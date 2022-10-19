package transport;

import java.time.LocalDate;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private int winterTires;
    private Key key;
    private Insurance insurance;


    public static class Key {
        private final String remoteEngineStart;
        private final String keylessAccess;

    public Key (String remoteEngineStart, String keylessAccess) {
        if (remoteEngineStart == null || remoteEngineStart.isEmpty()) {
            this.remoteEngineStart = "default";
        } else {
            this.remoteEngineStart = remoteEngineStart;
        }
        if (keylessAccess == null || keylessAccess.isEmpty()) {
            this.keylessAccess = "default";
        } else {
            this.keylessAccess = keylessAccess;
        }
    }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate validityPeriod;
        private final double cost;
        private final String number;

        public Insurance(LocalDate validityPeriod, double cost, String number) {
            if (validityPeriod == null) {
                this.validityPeriod = LocalDate.now().plusDays(365);
            } else {
                this.validityPeriod = validityPeriod;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public LocalDate getValidityPeriod() {
            return validityPeriod;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkTheDeadline() {
            if (validityPeriod.isBefore(LocalDate.now()) || validityPeriod.isEqual(LocalDate.now())) {
                System.out.println("Срочно нужно оформлять новую страховку");
            }
        }

        public void checkTheNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }
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
            , Key key
            , Insurance insurance
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
        setTypeOfRubber(winterTires);
        this.key = new Key(key.remoteEngineStart, key.keylessAccess);
        this.insurance = new Insurance(insurance.validityPeriod, insurance.cost, insurance.number);

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
                + ", удаленный запуск двигателя - "
                + this.key.getRemoteEngineStart()
                + ", безключевой доступ - "
                + this.key.keylessAccess
                + ". Срок действия страховки - "
                + this.insurance.validityPeriod
                + ". Стоимость страховки - "
                + this.insurance.cost
                + ". Номер страховки: "
                + this.insurance.number
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
        if (winterTires > 1 || winterTires < 0) {
            this.winterTires = 0;
        } else {
            this.winterTires = winterTires;
        }
    }


}
