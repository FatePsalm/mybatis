package entity;

public class DeptCopy {
	private int number;
	private String deptnames;
	private String loc;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDeptnames() {
		return deptnames;
	}
	public void setDeptnames(String deptnames) {
		this.deptnames = deptnames;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "DeptCopy [number=" + number + ", deptnames=" + deptnames + ", loc=" + loc + "]";
	}
	
	
}
