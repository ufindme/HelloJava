
interface Bark {
    void bark();
}

interface Walk {
    void walk();
}

abstract class Animal3 implements Bark, Walk {
    public abstract void eat();

    // bark and walk are implemented but there doesn't need to achieve the interface's method
}
class Cat2 extends Animal3 implements Bark, Walk {
    public void bark() {
        System.out.println("Meow!");
    }

    public void walk() {
        System.out.println("I am walking as a cat.");
    }
    public void eat() {
        System.out.println("I am eating fish.");
    }
}

class Dog2 implements Bark, Walk {
    public void bark() {
        System.out.println("Woo!");
    }

    public void walk() {
        System.out.println("I am walking as a dog.");
    }
}

public class Start3 {
    public static void main(String[] args) {
        Dog2 myDog = new Dog2();
        myDog.bark();
        myDog.walk();
        Cat2 myCat = new Cat2();
        myCat.bark();
        myCat.walk();
        myCat.eat();
    }
}





