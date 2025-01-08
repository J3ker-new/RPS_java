import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int comp = rand.nextInt(3);
        String computer;
        if (comp == 0) {
            computer = "rock";
        } else if (comp == 1) {
            computer = "paper";
        } else {
            computer = "scissor";
        }

        System.out.println("Enter your choice: ");
        String input = sc.nextLine();
        input = input.toLowerCase(Locale.ROOT);
        if (input.equals(computer)) {
            System.out.printf("Your Choice was %s and computer chose %s, resulting in a Draw!", input, computer);
        } else if ((!input.equals("rock") || !computer.equals("scissor")) && (!input.equals("paper") || !computer.equals("rock")) && (!input.equals("scissor") || !computer.equals("paper"))) {
            System.out.printf("Your choise was %s and the Computer chose %s, Computer Wins!", input, computer);
        } else {
            System.out.printf("Your choice was %s, the computer chose %s, You Win!", input, computer);
        }

    }
}