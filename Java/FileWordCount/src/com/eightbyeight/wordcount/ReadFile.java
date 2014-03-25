package com.eightbyeight.wordcount;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

public class ReadFile {
	
	//Generates a Report with total word count of all files
	
	/*Modifications to be done to generate a report per file
	1. Create an instance of CountWords per file i.e move "CountWords cws = new CountWords()" inside for loop
	2. Print report inside for loop
	*/
	
	public static void main(String[] args)
	{
		if(args.length > 0) { 
		 CountWords cws = new CountWords();
		 // Read all files passed as argument
         for(int i=0;i<args.length;i++)
         {
            File file= new File(args[i]);
    		FileInputStream fir = null;
    		
    		try {
    			fir =  new FileInputStream(file);
    			cws.findfrequency(fir);
    		} catch (FileNotFoundException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
         }
    		
    		System.out.println("Report");
    		System.out.println("========================================");
    		System.out.printf("%-20s %s","Word","Count");
    		System.out.println();
    		//System.out.println("Word\t\tCount");
    		System.out.println("========================================");
    		Map<String,Integer> map =cws.getMap();
    		for(String s: map.keySet())
    		{
    			if(s!="")
    			{
    				System.out.printf("%-20s %d",s,map.get(s));
    				System.out.println();
    				//System.out.print(map.get(s));
    			}
    		}
    		
            
        }  
		
	}

}
