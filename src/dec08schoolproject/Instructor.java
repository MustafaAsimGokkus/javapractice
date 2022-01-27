package dec08schoolproject;

public class Instructor implements ITDepartment,LanguageDepartment {

	private String name;
	private String lastname;
	private String title;
	private String departmentName;
	private String labName;
	private int id;
	
	
	
	@Override
	public String departmentName() {   // when we override methods from parent interface we have already getter
		
		return this.departmentName;
	}	
	
	public void setDepartmentName (String departmentName) {
		
		this.departmentName = departmentName;
	}
		

	@Override
	public Instructor instructor() {
		
		return null;
	}
	@Override
	public Student student() {
		
		return null;
	}
	@Override
	public String labName() {
		
		return this.labName;
	}	
	
	public void setLabName (String labName) {
		
	this.labName = labName;	
	}
		
	@Override
	public boolean isLabAvailable() {
		
		return false;
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", lastname=" + lastname + ", title=" + title + ", departmentName="
				+ departmentName + ", labName=" + labName + ", id=" + id + "]";
	}
	
		
 }
