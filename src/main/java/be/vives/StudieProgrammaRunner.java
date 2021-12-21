package be.vives;

import java.util.ArrayList;
import java.util.List;

public class StudieProgrammaRunner {


    public static void main(String[] args) {
        Course maths = new Course(Courses.MATHMATICS);
        Course nederlands = new Course(Courses.NEDERLANDS);
        List<Course> trajectoryBondJames = new ArrayList<>();



        Trajectory bondJames = new Trajectory(trajectoryBondJames);

        Student james = new Student("Bond", "James", bondJames);
        System.out.println(james);

        james.addCourseToTrajectory(new Course(Courses.ECONOMY));
        System.out.println(james.showCoursesInTrajectory());
        james.getTrajectory().getCourse("ECON").setAchievedScore(10);
        System.out.println(james.showCoursesInTrajectory());


    }
}
