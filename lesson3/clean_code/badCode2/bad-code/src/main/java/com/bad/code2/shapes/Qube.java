package main.java.com.bad.code2.shapes;

import main.java.com.bad.code2.shapeInterfaces.Shape3D;

/*
Класс Куб, имплементирующий интерфейс Shape3D
 */
public class Qube implements Shape3D {

    /*
    Переменная для хранения координаты X для отображения фигуры
     */
    private Double x;

    /*
    Переменная для хранения координаты Y для отображения фигуры
     */
    private Double y;

    /*
    Переменная для хранения координаты Z для отображения фигуры
     */
    private Double z;

    /*
    Переменная, которая хранит значение стороны куба
     */
    private Double edgeSize;

    /*
    Конструктор для создания объекта Куб. Принимает параметры координата x, координата y, координата z и сторона edgeSize.
     */
    public Qube(Double centerX, Double centerY, Double centerZ, Double edgeSize) {
        this.x = centerX;
        this.y = centerY;
        this.z = centerZ;
        this.edgeSize = edgeSize;
    }

    /*
    Метод, который возвращает значение координаты X.
     */
    @Override
    public Double getX() {
        return null;
    }

    /*
    Метод, который возвращает значение координаты Y.
     */
    @Override
    public Double getY() {
        return null;
    }

    /*
    Метод, который возвращает значение координаты Z.
     */
    @Override
    public Double getZ() {
        return null;
    }

    /*
    Метод, который расчитывает объём фигуры и возвращает его.
     */
    @Override
    public Double getVolume() {
        return Math.pow(edgeSize, 3);
    }
}
