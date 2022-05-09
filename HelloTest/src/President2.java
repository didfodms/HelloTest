
public class President2 extends Person2 {

	private int salary;
	private String nation;
	
	public President2() {
		super();
	}
	
	public President2(int salary, String nation) {
		super();
		this.salary = salary;
		this.nation = nation;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getNation() {
		return nation;
	}
	
	public void setNation(String nation) {
		this.nation = nation;
	}
	
}
