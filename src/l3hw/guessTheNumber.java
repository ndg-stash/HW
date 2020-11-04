package l3hw;

import java.util.Random;
import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args) {
        int v_replay = 0;
        int gameCounter = 0;

        do{
            if (gameCounter == 3){
                System.out.println("Хватит играть:)");
                break;
            }
            v_replay = game();
            gameCounter++;

        } while (v_replay == 1);

    }

    static int game(){
        Scanner input = new Scanner(System.in);
        Random randomizer = new Random();
        int randomNumber = randomizer.nextInt(10);
        int inNumber = -1;
        int replay = -1;

        for (int i = 0; i < 3; i++) {
            System.out.print("угадайте число от 0 до 9: ");
            while (!input.hasNextInt()) {
                System.out.println("Вы ввели не число!");
                System.out.print("Введите число: ");
                input.next();
            }
            inNumber = input.nextInt();

            if (randomNumber < inNumber){
                System.out.println("Загаданное число меньше.");
            } else if (randomNumber > inNumber){
                System.out.println("Загаданное число больше.");
            } else{
                System.out.println("Вы угадали!");
                break;
            };
            if(i == 2){
                System.out.println("Попытки закончились.");
            }
        }

        System.out.print("Повторить игру еще раз? 1 – да / 0 – нет: ");

        do {
            if (replay == 0 || replay == 1){
                break;
            } else {
                System.out.print("Некорректное значение!(1 – да / 0 – нет): ");
            }
            while (!input.hasNextInt()) {
                System.out.print("Некорректное значение!(1 – да / 0 – нет): ");
                input.next();
            }
            replay = input.nextInt();
        } while(1==1);

        return replay;
    }

}