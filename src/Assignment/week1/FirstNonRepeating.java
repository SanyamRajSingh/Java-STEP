package Assignment.week1;

import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                System.out.println("First non-repeating: " + text.charAt(i));
                sc.close();
                return;
            }
        }
        System.out.println("No unique character found.");
        sc.close();
    }
}
