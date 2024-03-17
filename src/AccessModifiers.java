//package com.company;

class Class1{
    public int a = 5;
    protected int b = 10;
    int c = 15;
    private int d = 20;

    public void From_Same_Class(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        class1.From_Same_Class();

        // From Same Package
        System.out.println(class1.a);
        System.out.println(class1.b);
        System.out.println(class1.c);
//        System.out.println(class1.d); // Can't be accessed
    }
}
