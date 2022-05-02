
public class Rectangle {

	private double length = 1;
	private double width = 1;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public void setLength (double length) {
		if(0.0 < length && length < 20.0) {
			this.length = length;
		}
	}
	
	public void setWidth (double width) {
		if(0.0 < width && width < 20.0) {
			this.width = width;
		}
	}
	
	public double getLength() {
		return this.length;
	}
	
	public double getWidth() {
		return this.width;
	}

	public double calPerimeter() {
		return 2*(getLength() + getWidth());
	}
		
	public double calArea() {
		return getLength()*getWidth();
	}
	
}
