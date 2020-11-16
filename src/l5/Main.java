package l5;

public class Main {
    public static void main(String[] args) {
        Cat firstCat = new Cat("Мурзик");
        //проверка значений
        firstCat.jumping(190);
        firstCat.swimming(12);
        firstCat.running(400);

        //вывод максимальных показателей с учетом рандома при генерации экземпляра
        System.out.println(firstCat.getName()+ " может прыгать на " + firstCat.getJumpHeight() +" метров! А еще может пробежать " + firstCat.getRunningDistance() + "  метров!");
        System.out.println("====================================================");

        Dog firstDog = new Dog("Шарик");
        //проверка значений
        firstDog.jumping(135);
        firstDog.swimming(12);
        firstDog.running(200);

        //вывод максимальных показателей с учетом рандома при генерации экземпляра
        System.out.println(firstDog.getName()+ " может прыгать на " + firstDog.getJumpHeight() +" метров! А еще может пробежать " + firstDog.getRunningDistance() + "  метров!");

    }
}
