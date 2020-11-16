package l5;

public class Main {
    public static void main(String[] args) {
        Cat firstCat = new Cat("Мурзик");
        //проверка значений
        firstCat.jump(190);
        firstCat.swim(12);
        firstCat.run(400);

        //вывод максимальных показателей с учетом рандома при генерации экземпляра
        System.out.println(firstCat.getName()+ " может прыгать на " + firstCat.getJumpHeight() +" метров! А еще может пробежать " + firstCat.getRunningDistance() + "  метров!");
        System.out.println("====================================================");

        Dog firstDog = new Dog("Шарик");
        //проверка значений
        firstDog.jump(135);
        firstDog.swim(12);
        firstDog.run(200);

        //вывод максимальных показателей с учетом рандома при генерации экземпляра
        System.out.println(firstDog.getName()+ " может прыгать на " + firstDog.getJumpHeight() +" метров! А еще может пробежать " + firstDog.getRunningDistance() + "  метров!");

    }
}
