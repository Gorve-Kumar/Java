//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello World!"); // new line (ln)
        System.out.print("Sum is ");        // same line.
        int num1 = 1;
        int num2 = 2;
        int sum = num1 + num2;
        System.out.println(sum);

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        int a = 5*4 / 3;
        System.out.println("Number: "+a);

        int num = 6;
        // fetch num;
        int other_num = num++; // old value
        System.out.println("OTHER NUM: "+other_num);
        System.out.println(num++);
        System.out.println(num);
        System.out.println(++num);
        System.out.println(num++);
        System.out.println(num);

        short x = 3;
        float y = 3.5f;

        float z = x + y;
        System.out.println("NUM "+ z);

        char letter = 'F';
        int number = 6;
        int combo = number + letter;
        System.out.println(combo);
    }
}