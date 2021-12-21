package be.vives;

import be.vives.course.Course;
import be.vives.course.CoursesEnum;
import be.vives.student.Student;
import be.vives.trajectory.Trajectory;

import java.util.ArrayList;
import java.util.List;

public class StudieProgrammaRunner {

    public static void main(String[] args) {
        List<Course> courseListBondJames = new ArrayList<>();
        Trajectory trajectoryOfBondJames = new Trajectory(courseListBondJames);
        trajectoryOfBondJames.addCourse(new Course(CoursesEnum.MATHMATICS));
        trajectoryOfBondJames.addCourse(new Course(CoursesEnum.NEDERLANDS));
        Student james = new Student("Bond", "James", trajectoryOfBondJames);
        james.addCourseToTrajectory(new Course(CoursesEnum.ECONOMY));
        james.getTrajectory().getCourse("ECON").setAchievedScore(10);
        System.out.println(james.showCoursesInTrajectory());
        System.out.println("---------------------------------------");

        List<Course> courseListMoneyPenny = new ArrayList<>();
        Trajectory trajectoryMoneyPenny = new Trajectory(courseListMoneyPenny);
        Student moneyPenny = new Student("Money", "Penny", trajectoryMoneyPenny);
        moneyPenny.addCourseToTrajectory(new Course(CoursesEnum.FRANCAIS));
        moneyPenny.addCourseToTrajectory(new Course(CoursesEnum.CODING));
        moneyPenny.getTrajectory().getCourse("FRANC").setAchievedScore(10);
        moneyPenny.getTrajectory().getCourse("COD").setAchievedScore(12);
        System.out.println(moneyPenny.showCoursesInTrajectory());


    }
}
