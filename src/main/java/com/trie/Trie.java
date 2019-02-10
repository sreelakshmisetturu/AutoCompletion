package com.trie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Trie {

	private static final int ALPHABET_SIZE = 26;
	private TrieNode[] root;

	public Trie() {
		root = new TrieNode[ALPHABET_SIZE];
		Arrays.fill(root, null);
	}

	public void insert(String word) {
		TrieNode[] current = root;
		int i = 0;
		while (i < word.length()) {
			char ch = Character.toLowerCase(word.charAt(i));
			int index = ch - 'a';
			if (current[index] == null) {
				TrieNode node = new TrieNode();
				node.setLetter(ch);
				current[index] = node;
			}
			if (i == word.length() - 1) {
				current[index].setIsend(true);
			}
			current = current[index].getChildren();
			i++;
		}
		// current[i-1].setIsend(true);

	}

	public boolean search(String word) {
		TrieNode[] current = root;
		boolean end = false;
		int i = 0;

		if (word == null) {
			return false;
		}

		while (i < word.length() && current != null) {
			char ch = Character.toLowerCase(word.charAt(i));
			int index = ch - 'a';
			if (current[index] != null) {
				if (i == word.length() - 1) {
					end = current[index].getIsend();
				}
				current = current[index].getChildren();
				i++;
			} else {
				return false;
			}
		}

		if (i == word.length() && end) {
			return true;
		}

		return false;
	}

	public boolean startsWith(String word) {
		TrieNode[] current = root;
		boolean end = false;
		int i = 0;

		if (word == null) {
			return false;
		}

		while (i < word.length() && current != null) {
			char ch = Character.toLowerCase(word.charAt(i));
			int index = ch - 'a';
			if (current[index] != null) {
				current = current[index].getChildren();
				i++;
			} else {
				return false;
			}
		}

		if (i == word.length()) {
			return true;
		}

		return false;
	}

	public List<String> getSuggestions(String prefix) {
		if (prefix == null) {
			return null;
		}

		int i = 0;
		TrieNode[] current = root;
		while (i < prefix.length()) {
			char ch = Character.toLowerCase(prefix.charAt(i));
			int index = ch - 'a';
			if (current[index] != null) {
				current = current[index].getChildren();
				i++;
			}
		}
		return traverse(prefix, new ArrayList<String>());
	}

	private List<String> traverse(String prefix, ArrayList<String> result){
		if()
	}

	public TrieNode[] getRoot() {
		return root;
	}

	public void setRoot(TrieNode[] root) {
		this.root = root;
	}

}
