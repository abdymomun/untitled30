public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getArea() {
        return 2 * Math.PI * radius * (height + radius);
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}

