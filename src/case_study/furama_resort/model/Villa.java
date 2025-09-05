package case_study.furama_resort.model;

public class Villa extends Facility{
    private String roomType;
    private double poolArea;
    private int totalFloors;

    public Villa() {
    }

    public Villa(String idService, String nameService, double usableArea, double rentFee, int guestCount, String typeRent, String roomType, double poolArea, int totalFloors) {
        super(idService, nameService, usableArea, rentFee, guestCount, typeRent);
        this.roomType = roomType;
        this.poolArea = poolArea;
        this.totalFloors = totalFloors;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomType='" + roomType + '\'' +
                ", poolArea=" + poolArea +
                ", soTang=" + totalFloors +
                "} " + super.toString();
    }
}
