package Lesson_1.Marathon.Obstacles;

import Lesson_1.Marathon.Competitors.Competitor;
import Lesson_1.Marathon.Obstacles.Obstacle;

public class Water extends Obstacle {
    int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }
}