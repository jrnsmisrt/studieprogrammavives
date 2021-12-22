package be.vives.student;

import be.vives.trajectory.Trajectory;
import be.vives.course.Course;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private String firstName;
    private final UUID studentId;
    private final Trajectory trajectory;

    public Student(String name, String firstName, Trajectory trajectory) {
        this.name = name;
        this.firstName = firstName;
        this.studentId = UUID.randomUUID();
        this.trajectory = trajectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public Trajectory getTrajectory() {
        return trajectory;
    }

    public void addCourseToTrajectory(Course course) {
        trajectory.addCourse(course);
    }

    public void removeCourseFromTrajectory(String courseId) {
        trajectory.removeCourse(courseId);
    }

    public List<Course> showCoursesInTrajectory() {
        return trajectory.getCourses();
    }

    public void setScoreForCourse(double score, String courseId) {
        if (isCourseIdCorrect(courseId)) {
            trajectory.getCourse(courseId).setAchievedScore(score);
        }
        else System.out.println("Het vak ID werd niet gevonden.");

    }
    public String getTrajectoryInformation(){
        return name + " " + firstName + " " + trajectory.getAllCoursesFromTrajectory();
    }

    private boolean isCourseIdCorrect(String courseId) {
        for (Course course : trajectory.getCourses()) {
            if (course.getCourseId().equals(courseId)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return name + " " + firstName;
    }
}
