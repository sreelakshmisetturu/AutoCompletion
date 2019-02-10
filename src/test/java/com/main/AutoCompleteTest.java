package com.main;

import com.trie.Trie;
import com.trie.TrieNode;

public class AutoCompleteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="insert";
		Trie trie = new Trie();
		trie.insert(str);
		TrieNode[] node = trie.getRoot();
		for(int i=0;i<str.length();i++){
			char ch = Character.toLowerCase(str.charAt(i));
			TrieNode current = node[ch-'a'];
			if(current !=null){
				System.out.println(current.getLetter());
				node = current.getChildren();
			}
		}
	}

}
