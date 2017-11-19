package Chapter_5_LinkedLists;

public class Xyz {
	
	static int count = 0;
	
	private static void printOne() {
		
		count += 1;
		System.out.println(count);

	}
	
	private static void printTwo() {
		count += 1;
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		printOne();
		printTwo();
	}

}
