package lab6;

import java.util.Scanner;

public class Lab6 {
	
	final int PART1LENGTH=5;

	private static int GetInt(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner (System.in);
		int out = s.nextInt();
		s.nextLine();
		//s.close();
		return out;
		}
	
	private static String GetString(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner (System.in);
		String out = s.nextLine();
		//s.close();
		return out;
		}
	
	private String Grading(int grade){
		//int grade = GetInt("enter the grade");
		
		if (grade>70) return("distinction");
		else if (grade>60) return("merit");
		else if (grade>49) return("pass");
		else return("fail");
	}
	
	public void Part1() {
		String[] names = new String[PART1LENGTH];
		int[] marks = new int[PART1LENGTH];
		String[] grades = new String[PART1LENGTH];
		
		for(int i = 0; i<PART1LENGTH; i++) {
			names[i]=GetString("enter the students name");
			marks[i]=GetInt("enter "+ names[i]+" marks");
			grades[i]=Grading(marks[i]);
		}
		//System.out.println(names);
		//System.out.println(marks);
		
		for(int i = 0;i<PART1LENGTH;i++) {
			System.out.printf("the student %s has mark %d with grade %s\n", names[i], marks[i], grades[i]);
		}
		
	}
	
	public void Part2() {
		int i=0;
		
		for(float money=100;money<200;money*=1.05) {
			System.out.printf("£%.2f\n",money);
			++i;
		}
		System.out.println(i);
	}
	
	public void Part3() {
		final int MAX = 20;
		for(int i =1;i<=MAX;i++) {
			for (int j =1;j<=MAX;j++) {
				System.out.printf("%5d",i*j);
			}
			System.out.println();
		}
	}
	
}
