package chapter6;

public class Player {
    private int points;
    private String name;
    private int roll;
    private String identifier;

    // copy constructor
    public Player(Player player) {
        this.points = player.points;
    }

    public Player() {
        this.setPoints(25);
    }

    public int rollTheDice() {
        Die die1 = new Die(6);
        Die die2 = new Die(6);

        die1.roll();
        die2.roll();


        return die1.getValue() + die2.getValue();
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
