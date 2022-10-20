package transport;

public class Bus extends Transport1{
    public Bus(String brand, String model, int productionYear, String productionCountry, String bodyColor, int maxTravelSpeed) {
        super(brand, model, productionYear, productionCountry, bodyColor, maxTravelSpeed);
    }

    public void busInfo() {
        System.out.println
                (
                "Автобус "
                + getBrand()
                + " "
                + getModel()
                + " "
                + getProductionYear()
                + " года выпуска, производство - "
                + getProductionCountry()
                + ", цвет - "
                + getBodyColor()
                + ". Максимальная скорость передвижения — "
                + getMaxTravelSpeed()
                + " км/ч."

        );
    }
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке.");
    }
}
