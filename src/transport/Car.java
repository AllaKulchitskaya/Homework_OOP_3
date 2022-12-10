package transport;

import java.time.LocalDate;

public class Car extends Transport {
    private double engineVolume;
    private String gearBbox;
    private final String bodywork;
    private String registrationNumber;
    private final int seatNumber;
    private boolean areTyresSnow;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, int year, String country, String color,
               double engineVolume, String gearBbox, String bodywork, String registrationNumber,
               int seatNumber, boolean areTyresSnow, Key key, Insurance insurance) {
        super(brand, model, year, country);
        setEngineVolume(engineVolume);
        setGearBbox(gearBbox);
        if (bodywork == null || bodywork.isEmpty() || bodywork.isBlank()) {
            this.bodywork = "хэтчбэк";
        } else {
            this.bodywork = bodywork;
        }
        setRegistrationNumber(registrationNumber);
        if (seatNumber <= 0) {
            this.seatNumber = 5;
        } else {
            this.seatNumber = seatNumber;
        }
        this.areTyresSnow = areTyresSnow;
        setKey(key);
        setInsurance(insurance);
    }

    public String getBodywork() {
        return bodywork;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
        if (this.engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
    }

    public String getGearBbox() {
        return gearBbox;
    }

    public void setGearBbox(String gearBbox) {
        this.gearBbox = gearBbox;
        if (this.gearBbox == null || this.gearBbox.isEmpty() || this.gearBbox.isBlank()) {
            this.gearBbox = "МКПП";
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        if (this.registrationNumber == null || this.registrationNumber.isEmpty()
                || this.registrationNumber.isBlank()) {
            this.registrationNumber = "х000хх000";
        }
    }

    public boolean isAreTyresSnow() {
        return areTyresSnow;
    }

    public void setAreTyresSnow(boolean areTyresSnow) {
        this.areTyresSnow = areTyresSnow;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        if (insurance == null) {
            insurance = new Insurance(null, 5_000, null);
        }
        this.insurance = insurance;
    }

    public void changeTyres() {
        int currentMonth = LocalDate.now().getMonthValue();
        switch (currentMonth) {
            case 1:
            case 2:
            case 3:
            case 11:
            case 12:
                if (this.areTyresSnow == true) {
                    System.out.println("Зимние шины уже стоят");
                } else {
                    setAreTyresSnow(!areTyresSnow);
                    System.out.println("Поменяем шины на зимние");
                }
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                if (this.areTyresSnow == false) {
                    System.out.println("Летние шины уже стоят");
                } else {
                    setAreTyresSnow(!areTyresSnow);
                    System.out.println("Поменяем шины на летние");
                }
                break;
        }
    }

    public boolean IsRegistrationNumberCorrect() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] regNumber = registrationNumber.toCharArray();
        if (Character.isDigit(regNumber[0]) || Character.isDigit(regNumber[4])
                || Character.isDigit(regNumber[5])) {
            return false;
        }
        if (!Character.isDigit(regNumber[1]) || !Character.isDigit(regNumber[2])
                || !Character.isDigit(regNumber[3]) || !Character.isDigit(regNumber[6])
                || !Character.isDigit(regNumber[7]) || !Character.isDigit(regNumber[8])) {
            return false;
        }
        return true;
    }

    public static class Key {
        private final boolean remoteStart;
        private final boolean keylessAccess;

        public Key(boolean remoteStart, boolean keylessAccess) {
            this.remoteStart = remoteStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteStart() {
            return remoteStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "удаленный запус двигателя - " + remoteStart + ", безключевой доступ - " + keylessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate validity;
        private final int cost;
        private final String number;

        public Insurance(LocalDate validity, int cost, String number) {
            if (validity == null) {
                validity = LocalDate.now().plusMonths(6);
            }
            this.validity = validity;
            if (cost <= 0) {
                cost = 5_000;
            }
            this.cost = cost;
            if (number == null || number.isBlank() || number.isEmpty()) {
                number = "000000000";
            }
            this.number = number;
        }

        public LocalDate getValidity() {
            return validity;
        }

        public int getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void isInsuranceValid() {
            if (validity.isAfter(LocalDate.now())) {
                System.out.println("Страховка еще действительна");
            } else {
                System.out.println("Страховка просрочена, нужно оформить новую");
            }
        }

        public void isNumberCorrect() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный");
            }
        }

        @Override
        public String toString() {
            return "дата истечения - " + validity + ", цена - " + cost +
                    ", номер - " + number;
        }
    }

    public String toString() {
        return this.getBrand() + " " + this.getModel() + ", " + this.getYear() + " год выпуска, страна сборки - " +
                this.getCountry() + ", цвет кузова - " + this.getColor() + ", объем двигателя - " + this.engineVolume +
                " л, коробка передач - " + this.gearBbox + ", тип кузова - " + this.bodywork + ", количество мест - " +
                this.seatNumber + ", регистрационный номер - " + this.registrationNumber + ", зимняя ли резина - " +
                this.areTyresSnow + ", " + this.key + ". Данные о страховке: " + this.insurance;
    }
}
