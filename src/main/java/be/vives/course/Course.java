package be.vives.course;

public class Course {

    private String name;
    private final String courseId;
    private final CoursesEnum course;
    private static final int MAX_SCORE = 20;
    private double achievedScore;
    private boolean successful;
    private boolean partaken;
    private int studyPoints;

    public Course(CoursesEnum course) {
        this.course = course;
        this.name = course.getCourseName();
        this.successful = false;
        this.courseId = course.getId();
        this.partaken = false;
        this.studyPoints = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseId() {
        return courseId;
    }

    public double getAchievedScore() {
        return achievedScore;
    }

    public void setAchievedScore(double achievedScore) {
        this.achievedScore = achievedScore;
        setSuccessful();
        setPartaken();
    }

    private void setSuccessful() {
        if (achievedScore >= 10) {
            this.successful = true;
        }
    }

    public String getSuccess() {
        if (!partaken) {
            return "niet deelgenomen";
        }
        if (successful) {
            return "credit behaald";
        } else {
            return "niet geslaagd";
        }
    }

    private boolean isPartaken() {
        return partaken;
    }

    private void setPartaken() {
        this.partaken = true;
    }

    public int getStudyPoints() {
        return studyPoints;
    }

    public void setStudyPoints(int studyPoints) {
        this.studyPoints = studyPoints;
    }

    @Override
    public String toString() {
        return course.getId() + " " + name + " " + studyPoints + " SP " + " Behaalde punten: " + achievedScore + "/" + MAX_SCORE + " -> " + getSuccess();

    }
}
