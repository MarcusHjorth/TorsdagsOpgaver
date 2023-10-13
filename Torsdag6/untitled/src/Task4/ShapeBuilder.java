package Task4;

import java.util.ArrayList;

public class ShapeBuilder {

    private ArrayList<Shape>shapes = new ArrayList<>();

    public ShapeBuilder(){
        shapes = new ArrayList<>();
    }
    public static void addShape(ArrayList<Shape> shapes, Shape shape){
        shapes.add(shape);
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public static double totalArea(ArrayList<Shape> shapes){
        double sumArea = 0;
        for (Shape shape : shapes) {
            sumArea += shape.getArea();
        }
        return sumArea;
    }
}
