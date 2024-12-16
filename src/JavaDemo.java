class Dept{
	private long deptNo;
	private String deptName;
	private String location;

	public Dept(){}

	public Dept(long deptNo){
        this.deptNo = deptNo;
	}

	public Dept(long deptNo, String deptName){
        this(deptNo);
        this.deptName =  deptName;
	}

	public Dept(long deptNo, String deptName, String location){
		this(deptNo, deptName);
		this.location = location;
	}

	public void setDeptNo(long deptNo){
		this.deptNo = deptNo;
	}

	public void setDeptName(String deptName){
		this.deptName = deptName;
	}

	public void setLocation(String location){
		this.location = location;
	}

	public long getDpeNo(){
		return this.deptNo;
	}

	public String getDeptName(){
		return this.deptName;
	}

	public String getLocaiton(){
		return this.location;
	}

	public String getInfo(){
		return "部门编号： " + this.deptNo + "; \r\n 部门名称： " + this.deptName + "; \r\n 所在地： " + this.location; 
	}
}

public class JavaDemo {
	public static void main(String[] arg){
       Dept myDept = new Dept(1010,"IT部门","深圳");
       System.out.println(myDept.getInfo());
	}
}