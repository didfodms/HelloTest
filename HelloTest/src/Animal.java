
public class Animal {

	String name;
	public Animal(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println(name + "(��)�� ������ �Խ��ϴ�.");
	}
	
	public void sleep() {
		System.out.println(name + "(��)�� ���� ��ϴ�.");
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
