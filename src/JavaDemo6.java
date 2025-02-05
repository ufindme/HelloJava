abstract class Person6{
    private int age;
    private String name;
    
    //abstract methods
    public abstract void eat();
    public abstract void walk();
    public abstract String toString();
    
    //normal methods
    public int getAge(){
        return this.age;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setName(String name){
        this.name = name;
    }
}

class Member extends Person6{
    @Override
    public void eat(){
        System.out.println("He eats meat."); 
    }
    
    @Override
    public void walk(){
        System.out.println("He can walk with two legs.");
    }
    
    @Override
    public String toString(){
        return "His name is " + getName() + ", and his age is " + getAge();
    }
    
    public Member(String name, int age){
        setAge(age);
        setName(name);
    }
}


public class JavaDemo6{
    public static void main(String[] args){
        //create a member name's Tom and his age is 20
        Member mbr = new Member("Tom",20);
        mbr.eat();
        mbr.walk();
        System.out.println(mbr.toString());
    }
}