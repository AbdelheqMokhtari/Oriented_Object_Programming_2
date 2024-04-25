public class Fish extends Animal {

    public Fish(String type, String size, double weight) {

        super(type, size, weight);
    }
    @Override
    public void move(String speed) {

        if (speed.equals("slow")) {
            System.out.println(type + " slow");
        } else {
            System.out.println(type + " fast");
        }

    }

    @Override
    public void makeNoise() {
            System.out.print("Fish sound ");
    }

}
