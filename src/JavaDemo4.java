class Department {
    private long deptNo;
    private String deptName;
    private String loc;
    private Emp[] emps;
    
    public Department(long deptNo, String deptName, String loc){
        this.deptNo = deptNo ;
        this.deptName = deptName;
        this.loc = loc;
    }
    
    public String getInfo(){
        return "【部门信息】部门编号：" + this.deptNo + ", 部门名称：" + this.deptName + ", 所在地：" + this.loc;
    }
    
    public void Dept(){}
    
    public long getDeptNo(){
        return this.deptNo;
    }   
    public void setDeptno(long deptNo){
        this.deptNo = deptNo;
    }
    
    public String getDeptName(){
        return this.deptName;
    }   
    public void setDeptName(String deptName){
        this.deptName = deptName;
    }
    
    public String getLoc(){
        return this.loc;
    }
    public void setDeptno(String loc){
        this.loc = loc;
    }
    
    public Emp[] getEmps(){
        return this.emps;
    }
    public void setEmps(Emp[] emps){
        this.emps = emps;
    }
    
}

class Emp{
    private long empNo;
    private String empName;
    private String work;
    private Department dept;
    private Emp mgr;
    private double salary;
    private double comm;
    
    public Emp(long empNo,String empName,String work,double salary,double comm){
        this.empNo = empNo ;
        this.empName = empName;
        this.work = work;
        this.salary = salary;
        this.comm = comm;
    }
    
    public String getInfo(){
        return "【雇员信息】员工编号：" + this.empNo + ", 姓名：" + this.empName + ", 职位：" + this.work+ ", 基本工资：" + this.salary+ ", 佣金：" + this.comm;
    }
    
    public void Emp(){}
    
    public Emp getMgr(){
        return this.mgr;
    }
    public void setMgr(Emp mgr){
        this.mgr = mgr;
    }
    
    public void setDept(Department dept){
        this.dept = dept;
    }    
    public Department getDept(){
        return this.dept;
    }
        
    public String getWork(){
        return this.work;
    }    
    public void setWork(String work){
        this.work = work;
    }

    public double getSalary(){
        return this.salary;
    }    
    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getComm(){
        return this.comm;
    }    
    public void setComm(double comm){
        this.comm = comm;
    } 
    
    public long getEmpNO(){
        return this.empNo;
    }    
    public void setEmpNO(long empNo){
        this.empNo = empNo;
    }

    public String getEmpName(){
        return this.empName;
    }    
    public void setEmpName(String empName){
        this.empName = empName;
    }     
}

public class JavaDemo4 {
	public static void main(String[] args){
        //第一步:根据关系进行类的定义
        //定义出各个类的实例化对象，此时并没有任何的关联定义
        Department dept = new Department(11L,"财务部","深圳市");
        Emp empA = new Emp(3001L,"Tom","会计",3000.0,150.0);
        Emp empB = new Emp(2001L,"Sam","经理",5000.0,200.0);
        Emp empC = new Emp(1001L,"Tim","副总经理",10000.0,0.0);
        
        //需要为对象进行关联设置
        empA.setMgr(empB);
        empB.setMgr(empC);
        dept.setEmps(new Emp[]{empA,empB,empC});
        
        //第二步：根据关系获取数据
        System.out.println(dept.getInfo());
        for(int i=0;i< dept.getEmps().length;i++){
            dept.getEmps()[i].setDept(dept);
            System.out.println("\t|-" + dept.getEmps()[i].getInfo());
            
            if (dept.getEmps()[i].getMgr() != null)
              System.out.println("\t\t|-" + dept.getEmps()[i].getMgr().getInfo());
        }
        System.out.println("----------------------------");
        System.out.println(empA.getDept().getInfo());
        System.out.println(empA.getMgr().getInfo());
	}
}