package stalls;

import themePark.ThemePark;

public abstract class Stall extends ThemePark {

    private String ownerName;
    private ParkingSpot parkingSpot;

    public Stall(String name, int rating, String ownerName, ParkingSpot parkingSpot) {
        super(name, rating);
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}
