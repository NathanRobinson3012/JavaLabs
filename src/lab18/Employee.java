package lab18;

public class Employee {

	private int id;
	private int idCount;
	private String title;
	private String name;
	
	public Employee(int id, int idCount,String title, String name) {
		this.id=id;
		this.idCount=idCount;
		this.title=title;
		this.name=name;
	}
	
	public String details() {
		return String.format("employee %d is called %s and is currently in position %s\n",id,name,title);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdCount() {
		return idCount;
	}
	
}
