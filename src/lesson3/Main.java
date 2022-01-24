package lesson3;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Задача угадать число");
        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i<=30; i+=10) playnum(i);
        System.out.println("Вы выйграли!!!!!!!!!!");
        scanner.close();
    }

    private static void playnum (int range){
        int number = (int) (Math.random() * range);
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_num = scanner.nextInt();
            if (input_num == number) {
                System.out.println("Вы угадали ");
                break;

            } else if (input_num > number) {
                System.out.println("Загаданное число меньше.");

            } else {
                System.out.println("Загаданное число больше.");
            }
        }


    }
}
