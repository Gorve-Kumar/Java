public class PS_Loops {
    public static void main(String[] args) {

        int n = 4;
        for (int i = n; i > 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("----------------------");
        System.out.println("First 4 even numbers sum");
        int j = 0;
        int sum = 0;
        while (j < 4){
            sum = sum + j*2;
            j++;
        }
        System.out.println("Sum is "+sum);
        System.out.println("----------------------");
        System.out.println("Table");
        int num = 6;
        for (int i = 1; i <= 10; i++){
//            System.out.println(num + " * "+ i + " = " + num*i ); // or
            System.out.printf("%d X %d = %d\n", num, i, num*i);
        }
        System.out.println("REVERSE FORM");
        for (int i = 10; i > 0; i--){

            System.out.println(num + " X "+ i + " = " + num*i );
        }
        System.out.println("----------------------");
        int fact = 5;
        int result = 1;
        for (int i = fact; i > 0; i--){
            result *= i;
        }
        System.out.println("Factorial is "+ result);
    }
}
