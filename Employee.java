import java.io.Serializable;

public class Employee implements Serializable {
	private String name;
	private String job;

	public Employee(String name, String job) {
		this.name = name;
		this.job = job;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setJob(String job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}

	public String toString() {
		return "Name: " + name + "\nJob: " + job;
	}
}
