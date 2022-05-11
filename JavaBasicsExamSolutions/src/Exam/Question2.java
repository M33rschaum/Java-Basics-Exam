package Exam;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double shirt = Double.parseDouble(scan.nextLine());
        double wantedSum = Double.parseDouble(scan.nextLine());

        double shorts = shirt*0.75;
        double socks = shorts*0.2;
        double shoes = (shirt+shorts)*2;
        double total = shirt+socks+shorts+shoes;
        double afterDiscount = total*0.85;

        if (afterDiscount>=wantedSum){
            System.out.printf("Yes, he will earn the world-cup replica ball!%n" +
                    "His sum is %.2f lv.",afterDiscount);
        }else {
            System.out.printf("No, he will not earn the world-cup replica ball.%n" +
                    "He needs %.2f lv. more.",wantedSum-afterDiscount);
        }

    }
}
