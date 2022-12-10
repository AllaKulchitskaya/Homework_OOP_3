package animals;

import java.util.Objects;

public abstract class Mammal extends Animal {
    private final String habitat;
    private int speed;

    public Mammal(String name, int age, String habitat, int speed) {
        super(name, age);
        if (habitat == null || habitat.isEmpty() || habitat.isBlank()) {
            habitat = "среда обитания не указана";
        }
        this.habitat = habitat;
        setSpeed(speed);
    }

    public String getHabitat() {
        return habitat;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        if (this.speed < 0) {
            this.speed = Math.abs(speed);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mammal mammal = (Mammal) o;
        return super.equals(o) && Objects.equals(habitat, mammal.habitat) && speed == mammal.speed;
    }

    @Override
    public String toString() {
        return super.toString() + ", среда обитания - " + habitat + ", скорость - " + speed + " км/ч";
    }
}
