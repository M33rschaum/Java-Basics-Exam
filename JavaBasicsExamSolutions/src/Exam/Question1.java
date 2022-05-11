package Exam;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int people = Integer.parseInt(scan.nextLine());
        int nights = Integer.parseInt(scan.nextLine());
        int transport = Integer.parseInt(scan.nextLine());
        int museum = Integer.parseInt(scan.nextLine());

        double nightsPrice= nights*20;
        double transportPrice = transport*1.6;
        double museumPrice = museum*6;
        double totalForOne = nightsPrice+transportPrice+museumPrice;
        double totalGroup = totalForOne*people;
        double addPercent = totalGroup*1.25;

        System.out.printf("%.2f",addPercent);

    }
}
