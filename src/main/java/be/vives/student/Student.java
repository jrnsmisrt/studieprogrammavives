package be.vives.student;

import be.vives.trajectory.Trajectory;
import be.vives.course.Course;

import java.util.UUID;

public class Student {
    private String name;
    private String firstName;
    private final UUID studentId;
    private final Trajectory trajectory;

    public Student(String name, String firstName, Trajectory trajectory) {
        this.name = name;
        this.firstName = firstName;
        this.studentId = UUID.randomUUID();
        this.trajectory=trajectory;
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

    public void addCourseToTrajectory(Course course){
        trajectory.addCourse(course);
    }
    public void removeCourseFromTrajectory(String courseId){
        trajectory.removeCourse(courseId);
    }
    public String showCoursesInTrajectory(){
        return name+" "+firstName+" "+trajectory.getAllCoursesFromTrajectory();
    }

    @Override
    public String toString() {
        return name+" "+firstName;
    }
}
