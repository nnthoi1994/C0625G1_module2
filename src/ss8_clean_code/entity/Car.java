package ss8_clean_code.entity;

public class Car extends Vehicle {
    private int numberSeat;
    private String typeCar;

    public Car() {
    }

    public Car(String controlNumber, String nameManufacturer, int yearManufacture, String nameOwner, int numberSeat, String typeCar) {
        super(controlNumber, nameManufacturer, yearManufacture, nameOwner);
        this.numberSeat = numberSeat;
        this.typeCar = typeCar;
    }

    public int getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    @Override
    public String getInfoToCsv() {
        return this.controlNumber + "," + this.nameManufacturer + "," + this.yearManufacture + "," + this.nameOwner + "," + this.numberSeat + "," + this.typeCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "controlNumber='" + controlNumber + '\'' +
                ", nameManufacturer='" + nameManufacturer + '\'' +
                ", yearManufacture=" + yearManufacture +
                ", nameOwner='" + nameOwner + '\'' +
                ", numberSeat=" + numberSeat +
                ", typeCar='" + typeCar + '\'' +
                '}';
    }
}