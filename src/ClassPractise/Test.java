package ClassPractise;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        String name = s.getName();
        System.out.println("Name: " + name);
        String ID = s.getID();
        System.out.println("ID: " + ID);
        String major = s.getMajor();
        System.out.println("Major: " + major);
        double GPA = s.getGPA();
        System.out.println("GPA: " + GPA);


    }
}
