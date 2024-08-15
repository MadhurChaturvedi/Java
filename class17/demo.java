package class17;

// Inheritance and this keyboard

class Students {
    private int rollno;
    private String Name;

    public Students() {
        // System.out.println(" in Constructor!");
        rollno = 12;
        Name = "Jhon";
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
        Students obj1 = new Students();
        System.out.println(obj.getRollno());

        obj.setRollno(31);
        // System.out.println(obj.getRollno());
    }
}
