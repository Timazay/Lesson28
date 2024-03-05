package by.itstep.lesson28.task01.model.entity;

public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(Point point, double a, double b) {
        super(point);
        this.a = a;
        this.b = b;
    }

    public Rectangle(int x, int y, double a, double b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void draw() {
        System.out.println("Rectangle is drawing");
    }

    @Override
    public double calcPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public double calcSquare() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Triangle { " +
                "a = " + a +
                ", b = " + b +
                " start point = (" + point + ") }";
    }
}
