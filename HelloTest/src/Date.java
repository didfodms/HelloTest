
public class Date {

	private int month;
	private int day;
	private int year;
	
	private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
	
	public Date(int month, int day, int year) {
		//month ���� ó�� 
		if(month <= 0 || month > 12) {
			throw new IllegalArgumentException("month (" + month + ") must be 1-12");
		}
		//���� ���� day ���� ó�� 
		if(day <= 0 || day > daysPerMonth[month] && !(month == 2 && day == 29)) {
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
		}
		//�����϶� day üũ
		if(month==2 && day==29 && !(year%400==0 || (year%4==0 && year%100 != 0))) {
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
		}
		
		this.month = month;
		this.day = day;
		this.year = year;
		
		System.out.printf("Date object constructor for date %s%n", this);
	}
	
	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public int getDaysPerMonth(int n) {
		return daysPerMonth[n];
	}
	
	public void nextDay() {
		this.day++;
		//����day�� daysPerMonth�� �ʰ��Ұ�� day%getDaysPerMonth(getMonth()) �� month++
		if(getDay() > getDaysPerMonth(getMonth())) {
			this.day = this.day%getDaysPerMonth(getMonth());
			this.month++;
			//���� month�� 12���� �ʰ��Ұ�� 
			if(getMonth() > 12) {
				this.month = 1;
				this.year++;
			}
		}
	}
	
}
