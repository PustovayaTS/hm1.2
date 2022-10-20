package transport;

public class Train extends Transport1{
    private double tripPrice;
    private String TripTime;
    private String departureStationName;
    private String finalStop;
    private int numberOfCars;

    public Train
            (
            String brand
            , String model
            , String Bodycolor
            , int productionYear
            , String productionCountry
            , int maxTravelSpeed
            , double tripPrice
            , String tripTime
            , String departureStationName
            , String finalStop
            , int numberOfCars
            ) {
        super(brand, model, productionYear, productionCountry, Bodycolor, maxTravelSpeed);
        setTripPrice(tripPrice);
        TripTime = tripTime;
        setDepartureStationName(departureStationName);
        setFinalStop(finalStop);
        setNumberOfCars(numberOfCars);

    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        if (tripPrice > 0) {
            this.tripPrice = tripPrice;
        }
    }

    public String getTripTime() {
        return TripTime;
    }

    public void setTripTime(String tripTime) {
        TripTime = tripTime;
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        if (departureStationName != null || !departureStationName.isEmpty() || !departureStationName.isBlank()) {
            this.departureStationName = departureStationName;
        }
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        if (finalStop != null || !finalStop.isEmpty() || !finalStop.isBlank()) {
            this.finalStop = finalStop;
        }
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        if (numberOfCars > 0) {
            this.numberOfCars = numberOfCars;
        }
    }

    public void trainInfo() {
        System.out.println
                (
                "Поезд "
                + getBrand()
                + ", модель "
                + getModel()
                + getProductionYear()
                + " года выпуска, производство - "
                + getProductionCountry()
                + " скорость передвижения — "
                + getMaxTravelSpeed()
                + " км/ч. Станция отбытия - "
                + getDepartureStationName()
                + " , следует до станции "
                + getFinalStop()
                + ". Цена поездки "
                + getTripPrice()
                + " рублей. В поезде "
                + getNumberOfCars()
                + " вагонов."
                );
        }
    }


