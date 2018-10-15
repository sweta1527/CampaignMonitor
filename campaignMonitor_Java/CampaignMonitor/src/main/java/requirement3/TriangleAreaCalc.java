package requirement3;

public class TriangleAreaCalc implements IAreaCalculator {

	public double calculateArea(IShape shape) throws InvalidShapeException {
		
		if (shape == null) {
			return 0.0;
		}
		// validate the triangle
		IValidateShape val = new ValidateTriangle();
		val.validate(shape);
		
		double perimeter = (shape.getSide1() + shape.getSide2() + shape.getSide3()) / 2d;

		double area = Math.sqrt(perimeter * (perimeter - shape.getSide1()) * (perimeter - shape.getSide2())
				* (perimeter - shape.getSide3()));
		return Math.round(area * 100.00) / 100.00;
	}

}
