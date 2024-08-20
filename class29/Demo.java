package class29;

abstract class Car {
    // abstract
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("Play music");
    }
}

abstract class WagonR extends Car {
    public void drive() {
        System.out.println("Driving...");
    }

    // public void fly() {
    // System.out.println("Fly");
    // }

}

class updatedWagonR extends WagonR {

    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("Unimplemented method 'fly'");
    }

}

public class Demo {
    public static void main(String[] args) {
        Car obj = new updatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
