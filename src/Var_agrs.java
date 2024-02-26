public class Var_agrs {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }

    static int sum(int ...array){
        // Available as int [] array
        int sum_result = 0;
        for (int element: array){
            sum_result += element;
        }
        return sum_result;
    }

    static int mult(int x, int ...array){
        int mult_result = x;
        for (int element: array){
            mult_result += element;
        }
        return mult_result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome");
        System.out.println(sum(3,4));
        System.out.println(sum(3,4,5));
        System.out.println(sum(3,4,5,6)); // error

        System.out.println(sum()); // Work
//        System.out.println(mult()); // Don't work
        System.out.println(mult(3));
    }
}
