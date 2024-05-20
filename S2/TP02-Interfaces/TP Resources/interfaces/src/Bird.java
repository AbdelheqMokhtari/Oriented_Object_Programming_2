public class Bird extends Animal implements FlightEnabled, Trackable {

    @Override
    public void move() {
        System.out.println("Flaps wings");
    }

    @Override
    public void takeOff() {
        System.out.println(" is taking off");
    }

    @Override
    public void land() {
        System.out.println(" is landing");
    }

    @Override
    public void fly() {
        System.out.println(" is flying");
    }

    @Override
    public void track() {
        System.out.println(" coordinates ");
    }
}