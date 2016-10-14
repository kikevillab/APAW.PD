package es.upm.miw.pd.visitor.figure;

public abstract class Visitor {
	
	private double result;
	
    public abstract void visitCircle(Circle circle);

    public abstract void visitSquare(Square square);
    
    public abstract void visitTriangle(Triangle triangle);
    
    public double getResult(){
    	return result;
    }
    
    protected void setResult(Double result){
    	this.result = result;
    }
}
