/*https://www.hackerrank.com/challenges/gem-stones*/
package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;

public class GemStones 
{
	private static int testCases;
	private static HashSet<Character>[] hsArr;
	
	public static void main(String args[])
	{
		GemStones gs = new GemStones();
		gs.readInput();
		HashSet<Character> base = hsArr[0];
		for(int i=1;i<testCases;i++)
		{
			base.retainAll(hsArr[i]);
		}
		System.out.println(base.size());
	}
	
	
	public void readInput()
	{
		try
		{
			BufferedReader in = new BufferedReader(new FileReader("D:\\workspace\\Challenges\\Gem stones.txt"));
			//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			testCases = Integer.parseInt(in.readLine());
			hsArr = new HashSet[testCases];
			for(int i=0;i<testCases;i++)
			{
				char charArr[] = in.readLine().toCharArray();
				HashSet<Character> hs = new HashSet<Character>();
				for(int j=0;j<charArr.length;j++)
				{
					hs.add(charArr[j]);
				}
				hsArr[i] = hs;
			}
			in.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
