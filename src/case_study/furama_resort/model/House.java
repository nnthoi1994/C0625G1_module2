package case_study.furama_resort.model;

public class House extends Facility{
    private String roomType;
    private int totalFloors;

    public House() {
    }

    public House(String idService, String nameService, double usableArea, double rentFee, int guestCount, String rentType, String roomType, int totalFloors) {
        super(idService, nameService, usableArea, rentFee, guestCount, rentType);
        this.roomType = roomType;
        this.totalFloors = totalFloors;
    }

    public int getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomType='" + roomType + '\'' +
                ", totalFloors=" + totalFloors +
                "} " + super.toString();
    }
}
