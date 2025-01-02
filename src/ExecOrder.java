/**
 *   静态代码块优先于主方法先执行。
 *   主方法优先执行
 * */
class Person2{
    public Person2(){
        System.out.println("【Person类构造方法1】Person类的构造方法执行 ");
    }

    static {
        System.out.println("【Person类静态代块2】静态代码块执行");
    }
    {
        System.out.println("【Person类构造块3】Person类的构造块执行");
    }
}

public class ExecOrder {

    //静态代码块优先于主方法执行，可以用于程序加载的初始化。
    static{
            System.out.println("【主类中的静态代码块6】一般用于程序初始化。");
    }

    public static void main(String[] args) {

        if(true){
            int x = 10;
            System.out.println("【主类main函数普通代码块4】是定义在方法中的方法块。x=" + x);
        }

        int x =  100;
        System.out.println("【主类main函数普通代码块5】是定义在方法中的方法块。x=" + x);

        new Person2();
        new Person2();
        new Person2();


    }
}
