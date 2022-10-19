import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car.Key keyLada = new Car.Key("нет","нет");
        Car.Insurance insuranceLada = new Car.Insurance(null, 0, null);
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015,
                           "Россия", "механическая", "седан", "х000хх154", 5, 1, keyLada, insuranceLada);
        Car.Key keyAudi = new Car.Key("есть","есть");
        Car.Insurance insuranceAudi = new Car.Insurance(null, 0, null);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020,
                           "Германия", "автоматическая", "хетчбэк", "а123аа154", 5, 0, keyAudi, insuranceAudi);
        Car.Key keyBmw = new Car.Key("есть","есть");
        Car.Insurance insuranceBmw = new Car.Insurance(null, 0, null);
        Car bmv = new Car("BMW", "Z8", 3.0, "черный", 2021,
                          "Германия", "автоматическая", "купе", "в555вв154", 2, 0, keyBmw, insuranceBmw);
        Car.Key keyKia = new Car.Key("есть","нет");
        Car.Insurance insuranceKia = new Car.Insurance(null, 0, null);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный",
                          2018,"Южная Корея", "автоматическая", "кроссовер", "о717оо154", 5, 1, keyKia, insuranceKia);
        Car.Key keyHyundai = new Car.Key("нет","нет");
        Car.Insurance insuranceHyundai = new Car.Insurance(null, 0, null);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016,
                              "Южная Корея", "механическая", "седан", "т554тт154", 4, 0, keyHyundai, insuranceHyundai);

        lada.info();
        audi.info();
        bmv.info();
        kia.info();
        hyundai.info();


    }
}