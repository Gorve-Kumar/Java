import java.time.Clock;

class Phone{
    public void time(){
        System.out.println("Time : 9:00 PM");
    }

    public void name(){
        System.out.println("PHONE");
    }
}

class SmartPhone extends Phone{
    public void name(){
        System.out.println("SMARTPHONE");
    }

    public void music(){
        System.out.println("SONGG!!!");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Phone this_phone = new Phone();
        SmartPhone this_smartphone = new SmartPhone();

//        SmartPhone phone = new Phone(); // ERROR
        Phone phone = new SmartPhone();
        phone.time(); // OF PHONE
        phone.name(); // OF SMARTPHONE: ONLY OVER-RIDE METHODS
//        phone.music(); // ERROR
    }
}