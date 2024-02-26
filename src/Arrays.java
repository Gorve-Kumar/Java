public class Arrays {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 9;
        marks[1] = 90;
        marks[2] = 45;
        System.out.println(marks[0]);
        System.out.println(marks[2]);
//        marks[7] = 56; //error
//        System.out.println(marks[4]); // error

        int [] score; // declaration
        score = new int[5]; // memory allocation
        score[0] = 6;
        System.out.println(score[0]);

        int [] times = {1,2,3,4,5,6}; // java take size itself
        System.out.println(times[2]);
        System.out.println("----------");
        System.out.println(times.length);

        float [] weights = {22.3f, 35.4f, 56.6f};
        System.out.println(weights[2] + "kg");

        String [] name = {"Honey","Kelvin","Alex"};
        // DISPLAY: NAIVE METHOD
        System.out.println("Name is "+name[0]);
        System.out.println("Name is "+name[1]);
        System.out.println("Name is "+name[2]);
        // USE LOOPS
        for (int i=0; i<name.length; i++){
            System.out.println("Good name is "+name[i]); // Array Traversal
        }
        // REVERSE ORDER
        for (int i=name.length-1; i>=0; i--){
            System.out.println("Bad name is "+name[i]);
        }
        // FOREACH LOOP
        // index not important
        for (String element:name){
            System.out.println("Name from foreach loop is "+element);
        }
    }
}
