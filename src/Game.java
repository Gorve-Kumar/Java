import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to Game");
        System.out.println("R for Rock");
        System.out.println("P for Paper");
        System.out.println("S for Scissor");
        int i = 0;
        int tie = 0;
        int user = 0;
        int computer = 0;

        while(i<5) {
            int comp_input = random.nextInt(3);
            System.out.println("");
            System.out.print("Select: ");
            String choice = scanner.next();

            switch (choice) {
                case "R" -> {
                    if (comp_input == 0) {
                        String Pr = "Rock";
                        System.out.println("Rock : " + Pr);
                        System.out.println("Its a tie");
                        tie++;
                    } else if (comp_input == 1) {
                        String Pr = "Paper";
                        System.out.println("Rock : " + Pr);
                        System.out.println("Computer wins");
                        computer++;
                    } else {
                        String Pr = "Scissor";
                        System.out.println("Rock : " + Pr);
                        System.out.println("You win");
                        user++;
                    }
                }
                case "P" -> {
                    if (comp_input == 0) {
                        String Pr = "Rock";
                        System.out.println("Paper : " + Pr);
                        System.out.println("You wins");
                        user++;
                    } else if (comp_input == 1) {
                        String Pr = "Paper";
                        System.out.println("Paper : " + Pr);
                        System.out.println("Its a tie");
                        tie++;
                    } else {
                        String Pr = "Scissor";
                        System.out.println("Paper : " + Pr);
                        System.out.println("Computer win");
                        computer++;
                    }
                }
                case "S" -> {
                    if (comp_input == 0) {
                        String Pr = "Rock";
                        System.out.println("Scissor : " + Pr);
                        System.out.println("Computer wins");
                        computer++;
                    } else if (comp_input == 1) {
                        String Pr = "Paper";
                        System.out.println("Scissor : " + Pr);
                        System.out.println("You win");
                        user++;
                    } else {
                        String Pr = "Scissor";
                        System.out.println("Scissor : " + Pr);
                        System.out.println("Its a tie");
                        tie++;
                    }
                }
            }

            i++;
            System.out.println("You :"+ user +" |Computer :"+ computer +"|Tie :"+tie);
        }
        if(user==computer){
            System.out.println("Overall Its a tie");
        }
        else if(user>computer){
            System.out.println("Overall You win");
        }
        else{
            System.out.println("Computer Wins");
        }
    }
}