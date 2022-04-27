package ch3.ex8;

import ch3.ex8.Student;

public class StudentTester {
    public static void main(String[] args) {
        Student student = new Student("Tolik");

        student.addQuiz(1);
        student.addQuiz(2);
        student.addQuiz(3);

        System.out.println(student.toString());
        System.out.println(student.getAverageScore());
        System.out.println(student.getTotalScore());
        System.out.println(student.getName());
    }
}
