import edu.princeton.cs.introcs.StdDraw;
public class Rectangle{
    private double length;
    private double width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter() {
        return (2*length) + (2*width);
    }

    public boolean compareArea(Rectangle r1){
        return getArea() < r1.getArea();
    }

    public boolean isSquare(){
        return width == length;
    }

    public void drawItself() {
        StdDraw.rectangle(0.5,0.5,width/100,length/100);
    }


    public static void main (String[] args) {
        Rectangle r1 = new Rectangle(5,5);
        Rectangle r2 = new Rectangle(4,5);
        r1.drawItself();
    }

}

