
package test.inheritance;


public class Segment {
    private ColoredPixel pixel1;
    private ColoredPixel pixel2;

    // Constructor for Segment
    public Segment(ColoredPixel pixel1, ColoredPixel pixel2) {
        this.pixel1 = pixel1;
        this.pixel2 = pixel2;
    }

    // Getters and Setters for pixel1 and pixel2
    public ColoredPixel getPixel1() {
        return pixel1;
    }

    public void setPixel1(ColoredPixel pixel1) {
        this.pixel1 = pixel1;
    }

    public ColoredPixel getPixel2() {
        return pixel2;
    }

    public void setPixel2(ColoredPixel pixel2) {
        this.pixel2 = pixel2;
    }
}
 class Rectangle extends Segment {
    private ColoredPixel pixel3;
    private ColoredPixel pixel4;
    public Rectangle(ColoredPixel pixel1, ColoredPixel pixel2) {
        super(pixel1, pixel2);
    }
}


class Rectangle1 {
    private Segment segment1;
    private Segment segment2;

    // Constructor using composition
    public Rectangle1(Segment segment1, Segment segment2) {
        this.segment1 = segment1;
        this.segment2 = segment2;
    }

    // Getters and Setters for segment1 and segment2
    public Segment getSegment1() {
        return segment1;
    }

    public void setSegment1(Segment segment1) {
        this.segment1 = segment1;
    }

    public Segment getSegment2() {
        return segment2;
    }

    public void setSegment2(Segment segment2) {
        this.segment2 = segment2;
    }
}
