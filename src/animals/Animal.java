package animals;

import java.util.Objects;

public abstract class Animal {
    private final String name;
    private int age;

    public Animal(String name, int age) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            name = "кличка не указана";
        }
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (this.age < 0) {
            this.age = Math.abs(age);
        }
    }

    public abstract void eat();

    public void sleep() {
        System.out.println("Все животные спят");
    }

    public abstract void go();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return name + ", продолжительность жизни - " + age + " лет";
    }
}
