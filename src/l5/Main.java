package l5;

public class Main {
    public static void main(String[] args) {
        Cat firstCat = new Cat();
        firstCat.name = "Дуся";
        firstCat.age = 5;
        firstCat.color = "Серый";

        Cat secondCat = new Cat("Вася", "Белый", 10);
//        secondCat.name = "Вася";
//        secondCat.color = "Черный";
//        secondCat.age = 3;

        System.out.println(firstCat.name+ " "+ firstCat.age + " " +firstCat.color);
        System.out.println(secondCat.name+ " "+ secondCat.age + " " +secondCat.color);

        firstCat.voice();
        secondCat.voice();
    }
}
