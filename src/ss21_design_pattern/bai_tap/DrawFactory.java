package ss21_design_pattern.bai_tap;

public class DrawFactory {
    public Shape getShape(String shape){
        switch (shape){
            case "circle":
                return new Circle();
            case "square":
                return new Square();
//            case"rectangle":
//                return new Rectangle();
            default:
                return new Rectangle();

        }
    }
}
