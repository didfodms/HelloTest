
class Triangle extends Shape {
	
	private int base;
	private int height;
	
	public Triangle() {
		super();
	}
	
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	public Triangle(int base, int height, String color) {
		super();
		this.base = base;
		this.height = height;
		super.setColor(color);
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public int getBase() {
		return base;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}
	
	@Override 
	public double getArea() {
		return (base * height * 0.5);
	}
	
	@Override
	public String toString() {
		String res = "";
		res += "Rectangle [ base = "+base+", height = "+height+", Shape[color="+super.getColor()+"] ]";
		res += "\n¿µ¿ªÀº "+getArea();
		
		return res;
	}
	
}
