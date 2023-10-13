package Task4;

public class Circle implements Shape {
    double value;

    Circle(double value){
        this.value = value;
    }

    public double getArea(){
        return 3.14 * (this.value * this.value);
    }
}
