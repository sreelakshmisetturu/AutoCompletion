package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.trie.Trie;

public class AutoComplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Enter a word to insert");
		Scanner sc = new Scanner(System.in);*/
		Trie trie = new Trie();
		trie.insert("micro");
		trie.insert("miami");
		trie.insert("mice");
		trie.insert("insert");
		trie.insert("mango");
		trie.insert("m");
		System.out.println(trie.search("microsoft"));
		System.out.println(trie.startsWith("micro"));
		List<String> ar = trie.getSuggestions("m");
		for(String str: ar){
			System.out.println(str);
		}
		
	}
}
