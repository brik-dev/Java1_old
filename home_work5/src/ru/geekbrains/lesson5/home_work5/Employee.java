package ru.geekbrains.lesson5.home_work5;

    /**
     * * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
     * * Конструктор класса должен заполнять эти поля при создании объекта;
     * * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
     * * Создать массив из 5 сотрудников
     * Пример:
     * Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
     * persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
     * persArray[1] = new Person(...);
     * ...
     * persArray[4] = new Person(...);
     *
     * * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
     */

public class Employee{

    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Lancon", "Developer", "lancon@net.com", "00432349875345", 50000, 35);
        employeesArray[1] = new Employee("Contar", "Senior Developer", "contar@net.com", "23409485782763", 70000, 45);
        employeesArray[2] = new Employee("Baker", "Project Manager", "baker@net.com", "203498756094380", 60000, 41);
        employeesArray[3] = new Employee("Roomer", "CEO", "roomer@net.com", "230498496872", 100000, 40);
        employeesArray[4] = new Employee("Konet", "Assistent", "konet@net.com", "0293489768456", 40000, 30);

        for(int i = 0; i < 5; i++){
            if(employeesArray[i].age > 40){
                employeesArray[i].info();
            }
        }
    }

    public Employee(String name, String position, String email, String phone, int salary, int age){
        this.name = name;
        this.position = position;
        this. email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.println("Сотрудник: " + name + " Должность: " + position +
                " Email: " + email + " Телефон: " + phone + " Зарплата: " + salary + " Возраст: " + age);
    }
}
