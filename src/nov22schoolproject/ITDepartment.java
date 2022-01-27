package nov22schoolproject;

public interface ITDepartment extends School {

	public static final String Name = "IT Department";
	
	public abstract Instructor instructor (); // will return a whole instructor

	public abstract Student student ();  // // will return a whole student
	
	public String labName();
	
	public boolean isLabAvailable();
	
	
	
	
	
}
