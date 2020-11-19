package l5;

public class Cat extends animal {

    public Cat(String name) {
        super(name, 200, 200, 0);
    }

    @Override
    void swim(int distance){
        System.out.println(this.getName() + " не любит плавать!");
    }

}
