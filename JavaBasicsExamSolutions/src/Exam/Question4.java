package Exam;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scan.nextLine());
        int excellent = 0;
        int good = 0;
        int average = 0;
        int failed = 0;
        double totalMarks = 0.0;

        for (int i = 1; i <= studentsCount; i++) {
            double mark = Double.parseDouble(scan.nextLine());
            if (mark >= 5) {
                excellent++;
                totalMarks += mark;
            } else if (mark >= 4) {
                good++;
                totalMarks += mark;
            } else if (mark >= 3) {
                average++;
                totalMarks += mark;
            } else {
                failed++;
                totalMarks += mark;
            }
        }
        double averageMark = totalMarks / studentsCount;
        System.out.printf("Top students: %.2f%%%n", 1.0 * excellent / studentsCount * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", 1.0 * good / studentsCount * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", 1.0 * average / studentsCount * 100);
        System.out.printf("Fail: %.2f%%%n", 1.0 * failed / studentsCount * 100);
        System.out.printf("Average: %.2f", averageMark);
    }
}
