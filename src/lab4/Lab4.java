package lab4;

import java.util.Scanner;

public class Lab4 {
	
	public static int GetInt(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner (System.in);
		int out = s.nextInt();
		s.close();
		return out;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = 4;
		int x = 9;
		Code run = new Code();
		run.Part1();

	}

}
