class Demo {
    public static void main(String[] args) {
        // wraper class primitiv type we have a class

        int num = 7;
        // Integer num = new Integer(5);
        Integer num1 = 5; // we taking a primitiv values and storing that in a Object and its called
                          // auto-boxing

        int num2 = num1.intValue(); // auto-unboxing

        String str = "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3);
        System.out.println(num1);
        System.out.println(num2);
    }
}