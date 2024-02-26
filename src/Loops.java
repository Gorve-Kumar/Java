public class Loops {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10){
            System.out.println(i);
            i = i + 2;
        }

        System.out.println("=============");
//        while(true){
//            System.out.println("HELLO!!");
//        }

        int j = 10;
        do { // it enters loop before evaluating condition for the first time.
            System.out.println(j);
            j++;
        } while(j< 5);


        System.out.println("=============");
        for (short l=0; l<=10; l++){
            System.out.println(l);
        }
        int number = 10;
        for (int num = number; num>0; num--){
            System.out.println(num);
        }
    }
}