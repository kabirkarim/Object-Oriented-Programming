import java.util.Scanner;

class Employee {
    private String name;
    private double salary;
    private int years;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary >= 0) this.salary = salary;
    }

    public void setYears(int years) {
        if (years >= 0) this.years = years;
    }

    public double calculateBonus() {
        if (years >= 5)
            return salary * 0.20;
        else
            return salary * 0.10;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[3];

        for (int i = 0; i < 3; i++) {
            emp[i] = new Employee();

            System.out.print("Name: ");
            emp[i].setName(sc.nextLine());

            System.out.print("Salary: ");
            emp[i].setSalary(sc.nextDouble());

            System.out.print("Experience: ");
            emp[i].setYears(sc.nextInt());
            sc.nextLine();
        }

        System.out.println("\n--- Bonuses ---");
        for (Employee e : emp) {
            System.out.println(e.getName() + " Bonus: " + e.calculateBonus());
        }
        sc.close();
    }
}/*
Task: Employee Record System — Bonus Calculator

Problem Statement:
Create an employee record system to calculate bonuses based on experience.

Class Name: Employee

Private Fields:
- name (String)
- salary (double)
- yearsOfExperience (int)

Requirements:
- Add a method calculateBonus():
    * If experience >= 5 years, bonus is 20% of salary.
    * Otherwise, bonus is 10% of salary.
- Use Scanner to input details for 3 employees into an array.
- Display a summary showing each employee's name and their calculated bonus.
*/