package l7hw;

public class Main {
    public static void main(String[] args) {
        Plate catsPlate = new Plate();
        System.out.println(catsPlate.getFoodAmount());
        catsPlate.addFood(15);
        System.out.println(catsPlate.getFoodAmount());

        Cat[] cats = new Cat[3];
        cats[1] = new Cat("Пушок", 7);
        cats[2] = new Cat("Мурка", 5);
        cats[0] = new Cat("Муся", 6);

        for (int i = 0; i< cats.length; i++){
            cats[i].eat(catsPlate);
        }

        for (int i = 0; i< cats.length; i++){
            cats[i].eat(catsPlate);
        }


    }
}
