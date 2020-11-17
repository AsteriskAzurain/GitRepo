package javawb.pojo;

public class CollegeUser1 {

	int id;
	String name;
	String command;
	String major;
	int score;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "CollegeUser1 [id=" + id + ", name=" + name + ", command=" + command + ", major=" + major + ", score="
				+ score + ", getId()=" + getId() + ", getName()=" + getName() + ", getCommand()=" + getCommand()
				+ ", getMajor()=" + getMajor() + ", getScore()=" + getScore() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
