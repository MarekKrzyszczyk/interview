package interview.task3;

public class Cube implements Shape, Solid {

    private double a;

    public Cube(double side) {
        this.a = side;
    }

    public double getA() {
        return a;
    }

    @Override
    public double calculateArea(Shape shape) {
        Cube square = (Cube) shape;
        return 6 * (square.getA() * square.getA());
    }

    @Override
    public double calculateVolume(Solid solid) {
        Cube square = (Cube) solid;
        return square.getA() * square.getA() * square.getA();
    }
}
