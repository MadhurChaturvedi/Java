
class demo {
    public static void main(String[] args) {
        // Array
        // int num[] = { 5, 4, 4 };
        // int num1[] = new int[4];
        // System.out.println(num[0]);

        // int nums[] = { 1, 2, 3, 5 };
        // int nums[] = new int[4];
        // nums[0] = 4;
        // nums[1] = 5;
        // nums[2] = 6;
        // nums[3] = 7;
        // for (int i = 0; i < nums.length; i++) {
        // System.out.println(nums[i]);
        // }

        // multydimensinal Array
        int arr[][] = new int[3][4]; 

        // arr[1][1] = 5;
        // System.out.println(arr[1][1]);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }

        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 4; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        for (int n[] : arr) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}