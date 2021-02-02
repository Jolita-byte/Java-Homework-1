package SDA_exercises.Ex9;

public class Circle {
    private Point2D center;
    private double radius;

    public Circle(Point2D center, Point2D edge) {
        this.center = center;
        this.radius = Math.sqrt(Math.pow(center.getX() - edge.getX(), 2) + Math.pow(center.getY() - edge.getY(), 2));
    }

    public double getRadius() {
        return radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }
}
