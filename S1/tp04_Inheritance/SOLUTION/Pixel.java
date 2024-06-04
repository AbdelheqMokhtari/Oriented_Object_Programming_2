
package test.inheritance;


 
public class Pixel {
    private int x;
    private int y;

    // Parametrized Constructor
    public Pixel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters and Setters for x and y
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

 class ColoredPixel extends Pixel {
    private int[] color; // RGB color array

    // Constructor for ColoredPixel
    public ColoredPixel(int x, int y, int[] color) {
        super(x, y);
        this.color = color;
    }

    // Getter and Setter for color
    public int[] getColor() {
        return color;
    }

    public void setColor(int[] color) {
        this.color = color;
    }
}
