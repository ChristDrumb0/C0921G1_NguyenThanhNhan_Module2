package ss7_abstract_class_interface.bai_tap.recoloring;

import ss6_inheritence.thuc_hanh.Square;

public class RecoloringSquare extends Square implements Recolorable {

    @Override
    public String howToColor() {
        return "All side colored";
    }
}
