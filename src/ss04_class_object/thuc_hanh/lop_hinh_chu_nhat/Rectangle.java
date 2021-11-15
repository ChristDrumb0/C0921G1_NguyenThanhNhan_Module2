package ss04_class_object.thuc_hanh.lop_hinh_chu_nhat;

public class Rectangle {
    double width,height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.height * this.width;
    }
    public double getPerimeter(){
        return (this.height+this.width)*2;
    }
    public void setWidth(double newWidth){
        width = newWidth;
    }
    public void setHeight(double newHeight){
        height = newHeight;
    }
    public String display(){
        return "Rectangle{ width= "+width+", height= "+height+" }";
    }

}
