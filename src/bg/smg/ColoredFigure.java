package bg.smg;

abstract class ColoredFigure {
    String color;
    int size;
    ColoredFigure(String color, int s){
        this.color=color;
        this.size=s;
    }
    void show(){
        System.out.println("Фигура: "+color+" "+getName());
        System.out.println("Характеристичен размер ("+getSizeName()+"): "+size);
        System.out.println("Площта е: "+getArea());
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
