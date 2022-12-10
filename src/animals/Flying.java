package animals;

import java.util.Objects;

public class Flying extends Bird {
    private final String movingType;

    public Flying(String name, int age, String habitat, String movingType) {
        super(name, age, habitat);
        if (movingType == null || movingType.isEmpty() || movingType.isBlank()) {
            movingType = "тип передвижения не указан";
        }
        this.movingType = movingType;
    }

    public String getMovingType() {
        return movingType;
    }

    @Override
    public void eat() {
        System.out.println("Летающие птицы питаются растительным и животным кормом");
    }

    @Override
    public void go() {
        System.out.println("Летающие птицы летают");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flying flying = (Flying) o;
        return super.equals(o) && Objects.equals(movingType, flying.movingType);
    }

    @Override
    public String toString() {
        return super.toString() + ", тип передвижения - " + movingType;
    }
}
