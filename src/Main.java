import transport.Bus;
import transport.Car;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        Car.Key keyLada = new Car.Key("нет","нет");
        Car.Insurance insuranceLada = new Car.Insurance(null, 0, null);
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015,
                           "Россия", "механическая", "седан", "х000хх154", 5, 1, keyLada, insuranceLada, 100);
        Car.Key keyAudi = new Car.Key("есть","есть");
        Car.Insurance insuranceAudi = new Car.Insurance(null, 0, null);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020,
                           "Германия", "автоматическая", "хетчбэк", "а123аа154", 5, 0, keyAudi, insuranceAudi, 100);
        Car.Key keyBmw = new Car.Key("есть","есть");
        Car.Insurance insuranceBmw = new Car.Insurance(null, 0, null);
        Car bmv = new Car("BMW", "Z8", 3.0, "черный", 2021,
                          "Германия", "автоматическая", "купе", "в555вв154", 2, 0, keyBmw, insuranceBmw, 100);
        Car.Key keyKia = new Car.Key("есть","нет");
        Car.Insurance insuranceKia = new Car.Insurance(null, 0, null);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный",
                          2018,"Южная Корея", "автоматическая", "кроссовер", "о717оо154", 5, 1, keyKia, insuranceKia, 100);
        Car.Key keyHyundai = new Car.Key("нет","нет");
        Car.Insurance insuranceHyundai = new Car.Insurance(null, 0, null);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016,
                              "Южная Корея", "механическая", "седан", "т554тт154", 4, 0, keyHyundai, insuranceHyundai, 100);

        lada.info();
        lada.refill();
        audi.info();
        audi.refill();
        bmv.info();
        bmv.refill();
        kia.info();
        kia.refill();
        hyundai.info();
        hyundai.refill();


        Train lastochka = new Train("Ласточка", "B-901", null, 2011, "Россия", 301, 3500, "", "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", null, 2019, "Россия", 270, 1700, "", "Ленинградский вокзал", "Ленинград-Пассажирский", 8);

        lastochka.trainInfo();
        lastochka.refill();
        leningrad.trainInfo();
        leningrad.refill();

        Bus gaz = new Bus("ГАЗель", "NEXT A65R25-60", 2022, "Россия", "белый", 90);
        Bus mers = new Bus("Mercedes-Benz", "Sprinter Classic", 2014, "Германия", "черный", 70);
        Bus paz = new Bus("ПАЗ", "32054", 2015, "Россия", "синий", 90);

        gaz.busInfo();
        gaz.refill();
        mers.busInfo();
        mers.refill();
        paz.busInfo();
        paz.refill();



    }
}