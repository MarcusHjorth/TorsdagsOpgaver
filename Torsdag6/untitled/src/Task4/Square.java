package Task4;

public class Square implements Shape {

    double value;

    Square(double value){
        this.value = value;
    }

    public double getArea(){
        return 3.14 * this.value;
    }
}
