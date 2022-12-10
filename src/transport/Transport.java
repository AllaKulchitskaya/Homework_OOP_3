package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    protected double fuelPercentage;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country, double fuelPercentage) {
        this(brand, model, year, country, fuelPercentage, 120, "белый");
    }

    public Transport(String brand, String model, int year, String country, double fuelPercentage,
                     int maxSpeed) {
        this(brand, model, year, country, fuelPercentage, maxSpeed, "белый");
    }

    public Transport(String brand, String model, int year, String country, double fuelPercentage,
                     int maxSpeed, String color) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }
        setColor(color);
        setFuelPercentage(fuelPercentage);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        if (this.color == null || this.color.isEmpty() || this.color.isBlank()) {
            this.color = "белый";
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        if (this.maxSpeed <= 0) {
            this.maxSpeed = 120;
        }
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    public void setFuelPercentage(double fuelPercentage) {
        this.fuelPercentage = fuelPercentage;
        if (this.fuelPercentage < 0 || this.fuelPercentage > 100) {
            this.fuelPercentage = 50;
        }
    }

    public abstract void refill();
}
