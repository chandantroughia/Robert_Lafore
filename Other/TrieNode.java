package Other;
import java.util.HashMap;

class TrieNode{
	  char ch;
	  String str;
	  HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
	  boolean isLast;

	  public TrieNode(){}

	  public TrieNode(char c, String str){
	    this.ch = c;
	    this.str = str;
	  }

	}
