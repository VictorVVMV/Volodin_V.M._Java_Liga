package main.java.com.bad.code2.shapes;

import main.java.com.bad.code2.shapeInterfaces.Shape3D;

public class Qube implements Shape3D {

    /*
    Переменные для хранения координат для отображения фигуры
     */
    private Double x;
    private Double y;
    private Double z;

    /*
    Переменная, которая хранит значение стороны куба
     */
    private Double edgeSize;

    public Qube(Double centerX, Double centerY, Double centerZ, Double s) {
        this.x = centerX;
        this.y = centerY;
        this.z = centerZ;
        this.edgeSize = s;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public Double getZ() {
        return z;
    }

    /*
    Метод, который расчитывает объём фигуры и возвращает его.
     */
    @Override
    public Double getVolume() {
        return Math.pow(edgeSize, 3);
    }
}
