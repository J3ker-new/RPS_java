import java.util.Random;
import java.util.Scanner;

class ComputerChoice {
    private String computerChoice;

    //Storing generated random integer as a computer response.
    public void setChoice() {
        Random rand = new Random();
        int randomInt = rand.nextInt(3);
        switch (randomInt) {
            case 0:
                computerChoice = "rock";
                break;
            case 1:
                computerChoice = "paper";
                break;
            case 2:
                computerChoice = "scissors";
                break;
        }
    }

    public String getComputerChoice() {
        return computerChoice;
    }
}

    class Userchoice{
    //Taking user input and converting it into a string.
    private String userInput;
    ComputerChoice computer = new ComputerChoice();
    private String response = computer.getComputerChoice();
    Scanner sc = new Scanner(System.in);

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    //Game Logic using if-else
    void logic() {
        if (userInput.equals(response)) {
            System.out.printf("You chose: %s, and the computer chose: %s, resulting in a draw. ", userInput, response);
            askRestart();
        } else if ((userInput.equals("rock") && response.equals("paper"))
                || (userInput.equals("paper") && response.equals("scissors"))
                || (userInput.equals("scissors") && response.equals("rock"))) {
            System.out.printf("You chose: %s, and the computer chose: %s, The computer wins. ", userInput, response);
            askRestart();
        }
        else {
            System.out.printf("You chose: %s, and the computer chose: %s, You win. ", userInput, response);
            askRestart();
        }
    }
    //Restart or End process.
    void askRestart(){
            System.out.println("Enter Y to restart and N to quit:");
            String restartCheck = sc.nextLine().toLowerCase();
            if (restartCheck.equals("y")) {
                System.out.printf("Restarting...\n");
                restart();
                return;
            } else if (restartCheck.equals("n")) {
                System.out.println("Exiting...");
                System.exit(0);
            } else {
                System.out.println("Invalid Input, Exiting...");
                System.exit(0);
            }
        }
    private void restart(){
        ComputerChoice reset = new ComputerChoice();
        reset.setChoice();
        System.out.println("Choose Rock/Paper/Scissors :");
        setUserInput(sc.nextLine().toLowerCase());
        setResponse(reset.getComputerChoice());
        logic();
    }
}
public class Main {
    public static void main(String[] args) {
        Userchoice input = new Userchoice();
        ComputerChoice intake = new ComputerChoice();
        Scanner sc = new Scanner(System.in);
        intake.setChoice();
        input.setResponse(intake.getComputerChoice());
        System.out.print("Choose Rock/Paper/Scissors :");
        input.setUserInput(sc.nextLine().toLowerCase());
        input.logic();
    }
}