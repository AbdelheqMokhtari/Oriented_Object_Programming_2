public class Wind extends Instrument {
    @Override
    public void play() {
        System.out.println("Wind.play()");
    }
    @Override
    public String what() { return "Wind"; }
    @Override
    public void adjust() {}
}