import java.util.ArrayList;
import java.util.List;

public class Monster implements Saveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> saved = new ArrayList<>();
        saved.add(this.name); // index --> 0
        saved.add(String.valueOf(this.hitPoints));// 100 --> "100", index -->1
        saved.add(String.valueOf(this.strength)); // index --> 2
        return saved;
    }

    @Override
    public void read(List<String> savedValues) {
        this.name = savedValues.get(0);
        this.hitPoints = Integer.parseInt(savedValues.get(1));
        this.strength = Integer.parseInt(savedValues.get(2));

    }

    public void displayInfo(){
        System.out.println("the player name : " + this.name);
        System.out.println("hit points : " + this.hitPoints);
        System.out.println("strength : " + getStrength());
    }
}
