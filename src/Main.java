public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015,
                           "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020,
                           "Германия");
        Car bmv = new Car("BMW", "Z8", 3.0, "черный", 2021,
                          "Германия");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный",
                          2018,"Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016,
                              "Южная Корея");
        Car land = new Car("Land Rover", null, 5.0, null , 0, null);

        lada.info();
        audi.info();
        bmv.info();
        kia.info();
        hyundai.info();
        land.info();
    }
}