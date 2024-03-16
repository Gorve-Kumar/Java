abstract class Hello{
    public Hello(){
        System.out.println("Constructor");
    }

    abstract public String greet();
    abstract public String greetback();
}

class Chinese extends Hello{
    Chinese(){
        System.out.println("Chinese!");
    }

    @Override
    public String greet(){
        return "Ni Hau!!";
    }

    @Override
    public String greetback(){
        return "Ni Hau Maa!!";
    }
}


class Pakistan extends Hello{
    Pakistan(){
        System.out.println("Pakistan!");
    }

    @Override
    public String greet(){
        return "Salam!!";
    }

    @Override
    public String greetback(){
        return "Waalikium Salam!!";
    }
}

public class Abstract_Classes {
    public static void main(String[] args) {
        Chinese chinese = new Chinese();
        System.out.println(chinese.greet());
        System.out.println(chinese.greetback());
    }
}