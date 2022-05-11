package Exam;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        String num = String.valueOf(number);
        char digit1 = num.charAt(0);
        char digit2 = num.charAt(1);
        char digit3 = num.charAt(2);
        int num1 = Integer.parseInt(String.valueOf(digit1));
        int num2 = Integer.parseInt(String.valueOf(digit2));
        int num3 = Integer.parseInt(String.valueOf(digit3));

        for (int i = 1; i <= num3; i++) {


            for (int j = 1; j <= num2; j++) {


                for (int k = 1; k <= num1; k++) {
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, i * j * k);
                }

            }

        }

    }

}
