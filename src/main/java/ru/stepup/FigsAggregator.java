package ru.stepup;

import java.util.ArrayList;
import java.util.List;

public class FigsAggregator {
    private List<Figure> figs = new ArrayList<>();

    FigsAggregator(Figure... figs) {
        this.figs.addAll(List.of(figs));
    }

    public void setFigs(Figure figs) {
        this.figs.add(figs);
    }

    public double sumAllAreas(){
        double sum = 0.;

        for (Figure f : figs) {
            sum+=f.getArea();
        }

        return sum;
    }

}
