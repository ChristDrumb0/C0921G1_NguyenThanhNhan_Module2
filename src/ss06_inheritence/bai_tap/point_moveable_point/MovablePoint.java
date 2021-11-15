package ss06_inheritence.bai_tap.point_moveable_point;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(){

    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed ) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return new float[] {this.xSpeed,this.ySpeed};
    }

    @Override
    public String toString() {
        return "(" +
                "x="+ getX()+
                "y="+ getY()+
                "Speed ="+
                "(xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                "))";
    }

    // return this sẽ thay đổi chính đối tượng đc tạo còn return new sẽ tạo ra một đối tượng mới rỗng
//    public MovablePoint move(){
//        this.setX(getX()+xSpeed);
//        this.setY(getY()+ySpeed);
//        return this;
//    }
    //Có thể sử dụng void
    public void move(){
        this.setX(getX()+xSpeed);
        this.setY(getY()+ySpeed);

    }
}
