public class Percussion extends Instrument {
    @Override
    public void play() {
        System.out.println("Percussion.play()");
    }


    public String what() { return "Percussion"; }
    @Override
    public void adjust() {}
}
