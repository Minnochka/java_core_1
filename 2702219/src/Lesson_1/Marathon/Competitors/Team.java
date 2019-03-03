package Lesson_1.Marathon.Competitors;

public class Team {
    String team_name;
    int competitors = 4;
    Competitor[] team_competitors = new Competitor[competitors];

    public Team(String team_name) {
        this.team_competitors[0] = new Human("Боб");
        this.team_competitors[1] = new Cat("Барсик");
        this.team_competitors[2] = new Dog("Бобик");
        this.team_competitors[3] = new Human("Стив");
        this.team_name = team_name;
    }


    public Team(String team_name, String[][] team) {
        if (team.length != competitors){
            System.out.println("В команде может быть " + competitors + " участников!");
        }
        else {
            for (int i = 0; i < competitors; i++) {
                if (team[i][0].toLowerCase() == "human") {
                    this.team_competitors[i] = new Human(team[i][1]);
                } else if (team[i][0].toLowerCase() == "cat") {
                    this.team_competitors[i] = new Cat(team[i][1]);
                } else if (team[i][0].toLowerCase() == "dog") {
                    this.team_competitors[i] = new Dog(team[i][1]);
                }
            }
            this.team_name = team_name;
        }
    }

    public void info() {
        for (int i = 0; i < competitors; i++) {
            this.team_competitors[i].info();
        }
    }

    public void info_success() {
        System.out.println("С заданием справились:");
        for (int i = 0; i < competitors; i++) {
            if (this.team_competitors[i].isOnDistance()){
                this.team_competitors[i].info();
            }
        }
    }

    public void setCompetitors ( int competitors){
        this.competitors = competitors;
    }

    public Competitor[] getTeam_competitors() {
        return team_competitors;
    }
}