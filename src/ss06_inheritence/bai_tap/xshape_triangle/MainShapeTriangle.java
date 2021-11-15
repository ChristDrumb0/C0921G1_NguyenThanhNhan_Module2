package ss06_inheritence.bai_tap.xshape_triangle;

public class MainShapeTriangle {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Triangle triangle = new Triangle();
        Triangle triangle1 = new Triangle("Blue",false,8,9,10);

        System.out.println(shape);
        System.out.println(triangle);
        System.out.println(triangle1);


    }

}
