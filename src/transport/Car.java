package transport;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {
    private String brand;
    private String model;
    public double engineVolume;
    public String color;
    private int productionYear;
    private String productionCountry;
    public String transmission;
    private String bodyType;
    public String registrationNumber;
    private int numberOfSeats;
    public int winterTires;

    public Car
            ( String brand
            , String model
            , double engineVolume
            , String color
            , int productionYear
            , String productionCountry
            , String transmission
            , String bodyType
            , String registrationNumber
            , int numberOfSeats
            , int winterTires
            ) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null || registrationNumber.isEmpty()) {
            this.registrationNumber = "default";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats == 0) {
            this.numberOfSeats = 4;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if (winterTires > 1 || winterTires < 0) {
            this.winterTires = 0;
        } else {
            this.winterTires = winterTires;
        }
    }

    public void info() {
        System.out.println
                (
                brand
                + " "
                + model
                + " "
                + productionYear
                + " год выпуска, сборка "
                + productionCountry
                + ", "
                + color
                + " цвет, объем двигателя — "
                + engineVolume
                + " л, коробка передач - "
                + transmission
                + ", тип кузова "
                + bodyType
                + ", регистрационный номер "
                + registrationNumber
                + ". Количество мест - "
                + numberOfSeats
                + ", резина - "
                + this.getTypeOfRubber()
                );
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

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        Pattern pattern = Pattern.compile("\\D\\d{3}\\D{2}\\d{3}");
        Matcher matcher = pattern.matcher(registrationNumber);
        if (matcher.find()) {
            this.registrationNumber = registrationNumber;
        }
    }

    public String getTypeOfRubber() {
        if (winterTires == 1) {
            return "зимняя";
        } else {
            return  "летняя";
        }
    }

    public void setTypeOfRubber(int winterTires) {
        this.winterTires = winterTires;
    }
}
