package animals;

import java.util.Objects;

public class Predator extends Mammal {
    private final String foodType;

    public Predator(String name, int age, String habitat, int speed, String foodType) {
        super(name, age, habitat, speed);
        if (foodType == null || foodType.isBlank() || foodType.isEmpty()) {
            foodType = "Тип пищи не указан";
        }
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }

    @Override
    public void eat() {
        System.out.println("Хищники питаются другими животными");
    }

    @Override
    public void go() {
        System.out.println("Хищники охотятся");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predator predator = (Predator) o;
        return super.equals(o) && Objects.equals(foodType, predator.foodType);
    }

    @Override
    public String toString() {
        return super.toString() + ", тип пищи - " + foodType;
    }
}
