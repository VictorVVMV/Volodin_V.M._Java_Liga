package main.java.com.bad.code2.shapes;

import main.java.com.bad.code2.shapeInterfaces.Shape2D;

/*
Класс Квадрат, имплементирующий интерфейс Shape2D
 */
public class Square implements Shape2D {

    /*
    Переменная для хранения координаты X для отображения фигуры
     */
    private Double x;
    /*
    Переменная для хранения координаты Y для отображения фигуры
     */
    private Double y;

    /*
    Переменная, которая хранит значение стороны квадрата
     */
    private Double edgeSize;

    /*
    Конструктор для создания объекта Квадрат. Принимает параметры координата x, координата y и сторона edgeSize.
     */
    public Square(Double x, Double y, Double edgeSize) {
        this.x = x;
        this.y = y;
        this.edgeSize = edgeSize;
    }

    /*
    Метод, который возвращает значение координаты X.
     */
    @Override
    public Double getX() {
        return x;
    }

    /*
    Метод, который возвращает значение координаты Y.
     */
    @Override
    public Double getY() {
        return y;
    }

    /*
    Метод в котором рассчитывается площадь квадрата. Возвращает площадь квадрата.
     */
    public Double getArea() {
        return edgeSize * edgeSize;
    }
}
