package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURECOUNT = 4;
    private static final int LIMIT = 100;
    private static final int DEFAULTRADIUS = 10;
    private static final String DEFAULTCOLOR = "white";
    private ColorSuppier colorSupplier = new ColorSuppier();

    private int getRandomInt() {
        return new Random().nextInt(LIMIT);
    }

    private double getRandomDouble() {
        return new Random().nextDouble();
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULTCOLOR,DEFAULTRADIUS);
    }

    public Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),getRandomInt());
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomDouble(),
                getRandomDouble(),
                getRandomDouble());
    }

    public Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),getRandomInt());
    }

    public Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),getRandomDouble(),
                getRandomDouble());
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),getRandomInt(),
                getRandomInt());
    }

    public Figure getRandomFigure() {
        int figureIndex = new Random().nextInt(FIGURECOUNT);
        switch (figureIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomSquare();
            case 3:
                return getRandomRectangle();
            case 4:
            default:
                return getRandomRightTriangle();
        }
    }
}