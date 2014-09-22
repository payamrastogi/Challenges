package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Iterator;

public class GameOfThrones1 
{	
	private static String str;
	private static HashSet<String> hashSet = new HashSet<String>();
	public void anag(String s1, String s2)	
	{
		if(s1.length() == 0)	
		{
			System.out.println(s2);
			hashSet.add(s2);
		}
		for(int i = 0; i < s1.length(); i++)	
		{
			anag(s1.substring(0, i) + s1.substring(i+1, s1.length()), s1.charAt(i) + s2);
		}
	}
	
	public boolean isPalindrome(char[] charArr)
	{
		int p1 = 0;
		int p2 = charArr.length-1;
		while(p2>p1)
		{
			if(charArr[p2]!=charArr[p1])
			{
				return false;
			}
			--p2;
			++p1;
		}
		return true;
	}
	
	public void readInput()
	{
		try
		{
			BufferedReader in = new BufferedReader(new FileReader("D:\\workspace\\Challenges\\GameOfThrones1.txt"));
			//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			str = in.readLine();
			in.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void findPalindrome()
	{
		Iterator<String> it = hashSet.iterator();
		while(it.hasNext())
		{
			if(isPalindrome(it.next().toCharArray()))
			{
				System.out.println("YES");
				return;
			}
		}
		System.out.print("NO");
	}
	
	public static void main(String[] args)	
	{
		 GameOfThrones1 got = new GameOfThrones1();
		 got.readInput();
		 got.anag("cdcdcdcdeeeef","");
		 got.findPalindrome();
		 
	}
}
