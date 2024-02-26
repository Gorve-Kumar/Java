public class Recursion {
    static int factorial(int n){
        if ((n==0) || (n==1)){
            return 1;
        }
        return n * factorial(n-1);
    }

    static int factorial_Loop(int n){
        if ((n==0) || (n==1)){
            return 1;
        } else {
            int fact = 1;
            for (int i=1; i<=n; i++){
                fact *= i;
            }
            return fact;
        }
    }

    // Method to generate Fibonacci series up to n terms
    static void generateFibonacci(int n) {
        int a = 0, b = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }

    // Recursive method to generate Fibonacci series
    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Method to print Fibonacci series up to n terms
    static void printFibonacci(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(factorial(6));
        System.out.println(factorial_Loop(5));
        System.out.println(factorial(3));
        System.out.println(factorial(1));

        generateFibonacci(9);
        System.out.print("\n");
        printFibonacci(9);
    }
}
