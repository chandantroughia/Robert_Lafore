package Chapter_5_LinkedLists;


public class LLapp{
	public static void main(String[] args) {
		LinkList theList = new LinkList();
		
		theList.insertFirst(11, 55);
		theList.insertFirst(22, 66);
		theList.insertFirst(33, 77);
		theList.insertFirst(44, 88);
		
		theList.displayList();
		
		while( !theList.isEmpty() ) {
			Link aLink = theList.deleteFirst(); 
			System.out.print("Deleted "); 
			aLink.displayLink(); System.out.println("");
			} 
		theList.displayList();
	}
}

