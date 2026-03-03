import java.util.Scanner;

class Student {
    private String name;
    private double marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100)
            this.marks = marks;
        else
            System.out.println("Invalid marks entered!");
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public boolean isPass() {
        return marks >= 50;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        int passCount = 0;

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();

            System.out.print("Enter name: ");
            students[i].setName(sc.nextLine());

            System.out.print("Enter marks: ");
            students[i].setMarks(sc.nextDouble());
            sc.nextLine();

            if (students[i].isPass()) {
                passCount++;
            }
        }

        System.out.println("\nStudents Passed: " + passCount);
        sc.close();
    }
}
/*
Task: Student Array — Pass/Fail Tracking

Problem Statement:
Create a system to handle multiple students using an array of objects.

Class Name: Student

Private Fields:
- name (String)
- marks (double)

Requirements:
- Calculate the number of students passed (marks > 55 or passing condition).
- In the main method, create an array to hold 3 Student objects.
- Use a loop and Scanner to gather data for each student.
- After input, display the names of students who passed and the total pass count.
*/