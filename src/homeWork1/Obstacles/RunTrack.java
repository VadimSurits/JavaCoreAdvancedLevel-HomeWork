package homeWork1.Obstacles;

import homeWork1.Participants.Participant;

public class RunTrack implements Obstacle {
    int distance;

    public RunTrack(int distance) {
        this.distance = distance;
    }

    @Override
    public void passTheObstacle(Participant p) {
        p.run(distance);
    }
}
