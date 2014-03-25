package com.learn.tree;

import java.util.HashMap;
import java.util.Map;

public class Trie {

	char x;
	Map<Character, Trie> list;
	boolean word;
	int count;

	public Trie(char ch) {
		this.x = ch;
		this.list = new HashMap<Character, Trie>();
		this.word = false;
	}

}
