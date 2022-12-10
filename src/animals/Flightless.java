package animals;

import java.util.Objects;

public class Flightless extends Bird {
    private final String movingType;

    public Flightless(String name, int age, String habitat, String movingType) {
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
        System.out.println("Нелетающие птицы питаются растениями, насекомыми и мелкими позвоночными");
    }

    @Override
    public void go() {
        System.out.println("Нелетающие птицы гуляют");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flightless flightless = (Flightless) o;
        return super.equals(o) && Objects.equals(movingType, flightless.movingType);
    }

    @Override
    public String toString() {
        return super.toString() + ", тип передвижения - " + movingType;
    }
}
