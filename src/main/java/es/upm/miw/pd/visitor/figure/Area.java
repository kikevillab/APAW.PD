package es.upm.miw.pd.visitor.figure;

public class Area extends Visitor{

	@Override
	public void visitCircle(Circle circle) {
		setResult(Math.PI * circle.getRadius() * circle.getRadius());
	}

	@Override
	public void visitSquare(Square square) {
		setResult(square.getSide() * square.getSide());
		
	}

	@Override
	public void visitTriangle(Triangle triangle) {
		setResult(triangle.getBase() * triangle.getHeight() * 0.5);
		
	}

}
