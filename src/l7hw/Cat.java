package l7hw;

public class Cat {
    private String name;
    private boolean isFull;
    private int appetite;


    public Cat(String name, int appetite) {
        this.name = name;
        this.isFull = false;
        this.appetite = appetite;
    }

    public void eat(Plate plate){
        if (isFull){
            System.out.println(name +" уже сыт(a)! =^.^=");
        } else if (this.appetite<= plate.getFoodAmount()){
            plate.decreaseFood(this.appetite);
            System.out.println(name +" поел(a)! =^.^=");
            this.isFull = true;
        } else {
            System.out.println("В тарелке недостаточно еды!");
        }
    }

}
