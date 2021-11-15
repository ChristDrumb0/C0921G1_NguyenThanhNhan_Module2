package ss07_abstract_class_interface.thuc_hanh.abstract_animal_interface_edible.Main;

import ss07_abstract_class_interface.thuc_hanh.abstract_animal_interface_edible.animal.Animal;
import ss07_abstract_class_interface.thuc_hanh.abstract_animal_interface_edible.animal.Chicken;
import ss07_abstract_class_interface.thuc_hanh.abstract_animal_interface_edible.animal.Tiger;
import ss07_abstract_class_interface.thuc_hanh.abstract_animal_interface_edible.edible.Edible;

public class MainZoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }else{
                Edible edibler = (Tiger) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
