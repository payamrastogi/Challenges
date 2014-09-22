/*https://www.hackerrank.com/challenges/halloween-party*/
package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;

public class HalloweenParty 
{
	private static int testCases;
	private static BigInteger[] cutArr;
	public void readInput()
	{
		try
		{
			BufferedReader in = new BufferedReader(new FileReader("D:\\workspace\\Challenges\\HalloweenParty.txt"));
			//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			testCases  = Integer.parseInt(in.readLine());
			cutArr = new BigInteger[testCases];
			for (int i=0;i<testCases;i++)
			{
				cutArr[i] = new BigInteger(in.readLine());
			}
			in.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void calculateCut()
	{
		for (int i=0;i<testCases;i++)
		{
			BigInteger num1 = cutArr[i].divide(new BigInteger("2"));
			BigInteger num2 = cutArr[i].subtract(num1);
			System.out.println(num1.multiply(num2));
		}
	}
	
	public static void main(String args[])
	{
		HalloweenParty hp = new HalloweenParty();
		hp.readInput();
		hp.calculateCut();
	}
}
