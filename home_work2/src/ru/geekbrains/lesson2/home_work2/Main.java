package ru.geekbrains.lesson2.home_work2;

public class Main {


    public static void main(String[] args) {

        invertArray();

        fillArray();

        changeArray();

        fillDiagonal();

        findMinAndMax();

        checkBalance();

    }

    /** 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */

    public static void invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 2);
            System.out.print(arr[i] + " ");
        }
            System.out.println();
        for (int i = 0; i < arr.length; i++) {
            int a = 0;
            switch(arr[i]){
                case 0:
                    arr[i] = 1;
                    break;
                case 1:
                    arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

        // 2. Задать пустой целочисленный массив размером 8.
        //С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    public static void fillArray() {
        int[] arr1 = new int[8];
        arr1[0] = 0;
        for (int i = 1; i < arr1.length; i++) {
            arr1[i] = arr1[i - 1] + 3;
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void changeArray() {
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] = arr2[i] * 2;
                System.out.print(arr2[i] + " ");
            }
        }
        System.out.println();
        System.out.println();
    }

    // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    public static void fillDiagonal(){
        int[][] table = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    table[i][j] = 1;
                } else {
                    table[i][j] = 0;
                }
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
            System.out.println();
        }
    }

    // 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы;

    public static void findMinAndMax(){
        int[] arr3 = {5, 3, 2, 4, 1};
        int min = arr3[0];
        int max = arr3[0];

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] > arr3[0]) {
                min = arr3[i];
            } else {
                max = arr3[i];
            }
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
        System.out.println();
    }

    // 6. Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true, если в массиве есть место, в котором сумма левой и
    // правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
    // checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||,
    // эти символы в массив не входят.

    public static void checkBalance() {

        int[] arr4 = {2, 2, 2, 1, 2, 2, 10, 1};

        int sum = 0;
        int balanceValue = 0;
        int left = 0;
        int right = 0;

        for (int i = 0; i < arr4.length; i++) {
            sum += arr4[i];
        }
        balanceValue = sum / 2;

        for (int i = 0, j = arr4.length - 1; j < arr4.length; i++, j--) {
            left += arr4[i];
            right += arr4[j];
            if (left == balanceValue || right == balanceValue) {
                System.out.println("true");
                break;
                //return true;
            } //else {
                //return false;
            }
        }
    }

    // 7. Написать метод, которому на вход подается одномерный массив и
    // число n (может быть положительным, или отрицательным), при этом метод должен сместить
    // все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.

    //...











