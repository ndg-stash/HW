package l5;

public class Cat {
    String name;
    String color;
    int age;
    int birthYear = 2020;

    Cat(){
        System.out.println("Я родился");
    }

    Cat(String name, String colors, int age){
        this.name = name;
        this.color = colors;
        this.age = age;
    }

    void voice(){
        System.out.println(name+ " мяукает");
    }

    int getAge(){
        return (2020 - birthYear);
    }

}
