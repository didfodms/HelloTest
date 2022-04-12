
public class arrayTest {

	public static void main(String[] args) {
		
		int[] array = {32, 27, 42, 123, 5421, 321, 2312, 4};
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for(int i=0; i<array.length; i++) {
			System.out.printf("%5d%8d%n", i, array[i]);
		}

	}

}
