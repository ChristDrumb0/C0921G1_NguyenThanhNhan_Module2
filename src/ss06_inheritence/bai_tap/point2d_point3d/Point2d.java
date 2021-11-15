package ss06_inheritence.bai_tap.point2d_point3d;

public class Point2d {
    private Float f[]=new Float[2];
    private float x=0.0f;
    private float y=0.0f;
    public Point2d(){

    }
    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){

        return new float[]{this.x,this.y};

    }

    @Override
    public String toString() {
        return "(" +
                "x=" + x +
                ", y=" + y +
                ')';
    }
}
