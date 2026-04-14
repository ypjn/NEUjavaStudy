package AcademicTranscript;
import java.util.ArrayList;

public class PersonalInformation {
    private String name;              // 姓名
    private String gender;            // 性别
    private String birthDate;         // 出生日期
    private int studentId;            // 学号
    private String phoneNumber;       // 手机号
    private String email;             // 邮箱
    private String studentClass;      // 班级
    private String major;             // 专业
    private String ethnicity;         // 民族
    private String idNumber;          // 身份证号
    private String enrollmentDate;    // 入学日期
    private String graduationDate;    // 毕业日期
    private String department;        // 院系
    private String trainingPlan;      // 培养方案
    private String degreeType;        // 获得学位
    private String totalCredits;      // 已获得总学分数
    private String averageGPA;        // 平均学分绩点
    private String conclusion;        // 毕业结论
    private String degreeTime;        // 授予学位时间

    public PersonalInformation() {
    }

    public PersonalInformation(String name, String gender, String birthDate, int studentId, String phoneNumber, String email, String studentClass, String major, String ethnicity, String idNumber, String enrollmentDate, String graduationDate, String department, String trainingPlan, String degreeType, String totalCredits, String averageGPA, String conclusion, String degreeTime, ArrayList<CourseRecord> courses) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.studentId = studentId;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.studentClass = studentClass;
        this.major = major;
        this.ethnicity = ethnicity;
        this.idNumber = idNumber;
        this.enrollmentDate = enrollmentDate;
        this.graduationDate = graduationDate;
        this.department = department;
        this.trainingPlan = trainingPlan;
        this.degreeType = degreeType;
        this.totalCredits = totalCredits;
        this.averageGPA = averageGPA;
        this.conclusion = conclusion;
        this.degreeTime = degreeTime;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTrainingPlan() {
        return trainingPlan;
    }

    public void setTrainingPlan(String trainingPlan) {
        this.trainingPlan = trainingPlan;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(String totalCredits) {
        this.totalCredits = totalCredits;
    }

    public String getAverageGPA() {
        return averageGPA;
    }

    public void setAverageGPA(String averageGPA) {
        this.averageGPA = averageGPA;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getDegreeTime() {
        return degreeTime;
    }

    public void setDegreeTime(String degreeTime) {
        this.degreeTime = degreeTime;
    }

    public ArrayList<CourseRecord> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<CourseRecord> courses) {
        this.courses = courses;
    }

    private ArrayList<CourseRecord> courses;

    public int getNumberOfCourses() {
        return courses.size();
    }


}
