package com.main;

import java.util.Arrays;
import java.util.Scanner;

import com.trie.Trie;

public class AutoComplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a word to insert");
		Scanner sc = new Scanner(System.in);
		Trie trie = new Trie();
		trie.insert(sc.nextLine());
		System.out.println(trie.search("microsoft"));
		System.out.println(trie.startsWith("micro"));
	}
}
