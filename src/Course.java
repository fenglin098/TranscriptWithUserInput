public class Course {
    private String courseName;
    private int credits;
    private String grade;
    private int qualityPoints;

    public Course(){}

    public Course(String courseName,int credits, String grade,int qualityPoints){
        this.courseName=courseName;
        this.credits=credits;
        this.grade=grade;
        this.qualityPoints=qualityPoints;

    }

    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getQualityPoints() {
        return qualityPoints;
    }

    public void setQualityPoints(int qualityPoints) {
        this.qualityPoints = qualityPoints;
    }
}
