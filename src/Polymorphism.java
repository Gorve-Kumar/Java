// existing is different forms
interface Map{
    void navigate();
    default void search(){
        System.out.println("Searching...");
    }
}

interface Snapchat{
    void clickPic();

    default void savePic(){
        System.out.println("Saving...");
    }
}

abstract class Mobile{
    String name;

    Mobile(String name){
        this.name = name;
    }

    abstract public void EMUI_No();
}


class Huawei extends Mobile implements Map, Snapchat {
    Huawei(String name){
            super(name);
    }

    @Override
    public void navigate() {
        System.out.println("Navigating...");
    }

    @Override
    public void clickPic() {
        System.out.println("Clicking...");
    }

    @Override
    public void EMUI_No() {
        System.out.println("This is EMUI");
    }
}
public class Polymorphism {
    // I want to use huawei as snap.
    public static void main(String[] args) {
        Snapchat snap = new Huawei("Y6p");
        snap.clickPic();
//        snap.navigate(); -> not allowed.
    }

}