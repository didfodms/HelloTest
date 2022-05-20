
abstract class Shape {

	private String color;
	
	abstract double getArea(); 
	
	public String toString() {
		return color+"";
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
}