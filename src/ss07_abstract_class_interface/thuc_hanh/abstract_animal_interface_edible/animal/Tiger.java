package ss07_abstract_class_interface.thuc_hanh.abstract_animal_interface_edible.animal;

import ss07_abstract_class_interface.thuc_hanh.abstract_animal_interface_edible.edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }
    @Override
    public String howToEat() {
        return "couldn't be eaten cause they are in danger";
    }
}
