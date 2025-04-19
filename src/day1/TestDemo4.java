package day1;

class Emp{
	private int empNo;
	private String empName;
	private String job;
	private double salary;
	private double comm;

	//no parameters in Constructors
    public Emp(){}

    //muti-parameters in constructors
    public Emp(int empNo,String empName, String job,double salary, double comm){
       this.empNo = empNo;
       this.empName = empName;
       this.job = job;
       this.salary = salary;
       this.comm = comm;
    }


    //methods of getters and setters
    public void setEmpNo(int e) {
        empNo = e;
    }
    public void setEmpName(String e) {
        empName = e;
    }
    public void setJob(String j) {
        job = j;
    }
    public void setSalary(double s) {
        salary = s;
    }
    public void setComm(double c) {
        comm = c;
    }
    public int getEmpNo() {
        return empNo;
    }
    public String getEmpName() {
        return empName;
    }
    public String getJob() {
        return job;
    }
    public double getSalary() {
        return salary;
    }
    public double getComm() {
        return comm;
    }


    public String getInfo(){
    	return "empno:" + this.empNo + "\n" +
    	       "empName:" + this.empName  + "\n" +
    	       "Jod:" + this.job  + "\n" +
    	       "Salary:" + this.salary  + "\n" +
    	       "Commission:" + this.comm ;
    }
}

public class TestDemo4{
	public static void main(String[] args){
		Emp emp = new Emp(7369, "SMITH", "CLERK", 800.0, 1.0);
        System.out.println(emp.getInfo());
	}
}