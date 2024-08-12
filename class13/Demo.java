package class13;

class Student {
    // this all instance variables not a method
    int rollno;
    String name;
    int marks;

}

public class Demo {
    public static void main(String[] args) {
        // int nums[] = new int[6];
        // nums[0] = 4;
        // nums[1] = 8;
        // nums[2] = 3;
        // nums[3] = 9;

        // for (int i = 0; i < nums.length; i++) {
        // System.out.println(nums[i]);
        // }
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Peter";
        s1.marks = 50;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Tom";
        s2.marks = 70;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Heisenberg";
        s3.marks = 99;

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].name + " : " + student[i].rollno);
        }
    }

}
