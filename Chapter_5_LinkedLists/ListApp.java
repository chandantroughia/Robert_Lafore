package Chapter_5_LinkedLists;

public class ListApp {

	
	public static void main(String[] args) {
		NodeList theList = new NodeList();
		
		theList.insertFront(4);
		theList.insertFront(7);
		theList.insertFront(3);
		theList.insertFront(6);
		theList.insertFront(2);
		theList.insertFront(5);
		theList.insertFront(1);
		
		theList.printList(theList.head);
	}
}
