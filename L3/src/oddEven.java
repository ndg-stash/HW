import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int vIntScanned = 1;

        while(vIntScanned != 0){

            vIntScanned = in.nextInt();
            if (vIntScanned == 0) {
                break;
            }
            System.out.println(vIntScanned % 2 == 0 ? "even" : "odd");
        }
    }
}


