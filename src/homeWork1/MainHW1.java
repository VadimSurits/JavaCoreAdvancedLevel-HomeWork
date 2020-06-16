package homeWork1;

import homeWork1.Obstacles.Obstacle;
import homeWork1.Obstacles.RunTrack;
import homeWork1.Obstacles.Wall;
import homeWork1.Participants.Cat;
import homeWork1.Participants.Human;
import homeWork1.Participants.Participant;
import homeWork1.Participants.Robot;

public class MainHW1 {                            // <- задания 1-4
    public static void main(String[] args) {

        Participant[] participants = {
            new Human("Human", "Vasily Pupkin", 3000, 1),
            new Cat("Cat", "SuperCat", 1000, 2),
            new Robot("Robot", "R2D2", 10000, 0)
        };
        Obstacle[] obstacles = {
            new RunTrack(2500),
            new Wall(1),
        };

        for (Participant p: participants) {
            for (Obstacle o: obstacles) {
                o.passTheObstacle(p);
                if (!p.isOnDistance()){
                    break;
                }
            }
        }


    }
}
