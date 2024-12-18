class Person3{
    int age;
    String name;
    private Car car;    // private Car car;
    private Person3[] children; // private Person3 son;

    public Person3(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setCar(Car car){
        this.car = car;
    }
    public Car getCar(){
        return this.car;
    }

    public String getINFO(){
        return ("Person Name: "+name+", Age: "+age);
    }

    public void setSon(Person3[] children){
        this.children = children;
    }
    public Person3[] getChildren(){
        return this.children;
    }
}

class Car{
    private String name;
    private double price;
    private Person3 owner;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getINFO(){
        return ("Car Name: "+name+", Car Price: "+price);
    }

    public void setOwner(Person3 owner){
        this.owner = owner;
    }
    public Person3 getOwner(){
        return this.owner;
    }
}

public class MutiPerson {
    public static void main(String[] args) {
        Person3 person1 = new Person3(395, "John");
        Person3 child1 = new Person3(20, "Jane");
        Person3 child2 = new Person3(18, "Tom");
        Person3[] children = {child1, child2};
        person1.setSon(children);

        // System.out.println(Arrays.toString(person1.getChildren()));
        child1.setCar(new Car("Toyota", 150000.0));
        child2.setCar(new Car("Honda", 120000.0));

        Car car1 = new Car("BMW", 200000.0);
        person1.setCar(car1);
        car1.setOwner(person1);

        System.out.println( person1.getINFO());
        System.out.println( person1.getCar().getINFO());

        for (Person3 child : person1.getChildren()){
            System.out.println("\t|-" + child.getINFO());
            System.out.println("\t\t|-" + child.getCar().getINFO());
        }
    }

}