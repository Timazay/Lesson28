package by.itstep.lesson28.task01.model.entity;

public class Circle extends Figure {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Circle is drawing");
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calcSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle { radius = " + radius + " start point = (" + point + ") }";
    }
}
