package lesson3;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадайте число.");
        int range = 30;
        int number = (int) (Math.random() * range);
        playnum(range, number);
        scanner.close();
    }

    private static void playnum (int range, int number){
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_num = scanner.nextInt();
            if (input_num == number) {
                System.out.println("Вы победили !!!");
                break;

            } else if (input_num > number) {
                System.out.println("Загаданное число меньше.");

            } else {
                System.out.println("Загаданное число больше.");
            }
        }


    }
}
