interface bicycle{
    int num = 6;
    // This is template
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface cycle_name{
    void setName(String name);
    String getName();
}

class tri_cycle implements bicycle, cycle_name{
    public int speed;
    public String name;

    public void applyBrake(int decrement) {
        this.speed -= decrement;
    }

    public void speedUp(int increment) {
        this.speed += increment;
    }

    int getSpeed(){
        return this.speed;
//        num += 6; // can't update
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

public class Interfaces {
    public static void main(String[] args) {
        tri_cycle tri_cycle = new tri_cycle();
        tri_cycle.speedUp(5);
        System.out.println("Speed is        : "+tri_cycle.getSpeed());
        System.out.println("Value of Number : "+tri_cycle.num);
        tri_cycle.setName("My Cycle");
        System.out.println("Name is         : "+tri_cycle.getName());
    }
}