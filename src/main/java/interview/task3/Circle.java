package interview.task3;

public class Circle implements Shape {

    private double r;
    private static final double PI = Math.PI;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public double calculateArea(Shape shape) {
        Circle circle = (Circle) shape;
        return PI * (circle.getR() * circle.getR());
    }

}
