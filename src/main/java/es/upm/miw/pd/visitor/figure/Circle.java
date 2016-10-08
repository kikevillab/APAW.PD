package es.upm.miw.pd.visitor.figure;

public class Circle extends Figure {

    private double radius;

    public Circle(String description, double radius) {
        super(description);
        this.radius = radius;
    }

	@Override
	public void accept(Visitor v) {
		v.visitCircle(this);		
	}
	
	public double getRadius(){
		return radius;
	}

}
