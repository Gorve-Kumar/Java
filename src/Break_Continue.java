public class Break_Continue {
    public static void main(String[] args) {

       for (int i = 0; i < 5; i++){
           if (i == 3){
               continue;
           }
           System.out.println(i);
           if (i == 4){
               System.out.println("4 Appeared, Bye");
               break;
           }
       }


       int j = 1;
       do {
           j = j*2;
           System.out.println(j);
           if (j == 4){
               System.out.println("Leaving");
               break;
           }
       } while (j <= 10);


    }
}
