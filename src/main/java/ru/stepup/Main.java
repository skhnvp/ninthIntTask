package ru.stepup;

/*
Необходимо продумать структуру и организацию следующих геометрических фигур:

Круг. Задается точкой координат центра и радиусом.
Квадрат. Задается точкой координат левого верхнего угла и длиной стороны.
Прямоугольник. Задается точкой координат левого верхнего угла и двумя сторонами.

Для каждой фигуры обязательно должна быть возможность рассчитать её площадь (getArea).

Ответом на это задание является группа классов.
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> figs = new ArrayList<>();

        figs.add(new Circle(1,1,3));
        figs.add(new Square(1,1,5));
        figs.add(new Rectangle(1,1,5, 10));

        for (Figure f : figs){
            System.out.println(f.getArea());
        }
    }
}