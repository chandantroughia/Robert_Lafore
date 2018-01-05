package Other;
import java.util.ArrayList;
import java.util.HashMap;

class Trie{
	  private TrieNode root;

	  public Trie(){
	    root = new TrieNode();
	  }

	  public void insert(String word){
	    HashMap<Character, TrieNode> children = root.children;
	    for(int i = 0; i < word.length(); i++){
	      char c = word.charAt(i);
	      TrieNode t;
	      if(children.containsKey(c)){
	        t = children.get(c);
	      }else{
	        t = new TrieNode(c, word.substring(0, i + 1));
	        children.put(c, t);
	      }
	      children = t.children;

	      if(i == word.length() - 1){
	        t.isLast = true;
	      }
	    }
	  }
	  public boolean searchWord(String word){
	    TrieNode p = searchNode(word);
	    if(p != null && p.isLast){
	      return true;
	    }else{
	      return false;
	    }
	  }

	  public boolean startsWith(String prefix){
	    TrieNode p = searchNode(prefix);
	    if(p != null){
	      return true;
	    }else{
	      return false;
	    }
	  }

	  private TrieNode searchNode(String word){
	    HashMap<Character, TrieNode> children = root.children;
	    TrieNode t = null;
	    for(int i = 0; i < word.length(); i++){
	      char c = word.charAt(i);
	      if(children.containsKey(c)){
	        t = children.get(c);
	        children = t.children;
	      }else{
	        return null;
	      }
	    }
	    return t;
	  }

	  public ArrayList<String> getWordsForPrefix(String pre) {
			ArrayList<String> results = new ArrayList<String>();

		    TrieNode curr = searchNode(pre);
		    if(curr != null){
		    	findAllchildrenWords(curr, results);
			    return results;
		    }
		    else{
		    	return results;
		    }
		}

		private void findAllchildrenWords(TrieNode n, ArrayList<String> results) {
			//results.add(pre + n.c);

			if (n.isLast) results.add(n.str);
		    for (Character c : n.children.keySet()) {
		        findAllchildrenWords(n.children.get(c), results);
		    }
		}
	}
