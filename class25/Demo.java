package class25;

final class Calc {
    public void show() {

    }

    final public void add(int a, int b) {
        System.out.println(a + b);
    }
}

// class AdvCalc extends Calc {

// }

public class Demo {
    public static void main(String[] args) {
        // final is a just like a const in javascript
        // final int num = 8;
        // num = 9;
        // System.out.println(num);
        Calc obj = new Calc();
        obj.show();
        obj.add(6, 6);

    }

}
