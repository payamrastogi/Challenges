/* https://www.hackerrank.com/challenges/service-lane*/
package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class ServiceLane 
{
	private static int segmentsLen;
	private static int testCases;
	private static int segmentsArr[];
	private static int testCasesArr[][];
	public static void main(String args[])
	{
		ServiceLane sl = new ServiceLane();
		//sl.readInput();
		sl.readInputFromFile();
		for(int i=0;i<testCases;i++)
		{
			System.out.println(sl.findMinimum(testCasesArr[i][0], testCasesArr[i][1]));
		}
	}
	
	public int findMinimum(int from, int to)
	{
		int min = Integer.MAX_VALUE;
		for (int i=from;i<=to;i++)
		{
			if(segmentsArr[i]<min)
			{
				min  = segmentsArr[i];
			}
		}
		return min;
	}
	
	public void readInput()
	{
		try
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		    String s[] = null;

		    s = in.readLine().split(" ");
		    
		    segmentsLen = Integer.parseInt(s[0]);
		    segmentsArr = new int[segmentsLen];
		    testCases = Integer.parseInt(s[1]);
		    testCasesArr = new int[testCases][2];
		    s = in.readLine().split(" ");
		    
		    for(int i =0; i<segmentsLen;i++)
		    {
		    	segmentsArr[i] = Integer.parseInt(s[i]);
		    }
		    
		    for(int i=0;i<testCases;i++)
		    {
		    	s  = in.readLine().split(" ");
		    	testCasesArr[testCases][0] = Integer.parseInt(s[0]);
		    	testCasesArr[testCases][1] = Integer.parseInt(s[1]);
		    }
		    
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void readInputFromFile()
	{
		try
		{
			BufferedReader in = new BufferedReader(new FileReader("D:\\workspace\\Challenges\\Service Lane.txt"));
		    String s[] = null;

		    s = in.readLine().split(" ");
		    
		    segmentsLen = Integer.parseInt(s[0]);
		    segmentsArr = new int[segmentsLen];
		    testCases = Integer.parseInt(s[1]);
		    testCasesArr = new int[testCases][2];
		    s = in.readLine().split(" ");
		    
		    for(int i =0; i<segmentsLen;i++)
		    {
		    	segmentsArr[i] = Integer.parseInt(s[i]);
		    }
		    
		    for(int i=0;i<testCases;i++)
		    {
		    	s  = in.readLine().split(" ");
		    	testCasesArr[i][0] = Integer.parseInt(s[0]);
		    	testCasesArr[i][1] = Integer.parseInt(s[1]);
		    }
		    in.close();   
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

/*while ((s = in.readLine()) != null && s.length() != 0)
System.out.println(s);*/
