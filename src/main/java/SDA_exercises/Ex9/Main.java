package SDA_exercises.Ex9;

public class Main {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(2,3);
        Point2D p2 = new Point2D(-3,-1);

        Circle c1 = new Circle(p1,p2);
        System.out.println("Radius: "+c1.getRadius());
        System.out.println("Perimeter: "+c1.getPerimeter());
        System.out.println("Area: "+c1.getArea());
    }
}
