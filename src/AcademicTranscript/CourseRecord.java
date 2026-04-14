package AcademicTranscript;

public class CourseRecord {
    private String courseName;        // 课程名
    private String credit;            // 学分
    private String score;             // 成绩
    private String courseType;        // 课程属性（必修/选修/任选）
    private String attemptCount;      // 修读次数
    private String semester;          // 考试时间（如：2016 秋）

    public CourseRecord() {
    }

    public CourseRecord(String courseName, String credit, String score, String courseType, String attemptCount, String semester) {
        this.courseName = courseName;
        this.credit = credit;
        this.score = score;
        this.courseType = courseType;
        this.attemptCount = attemptCount;
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getAttemptCount() {
        return attemptCount;
    }

    public void setAttemptCount(String attemptCount) {
        this.attemptCount = attemptCount;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
