package ss04_class_object.bai_tap.lop_phuong_trinh_bac_hai;

public class QuadraticEquation {
    double a , b , c ;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        return this.b * this.b - 4*this.a*this.c;
    }
    public double getRoot1(){
        return (-b+ Math.pow(getDiscriminant(),0.5))/2*a;
    }
    public double getRoot2(){
        return (-b- Math.pow(getDiscriminant(),0.5))/2*a;
    }


}
