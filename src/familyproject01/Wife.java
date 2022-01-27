package familyproject01;
import java.util.*;


public class Wife extends Father {
	
	private String name;
	
	private String lastname;
	private boolean isHappy;
	List<Product> list = new ArrayList<>();
    private Requirement requirement;
    
    public Wife() {
		super();
	}

	public Wife(String name, String lastname, boolean isHappy, List<Product> list, Requirement requirement) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.isHappy = isHappy;
		this.list = list;
		this.requirement = requirement;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the isHappy
	 */
	public boolean isHappy() {
		return isHappy;
	}

	/**
	 * @param isHappy the isHappy to set
	 */
	public void setHappy(boolean isHappy) {
		this.isHappy = isHappy;
	}

	/**
	 * @return the list
	 */
	public List<Product> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<Product> list) {
		this.list = list;
	}

	/**
	 * @return the requirement
	 */
	public Requirement getRequirement() {
		return requirement;
	}

	/**
	 * @param requirement the requirement to set
	 */
	public void setRequirement(Requirement requirement) {
		this.requirement = requirement;
	}

	@Override
	public String toString() {
		return "Wife [name=" + name + ", lastname=" + lastname + ", isHappy=" + isHappy + ", list=" + list
				+ ", requirement=" + requirement + "]";
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
