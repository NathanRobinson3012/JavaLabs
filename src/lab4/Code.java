package lab4;

import java.util.Scanner;

public class Code {
	
	public static int GetInt(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner (System.in);
		int out = s.nextInt();
		s.nextLine();
		//s.close();
		return out;
		}
	
	public void Part1(){
		
		int price = GetInt("How much is a bag worth in pence");
		int money = GetInt("How much money do you currently have");
		if(price>0 && money>0) {
			int max = money/price;
			System.out.println("you can buy "+max+" bags with "+money+"p at "+price+"p per bag");
			
		}
		else if (price<=0)
			System.out.println("price must be greater then 0");
		else if (money<=0)
			System.out.println("to buy a bag you must have some money to spend");
		
	}

}
