import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        byte m1, m2, m3;
//        System.out.print("Enter SPM Marks: ");
//        m1 = scanner.nextByte();
//        System.out.print("Enter DSP Marks: ");
//        m2 = scanner.nextByte();
//        System.out.print("Enter DSP Marks: ");
//        m3 = scanner.nextByte();
//        float avg = (m1+m2+m3)/3.0f;
//        if (avg > 40 && m1 > 33 && m2 > 33 && m3 > 33){
//                System.out.println("Congratulations");
//        } else {
//            System.out.println("You Fail!!");
//        }

        System.out.print("Website Name: ");
        String website = scanner.next();
        if (website.endsWith(".com")){
            System.out.println(".com website");
        } else if (website.endsWith(".org")){
            System.out.println(".org website");
        } else {
            System.out.println("UNKNOWN WEBSITE");
        }

        System.out.print("Age: ");
        int age = scanner.nextInt();

        if (age > 40){
            System.out.println("Old");
        } else if (age> 20){
            System.out.println("Adult");
        } else {
            System.out.println("Young"); // all above has to be evaluated.
        }

        switch (age){
            case 18:
                System.out.println("Enjoy");
                break;
                // important otherwise all other blocks will be executed.
            case 28:
                System.out.println("Get Job");
                break;
            case 60:
                System.out.println("Retire");
                break;
            default:
                System.out.println("Nothing");
                break;
        }
    }
}
