package ru.stepup;

/*
Разработайте метод (sumAllAreas), который принимает набор фигур из задачи #9
и считает их общую площадь (без учета возможного перекрытия фигурами друг друга).
Продемонстрируйте работоспособность метода, передав туда несколько кругов и квадратов.
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> figs = new ArrayList<>();

        figs.add(new Circle(1,1,3));
        figs.add(new Square(1,1,5));
        figs.add(new Rectangle(1,1,5, 10));

        FigsAggregator fa = new FigsAggregator();

        for (Figure f : figs){
            System.out.println(f.getArea());
            fa.setFigs(f);
        }

        System.out.println(fa.sumAllAreas());
    }
}