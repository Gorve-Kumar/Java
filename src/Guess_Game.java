import java.util.Scanner;
import java.util.Random;

class Guess{
    private int no_of_tries;
    private int number;

    public Guess(){
        Random random = new Random();
        this.number = random.nextInt(100);
        this.no_of_tries = 0;
        this.take_user_input();
    }

    public void setNo_of_tries(int no_of_tries) {
        this.no_of_tries = no_of_tries;
    }

    public int getNo_of_tries() {
        return this.no_of_tries;
    }

    private Boolean isCorrectNumber(int num){
        return num == this.number;
    }

    public void take_user_input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = scanner.nextInt();

        this.no_of_tries++;

        if (this.isCorrectNumber(num)) {
            System.out.println("Correct Guess!!");
            System.out.println("Score : " + (100 - this.getNo_of_tries()));
            this.setNo_of_tries(0);
        } else {
            if (num > this.number){
                System.out.println("Number is Smaller!!");
            } else {
                System.out.println("Number is Bigger!!");
            }
            this.take_user_input();
        }
    }

}

public class Guess_Game {
    public static void main(String[] args) {
        Guess guess = new Guess();
    }
}