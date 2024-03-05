package by.itstep.lesson28.task01.model.entity;

public abstract class Figure extends Object{
    protected Point point;

    public Figure() {
        super();
        this.point = new Point();
    }

    public Figure(Point point) {
        this.point = point;
    }

    public Figure(int x, int y) {
        this.point = new Point(x, y);
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public abstract void draw();
    public abstract double calcPerimeter();
    public abstract double calcSquare();

    @Override
    public String toString() {
        return "start point = " + point;
    }
}
