package ru.geekbrains.homework1;

public class MainApp {

    public static void main(String[] args) {
        // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main(): done
        // 2. Создать переменные всех пройденных типов данных и инициализировать их значения.

        byte e = -120;
        short s = 12442;
        int i = 1000;
        long l = 10000000L;

        float f = 1.23f;
        double g = -123.123;

        char h = 's';
        boolean bool = true;

        // вызов метода сalculate()

        System.out.println(calculate( 1.2f,  2.5f,  3.2f, 4.5f));

        // вызов метода sum()
        System.out.println(from10till20(10,5));

        // вызов метода checkNumber()

        checkPositiveOrNegative(10);

        // вызов метода checkNegative()

        System.out.println(checkNegative(-5));

        // вызов метода printHello()

        printHello("Наталья");

        // вызов метода checkLeapYear

        checkLeapYear(1300);
    }

    // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.

    static float calculate(float a, float b, float c, float d)
    {
        return a * (b + (c / d));
    }

    // 4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
    // в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

    public static boolean from10till20(int j, int k )
    {
        int sum = j + k;
        if (sum > 10 && sum <= 20){
            return true;
        } else {
            return false;
        }
    }

    // 5. Написать метод, которому в качестве параметра передается целое число, метод должен
    // напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.

    // Дополнительное задание: Использовать тернарный оператор

    public static void checkPositiveOrNegative(int j){
       String answerPositiveOrNegative = (j >= 0) ? "Введенное число положительное" : "Введенное число отрицательное";
       System.out.println(answerPositiveOrNegative);

        /*if(j >= 0){
            System.out.println("Число " + j + " положительное.");
        } else {
            System.out.println("Число " + j + " отрицательное.");
        }*/
    }

    // 6. Написать метод, которому в качестве параметра передается целое число. Метод должен
    // вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean checkNegative(int j){
        if(j < 0){
            return true;
        } else {
            return false;
        }
    }

    // 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

    public static void printHello(String name){
        System.out.println("Привет, " + name + "!");
    }

    // 8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static void checkLeapYear(int y){
        int rest = y%4;
        int is100 = y%100;
        int is400 = y%400;

        if(is400 == 0) {
            System.out.println(y + " - високосный год");
        }else{
            if(rest == 0 && is100 != 0){
                System.out.println(y + " - високосный год");
            } else {
                System.out.println(y + " - невисокосный год");
            }
        }
    }
}