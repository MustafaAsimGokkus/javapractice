 package practice4_nov_28;

  public class Student implements HonorAward {
	  private String name;
	  private String lastname;
	  private int age;
	  private ReportCard reportCard;
	  private Parent parent; 
	  
	public Student() {
		
	}
	
	public Student(String name, String lastname, int age, ReportCard reportCard, Parent parent) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.reportCard = reportCard;
		this.parent = parent;
	}

	public Student(String name, String lastname, int age, ReportCard reportCard) {
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.reportCard = reportCard;
	} 
	  



  public int total () {
	  int total = reportCard.getEnglishGrade()+reportCard.getJavaGrade()+reportCard.getMathGrade()+reportCard.getScienceGrade();
   
	  
	  return total;
  }
  @Override
  public String successMessage() {
	
	  String message = "You need to make more efforts! Almost there";
	  if (total() >= 35) {
		System.out.println("Congragulations you are super!!");  
	  }
	  
	return message;
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
    public int getAge() {
	return age;
    }
    public void setAge(int age) {
	this.age = age;
    }
    public ReportCard getReportCard() {
	return reportCard;
    }
    public void setReportCard(ReportCard reportCard) {
 	this.reportCard = reportCard;
  }

   @Override
   public String toString() {
	return "Student [name=" + name + ", lastname=" + lastname + ", age=" + age + ", reportCard=" + reportCard + "]";
}

}
