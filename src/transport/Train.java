package transport;

public class Train extends Transport {
    private int ticketCost;
    private String tripTime;
    private String departureStation;
    private String finalStation;
    private int carriageNumber;

    public Train(String brand, String model, int year, String country, int maxSpeed, int ticketCost,
                 String tripTime, String departureStation, String finalStation, int carriageNumber) {
        super(brand, model, year, country, maxSpeed);
        setTicketCost(ticketCost);
        setTripTime(tripTime);
        setDepartureStation(departureStation);
        setFinalStation(finalStation);
        setCarriageNumber(carriageNumber);
    }


    public int getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(int ticketCost) {
        this.ticketCost = ticketCost;
        if (this.ticketCost <= 0) {
            this.ticketCost = 1_000;
        }
    }

    public String getTripTime() {
        return tripTime;
    }

    public void setTripTime(String tripTime) {
        this.tripTime = tripTime;
        if (this.tripTime == null || this.tripTime.isEmpty() || this.tripTime.isBlank()) {
            this.tripTime = "1 час";
        }
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
        if (this.departureStation == null || this.departureStation.isEmpty() || this.departureStation.isBlank()) {
            this.departureStation = "нет информации";
        }
    }

    public String getFinalStation() {
        return finalStation;
    }

    public void setFinalStation(String finalStation) {
        this.finalStation = finalStation;
        if (this.finalStation == null || this.finalStation.isEmpty() || this.finalStation.isBlank()) {
            this.finalStation = "нет информации";
        }
    }

    public int getCarriageNumber() {
        return carriageNumber;
    }

    public void setCarriageNumber(int carriageNumber) {
        this.carriageNumber = carriageNumber;
        if (this.carriageNumber <= 0) {
            this.carriageNumber = 10;
        }
    }

    @Override
    public String toString() {
        return "Поезд " + this.getBrand() + ", модель " + this.getModel() + ", год выпуска - " + this.getYear() +
                ", страна производства - " + this.getCountry() + ", скорость передвижения - " + this.getMaxSpeed() +
                " км/ч, станция отправления - " + departureStation + ", станция прибытия - " + finalStation +
                ", цена поездки - " + ticketCost + " рублей, количетсво вагонов в поезде - " + carriageNumber;
    }
}
