
class Calculator {
    public int add(int x, int y) {
        int result = x + y;
        return result;
    }
}

public class demo { // Class name matches the file name
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int num = 1, num2 = 1;
        int sum = calc.add(num, num2);
        System.out.println(sum);
    }
}
