interface Interface{
    void meth1();
}

interface ChildInterface extends Interface{
    void meth2();

    default void meth3(){
        System.out.println("Hello I'm Meth3");
    }
}

//class Sample extends ChildInterface ---> not possible

class Sample implements ChildInterface{

    @Override
    public void meth1() {
        System.out.println("Hello I'm Meth1");
    }

    @Override
    public void meth2() {
        System.out.println("Hello I'm Meth2");
    }
}


public class Interface_Inheritance {
    public static void main(String[] args) {
        new Sample().meth1();
        new Sample().meth2();
        new Sample().meth3();
    }
}