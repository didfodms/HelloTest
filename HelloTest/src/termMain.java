
public class termMain {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(1.0, 1.0);
		System.out.printf(">> Set rectangle length = 1.0, width = 1.0%n");
		System.out.printf("Rectangle length = %.2f%nRectangle width = %.2f%n", r.getLength(), r.getWidth());
		System.out.printf("Result of calculating rectangle perimeter : %.2f%n", r.calPerimeter());
		System.out.printf("Result of calculating rectangle area : %.2f%n", r.calArea());

		r.setLength(30.0);
		r.setWidth(35.0);
		System.out.printf("%n>> Set rectangle length = 30.0, width = 35.0%n");
		System.out.printf("Rectangle length = %.2f%nRectangle width = %.2f%n", r.getLength(), r.getWidth());
		
		System.out.printf("%n>> Set rectangle length = 15.0, width = 15.0%n");
		r.setLength(15.0);
		r.setWidth(15.0);
		System.out.printf("Rectangle length = %.2f%nRectangle width = %.2f%n", r.getLength(), r.getWidth());
		System.out.printf("Result of calculating rectangle perimeter : %.2f%n", r.calPerimeter());
		System.out.printf("Result of calculating rectangle area : %.2f%n", r.calArea());

	}

}
