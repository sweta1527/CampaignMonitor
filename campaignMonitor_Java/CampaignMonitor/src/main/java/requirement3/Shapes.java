package requirement3;

public class Shapes {

	public static void main(String[] args) {

		/*
		 * Alternatively, the Scanner utility can be used to accept an input from the
		 * user. Methods of the Scanner utility can be used to validate the input and
		 * ensure that only integers are entered.
		 */
		// form a triangle
		IShape tri = new Triangle(3, 6, 6);
		
		//Calculate the area of the triangle
		IAreaCalculator calc = new TriangleAreaCalc();
		Double area = 0.0;
		try {
			area = calc.calculateArea(tri);
		} catch (InvalidShapeException e) {
			e.printStackTrace();
			return;
		}

		System.out.println(area);

	}

}
