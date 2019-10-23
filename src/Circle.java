public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
       return "A Circle with radius="+this.getRadius()+", which is a subclass of "+super.toString();
    }

    public double getArea(){
        return Math.pow(this.getRadius(),2)*Math.PI;
    }

    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }
}
