package animals;

import java.util.Objects;

public class Amphibia extends Animal {
    private final String habitat;

    public Amphibia(String name, int age, String habitat) {
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
    public void eat() {
        System.out.println("Земноводные питаются насекомыми и другими беспозвоночными");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Amphibia amphibia = (Amphibia) o;
        return super.equals(o) && Objects.equals(habitat, amphibia.habitat);
    }

    @Override
    public void go() {
        System.out.println("Земноводные охотятся");


    }

    @Override
    public String toString() {
        return super.toString() + ", среда обитания - " + habitat;
    }
}
