
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
		System.out.println("백조가 먹는다.");
	}
	
	@Override
	public void swim() {
		System.out.println("백조가 수영한다.");
	}
	
	@Override
	public void fly() {
		System.out.println("백조가 난다.");
	}
	
}

public class InterfaceTest {
	
	Swan swan = new Swan();
	
	//swan.eat();
	//swan.swim();
	//swan.fly();
	
}
