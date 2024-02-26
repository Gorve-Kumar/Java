public class Methods_Java {
    int add(int a, int b){ // objects se associated.
        // particular to every object.
        // every object has its own add method
        return a + b;
    }
    static float div(float a, float b){ // class se associated.
        // one fridge in the hostel.
        return  a / b;
    }

    static int multiply(int a, int b){

        return a * b;
    }

    static void joke(){
        System.out.println("You Genius!!");
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        //  create object to call from non-static method of the class.
        Methods_Java methodsJava = new Methods_Java();
        int c = methodsJava.add(a, b);
        System.out.println(c);
        float d = 4.1f;
        float e = 4.2f;
        float f = div(d, e);
        System.out.println(f);
        int g = 3;
        int h = 5;
        int i = multiply(g, h);
        System.out.println(i);
        joke();


        int [] num = {13,43,33,25,65,87,76,56};

    }
    // non-static method can be referenced for static context.
}