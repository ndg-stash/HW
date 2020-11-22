package l7hw;

public class Plate {

    private int foodAmount = 0;

    public int getFoodAmount() {
        return foodAmount;
    }

    public void addFood(int foodAmount) {
        this.foodAmount = this.foodAmount + foodAmount;
    }

    public void decreaseFood(int foodAmount) {
        if (this.foodAmount >= foodAmount){
            this.foodAmount = this.foodAmount - foodAmount;
        } else{
            System.out.println("В тарелке недостаточно еды!");
        }

    }


}
