package l5hwEmp;

public class Employee {
    String name;
    String position;
    String email;
    String phoneNumber;
    double salary;
    int age;

    public int getAge() {
        return age;
    }

    public Employee(String name, String position, String email, String phoneNumber, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }


    void printEmployeeInfo(){
        System.out.println("===================================");
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Адрес электронной почты: " + email);
        System.out.println("Номер телефона: " + phoneNumber);
        System.out.println("Зароботная плата: " + salary);
        System.out.println("Возраст: " + age);
    }
}
