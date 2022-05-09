
public class PublicationTest {

	public static void main(String[] args) {

		Book book = new Book("모던 자바스크립트", 45000, "이웅모");
		Magazine magazine = new Magazine("잡지", 12000, "이슈");
		
		book.sell(2);
		magazine.sell(2);
		
		book.setPrice(35000);
		magazine.setPrice(15000);
		
		book.sell(2);
		magazine.sell(2);

	}

}
