package ru.geekbrains.homework1;

public class MainApp
{
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

        System.out.println(calculate(1,2,3,4));
    }

        // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        //где a, b, c, d – аргументы этого метода, имеющие тип float.

        static float calculate(float a, float b, float c, float d)
        {
            return a * (b + (c / d));

        }


}
