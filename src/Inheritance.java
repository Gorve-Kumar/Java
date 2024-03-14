class Base{
    int x;
    int y;

    public Base(){
        System.out.println("Base Constructor!!");
    }

    public Base(int x, int y){
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Derived extends Base{
    int z;

    public Derived(){
        System.out.println("Derived Constructor!!");
    }

    public Derived(int x, int y, int z) {
        super(x, y);
        setZ(z);
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}

class GrandChild extends Derived{
    GrandChild(){
        System.out.println("GrandChild Constructor!!");
    }
}


class Parent {
    int var1;
    int var2;
    Parent(int var1, int var2){
        this.var1 = var1;
        this.var2 = var2;
    }
}

class Child extends Parent {
    int var1;
    Child(int var1, int var2, int var3){
        super(var1, var2);
        this.var1 = var3;
        System.out.println("VAR 1 : "+ this.var1);
        System.out.println("VAR 2 : "+ this.var2);
        System.out.println("VAR 3 : "+ super.var1);
    }
}

class A{
    int a;
    A(int a){
        this.a = a;
        System.out.println("A : "+this.a);
    }

    public void printMyName(){
        System.out.println("HELLO!! I'm A.");
    }

    public void printWhatIdo(){
        System.out.println("I SHOW OVERRIDING SITUATION.");
    }
}

class B extends A{
    int b;
    B(int a, int b){
        super(a);
        this.b = b;
        System.out.println("B : "+this.b);
    }

    @Override // By declaring this, we ensure that if overriding is not being implemented, then we get to know.
    public void printMyName(){
        System.out.println("HELLO!! I'm B.");
    }

//    @Override  // throws an error
    public void printWhatIdo(int num){
        System.out.println("SHOW: "+num);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Base base1 = new Base(7, 9);
        System.out.println("X: "+ base1.getX());
        System.out.println("Y: "+ base1.getY());

        System.out.println("-------");
        Derived derived1 = new Derived(3,4,5);
        System.out.println(derived1.getX());
        System.out.println(derived1.getY());
        System.out.println(derived1.getZ());

        System.out.println("-------");
        Derived derived2 = new Derived();

        System.out.println("-------");
        GrandChild grandChild = new GrandChild();
        grandChild.setX(1);
        grandChild.setY(2);
        grandChild.setZ(3);
        System.out.println("X: "+ grandChild.getX());
        System.out.println("Y: "+ grandChild.getY());
        System.out.println("Z: "+ grandChild.getZ());

        System.out.println("-------");
        Child child = new Child(3,4,5);

        System.out.println("-------");
        A a = new A(50);
        a.printMyName();
        a.printWhatIdo();

        B b = new B(20, 100);
        b.printMyName();
        b.printWhatIdo();
        b.printWhatIdo(5);
    }
}
