package case_study.furama_resort.model;

public class Villa extends Facility{
    private String roomType;
    private double poolArea;
    private int totalFloors;

    public Villa() {
    }

    public Villa(String maDichVu, String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoi, String kieuThue, String roomType, double poolArea, int totalFloors) {
        super(maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
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
                "tieuChuanPhong='" + roomType + '\'' +
                ", dienTichHoBoi=" + poolArea +
                ", soTang=" + totalFloors +
                "} " + super.toString();
    }
}
