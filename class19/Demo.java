package class19;

class Demo {
    public static void main(String[] args) {
        Calc obj = new Calc();
        AdvCal newCal = new AdvCal();
        int r1 = obj.add(5, 5);
        int r2 = obj.add(5, 5);
        int r3 = newCal.div(10, 2);
        int r4 = newCal.multi(10, 2);
        // AdvCal
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);

    }
}
