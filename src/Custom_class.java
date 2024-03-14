class Employee {
    private int ID;
    private int salary;
    private String name;

    // CONSTRUCTORS CAN ALSO BE OVERLOADED.
    public Employee(){
        ID = 1;
        salary = 0;
        name = "UNKNOWN";
    }

    public Employee(int ID, int salary, String name){
        this.setID(ID);
        this.setName(name);
        this.setSalary(salary);
    }
    public void printDetails(){
        System.out.println("My ID: "+this.ID);
        System.out.println("Name is "+this.name);
        System.out.println("Salary is "+this.salary);
    }

    public int getSalary(){
        return this.salary;
    }

    public void setSalary(int salary_enter){
        this.salary = salary_enter;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID_enter){
        this.ID = ID_enter;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name_enter){
        this.name = name_enter;
    }
}

class CellPhone {
    public void printRing(){
        System.out.println("RINGING...");
    }

    public void printVibrate(){
        System.out.println("VIBRATING...");
    }
}

class Square {
    private int side;
    private String color;

    public Square(int side, String color){
        this.setSide(side);
        this.color = color;
    }
    public int getSide(){
        return side;
    }

    private void setSide(int side_enter){
        side = side_enter;
    }

    public int Area(){
        return side*side;
    }

    public int Perimeter(){
        return side*4;
    }
}

class Cylinder{
    private int length;
    private int height;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

public class Custom_class {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
//        employee1.name = "Gorve Kumar";
//        employee1.salary = 200000; // throws error becoz of private modifier
//        employee1.ID = 1;
        employee1.setName("Gorve");
        employee1.setSalary(200000);
        employee1.setID(13);
        System.out.println(employee1.getName());
        System.out.println(employee1.getID());
        System.out.println(employee1.getSalary());

        Employee employee2 = new Employee(3,4334,"Bilal");
        System.out.println(employee2.getName());


        CellPhone cellPhone1 = new CellPhone();
        cellPhone1.printRing();
        cellPhone1.printVibrate();

        Square square1 = new Square(3,"Black");
        System.out.println("Side of Square    : "+square1.getSide());
        System.out.println("Area of Square    : "+square1.Area());
        System.out.println("Area of Perimeter : "+square1.Perimeter());

        float pi = (float) Math.PI;
        System.out.println(pi);
    }
}
