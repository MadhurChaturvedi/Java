package class16;

class Moble {
    String brand;
    int price;
    String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class Demo {
    public static void main(String[] args) {
        Moble obj1 = new Moble();
        obj1.brand = "Apple";
        obj1.price = 200;
        obj1.name = "I Phone";

        Moble obj2 = new Moble();
        obj2.brand = "Samsung";
        obj2.price = 100;
        obj2.name = "Samsung";

        obj1.show();
        obj2.show();
    }
}
