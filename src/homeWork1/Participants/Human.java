package homeWork1.Participants;

public class Human implements Participant {
    String type;
    String name;
    int maxRunDistance;
    int maxHeightJump;
    boolean OnDistance;

    public Human(String type, String name, int maxRunDistance, int maxHeightJump) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxHeightJump = maxHeightJump;
        this.OnDistance = true;
    }

    @Override
    public void run(int distance) {
        if(distance <= maxRunDistance){
            System.out.println(type + " " + name + " has successfully run " + distance + " metres!");
        } else{
            System.out.println(type + " " + name + " couldn't run " + distance + " metres and rejected from " +
                    "further participation!");
            OnDistance = false;
        }
    }

    @Override
    public void heightJump(int height) {
        if (height <= maxHeightJump) {
            System.out.println(type + " " + name + " has successfully vaulted over " + height + "-metres wall!");
        } else {
            System.out.println(type + " " + name + " couldn't vault over " + height + "-metres wall and rejected" +
                    " from further participation!");
            OnDistance = false;
        }
    }

    @Override
    public boolean isOnDistance(){
        return OnDistance;
    }
}
