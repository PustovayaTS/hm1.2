package transport;

public class Transport1 {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String bodyColor;
    private int maxTravelSpeed;

    public Transport1(String brand, String model, int productionYear, String productionCountry, String bodyColor, int maxTravelSpeed) {
        if (brand != null || !brand.isEmpty() || !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null || !model.isEmpty() || !model.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry != null || !productionCountry.isEmpty() || !productionCountry.isBlank()) {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = "default";
        }
        setBodyColor(bodyColor);
        setMaxTravelSpeed(maxTravelSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor == null || bodyColor.isEmpty() || bodyColor.isBlank()) {
            this.bodyColor = "белый";
        } else {
            this.bodyColor = bodyColor;
        }
    }

    public int getMaxTravelSpeed() {
        return maxTravelSpeed;
    }

    public void setMaxTravelSpeed(int maxTravelSpeed) {
        if (maxTravelSpeed > 0) {
            this.maxTravelSpeed = maxTravelSpeed;

        }
    }
}
