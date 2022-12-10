package animals;

import java.util.Objects;

public class Herbivorous extends Mammal {
    private final String foodType;

    public Herbivorous(String name, int age, String habitat, int speed, String foodType) {
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
        System.out.println("Травоядные питаются растениями");
    }

    @Override
    public void go() {
        System.out.println("Травоядные пасутся");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivorous herbivorous = (Herbivorous) o;
        return super.equals(o) && Objects.equals(foodType, herbivorous.foodType);
    }

    @Override
    public String toString() {
        return super.toString() + ", тип пищи - " + foodType;
    }
}
