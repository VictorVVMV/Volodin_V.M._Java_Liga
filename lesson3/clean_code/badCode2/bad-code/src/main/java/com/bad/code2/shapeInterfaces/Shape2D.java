package main.java.com.bad.code2.shapeInterfaces;

/*
Интерфейс с методом для расчёта периметра 2D фигур
 */
public interface Shape2D {

    /*
    Метод для расчёта площади фигуры
     */
    Double getArea();

    /*
    Метод, который возвращает значение координаты X.
     */
    Double getX();

    /*
    Метод, который возвращает значение координаты Y.
     */
    Double getY();
}
