package bg.smg;

public class Circle extends ColoredFigure {
    Circle(String color, int r){
       super(color, r);
    }

    @Override
    String getName() {
        return "окръжност";
    }

    @Override
    double getArea() {
        return size*size*Math.PI;
    }

    @Override
    String getSizeName() {
        return "радиус";
    }
}
