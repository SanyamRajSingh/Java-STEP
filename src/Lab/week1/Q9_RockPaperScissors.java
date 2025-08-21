package Lab.week1;

import java.util.*;

public class Q9_RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] choices = {"rock", "paper", "scissors"};
        int userWins = 0, compWins = 0;

        System.out.print("How many rounds? ");
        int rounds = sc.nextInt();
        for (int i = 1; i <= rounds; i++) {
            System.out.print("Enter rock/paper/scissors: ");
            String user = sc.next().toLowerCase();
            String comp = choices[new Random().nextInt(3)];
            System.out.println("Computer: " + comp);

            if (user.equals(comp)) System.out.println("Draw!");
            else if ((user.equals("rock") && comp.equals("scissors")) ||
                    (user.equals("scissors") && comp.equals("paper")) ||
                    (user.equals("paper") && comp.equals("rock"))) {
                System.out.println("You win!");
                userWins++;
            } else {
                System.out.println("Computer wins!");
                compWins++;
            }
        }
        System.out.println("Final Score → You: " + userWins + ", Computer: " + compWins);
    }
}
