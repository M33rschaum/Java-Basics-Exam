package Exam;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int desiredSum = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();
        double totalSum = 0.0;
        double price = 0.0;
        boolean sumAchieved = false;

        while (!input.equals("closed")) {
            if (input.equals("haircut")) {
                String haircut = scan.nextLine();
                switch (haircut) {
                    case "mens":
                        price = 15;
                        totalSum += price;
                        break;
                    case "ladies":
                        price = 20;
                        totalSum += price;
                        break;
                    case "kids":
                        price = 10;
                        totalSum += price;
                        break;
                }

            } else if (input.equals("color")) {
                String color = scan.nextLine();
                switch (color) {
                    case "touch up":
                        price = 20;
                        totalSum += price;
                        break;
                    case "full color":
                        price = 30;
                        totalSum += price;
                        break;
                }
            }

            if (totalSum >= desiredSum) {
                sumAchieved = true;
                System.out.printf("You have reached your target for the day!%n" +
                        "Earned money: %.0flv.", totalSum);
                break;
            }
            input = scan.nextLine();
        }

        if (input.equals("closed") && totalSum >= desiredSum) {

            System.out.printf("You have reached your target for the day!%n" +
                    "Earned money: %.0flv.", totalSum);
        } else if (input.equals("closed") && totalSum < desiredSum) {
            System.out.printf("Target not reached! You need %.0flv. more.%n" +
                    "Earned money: %.0flv.", desiredSum - totalSum, totalSum);

        }

    }
}
