package l5;

public class animal {

    private String name;
    private int runningDistance;
    private int jumpHeight;
    private int swimmingDistance;

    public String getName() {
        return name;
    }

    public animal(String name, int runningDistance, int jumpHeight, int swimmingDistance) {
        this.name = name;
        this.runningDistance = runningDistance;
        this.jumpHeight = jumpHeight;
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
