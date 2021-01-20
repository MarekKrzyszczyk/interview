package interview.task3;

public class Sphere implements Shape, Solid{

  private double r;
    private static final double PI = Math.PI;

    public Sphere(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public double calculateArea(Shape shape) {
        Sphere sphere = (Sphere) shape;
        return (PI*4) * (sphere.getR() * sphere.getR());
    }

    @Override
    public double calculateVolume(Solid solid) {
        Sphere sphere = (Sphere) solid;
        return ((PI*4)/3) * (sphere.getR() * sphere.getR() * sphere.getR());
    }

}
