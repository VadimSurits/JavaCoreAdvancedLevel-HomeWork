package homeWork1.Obstacles;

import homeWork1.Participants.Participant;

public class Wall implements Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void passTheObstacle(Participant p) {
        p.heightJump(height);
    }
}
