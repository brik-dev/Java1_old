package ru.geekbrains.lesson3.home_work3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки
        // угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное
        // пользователем число чем загаданное, или меньше. После победы или проигрыша выводится
        // запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

        Scanner scanner = new Scanner(System.in);

        int range = 10;
        int trials = 3;
        int guessNumber;
        int inputNumber;
        int answer;
        int counter;

        System.out.println("Ваша задача угадать число. У Вас есть 3 попытки.");
        do{
            guessNumber = (int)(Math.random()*range);
            counter = 0;
            for(int i = 0; i < trials; i++){
                System.out.println("Введите число цифрами от 0 до " + range);
                inputNumber = scanner.nextInt();
                while(inputNumber < 0 || inputNumber > range){
                    System.out.println("Ошибка! Введите число цифрами от 0 до " + range);
                    inputNumber = scanner.nextInt();
                }

                if(inputNumber == guessNumber)
                {
                    System.out.println("Поздравляю. Вы угадали!");
                    break;
                } else if (inputNumber > guessNumber)
                {
                    System.out.println("Вы ввели число больше чем загаданное.");
                    counter++;
                } else
                {
                    System.out.println("Вы ввели число меньше чем загаданное.");
                    counter++;
                }
            }
            if(counter == 3){
                System.out.println("Попытки закончились. Вы проиграли!");
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            answer = scanner.nextInt();
        }while (answer != 0);
        System.out.println("Спасибо за игру! До встречи!");
        scanner.close();
    }
}
