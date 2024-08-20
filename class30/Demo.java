package class30;

class A {

    // inner class
    int age;

    public void show() {

    }

    class B {
        public void config() {
            System.out.println("in config");
        }
    }

}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();
    }
}
