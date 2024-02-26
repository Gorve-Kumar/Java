public class Methods_Overloading {
    // WORKS FOR PARAMETERS ONLY, NOT BY RETURN TYPE.
    static void func(){
        System.out.println("Hello");
    }
    static void func(int a){
        System.out.println("Hello 2");
    }

    // Not Allowed.
//    static int func(int a){
//        return a;
//    }

    public static void main(String[] args) {
        func();
    }
}
