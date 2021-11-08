package ss7_abstract_class_interface.bai_tap.resizeable;

import ss6_inheritence.thuc_hanh.GeometricObject;

public class ResizeGeometricTest {
    public static void main(String[] args) {
        GeometricObject[] arr = new GeometricObject[3];
        arr[1]= new ResizeRectangle();
        arr[0]= new ResizeCircle();
        arr[2]= new ResizeSquare();
        for (GeometricObject sh : arr){
            if (sh instanceof ResizeCircle){
                ResizeCircle circle  = (ResizeCircle) sh;
                circle.setRadius(2.0);
                System.out.println("before" +circle.getArea());
                double resizep = Math.random()*(100-1+1)+1;
//                double resizep = 10;
                circle.resize(resizep);
                System.out.println("after" + circle.getArea());

            }else if(sh instanceof ResizeRectangle){
                ResizeRectangle rectangle = (ResizeRectangle) sh;
                rectangle.setLength(3.0);
                rectangle.setWidth(4.0);
                System.out.println("before"+rectangle.getArea());
                double resizep = Math.random()*(100-1+1)+1;
//                double resizep = 100;
                rectangle.resize(resizep);
                System.out.println("after"+rectangle.getArea());
            }
            else if(sh instanceof ResizeSquare){
                ResizeSquare square = (ResizeSquare) sh;
                square.setSide(5.0);
                System.out.println("before"+square.getArea());
                double resizep = Math.random()*(100-1+1)+1;
//                double resizep = 10;
                square.resize(resizep);
                System.out.println("after"+square.getArea());
            }
        }

    }
}
