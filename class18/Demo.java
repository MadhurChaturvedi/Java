package class18;

class A {
    public A() {
        System.out.println("Object created");
    }

    public void show() {
        System.out.println("in A show");
    }
}

public class Demo {
    public static void main(String[] args) {

        int marks;
        marks = 99;
        new A().show(); // anonymous object because dont have a name
        // A obj;
        // obj = new A(); // creating a new object;
        // obj.show();

    }
}
