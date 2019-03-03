package Lesson_1.Marathon;

import Lesson_1.Marathon.Competitors.*;
import Lesson_1.Marathon.Obstacles.Course;
import Lesson_1.Marathon.Obstacles.Cross;
import Lesson_1.Marathon.Obstacles.Obstacle;
import Lesson_1.Marathon.Obstacles.Wall;
import Lesson_1.Marathon.Obstacles.Water;


public class Main {
    public static void main(String[] args) {
        //
        Team team = new Team("Good");
        Course course = new Course(new String[]{"wall","water", "cross"}, new int[]{2,11,100});

        course.doIt(team);
        team.info_success();
        System.out.println("------------------------------");
        team.info();

        /*System.out.println("------------------------------");
        Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Бобик")};
        Obstacle[] co = {new Cross(80), new Wall(2), new Water(100), new Cross(19920)};
        for (Competitor c : competitors) {
            for (Obstacle o : co) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
        for (Competitor c : competitors) {
            c.info();
        }*/
    }
}