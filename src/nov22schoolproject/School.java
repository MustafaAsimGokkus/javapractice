package nov22schoolproject;

public interface School {
  
	static final String SCHOOL_NAME = "TechProEd";
	
	public abstract String departmentName ();
	
	public abstract Instructor instructor (); // will return a whole instructor

	public abstract Student student ();  // // will return a whole student

}
