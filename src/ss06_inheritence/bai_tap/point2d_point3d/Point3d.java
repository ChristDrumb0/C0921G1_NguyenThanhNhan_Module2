package ss06_inheritence.bai_tap.point2d_point3d;

public class Point3d extends Point2d {
    float z = 0.0f;
    public Point3d(){

    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" +
                "x=" + this.getX() +
                "y=" + this.getY() +
                "z=" + z +
                ')';
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {

        return new float[]{this.getX(), this.getY(),this.z};
    }

    public void setXYZ(float x,float y,float z) {
        this.setXY(x,y);
        this.z = z;
    }



}

