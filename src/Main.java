import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 2015, "Россия", "", 1.7,
                "МКПП", "седан", "к549ву178", 0, true,
                new Car.Key(false, false), new Car.Insurance(null, 7_000,
                "326435268"));
        System.out.println(lada);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный",
                3.0, "АКПП", "седан", "", 4, false,
                new Car.Key(true, true), new Car.Insurance(null, 6_000,
                "729461085"));
        System.out.println(audi);
        Car bmw = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0,
                "", "хэтчбэк", "р254пр136", 6, true,
                new Car.Key(true, false), new Car.Insurance(null, 0,
                "936406573"));
        System.out.println(bmw);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красный",
                2.4, "АКПП", "", "", 4, false,
                new Car.Key(false, true), new Car.Insurance(null, 9_000, ""));
        System.out.println(kia);
        Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый",
                1.6, "МКПП", "седан", "а976мс162", 4,
                true, new Car.Key(false, false), new Car.Insurance(null,
                7_500, ""));
        System.out.println(hyundai);

        boolean result = hyundai.IsRegistrationNumberCorrect();
        System.out.println(result);
        audi.changeTyres();

        Train lastochka = new Train("Ласточка", "В-901", 2011, "Россия",
                301, 3500, "", "Белорусский вокзал",
                "Минск-Пассажирский", 11);
        System.out.println(lastochka);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия",
                270, 1700, "", "Ленинградский вокзал",
                "Ленинград-Пассажирский", 8);
        System.out.println(leningrad);

        Bus liaz = new Bus("ЛиАЗ", "Курсор-4292", 2015, "Россия", 85,
                "серебристый");
        System.out.println(liaz);
        Bus hyundaiBus = new Bus("Hyundai", "Aero Town", 2012, "Южная Корея", 90,
                "голубой");
        System.out.println(hyundaiBus);
        Bus volvo = new Bus("Volvo", "8900", 2010, "Швеция", 95, "зеленый");
        System.out.println(volvo);
    }
}