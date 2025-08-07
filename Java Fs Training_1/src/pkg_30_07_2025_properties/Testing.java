package pkg_30_07_2025_properties;

public class Testing {
    
	private String Name;
	private Double Height;
	private String Identification;
	private String BloodGroup;
	private String Goal;	
	@Override
	public String toString() {
		return "Testing [Name=" + Name + ", Height=" + Height + ", Identification=" + Identification + ", BloodGroup="
				+ BloodGroup + ", Goal=" + Goal + "]";
	}
	public Testing(String name, Double height, String identification, String bloodGroup, String goal) {
		super();
		Name = name;
		Height = height;
		Identification = identification;
		BloodGroup = bloodGroup;
		Goal = goal;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getHeight() {
		return Height;
	}
	public void setHeight(double height) {
		Height = height;
	}
	public String getIdentification() {
		return Identification;
	}
	public void setIdentification(String identification) {
		Identification = identification;
	}
	public String getBloodGroup() {
		return BloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}
	public String getGoal() {
		return Goal;
	}
	public void setGoal(String goal) {
		Goal = goal;
	}
}
