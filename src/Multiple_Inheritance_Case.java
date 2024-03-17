abstract class Phone_Class{
    private String phone_name;
    Phone_Class(String phone_name){
        this.phone_name = phone_name;
    }
    abstract void ring();
    abstract void message();

    public String phoneNameDisplay(){
        return this.phone_name;
    }
}

interface Clock{
    void showTime();

    private void HelpingMethod(){
        System.out.println("I help default methods in interfaces!!");
        System.out.println("Can't be used outside!!");
    }
    default void setTime(){ // No need to redefine it. Can be overided
        System.out.println("Setting Time!!");
        this.HelpingMethod();
    }
}
interface Camera{
    void click_picture();
    void save_picture();
}

interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network_name);
}

interface Music{
    void play_music();
}

class SmartPhone_Class extends Phone_Class implements Camera, Clock, Wifi, Music{
    SmartPhone_Class(String phone_name) {
        super(phone_name);
    }

    @Override
    void ring() {
        System.out.println("Ringing!!");
    }

    @Override
    void message() {
        System.out.println("Messaging!!");
    }

    @Override
    public void click_picture() {
        System.out.println("Clicking!!");
    }

    @Override
    public void save_picture() {
        System.out.println("Saving!!");
    }

    @Override
    public void play_music() {
        System.out.println("Music Playing!!");
    }

    @Override
    public String[] getNetworks() {
        String[] network_list = {"A","B","C"};
        return network_list;
    }

    @Override
    public void connectToNetwork(String network_name) {
        System.out.println("Connecting...");
    }

    @Override
    public void showTime() {
        System.out.println("Time is 6 AM");
    }
}

public class Multiple_Inheritance_Case {
    public static void main(String[] args) {
        SmartPhone_Class smartPhoneClass = new SmartPhone_Class("Huawei Y6p");
        smartPhoneClass.ring();
        System.out.println(smartPhoneClass.phoneNameDisplay());

        String[] array = smartPhoneClass.getNetworks();
        for (String element: array){
            System.out.println("Name of Network: "+element);
        }

        smartPhoneClass.showTime();
        smartPhoneClass.setTime();
    }
}