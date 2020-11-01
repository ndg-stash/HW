public class Main {
    public static void main(String[] args) {
        int a = 9;

        switch (a){
            case 6:
                System.out.println("six"); break;
            case 5:
                System.out.println("five"); break;
            default:
                System.out.println("default");
        }

        cycle();
    }

    static void cycle(){
        int a = 5;
        while(a<5){
            System.out.println(a);
            a ++;
        }


        for(int i = 0; i<5;++i){
            a *= i+1;
            System.out.println("for cycle "+ a);
        }

        do {
            System.out.println("do cycle "+ a);
        } while (a<600);

        System.out.println(a);
    }
}
