package dec08schoolproject;

public interface School {

	
	
	public static final String SCHOOL_NAME = "TechProEd";
	
	public abstract String departmentName();//returns related department
	
	public abstract Instructor instructor();       //if I wanna get Instructor data type can be Instructor==>a whole instructor
	
	public abstract Student student  (); //returns a whole student
	
	
	
}
        