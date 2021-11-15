package ss04_class_object.bai_tap.lop_fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed ;
    private boolean check ;
    private double radius ;
    private String color ;
    public Fan() {
        this.speed = 1;
        this.check = false;
        this.radius = 5;
        this.color = "Blue";
    }

    public Fan(int speed, boolean check, double radius, String color) {
        this.speed = speed;
        this.check = check;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if(check){
            return "speed=" + speed + " ,color=" + color +", radius=" + radius +" ,Fan is on";
        }
        else{
            return "color=" + color +", radius=" + radius +" ,Fan is off";
        }

    }

}
