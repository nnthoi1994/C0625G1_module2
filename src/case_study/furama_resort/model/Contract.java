package case_study.furama_resort.model;

public class Contract {
    private String idContract;
    private String idBooking;
    private double depositAmount;
    private double totalPayment;

    public Contract() {
    }

    public Contract(String idContract, String idBooking, double depositAmount, double totalPayment) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.depositAmount = depositAmount;
        this.totalPayment = totalPayment;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract='" + idContract + '\'' +
                ", idBooking='" + idBooking + '\'' +
                ", depositAmount=" + depositAmount +
                ", totalPayment=" + totalPayment +
                '}';
    }
}
