package ss6_inheritence.bai_tap.point2d_point3d;

import java.util.Arrays;

public class MainPoint2dPoint3d {
    public static void main(String[] args) {
        Point2d p2d = new Point2d(2,3);
        Point3d p3d = new Point3d(2,3,4);
        System.out.println(Arrays.toString(p2d.getXY()));
        for (float n: p3d.getXYZ()) {
            System.out.print(n);
        }
    }
}
