package com.trie;

import java.util.Arrays;

public class TrieNode {
	private static final int ALPHABET_SIZE = 26;
	private boolean isend;
	char letter;
	TrieNode[] children;
	public TrieNode(){
		children = new TrieNode[ALPHABET_SIZE];
		Arrays.fill(children,null);
	}
	public boolean getIsend() {
		return isend;
	}

	public void setIsend(boolean isend) {
		this.isend = isend;
	}

	public TrieNode[] getChildren() {
		return children;
	}

	public void setChildren(TrieNode[] children) {
		this.children = children;
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

}
