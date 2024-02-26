public class If_Else {
    public static void main(String[] args) {
        int age =  21;
        if (age < 18){
            System.out.println("Kid!!");
        } else {
            System.out.println("Adult!!");
        }

        boolean flag = true;
        boolean signal = true;

        if (flag && signal){
            flag = true;
            signal = false;
        } else {
            flag = false;
            signal = true;
        }

        System.out.println(flag + " && " + signal);
    }
}