/* https://www.hackerrank.com/challenges/the-love-letter-mystery*/
package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class LoveLetterMystery 
{
	private static int testCases;
	private static char[][] wordArr;
	
	public static void main(String args[])
	{
		LoveLetterMystery llm = new LoveLetterMystery();
		llm.readInput();
		for(int i=0;i<testCases;i++)
		{
			System.out.println(llm.createPalindrome(wordArr[i]));
		}
	}
	
	public int createPalindrome(char[] charArr)
	{
		int countOp = 0;
		int p1 = 0;
		int p2 = charArr.length-1;
		while(p2>p1)
		{
			if(charArr[p2]!=charArr[p1])
			{
				
				if(charArr[p2]>charArr[p1])
				{
					countOp = countOp + charArr[p2]-charArr[p1];
				}
				else if(charArr[p2]<charArr[p1])
				{
					countOp = countOp + charArr[p1]-charArr[p2];
				}
				charArr[p2] = charArr[p1];
			}
			--p2;
			++p1;
		}
		return countOp;
	}
	
	public void readInput()
	{
		try
		{
			BufferedReader in = new BufferedReader(new FileReader("D:\\workspace\\Challenges\\LoveLetterMystery.txt"));
			//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			testCases = Integer.parseInt(in.readLine());
			wordArr = new char[testCases][];
			for(int i=0;i<testCases;i++)
			{
				wordArr[i]= in.readLine().toCharArray();
			}
			in.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
/**
	public boolean checkPalindrome(char charArr[])
	{
		int p1 = 0;
		int p2 = charArr.length-1;
		while(p2>p1)
		{
			if(charArr[p1]!=charArr[p2])
			{
				return false;
			}
			++p1;
			--p2;
		}
		return true;
	}
*/
}
