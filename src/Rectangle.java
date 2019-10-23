public class Rectangle extends Shape {
    private double width, length;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.getWidth()*this.getLength();
    }

    public double getPerimeter(){
        return 2*this.getWidth()*this.getLength();
    }

    @Override
    public String toString() {
        return "A Rectangle with width= "+this.getWidth()+" and length="+this.getLength()+", which is a subclass of "+super.toString();
    }
}
