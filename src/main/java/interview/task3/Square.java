package interview.task3;

public class Square implements Shape{

  private double a;

    public Square(double side) {
        this.a = side;
    }

    public double getA() {
        return a;
    }

    @Override
    public double calculateArea(Shape shape) {
        Square square = (Square) shape;
        return square.getA() * square.getA();
    }

}
