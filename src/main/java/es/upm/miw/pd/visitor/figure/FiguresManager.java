package es.upm.miw.pd.visitor.figure;

import java.util.ArrayList;
import java.util.List;

public class FiguresManager {

    private List<Figure> figures;
    
    private Visitor visitor;

    public FiguresManager() {
        figures = new ArrayList<>();
    }

    public void add(Figure figure) {
        figures.add(figure);
    }

    public double totalArea() {
        double result = 0;
        visitor = new Area();
        for (Figure figure : figures) {
        	figure.accept(visitor);
            result += visitor.getResult();
        }
        return result;
    }

    public double totalNumberOfSides() {
        double result = 0;
        visitor = new NumberOfSides();
        for (Figure figure : figures) {
            figure.accept(visitor);
            result += visitor.getResult();
        }
        return result;
    }

}
