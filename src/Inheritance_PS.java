class Circle{
    int radius;

    Circle(int radius){
        this.radius = radius;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder_1 extends Circle{
    int height;

    Cylinder_1(int radius, int height){
        super(radius);
        this.height = height;
    }

    public double volumne(){
        return this.area()* this.height;
    }
}

public class Inheritance_PS {
    public static void main(String[] args) {
        Cylinder_1 cylinder1 = new Cylinder_1(5,6);
        System.out.println("AREA   : "+cylinder1.area());
        System.out.println("VOLUME : "+cylinder1.volumne());
    }
}