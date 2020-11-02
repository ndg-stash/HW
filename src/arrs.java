import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class arrs {
    private static int tmp;
    private static int i;

    public static void main(String[] args) {
        System.out.println("1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;");
        int[] arA = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (i = 0; i < arA.length; i++){
            if (arA[i]==1){
                arA[i]=0;
            } else {
                arA[i]=1;
            }
        }
        System.out.println(Arrays.toString(arA));

        System.out.println("\n2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;");
        int[]arB = new int[8];
        for(i = 0; i < arB.length; i++){
            arB[i] = tmp;
            tmp +=3;
        }
        System.out.println(Arrays.toString(arB));

        System.out.println("\n3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;");
        int[]arC = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(i = 0; i < arB.length; i++){
            if (arC[i] < 6){
                arC[i] *= 2;
             }
        }
        System.out.println(Arrays.toString(arC));

        System.out.println("\n4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;");
        int[][]arQuad = new int[5][5];
        for(i = 0; i < arQuad.length; i++){
            arQuad[i][i]= 1;
            arQuad[i][arQuad.length-1-i]= 1;
        }
        for(i = 0; i < arQuad.length; i++){
            System.out.println(Arrays.toString(arQuad[i]));
        }

        System.out.println("\n5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);");
        int[]arD = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxVal = arD[0];
        int minVal = arD[0];

        for(i = 1; i < arD.length; i++){
            if (maxVal < arD[i]){maxVal = arD[i];};
            if (minVal > arD[i]){minVal = arD[i];};
        }
        System.out.println("maxVal="+maxVal);
        System.out.println("minVal="+minVal);

        //System.out.println("6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.");
        //не совсем понял условия задачи

        System.out.println("7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.");
        Integer[] shiftedArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString( arrayShift( shiftedArr,5)));;
    }

    static Integer[] arrayShift(Integer[] arE, int vShift) {
        //в задании не сказано что нельзя пользоваться интернетом, так что :)
        Collections.rotate(Arrays.asList(arE), vShift);
        return arE;
    }


}
