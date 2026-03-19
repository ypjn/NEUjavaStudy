package ClassPractise;

public class Student {
    String name;
    String ID;
    String major;
    double GPA;
    String setmajor(String newMajor){
        major = newMajor;
        System.out.println("major is set to " + major);
        return major;
    }
    double setGPA(double GPA){
        System.out.println("GPA is set to " + GPA);
        return GPA;
    }
}