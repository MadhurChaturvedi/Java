package class15;

public class Demo {
    public static void main(String[] args) {
        // string buffer
        StringBuffer sb = new StringBuffer("Madhur");
        // System.out.println(sb.capacity());
        System.out.print("Append - ");
        sb.append(" Chaturvedi");
        System.out.println(sb);
        System.out.print("deleteCharAt - ");
        sb.deleteCharAt(1);
        System.out.println(sb);
        System.out.print("insert - ");
        sb.insert(1, "a");
        System.out.println(sb);
        // String str = sb.toString();
        /*
         * the diff bwt StringBuffer and StringBuilder
         * is StringBuffer is thread save
         */
    }
}
