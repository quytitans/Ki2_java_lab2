package lab2_exercise1;

import lab2_exercise1.Entity.Student;

public class MainThread {
    public static void main(String[] args) {
        Student studentA;
        Student studentB;
        studentA = new Student();
        studentB = new Student(1, "Nguyen Van Quy", true);
        studentB.printInfo();
        studentB.setName("Nguyen Van Binh");
        studentB.printInfo();
    }
}
