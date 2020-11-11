import java.util.Arrays;

public class testArr {
    static int k = 0;
    int v_1;
    int v_j;
    public static void main(String[] args) {
        int[][]arQuad = new int[5][5];
        for(int i=0; i < arQuad.length; i++){
            System.out.println("========================================");
            for(int j=0; j < arQuad.length; j++){
                arQuad[Math.abs(j)][arQuad.length-j-(arQuad.length-j)+i] = k;

          //      System.out.print(Math.abs(j-i));
          //      System.out.println(arQuad.length-j-(arQuad.length-j)+i);
            }
            k++;
        }

        for(int i = 0; i < arQuad.length; i++){
            System.out.println(Arrays.toString(arQuad[i]));
        }
    }

}
