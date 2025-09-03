package case_study.furama_resort.model;

public class Room extends Facility{
    private String freeServices;

    public Room(String freeServices) {
    }

    public Room(String idService, String nameService, double usableArea, double rentFee, int guestCount, String rentType, String freeServices) {
        super(idService, nameService, usableArea, rentFee, guestCount, rentType);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServices='" + freeServices + '\'' +
                "} " + super.toString();
    }
}
