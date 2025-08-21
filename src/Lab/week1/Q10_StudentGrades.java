package Lab.week1;

import java.util.*;

public class Q10_StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics, Chemistry, Math marks for student " + (i + 1) + ": ");
            marks[i][0] = sc.nextInt();
            marks[i][1] = sc.nextInt();
            marks[i][2] = sc.nextInt();
        }

        System.out.println("Student\tTotal\t%age\tGrade");
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double per = total / 3.0;
            String grade;
            if (per >= 90) grade = "A";
            else if (per >= 75) grade = "B";
            else if (per >= 60) grade = "C";
            else if (per >= 40) grade = "D";
            else grade = "F";
            System.out.println((i + 1) + "\t" + total + "\t" + per + "\t" + grade);
        }
    }
}
