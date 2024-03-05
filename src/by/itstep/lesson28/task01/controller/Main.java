package by.itstep.lesson28.task01.controller;

import by.itstep.lesson28.task01.model.entity.*;
import by.itstep.lesson28.task01.model.logic.CoordinateLogic;

public class Main {
    public static void main(String[] args) {
        test(new Rectangle(2, -5, 1, 1));
        test(new Circle(5, 3, 3));
        //  test(new Figure(new Point(-5,-5)));
        //  test(new Figure(new Point(0,0)));
        test(new Square(new Point(0, 0), 10));
    }

    public static void test(Figure figure) {
        System.out.println(CoordinateLogic.checkQuarter(figure));
        figure.draw();
        System.out.println(figure.calcSquare());
    }
}
