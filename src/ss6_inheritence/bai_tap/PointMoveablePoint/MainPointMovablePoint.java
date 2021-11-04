package ss6_inheritence.bai_tap.PointMoveablePoint;

public class MainPointMovablePoint {
    public static void main(String[] args) {
        Point p = new Point(1,1);
        MovablePoint mp = new MovablePoint(1,1, 0.2f,0.2f);

        System.out.println(p.toString());
        for (int i = 0; i < 100; i++) {
            mp.move();
            System.out.println(mp.toString());
        }

    }

}
