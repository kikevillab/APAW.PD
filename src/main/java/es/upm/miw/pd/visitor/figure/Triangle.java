package es.upm.miw.pd.visitor.figure;

public class Triangle extends Figure {
    private double base;

    private double height;

    public Triangle(String description, double base, double height) {
        super(description);
        this.base = base;
        this.height = height;
    }
    
    public void accept(Visitor v){
    	v.visitTriangle(this);
    }

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}
    
    

}
