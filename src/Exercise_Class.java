import java.util.Scanner;

class Subject {
    float max = 100f;
    float obtain;
}

public class Exercise_Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println(4.8 % 1.1);

        Subject subject1 = new Subject();
        System.out.print("Subject 1: ");
        subject1.obtain = scanner.nextFloat();

        Subject subject2 = new Subject();
        System.out.print("Subject 2: ");
        subject2.obtain = scanner.nextFloat();

        float per = (((subject1.obtain + subject2.obtain)/(subject1.max+subject2.max))*100);
        System.out.println("Percentage " + per);
    }
}