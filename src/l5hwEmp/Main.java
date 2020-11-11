package l5hwEmp;

public class Main {
    public static void main(String[] args) {

        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        empArr[1] = new Employee("Petrov Petr", "Engineer", "pepetr@mailbox.com", "8923181928", 32000, 33);
        empArr[2] = new Employee("Smirnov Alexey", "sr Engineer", "smpetr@mailbox.com", "8923242342", 42000, 33);
        empArr[3] = new Employee("Antonov Alexandr", "jr Engineer", "alalex@mailbox.com", "8923345345", 22000, 24);
        empArr[4] = new Employee("Dmitriy Alexeev", "lead Engineer", "aldmitr@mailbox.com", "8923768657", 65000, 44);

        System.out.println();

        for(int i = 0; i < empArr.length-1; i++){
            if (empArr[i].getAge() > 40){
                empArr[i].printEmployeeInfo();
            }
            System.out.println(i);
        }

    }
}
