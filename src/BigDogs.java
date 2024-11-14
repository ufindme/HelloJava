
abstract class Animal2{
    private int age = 10;
    public void Animal(){
        System.out.println("初始化Animal");
    }
    public void move(){
        System.out.println("跑步数："+this.age);
    }
}

abstract class Dog extends Animal2{
    public Dog(int age){
        // super(age);   //不去掉会报异常，除非第25行注释掉
        System.out.println("初始化Dog");
    }

    //这个是为了第24行的构造方法而创建的;
    public Dog(){ }

}

public class BigDogs extends Dog{
    public BigDogs(){
        //super(20);
        System.out.println("初始化BigDog");
    }

    public static void main(String[] args){
        BigDogs a = new BigDogs();
        a.move();
    }
}