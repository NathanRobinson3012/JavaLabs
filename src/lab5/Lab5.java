package lab5;

import java.util.Scanner;

public class Lab5 {
	
	private static int GetInt(String prompt) {
		System.out.println(prompt);
		Scanner s = new Scanner (System.in);
		int out = s.nextInt();
		s.nextLine();
		//s.close();
		return out;
		}
	
	private static boolean GetBoolYN(String prompt) {
		while (true){
			System.out.println(prompt+"\nPlease enter y or n");
			
			Scanner s = new Scanner(System.in);
			String ans=s.nextLine();
			//s.close();
			//boolean out;
			if(ans!=null&&!ans.isBlank()) {
				
				if(ans.equalsIgnoreCase("y")) return true;
				else if (ans.equalsIgnoreCase("n")) return false;
				else System.out.println("invalid input");
			}
			else System.out.println("ERROR: PLEASE ENTER A VALID INPUT");
		}
		
	}

	public void Part1(){
		int grade = GetInt("enter the grade");
		
		if (grade>70) System.out.println("distinction");
		else if (grade>60) System.out.println("merit");
		else if (grade>49) System.out.println("pass");
		else System.out.println("fail");
	}
	
	public void Part2() {
		String toDo = "";
		boolean summer = GetBoolYN("is it summer?");
		boolean evening = GetBoolYN("is it a sunny evening");
		
		toDo+="Have a shower\n";
		
		if(summer&&evening) toDo+="Eat outside\n";
		else toDo+="Eat inside\n";
		
		if (summer) toDo+="Do outdoors hobby\n";
		
		if (!summer && evening)toDo+="Go for a walk\n";
		
		toDo+="talk to friends\n";
		
		System.out.println("On todays todo list:\n"+toDo);
		
	}
}
