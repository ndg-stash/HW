public class lesson1HW {
    byte vByte = 1;
    short vShort = 1;
    int vInt = 1;
    long vLong = 1;
    float vFloat = 1;
    double vDouble = 1;
    char vChar = 'a';
    boolean vBool = false;

    public static void main(String[] args) {
        System.out.println(mMath(1,2,3,4));
        System.out.println(checkSum(12,9));
        printSign(0);
        System.out.println(checkMinusSign(-5));
        checkYear(1900);
    }

    //3.Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    static float mMath(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    static boolean checkSum(int a, int b){
        int vSum = a+b;
        return (vSum<10||vSum>20)?false:true;
    }

    //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    static void printSign(int a){
        System.out.println(a<0?"Отрицательное число":"Положительное число");
    }

    //6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    static boolean checkMinusSign(int a){
        return (a<0);
    }

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»
    static void printHello(String name){
        System.out.println("Привет " +name+"!");
    }

    static void checkYear(int a){
        if(a%400==0){
            System.out.println("Високосный");
        }else if (a%100==0){
            System.out.println("Не високосный");
        }else if (a%4==0){
            System.out.println("Високосный");
        }else {
            System.out.println("Не високосный");
        }
    }

}
