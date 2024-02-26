import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is total score: ");
        int total = scanner.nextInt();

        System.out.print("Subject 1: ");
        float s1 = scanner.nextInt();
        System.out.print("Subject 2: ");
        float s2 = scanner.nextInt();
        System.out.print("Subject 3: ");
        float s3 = scanner.nextInt();
        System.out.print("Subject 4: ");
        float s4 = scanner.nextInt();
        System.out.print("Subject 5: ");
        float s5 = scanner.nextInt();

        float sum = s1 + s2 + s3 + s4 +s5;
        float percentage = ((sum/(total*5)) * 100);
        System.out.print("Percentage: " + percentage);
    }
}
