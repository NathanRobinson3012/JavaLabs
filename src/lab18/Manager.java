package lab18;

import java.util.ArrayList;

public class Manager extends Employee {
	
	private ArrayList<Employee> employees;
	
	public Manager(int id, int idCount, String title, String name) {
		// TODO Auto-generated constructor stub
		
		super(id,idCount,title,name);
		
	}
	
	public void AddEmploy(Employee employ) {
		employees.add(employ);
	}
	
	public String details() {
		String s = super.details();
		s+="This person is in change of:\n";
		for (Employee e : employees) {
			s+=e;
		}
		return s;
	}

}
