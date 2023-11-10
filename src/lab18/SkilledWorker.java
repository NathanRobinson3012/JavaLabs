package lab18;

import java.util.ArrayList;

public class SkilledWorker extends Employee {
	
	private ArrayList<String> skills;

	public SkilledWorker(int id, int idCount, String title, String name) {
		// TODO Auto-generated constructor stub
		super(id,idCount,title,name);
		
	}
	
	public void gainSkill(String skill) {
		skills.add(skill);
	}
	
	
}
