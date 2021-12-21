package be.vives;

public class Course {

    private String name;
    private String courseId;
    private Courses course;
    private static final int MAX_SCORE = 20;
    private double achievedScore;
    private boolean successful;

    public Course(Courses course) {
        this.course=course;
        this.name = course.getCourseName();
        this.successful = false;
        this.courseId = course.getId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseId() {
       return  course.getId();
    }

    public double getAchievedScore() {
        return achievedScore;
    }

    public void setAchievedScore(double achievedScore) {
        this.achievedScore = achievedScore;
        setSuccessful();
    }

    private void setSuccessful() {
        if(achievedScore>=10){
            this.successful=true;
        }
    }
    public String getSuccess(){
        if(successful){
            return "Geslaagd";
        }
        else{
            return "Niet geslaagd";
        }
    }

    @Override
    public String toString() {
        return name +" Behaalde punten: "+achievedScore+"/"+MAX_SCORE+" -> "+getSuccess();

    }
}
