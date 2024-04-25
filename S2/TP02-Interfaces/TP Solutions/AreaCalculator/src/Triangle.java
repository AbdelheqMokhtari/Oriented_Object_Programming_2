public class Triangle implements AreaCalculator{
    double base;
    double height;
    @Override
    public double calculateArea() {
        return (this.base * this.height) /2;
    }

    @Override
    public double calculatePerimeter() {
        return this.base + this.height;
    }

    @Override
    public void displayInfo() {
        System.out.println("the base of the shape : " + this.base);
        System.out.println("the height of the shape : "+ this.height);
        System.out.println("the area of the shape : " + this.calculateArea());
        System.out.println("the perimeter of the shape : " + this.calculatePerimeter());
    }
}
