package class17;

// Inheritance and this keyboard

class Students {
    private int rollno;
    private String Name;

    public Students() {  // default Constructor
        // System.out.println(" in Constructor!");
        rollno = 12;
        Name = "Jhon";
    }

    public Students(int rollno, String name) {
        this.rollno = rollno;
        Name = name;
    }

    public Students(int a) {
        // System.out.println(" in Constructor!");
        rollno = a;

    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getRollno() {
        return rollno;
    }
}

public class demo {
    public static void main(String[] args) {
        Students obj = new Students();
        Students obj1 = new Students(1);
        System.out.println(obj.getRollno());

        obj.setRollno(31);
        obj1.setRollno(2);
        System.out.println(obj.getRollno());
        System.out.println(obj1.getRollno());
    }
}
