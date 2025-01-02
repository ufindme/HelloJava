class Person4 {
    private String name;
    private int age;

    public Person4(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("[Person4 Superclass] a new Person4 superclass instance is created");
    }
}

class Student extends Person4 {
    private String schoolName;
    public Student(String name, int age) {
        //a superclass instance is created, then a subclass instance is created
        super(name, age);
        System.out.println("[Student Subclass] a new Student subclass instance is created");
    }
}

class ExecOrder2 {
    //a superclass instance is created, then a subclass instance is created
    //the order of execution is: Person4 -> Student -> ExecOrder2
    public static void main(String[] args) {
        Student emp = new Student("John", 25);
    }
}
