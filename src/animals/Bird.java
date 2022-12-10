package animals;

import java.util.Objects;

public abstract class Bird extends Animal {
    private final String habitat;

    public Bird(String name, int age, String habitat) {
        super(name, age);
        if (habitat == null || habitat.isEmpty() || habitat.isBlank()) {
            habitat = "среда обитания не указана";
        }
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return super.equals(o) && Objects.equals(habitat, bird.habitat);
    }

    @Override
    public String toString() {
        return super.toString() + ", среда обитания - " + habitat;
    }
}
