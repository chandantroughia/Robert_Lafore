package Other;

import java.util.ArrayList;

public class TrieApp {

    public static void main(String[] args) {
		Trie a = new Trie();
		a.insert("master");
		a.insert("masli");
		a.insert("chandan");
		//a.insert("their");

		System.out.println(a.searchWord("master"));
		System.out.println(a.startsWith("masl"));
		ArrayList<String> ans = a.getWordsForPrefix("ma");
		System.out.println(ans);

	}
}
