package ru.geekbrains.lesson4.home_work4;

import java.util.Random;
import java.util.Scanner;

/**
 * 1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку;
 * 2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
 * 3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4. Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;

 */

public class Main {
    // Создаем игровое поле
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int FIELDS_TO_WIN = 3;

    // Вводим символы для заполнения ячеик поля
    public static final char FIELD_EMPTY = '.';
    public static final char FIELD_X = 'X';
    public static final char FIELD_O = 'O';
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static int counter = 0;
    public static int counterHorizontal = 0;
    public static int counterVertical = 0;
    public static int lastHumanX;
    public static int lastHumanY;


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true){
            humanTurn();
            printMap();
            if(isWinner1(FIELD_X)){
                System.out.println("Human wins!");
                break;
            }
            if(isMapFull()){
                System.out.println("Draw!");
                break;
            }

            aiTurn(lastHumanX,lastHumanY);
            printMap();
            if(isWinner1(FIELD_O)){
                System.out.println("AI wins!");
                break;
            }
            if(isMapFull()){
                System.out.println("Draw!");
                break;
            }
        }
        System.out.println("Game over!");
    }

    // Метод для инициализации игрового поля
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = FIELD_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // метод, отвечающий за ход человека-игрока
    public static void humanTurn(){
        int x, y;
        do{
            System.out.println("Please enter your move in form X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }while (!isCellValid(x,y));
        lastHumanX = x;
        lastHumanY = y;
        map[y][x] = FIELD_X;
    }

    public static boolean isCellValid(int x, int y){
        if(x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if(map[y][x] == FIELD_EMPTY) return true;
        return false;
    }

    public static void aiTurn(int j, int i){
        int x = 0;
        int y = 0;
        if(map[i][j+1] == FIELD_X && map[i][j+2] == FIELD_EMPTY){
            x = j+2;
            y = i;
        }else if(map[i+1][j] == FIELD_X && map[i+2][j] == FIELD_EMPTY){
            x = j;
            x = i + 2;
        }if(map[i][j+1] == FIELD_EMPTY){
            x = j + 1;
            y = i;
        }else if(map[i+1][j] == FIELD_EMPTY){
            x = j;
            y = i + 1;
        }else if(map[i][j - 1] == FIELD_EMPTY){
            x = j - 1;
            y = i;
        }else if(map[i-1][j] == FIELD_EMPTY){
            x = j;
            y = i - 1;
        }
        /*do{
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        }while (!isCellValid(x,y));*/
        System.out.println("AI made a move: X = " + (x + 1) + " Y = " + (y + 1));
        map[y][x] = FIELD_O;
    }

    // Проверка победы методом прописания проверки всех возможных комбинаций
    public static boolean isWinner0(char symb){
        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;
    }

    // Проверка победы с использованием циклов

    public static boolean isWinner1(char symb){
        for(int i = 0; i < SIZE; i++){          // проверка по горизонтали
            counter = 0;
            for (int j = 0; j < SIZE; j++){
                if(map[i][j] == symb) counter++;
            }
            if(counter == FIELDS_TO_WIN) return true;
        }

        for(int j = 0; j < SIZE; j++){      // проверка по вертикали
            counter = 0;
            for (int i = 0; i < SIZE; i++){
                if(map[i][j] == symb) counter++;
            }
            if(counter == FIELDS_TO_WIN) return true;
        }
        counter = 0;
        for(int i = 0; i < SIZE; i++){      // проверка по диагонали
            if(map[i][i] == FIELD_X) counter++;
            if(counter == FIELDS_TO_WIN) return true;
        }
        counter = 0;
        for(int i = 0; i < SIZE; i++){      // проверка по другой диагонали
            if(map[i][map[i].length - 1 - i] == FIELD_X) counter++;
            if(counter == FIELDS_TO_WIN) return true;
        }
        counter = 0;
        return false;
    }

    // Проверка на отсутствие свободных клеток.
    public static boolean isMapFull(){
        for(int i = 0; i < SIZE; i++){
            for (int j = 0; j < SIZE; j++){
                if(map[i][j] == FIELD_EMPTY) return false;
            }
        }
        return true;
    }
}