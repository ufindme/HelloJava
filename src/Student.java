class Person5{
	private String name;
	private String addr;
	private String sex;
	private long age;
	
	public Person5(){}
	
	public Person5(String name, long age){
		this.name = name;
		this.age = age;
	}
	
	public Person5(String name,long age, String sex,String addr){
		this(name,age);
		this.addr = addr;
		this.sex = sex;		
	}
	
	public String getInfo(){
		return "name:" + this.name + "; age:" + this.age+ "; sex:" + this.sex+ "; addr:" + this.addr;
	}
}
public class Student extends Person5{
	private long math;
    private long english;
	
	public Student(){}
	public Student(String name, long age){
		super(name,age);
	}
	
	public Student(String name,long age,String sex,String addr, long math, long english){
		super(name,age,sex,addr);
		this.math = math;
		this.english = english;
	}
	
	//@Override
	public String getInfo(){
		return super.getInfo() + "; math score:" + this.math+ "; english score:" + this.english;
	}
	
	public static void main(String[] args){
		Student student = new Student("John",15,"Boy","江西省赣州市",89,77);
		System.out.println(student.getInfo());
	}
}
