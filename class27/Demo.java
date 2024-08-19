package class27;

class A {
    public void show1() {
        System.out.println(" in A show");
    }
}

class B extends A {

    public void show2() {
        System.out.println(" in B show");
    }
}

public class Demo {

    // upcasting and downCasting
    public static void main(String args[]) {
        // double d = 4.5;
        // int i = (int) d;
        // System.out.println(i);
        A obj = (A) new B();
        // upCasting
        obj.show1();

        B obj1 = (B) obj;
        obj1.show2();
    }
}
