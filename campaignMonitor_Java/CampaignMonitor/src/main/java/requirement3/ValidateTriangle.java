package requirement3;

public class ValidateTriangle implements IValidateShape {

	public void validate(IShape shape) throws InvalidTriangleException {
		checkNegativeSides(shape.getSide1(), shape.getSide2(), shape.getSide3());
		validateTriangle(shape.getSide1(), shape.getSide2(), shape.getSide3());

	}

	protected boolean validateTriangle(int side1, int side2, int side3) throws InvalidTriangleException {
		if ((side1 + side2 <= side3) || (side1 + side3 <= side2) || (side2 + side3 <= side1)) {
			throw new InvalidTriangleException("The sides passed as the input does not make a valid triangle: " + side1
					+ "," + side2 + "," + side3 + ". Please try again.");
		}
		return true;
	}

	protected boolean checkNegativeSides(int side1, int side2, int side3) throws InvalidTriangleException {
		if (side1 <= 0) {
			throw new InvalidTriangleException(
					"A side of the triangle is negative or zero: " + side1 + ". Please try again.");
		} else if (side2 <= 0) {
			throw new InvalidTriangleException(
					"A side of the triangle is negative or zero: " + side2 + ". Please try again.");
		} else if (side3 <= 0) {
			throw new InvalidTriangleException(
					"A side of the triangle is negative or zero: " + side3 + ". Please try again.");
		}
		return true;
	}
}
