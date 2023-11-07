package bg.smg;

abstract class ColoredFigure {
    String color;
    int size;
    ColoredFigure(String color, int s){
        this.color=color;
        this.size=s;
    }
    void show(){
        System.out.println("Figure with color "+color+" with name "+getName()+" has size of "+getSizeName()+": "+size);
        System.out.println("Area of figure is: "+getArea());
        String line="";
        for(int i=0;i<30;i++){
            line+="*";
        }
        System.out.println(line);
    }

    String getSizeName(){
        return "страна";
    }

    abstract String getName();
    abstract double getArea();
}
