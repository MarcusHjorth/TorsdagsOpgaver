package Task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ShapeBuilder shapeBuilder = new ShapeBuilder();

        Circle circle1 = new Circle(4);
        Square square1 = new Square(17);
        Circle circle2 = new Circle(7);

        System.out.println(circle1.getArea());
        System.out.println(circle2.getArea());
        System.out.println(square1.getArea());

        System.out.println(" ");

        ShapeBuilder.addShape(shapeBuilder.getShapes(),circle1);
        ShapeBuilder.addShape(shapeBuilder.getShapes(),circle2);
        ShapeBuilder.addShape(shapeBuilder.getShapes(),square1);


        System.out.println(ShapeBuilder.totalArea(shapeBuilder.getShapes()));
    }
}
