package leesons;

import java.util.Scanner;

public class stringsLesson {
    public static void main(String[] args) {
        String s1 = "java";
        String s2 = new String("hello");
        String s3 = new String(new char[]{'a','b','c'});
        String s4 = new String(s3);
        String s5 = new String(new char[]{33,45,32});

   //     System.out.println(s5);

        String v1 = "hello world";
        String v2 = "hello world";
        String v3 = "hello ";
        String v4 = "world";
        String v5 = v3+v4;

//        Scanner scanner = new Scanner(System.in);

 //       System.out.println(v1 == v2);
 //       System.out.println(v1 == v5);
//        System.out.println(v1 == scanner.nextLine());

        String q1 = "";
        long startTime = System.nanoTime();
        for (int i =0; i<1000000; i++){
            q1 +="q";
        }
        long endTime = System.nanoTime();
        float result = (endTime -startTime) *0.000000001f;

   //     System.out.println(result);

        int e = new int[4][8].length;
        System.out.println(e);
    }
}
