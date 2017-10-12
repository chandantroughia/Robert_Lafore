package Chapter_8_BST;

public class TreeAp {
	
	public static void main(String[] args) {
		Tree theTree = new Tree();
		theTree.insert(50);
		theTree.insert(60);
		theTree.insert(70);
		theTree.insert(80);
		theTree.insert(90);
		theTree.insert(40);
		theTree.insert(30);
		theTree.insert(20);
		theTree.insert(10);

		
		theTree.inOrder(theTree.root);
	}

}
