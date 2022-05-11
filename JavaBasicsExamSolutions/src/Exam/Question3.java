package Exam;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        double price = 0.0;


        if (people <= 5) {
            switch (season) {
                case "spring":
                    price = 50;
                    break;
                case "summer":
                    price = 48.50;
                    break;
                case "autumn":
                    price = 60;
                    break;
                case "winter":
                    price = 86;
                    break;
            }

        } else if (people > 5) {
            switch (season) {
                case "spring":
                    price = 48;
                    break;
                case "summer":
                    price = 45;
                    break;
                case "autumn":
                    price = 49.50;
                    break;
                case "winter":
                    price = 85;
                    break;
            }

        }
        double totalPrice = price * people;
        if (season.equals("summer")) {
            totalPrice = totalPrice * 0.85;
        } else if (season.equals("winter")) {
            totalPrice = totalPrice * 1.08;
        }
        System.out.printf("%.2f leva.", totalPrice);
    }
}