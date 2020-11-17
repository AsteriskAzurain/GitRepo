package javawb.pojo;

public class CollegeUser {
int id;
int score;
String name;
String command;
String major;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
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
@Override
public String toString() {
	return "CollegeUser [id=" + id + ", score=" + score + ", name=" + name + ", command=" + command + ", major=" + major
			+ ", getId()=" + getId() + ", getScore()=" + getScore() + ", getName()=" + getName() + ", getCommand()="
			+ getCommand() + ", getMajor()=" + getMajor() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

}
