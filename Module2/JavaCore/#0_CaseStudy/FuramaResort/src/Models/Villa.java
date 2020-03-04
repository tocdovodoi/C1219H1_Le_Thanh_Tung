package Models;

public class Villa extends Services {
    private String roomStandard;
    private String convenientDescription;
    private double areaPool;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String id, String serviceName, double areaUser, double rentalCosts, int maxNumberOfPeople, String rentType, String roomStandard, String convenientDescription, double areaPool, int numberOfFloors) {
        super(id, serviceName, areaUser, rentalCosts, maxNumberOfPeople, rentType);
        this.roomStandard = roomStandard;
        this.convenientDescription = convenientDescription;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getConvenientDescription() {
        return convenientDescription;
    }

    public void setConvenientDescription(String convenientDescription) {
        this.convenientDescription = convenientDescription;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void showInfor() {
        System.out.println(
                "Service Id: " + super.getId() +
                        "\nService Name: " + super.getServiceName() +
                        "\nArea Used: " + super.getAreaUser() +
                        "\nRental Costs: " + super.getRentalCosts() +
                        "\nMax Number Of People: " + super.getMaxNumberOfPeople() +
                        "\nType Rent: " + super.getRentType() +
                        "\nRoom Standard: " + this.roomStandard +
                        "\nConvenient Description: " + this.convenientDescription +
                        "\nArea Pool: " + this.areaPool +
                        "\nNumber Of Floors: " + this.numberOfFloors);
    }
}
