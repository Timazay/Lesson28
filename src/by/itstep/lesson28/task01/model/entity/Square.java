package by.itstep.lesson28.task01.model.entity;

public class Square extends Figure {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public Square(Point point, int a) {
        super(point);
        this.a = a;
    }

    public Square(int x, int y, int a) {
        super(x, y);
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void draw() {
        System.out.println("Square is drawing");
    }

    @Override
    public double calcPerimeter() {
        return a * 4;
    }

    @Override
    public double calcSquare() {
        return a * a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
}
