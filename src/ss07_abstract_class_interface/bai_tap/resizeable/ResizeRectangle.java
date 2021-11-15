package ss07_abstract_class_interface.bai_tap.resizeable;

import ss06_inheritence.thuc_hanh.Rectangle;

public class ResizeRectangle extends Rectangle implements Resizeable{

    @Override
    public void resize(double p) {
        setLength(getLength()*Math.sqrt((100+p)/100));
        setWidth(getWidth()*Math.sqrt((100+p)/100));
    }
}
