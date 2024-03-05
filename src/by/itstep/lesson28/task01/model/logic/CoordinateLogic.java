package by.itstep.lesson28.task01.model.logic;

import by.itstep.lesson28.task01.model.entity.Figure;

public class CoordinateLogic {
    public static int checkQuarter(Figure figure) {
        int quarter = 0;
        int x = figure.getPoint().getX();
        int y = figure.getPoint().getY();

        if (x > 0 && y > 0) {
            quarter = 1;
        } else if (y > 0 && x < 0) {
            quarter = 2;
        } else if (x < 0 && y < 0) {
            quarter = 3;
        } else if (x > 0 && y < 0) {
            quarter = 4;
        }
        return quarter;
    }
}
