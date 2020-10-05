package main.java.com.bad.code2.shapeInterfaces;

/*
Интерфейс с методом для расчёта объёма 3D фигур
 */
public interface Shape3D {
    /*
    Метод для расчёта объёма фигуры
     */
    Double getVolume();

    /*
    Метод, который возвращает значение координаты X.
     */
    Double getX();

    /*
    Метод, который возвращает значение координаты Y.
     */
    Double getY();

    /*
    Метод, который возвращает значение координаты Z.
     */
    Double getZ();
}
