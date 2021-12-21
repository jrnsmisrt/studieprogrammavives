package be.vives.trajectory;

import be.vives.course.Course;

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
        coursesFromTrajectory.append(calculateTrajectoryResult().toUpperCase()).append("\n");
        for(Course course : courses){
            coursesFromTrajectory.append(course).append("\n");
        }
        return coursesFromTrajectory.toString().trim();
    }
    private String calculateTrajectoryResult(){
        double succesResult=0;

        for(Course course : getCourses()){
            if(course.getSuccess().equals("geslaagd")){
                succesResult+=1;
            }
        }
        if(succesResult>=((double)getCourses().size()/2)){
            return "geslaagd";
        }
        else return "niet geslaagd";
    }

    @Override
    public String toString(){
        return getAllCoursesFromTrajectory();
    }
}
