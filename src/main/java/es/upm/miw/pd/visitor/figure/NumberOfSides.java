package es.upm.miw.pd.visitor.figure;

public class NumberOfSides extends Visitor{

	@Override
	public void visitCircle(Circle circle) {
		setResult(Double.POSITIVE_INFINITY);
		
	}

	@Override
	public void visitSquare(Square square) {
		setResult(4.0);
		
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		setResult(3.0);
		
	}

}
