package case_study.furama_resort.model;

public abstract class Facility {
    private String idService;
    private String nameService;
    private double usableArea;
    private double rentFee;
    private int guestCount;
    private String rentType;

    public Facility() {
    }

    public Facility(String idService, String nameService, double usableArea, double rentFee, int guestCount, String rentType) {
        this.idService = idService;
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.rentFee = rentFee;
        this.guestCount = guestCount;
        this.rentType = rentType;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentFee() {
        return rentFee;
    }

    public void setRentFee(double rentFee) {
        this.rentFee = rentFee;
    }

    public int getGuestCount() {
        return guestCount;
    }

    public void setGuestCount(int guestCount) {
        this.guestCount = guestCount;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "idService='" + idService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", usableArea=" + usableArea +
                ", rentFee=" + rentFee +
                ", guestCount=" + guestCount +
                ", rentType='" + rentType + '\'' +
                '}';
    }
}
