package l5;

public class animal {

    private String name;

    private int runningDistance;
    private int jumpHeight;
    private int swimmingDistance;

    public String getName() {
        return name;
    }

    public int getRunningDistance() {
        return runningDistance;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getSwimmingDistance() {
        return swimmingDistance;
    }

    support.randomGen statsRandomazer = new support.randomGen();

    public animal(String name, int runningDistance, int jumpHeight, int swimmingDistance) {
        this.name = name;
        //коэффициент рандома можно было вынести в конструктор класса, но было уже лень:)
        this.runningDistance = statsRandomazer.getRundomNum(runningDistance*8/10,runningDistance*12/10);
        this.jumpHeight = statsRandomazer.getRundomNum(jumpHeight*8/10,jumpHeight*12/10);
        this.swimmingDistance = swimmingDistance;
    }


    void running(int distance){
        if (distance <= runningDistance){
            System.out.println(name +" бежит "+ distance +" метров!");
        } else {
            System.out.println(name + " не может пробежать " + distance +" метров!");
        }
    }

    void jumping(int Height){
        if (Height <= jumpHeight){
            System.out.println(name +" прыгнул на "+ Height +" сантиметров!");
        } else {
            System.out.println(name + " не может прыгнуть на " + Height +" сантиметров!");
        }
    }

    void swimming(int distance){
        if (swimmingDistance <= jumpHeight){
            System.out.println(name +" проплыл "+ distance +" метров!");
        } else {
            System.out.println(name + " не может проплыть " + distance +" метров!");
        }
    }

}
