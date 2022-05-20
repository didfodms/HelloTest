
abstract class Animal_interface {
	
	public abstract void eat();
	
}

interface Swimable {

	void swim();

}

interface Flyable {

	void fly();

}

class Swan extends Animal_interface implements Swimable, Flyable {
	
	public Swan() {
		super();
	}
	
	@Override
	public void eat() {
		System.out.println("������ �Դ´�.");
	}
	
	@Override
	public void swim() {
		System.out.println("������ �����Ѵ�.");
	}
	
	@Override
	public void fly() {
		System.out.println("������ ����.");
	}
	
}

public class InterfaceTest {
	
	Swan swan = new Swan();
	
	//swan.eat();
	//swan.swim();
	//swan.fly();
	
}
