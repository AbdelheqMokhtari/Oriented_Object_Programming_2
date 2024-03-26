public class Circle implements AreaCalculator{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("the radius of the shape : "+ this.radius);
        System.out.println("the area of the shape : " + this.calculateArea());
        System.out.println("the perimeter of the shape : " + this.calculatePerimeter());
    }
}
