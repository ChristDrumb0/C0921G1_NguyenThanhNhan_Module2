package ss06_inheritence.thuc_hanh;

public class MainGeometricObject {
    public static void main(String[] args) {
        //GeometricObject
        GeometricObject shape = new GeometricObject();
        System.out.println(shape);

        shape = new GeometricObject("red", false);
        System.out.println(shape);
        //Circle
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        //Rectangle
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
        //Square
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
    }
}
