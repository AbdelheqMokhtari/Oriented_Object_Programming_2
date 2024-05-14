public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Corona Cadogan", 6000, 1000);
        Employee programmer = new Programmer("Antal Nuka", 5000, 20, 25.0);

        manager.displayInfo();
        System.out.println("---------------------");
        programmer.displayInfo();
    }
}
