package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int year, String country, double fuelPercentage, int maxSpeed, String color) {
        super(brand, model, year, country, fuelPercentage, maxSpeed, color);
    }

    @Override
    public void refill() {
        if (fuelPercentage < 100) {
            this.setFuelPercentage(100);
            System.out.println("Автобус заправляется бензином или дизелем на заправке");
            System.out.println("Количество топлива в процентах после заправки - " + this.getFuelPercentage());
        } else {
            this.fuelPercentage = fuelPercentage;
            System.out.println("Бак полный. Заправляться не нужно");
        }
    }

    public String toString() {
        return "Автобус " + this.getBrand() + ", модель " + this.getModel() + ", год выпуска - " + this.getYear() +
                ", страна производства - " + this.getCountry() + ", количество топлива в процентах - " +
                this.getFuelPercentage() + ", скорость передвижения - " + this.getMaxSpeed() +
                " км/ч, цвет " + this.getColor();
    }
}
