
public class PublicationTest {

	public static void main(String[] args) {

		Book book = new Book("��� �ڹٽ�ũ��Ʈ", 45000, "�̿���");
		Magazine magazine = new Magazine("����", 12000, "�̽�");
		
		book.sell(2);
		magazine.sell(2);
		
		book.setPrice(35000);
		magazine.setPrice(15000);
		
		book.sell(2);
		magazine.sell(2);

	}

}
