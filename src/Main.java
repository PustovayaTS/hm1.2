import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015,
                           "Россия", "механическая", "седан", "х000хх154", 5, 1);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020,
                           "Германия", "автоматическая", "хетчбэк", "а123аа154", 5, 0);
        Car bmv = new Car("BMW", "Z8", 3.0, "черный", 2021,
                          "Германия", "автоматическая", "купе", "в555вв154", 2, 0);
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный",
                          2018,"Южная Корея", "автоматическая", "кроссовер", "о717оо154", 5, 1);
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016,
                              "Южная Корея", "механическая", "седан", "т554тт154", 4, 0);

        lada.info();
        audi.info();
        bmv.info();
        kia.info();
        hyundai.info();


    }
}