import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // input from keyboard
        System.out.println("Number 1");
        int a = scanner.nextInt();
        System.out.println("Number 2");
        int b = scanner.nextInt();
        int sum = a+b;
        System.out.println("Sum : "+ sum);

        System.out.println("Enter Something --");
        boolean bool = scanner.hasNextInt(); // validate checking
        System.out.println(bool);

        String s1 = scanner.next(); // read one word only.
        System.out.println(s1);

        String s2 = scanner.nextLine(); // Full line
        System.out.println(s2);
    }
}
