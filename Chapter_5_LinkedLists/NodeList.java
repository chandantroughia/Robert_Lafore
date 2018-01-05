package Chapter_5_LinkedLists;

public class NodeList {
	
	Node head;
	public NodeList(){
		this.head = null;
	}
	
	
	public void insertFront(int value)
	{
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	

	public void printList(Node root){
		Node current = root;
		while(current != null){
			System.out.print(current.val+" ");
			current = current.next;
		}
	}
	
	
	
}
