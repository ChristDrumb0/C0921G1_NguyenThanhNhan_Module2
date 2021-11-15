package ss07_abstract_class_interface.bai_tap.resizeable;

import ss06_inheritence.thuc_hanh.Circle;

public class ResizeCircle extends Circle implements Resizeable{

    @Override
    public void resize(double p) {
        this.setRadius(this.getRadius()*Math.sqrt((100+p)/100));
    }

}
