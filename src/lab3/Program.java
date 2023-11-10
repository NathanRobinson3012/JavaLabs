package lab3;

import java.util.Scanner;

public class Program {
	
	public static int GetInt(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner (System.in);
		int out = s.nextInt();
		s.close();
		return out;
		}
	
	public static String GetString(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner (System.in);
		String out = s.nextLine();
		s.close();
		return out;
		}
	
	public static void Lunch() {
		String main = GetString("what main would you like for lunch");
		int potatoes = GetInt("how many potatoes");
		int sprout = GetInt("how many brussel sprouts");
		System.out.println("you ordered " + main + " with " +potatoes + " potatoes and "+ sprout + " brussel sprouts");
	}
	
	public static void PoundsToPoundsAndStones(int pounds) {
		//int weight = GetInt("enter weight in pounds");
		System.out.println("this value is " + (pounds/14) + " stone and "+(pounds%14)+"lbs");
	}
	
	public static void KgToStones(int kg) {
		int lbs = (int)(kg*2.20462);
		System.out.println("this value is "+lbs+"lbs");
		PoundsToPoundsAndStones(lbs);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("the int is: "+GetInt("hello"));
		//System.out.println("the string is: "+ GetString("hi"));
		
		//Lunch();
		KgToStones(10);
		System.out.println("end");
		
		

	}

}
