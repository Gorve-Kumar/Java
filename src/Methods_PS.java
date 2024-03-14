public class Methods_PS {
    static void number_table(int n){
        for (int i=1; i<=10; i++){
            System.out.println(i + " X " + n + " = " + i*n);
        }
    }
    static void print_pattern(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static int recursive_sum(int n){
        if (n == 1){
            return 1;
        }
        return n + recursive_sum(n-1);
    }

    static void rev_print_pattern(int n){
        for (int i=n; i>0; i--){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    static int fibonacci_term(int n){
        if (n==1){
            return 0;
        } else if (n==2){
            return 1;
        } else {
            return fibonacci_term(n-1) + fibonacci_term(n-2);
        }
    }

    static void pattern_using_recursion(int n){
        if (n>0){
            pattern_using_recursion(n-1);
            for (int i=1; i<=n; i++){
                System.out.print('*');
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        // Q1
        number_table(10);
        // Q2
        print_pattern(10);
        // Q3
        int sum = recursive_sum(10);
        System.out.println("SUM IS : "+sum);
        // Q4
        rev_print_pattern(10);
        // Q5
        int n = 10;
        System.out.println("Fibonacci Series");
        for (int i=1; i<n; i++){
            System.out.print(fibonacci_term(i) + " ");
        }
        System.out.print("\n");
        // Q6
        pattern_using_recursion(10);
    }
}
