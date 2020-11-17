package model;

public class TestPo {
	@Override
	public String toString() {
		return "TestPo [TID=" + TID + ", TName=" + TName + "]";
	}
	private int TID;
	private String TName;
	public int getTID() {
		return TID;
	}
	public void setTID(int tID) {
		TID = tID;
	}
	public String getTName() {
		return TName;
	}
	public void setTName(String tName) {
		TName = tName;
	}
	public TestPo(int tID, String tName) {
		super();
		TID = tID;
		TName = tName;
	}
}
