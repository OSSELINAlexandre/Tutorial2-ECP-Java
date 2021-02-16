package osselin.alexandre.Exercice3;

public class Square extends Rectangle{


    public Square(double side) {
        super(side, side);
    }

    public Square() {
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double newside){
        super.setLength(newside);
        super.setWidth(newside);
    }

    @Override
    public void setWidth(double width) {
        System.out.println("This method is not functionning. Please use the \"SetSide\" Method" );
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        System.out.println("This method isn't functionning. Please use the \"SetSide\" Method" );
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side : " + super.getWidth() + super.toString();
    }
}
