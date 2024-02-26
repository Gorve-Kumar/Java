public class Methods_Change {
    static void change_int(int a){
        a = 60;
    }
    static void change_array(int [] array){
        array[0] = 60;
    }
    public static void main(String[] args) {
        int i = 2003;
        change_int(i);
        System.out.println(i);      // OLD VALUE

        int [] lst = {21,43,54,65};
        change_array(lst); // memory lst is referenced that is passed.
        System.out.println(lst[0]); // TAKES NEW VALUE
    }
}
