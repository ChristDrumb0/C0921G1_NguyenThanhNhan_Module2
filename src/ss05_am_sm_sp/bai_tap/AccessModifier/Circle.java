package ss05_am_sm_sp.bai_tap.AccessModifier;

public class Circle {
    private double radius =1.0;
    private String corlor = "Blue";
    final double PI = 3.14;

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }
    protected double getArea(){
        return radius*radius*PI;
    }

}
