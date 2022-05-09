
public class Student2 extends Person2 {

	private String schoolKind;
	private int grade;
	
	public Student2() {
		super();
	}
	
	public Student2(String schoolKind, int grade) {
		super();
		this.schoolKind = schoolKind;
		this.grade = grade;
	}
	
	public String getSchoolKind() {
		return schoolKind;
	}
	
	public void setSchoolKind(String schoolKind) {
		this.schoolKind = schoolKind;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	
}
