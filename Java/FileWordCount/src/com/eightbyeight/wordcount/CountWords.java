package com.eightbyeight.wordcount;



import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountWords {
	
	private Map<String,Integer> wordcount;
	
	public CountWords()
	{
		wordcount = new HashMap<String,Integer>();
	}
	
	public Map<String,Integer> getMap()
	{
		return wordcount;
	}
	
	
	//Read Words from file
	public  void findfrequency(FileInputStream fir)
	{
		Scanner scanr =  new Scanner(fir);
		while(scanr.hasNext())
		{
			String input = scanr.next();
			//Remove any non-character word [eg:;,.']
			input = input.replaceAll("\\W", "");
			addToMap(input);
		}
		
	}
	
	//Add strings to hashmap and increment count
	private void addToMap(String word)
	{
		if(word == null | word.equals(""))
			return;
		if(!wordcount.containsKey(word))
		{
			wordcount.put(word, 1);
		}
		else
		{
			int count = wordcount.get(word);
			wordcount.put(word, count+1);
		}
	}
	
	
	

}
