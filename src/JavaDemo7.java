import java.lang.Math;

abstract class AbstractShape{
    public abstract double area();
    public abstract double perimeter();
}

class Circular extends AbstractShape{
    private double radius;
    
    public Circular(double radius){
        this.radius = radius;
    }
    public double area(){
        // keep the value as double with 4 decimal places
        return Math.round(3.1415926 * this.radius * this.radius * 10000) / 10000.0;
    }
    public double perimeter(){
        // keep the value as double with 4 decimal places
        return Math.round( 2 * 3.1415926 * this.radius * 10000)/ 10000.0;
    }
}

// Rectangle Four
class Rectangle2 extends AbstractShape{
    private double length;
    private double width;
    
    public Rectangle2(double length,double width){
        this.length = length;
        this.width = width;
    }
    
    public double area(){
        // keep the value as double with 4 decimal places
        return Math.round(this.length * this.width * 10000) / 10000.0;
    }
    public double perimeter(){
        // keep the value as double with 4 decimal places
        return Math.round(2 * this.width + 2 * this.length * 10000) / 10000.0;
    }
}

class FactoryShape{
    public static AbstractShape getInstance(String className, Double[] args ){
        if ("Circular".equalsIgnoreCase(className)){
            return new Circular(args[0]);
        } else if ("Rectangle".equalsIgnoreCase(className)){
            return new Rectangle2(args[0],args[1]);
        } else {
            return null;
        }
    }
}

public class JavaDemo7{
    public static void main (String[] args){
        AbstractShape absCircular = FactoryShape.getInstance("Circular",new Double[]{1.2});
        System.out.println("This is circular, Area: " + absCircular.area() + "; perimeter: " + absCircular.perimeter());
        AbstractShape absRectangle = FactoryShape.getInstance("Rectangle",new Double[]{8.2, 3.1});
        System.out.println("This is rectangle, Area: " + absRectangle.area() + "; perimeter: " + absRectangle.perimeter());
    }
}