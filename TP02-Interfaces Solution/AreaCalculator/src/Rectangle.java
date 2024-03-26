public class Rectangle implements AreaCalculator{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }

    @Override
    public double calculatePerimeter() {
        return (this.width + this.height)*2;
    }

    @Override
    public void displayInfo() {
        System.out.println("the width of the shape : " + this.width);
        System.out.println("the height of the shape : "+ this.height);
        System.out.println("the area of the shape : " + this.calculateArea());
        System.out.println("the perimeter of the shape : " + this.calculatePerimeter());
    }
}
