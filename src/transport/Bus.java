package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int year, String country, int maxSpeed, String color) {
        super(brand, model, year, country, maxSpeed, color);
    }

    public String toString() {
        return "Автобус " + this.getBrand() + ", модель " + this.getModel() + ", год выпуска - " + this.getYear() +
                ", страна производства - " + this.getCountry() + ", скорость передвижения - " + this.getMaxSpeed() +
                " км/ч, цвет " + this.getColor();
    }
}
