import java.util.ArrayList;
import java.util.List;

public class Player implements Saveable{
    String name;
    String weapon;
    int hitPoints;
    int strength;

    public Player(String name, int hitPoints, int strength) {
        this.weapon = "sword";
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

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
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
        saved.add(this.weapon); // index --> 1
        saved.add(String.valueOf(this.hitPoints));// 100 --> "100", index -->2
        saved.add(String.valueOf(this.strength)); // index --> 3
        return saved;
    }

    @Override
    public void read(List<String> savedValues) {
        this.name = savedValues.get(0);
        this.weapon = savedValues.get(1);
        this.hitPoints = Integer.parseInt(savedValues.get(2));
        this.strength = Integer.parseInt(savedValues.get(3));
    }

    public void displayInfo(){
        System.out.println("the player name : " + this.name);
        System.out.println("weapon : " + this.weapon);
        System.out.println("hit points : " + this.hitPoints);
        System.out.println("strength : " + getStrength());
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
