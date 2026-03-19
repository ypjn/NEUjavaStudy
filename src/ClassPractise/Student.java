package ClassPractise;

public class Student {
    private String name;
    private String ID;
    private String major;
    double GPA;
     public String setmajor(String newMajor){
        major = newMajor;
        System.out.println("major is set to " + major);
        return major;
    }
    public double setGPA(double GPA){
        System.out.println("GPA is set to " + GPA);
        return GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGPA() {
        return GPA;
    }
}