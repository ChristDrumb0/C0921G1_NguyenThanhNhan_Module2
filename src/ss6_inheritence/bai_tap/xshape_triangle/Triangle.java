package ss6_inheritence.bai_tap.xshape_triangle;

public class Triangle extends Shape{
    private double s1 = 1.0;
    private double s2 = 1.0;
    private double s3 = 1.0;

    public Triangle() {
    }

    public Triangle(String color, boolean filled, double s1, double s2, double s3) {
        super(color, filled);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public double getS1() {
        return this.s1;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public double getS2() {
        return this.s2;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public double getS3() {
        return this.s3;
    }

    public void setS3(double s3) {
        this.s3 = s3;
    }

    public  double getPerimeter(){
        return (s1+s2+s3);
    }

    public double getArea(){

        double p = getPerimeter()/2;
        return Math.sqrt(p*(p-s1)*(p-s2)*(p-s3));
    }

    @Override
    public String toString() {
        return "Triangle(" +
                "Color:"+ getColor()+
                (isFilled() ? " filled" : " not filled")+
                ", s1=" + s1 +
                ", s2=" + s2 +
                ", s3=" + s3 +
                ", Perimeter="+getPerimeter()+
                ", Area="+getArea()+
                ')';
    }
}
