package Chapter_8_BST;

public class Tree {

	public Node root;
	
	public Node find(int key){
		Node current = root;
		
		while(current.data != key){
			if(key < current.data){
				current = current.left;
			}else{
				current = current.right;
			}
			
			if(current == null){
				return null;
			}
		}
		return current;
	}
	
	public Node getReplacement(Node replacedNode){
		Node replaceParent = replacedNode;
		Node replacement = replacedNode;
		Node current = replacedNode.right;
		
		while(current != null){
			replaceParent = replacement;
			replacement = current;
			current = current.left;
		}
		
		if(replacement != replacedNode.right){
			replaceParent.left = replacement.right;
			replacement.right = replacedNode.right;
		}
		
		return replacement;
	}
	
	
	public void insert(int dd){
		Node newNode = new Node(dd);
		
		if(root == null){
			root = newNode;
		}else{
			
			Node current = root;
			Node previous;
			
			while(true){
				previous = current;
				if(dd < current.data){
					current = current.left;
					if(current == null){
						previous.left = newNode;
						return;
					}
				}else{
					
					previous = current;
					if(dd > current.data){
						current = current.right;
						if(current == null){
							previous.right = newNode;
							return;
						}
					}
				}
			}
		}
	}
	
	
	
	public Node min() {
		
		Node current = root;
		Node previous = null;
		while(current != null){
			previous = current;
			current = current.left;
		}
		return previous;
	}
	
	public Node max(){
		
		Node current = root;
		Node previous = null;
		while(current != null){
			previous = current;
			current = current.right;
		}
		return previous;
	}
	
	
	public void inOrder(Node localRoot){
		while(localRoot != null){
			inOrder(localRoot.left);
			System.out.print(localRoot.data + " ");
			inOrder(localRoot.right);
		}
	}
	
	
	public boolean deleteNode(int key){
		
		Node current = root;
		Node parent = root;
		boolean isLeft = true;
		
		while(current.data != key){
			parent = current;
			if(key < current.data){
				isLeft = true;
				current = current.left;
			}else{
				isLeft = false;
				current = current.right;
			}
			//check if current is null i.e. you were not able to find the key
			if(current == null) return false;
		}
		
		//1. If the node that is being deleted has no child
		if(current.left == null && current.right == null){
			if(current == root){
				root = null;
			}
			else if(isLeft){
				parent.left = null;
			}
			else{
				parent.right = null;
			}
		}
		
		//2. If the node being deleted has only one child
		//a. Has only left child
		else if(current.right == null){
			if(current == root){
				root = current.left;
			}
			else if(isLeft){
				parent.left = current.left;
			}
			else{
				parent.right = current.left;
			}
		}
		
		//b. Has only the right child
		else if(current.left == null){
			if(current == root){
				root = current.right;
			}
			else if(isLeft){
				parent.left = current.right;
			}
			else{
				parent.right = current.right;
			}
		}
		
		//3. If the node being deleted has two children
		else{
			Node replacement = getReplacement(current);
			
			if(current == root){
				root = replacement;
			}
			else if(isLeft){
				parent.left = replacement;
			}
			else{
				parent.right = replacement;
			}
			
			replacement.left = current.left;
		}
	return true;
	}
}
