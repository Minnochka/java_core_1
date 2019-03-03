package Lesson_1.Marathon.Obstacles;

import Lesson_1.Marathon.Competitors.Competitor;
import Lesson_1.Marathon.Competitors.Team;

public class Course {
    int obstacle_num = 3;
    Obstacle[] course = new Obstacle[obstacle_num];

    public Course(String obstacles[], int length[]){
        for (int i = 0; i < obstacle_num; i++){
            if (obstacles[i].toLowerCase() == "cross"){
                this.course[i] = new Cross(length[i]);
            }
            else if (obstacles[i].toLowerCase() == "wall"){
                this.course[i] = new Wall(length[i]);
            }
            else if (obstacles[i].toLowerCase() == "water"){
                this.course[i] = new Water(length[i]);
            }
        }
    }

    public Course(){
        this.course[0] = new Cross(100);
        this.course[1] = new Wall(2);
        this.course[2] = new Water(50);
    }

    public void doIt(Team team){
        for (Competitor c : team.getTeam_competitors()){
            for (int i = 0; i < obstacle_num; i++) {
                this.course[i].doIt(c);
            }
        }
    }

}
