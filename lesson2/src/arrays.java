import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 5;

        double[] dArr = {2.2,242};
        float[] fArr = {2.1f, 2.6f};

        for (int i = 0; i < arr.length; i++){
            arr[i] = i*3;
            System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(arr));

        stringArr();
    }


    static void stringArr(){
        String[] name = {"Саша","Петя","Вася"};

        int[][] arr ={{1, 3, 4}, {5, 5, 66}};
        System.out.println(arr[0][0]);
    }

}
