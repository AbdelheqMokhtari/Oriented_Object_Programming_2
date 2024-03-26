public class Main {
    public static void main(String[] args) {
        Manager ahmed = new Manager("Ahmed",6000.0,1000.0);
        ahmed.displayInfo();
        ahmed.calculateSalary();


        Programmer aymen = new Programmer("Aymen",5000,20,25);
        aymen.displayInfo();

    }
}