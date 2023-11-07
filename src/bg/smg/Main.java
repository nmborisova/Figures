package bg.smg;

public class Main {

    public static void main(String[] args) {
	    Triangle t = new Triangle("червен", 2);
        Square s = new Square("черен", 3);
        Circle c = new Circle("жълта", 1);
        t.show();
        s.show();
        c.show();

        ColoredFigure f;
        f=t;
        f.show();
        f=s;
        f.show();
        f=c;
        f.show();
    }
}
