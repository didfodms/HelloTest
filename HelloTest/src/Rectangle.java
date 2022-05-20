class Rectangle extends Shape {
	
	private int length;
	private int width;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public Rectangle(int length, int width, String color) {
		super();
		this.length = length;
		this.width = width;
		super.setColor(color);
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setwidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}
	
	@Override
	public double getArea() {
		return (length * width);
	}
	
	@Override
	public String toString() {
		String res = "";
		res += "Rectangle [ length = "+length+", width = "+width+", Shape[color="+super.getColor()+"] ]";
		res += "\nArea is "+getArea();
		
		return res;
	}
	
}