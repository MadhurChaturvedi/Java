package class21;

class Cale {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public void config() {
        System.out.println("in A config");
    }
}

class Advnace extends Cale {
    public int add(int n1, int n2) {
    return n1 + n2 + 1;
    }
    // this is could in java method overRiding
}

public class Demo {
    public static void main(String[] args) {
        Advnace obj = new Advnace();
        int r1 = obj.add(5, 5);
        System.out.println(r1);
    }
}
