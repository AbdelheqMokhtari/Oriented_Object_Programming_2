import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player aymen = new Player("aymen",100,250);
        List <String> saved = new ArrayList<>();
        saved = aymen.write();
        aymen.displayInfo();
        System.out.println("************************************");
        aymen.setHitPoints(75);
        aymen.setName("Ahmed");
        aymen.setWeapon("arch");
        aymen.setStrength(300);
        aymen.displayInfo();
        System.out.println("************************************");
        aymen.read(saved);
        aymen.displayInfo();

        System.out.println("************************************");
        System.out.println(aymen);

    }
}