import java.util.Scanner;

public class Practice_Set2 {
    public static void main(String[] args) {
        float a = 7/4f * 9/2f;
        System.out.println(a);

        char grade = 'A';
        // ENCRYPT
        grade = (char)(grade + 8);
        System.out.println(grade);
        // DECRYPT
        grade = (char)(grade - 8);
        System.out.println(grade);

        Scanner scanner = new Scanner(System.in);
        System.out.print("INPUT: ");
        int inp = scanner.nextInt();
        System.out.println(inp>8);

    }
}
