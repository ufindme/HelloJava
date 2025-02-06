// Factory design pattern is used to create objects of different classes without exposing the creation logic to the client.
interface IShape {
    void draw();
}

//define class Circle
class Circle implements IShape{
    public void draw(){
        System.out.println("Draw a circle");
    }
}

//define class Rectangle
class Rectangle implements IShape{
    public void draw(){
        System.out.println("Draw a rectangle");
    }
}

//define class Square
class Square implements IShape{
    public void draw(){
        System.out.println("Draw a square");
    }
}

//define class ShapeFactory
class ShapeFactory {
    public IShape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }else if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        /*Shape circle = shapeFactory.getShape("circle");
        Shape rectangle = shapeFactory.getShape("rectangle");
        Shape square = shapeFactory.getShape("square");

        circle.draw();
        rectangle.draw();
        square.draw();*/

        //Using command line arguments to create shape objects
        IShape myShape = shapeFactory.getShape(args[0]);
        myShape.draw();

    }
}
