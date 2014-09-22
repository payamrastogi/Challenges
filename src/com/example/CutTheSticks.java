/*https://www.hackerrank.com/challenges/cut-the-sticks*/
package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class CutTheSticks 
{
	private static int testCases;
	private static ArrayList<Integer> array ;
	public void readInput()
	{
		try
		{
			BufferedReader in = new BufferedReader(new FileReader("D:\\workspace\\Challenges\\CutTheSticks.txt"));
			//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			testCases  = Integer.parseInt(in.readLine());
			String[] str = in.readLine().split(" ");
			array = new ArrayList<Integer>();
			for(int i=0;i<testCases;i++)
			{
				array.add(Integer.parseInt(str[i]));
			}	
			in.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void cutSticks()
	{
		Collections.sort(array);
		while(array.size()!=0)
		{
			int count = 0;
			int min = array.get(0);
			for(int i=0;i<array.size();i++)
			{
				int num = array.remove(i)-min;
				array.add(i,num);
				count++;
			}
			System.out.println(count);
			while(array.size()>0 && array.get(0)==0)
			{
				array.remove(0);
			}
		}
	}
	
	public static void main(String args[])
	{
		CutTheSticks cts = new CutTheSticks();
		cts.readInput();
		cts.cutSticks();
	}
}
