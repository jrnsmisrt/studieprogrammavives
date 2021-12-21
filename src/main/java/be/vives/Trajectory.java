package be.vives;

import java.util.List;

public class Trajectory {
    private List<Course> courses;

    public Trajectory(List<Course> courses) {
        this.courses = courses;
    }
    public Trajectory(){

    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course){
        courses.add(course);
    }
    public void removeCourse(String id){
        courses.removeIf(course -> course.getCourseId().equals(id));
    }

    public Course getCourse(String id){
        for(Course course : courses){
            if(course.getCourseId().equals(id)){
                return course;
            }
        }
        System.out.println("Course not found");
        return null;
    }
    public String getAllCoursesFromTrajectory(){
        StringBuilder coursesFromTrajectory = new StringBuilder();
        for(Course course : courses){
            coursesFromTrajectory.append(course).append("\n");
        }
        return coursesFromTrajectory.toString().trim();
    }
}
