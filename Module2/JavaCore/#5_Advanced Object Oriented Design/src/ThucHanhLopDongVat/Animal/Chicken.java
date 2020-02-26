package ThucHanhLopDongVat.Animal;

import ThucHanhLopDongVat.Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: Chip chip";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
