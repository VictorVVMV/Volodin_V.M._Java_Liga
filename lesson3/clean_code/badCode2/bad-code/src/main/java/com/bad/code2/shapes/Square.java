package main.java.com.bad.code2.shapes;

import main.java.com.bad.code2.shapeInterfaces.Shape2D;

/*
Класс Квадрат, имплементирующи интерфейс Shape2D
 */
public class Square implements Shape2D {

    /*
    Переменные для хранения координат для отображения фигуры
     */
    private Double x;
    private Double y;

    /*
    Переменная, которая хранит значение стороны квадрата
     */
    private Double edgeSize;

    public Square(Double x, Double y, Double edgeSize) {
        this.x = x;
        this.y = y;
        this.edgeSize = edgeSize;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    /*
    Изначально в методе getPerimeter() производилось вычисление площади фигуры (а не периметра), которое и возвращалось.
    Формула исправлена на формулу получения периметра квадрата, возвращает периметр.
     */
    public Double getPerimeter() {
        return edgeSize * 4;
    }
}
