package dec08schoolproject;

public class Student implements ITDepartment,LanguageDepartment {

	private String name; // for name, surname and id I need getters and setters because I will get them from other other class
	private String lastname;
	private int id;
	private String departmentName;//for departmenName, instructor and labName I will create only setters
	private Instructor instructor;//because i will only set them. getter is for making method accessible from other classes
	private String labName;
	
	
	
	@Override
	public String departmentName() {//This method comes from super Interface so no need to create a getter
		
		return this.departmentName;
	}
	@Override
	public Instructor instructor() {//This method comes from super Interface so no need to create a getter
	
		return instructor;
	}
	@Override
	public Student student() {  //important: only this means return this class itself!!!
		
		return this;
	}
	@Override
	public String labName() {
		
		return this.labName;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	public void setLabName(String labName) {
		this.labName = labName;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", lastname=" + lastname + ", id=" + id + ", departmentName=" + departmentName
				+ ", instructor=" + instructor + ", labName=" + labName + "]";
	}
	
	
	
	
	
}
