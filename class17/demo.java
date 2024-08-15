package class17;

class Students {
    private int rollno;
    private String Name;

    public void setRollno(int a) {
        rollno = a;
    }

    public int getRollno() {
        return rollno;
    }
}

public class demo {
    public static void main(String[] args) {
        Students obj = new Students();
        obj.setRollno(31);
        System.out.println(obj.getRollno());
    }
}
