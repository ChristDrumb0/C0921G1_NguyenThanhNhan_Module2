package ss7_abstract_class_interface.bai_tap.resizeable;

import ss6_inheritence.thuc_hanh.Square;

public class ResizeSquare extends Square implements Resizeable{

    @Override
    public void resize(double p) {
        setSide(getSide()*Math.sqrt((100+p)/100));
    }
}
