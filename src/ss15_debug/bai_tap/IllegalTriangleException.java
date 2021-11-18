package ss15_debug.bai_tap;

public class IllegalTriangleException extends Exception{
    public IllegalTriangleException() {
        super("Tam giác vô vị");
    }

    public IllegalTriangleException(String message) {
        super(message);
    }
    @Override
    public String getMessage(){
        return super.getMessage();
    }
}
