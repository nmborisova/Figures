package bg.smg;

public class Triangle extends ColoredFigure {
    Triangle(String color, int s){
        super(color, s);
    }

    @Override
    String getName() {
        return "триъгълник";
    }

    @Override
    double getArea() {
        double k=Math.sqrt(3)/4;
        return size*size*k;
    }

}
