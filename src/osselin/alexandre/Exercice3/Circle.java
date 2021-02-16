package osselin.alexandre.Exercice3;

public class Circle extends Shape{

    private double radius;

    public Circle() {
        radius = 1.0;
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
     public double getArea(){
        return Math.PI * radius * radius;
     }

     public double getPerimeter(){
         return Math.PI*2*radius;
     }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}' + super.toString();
    }
}
