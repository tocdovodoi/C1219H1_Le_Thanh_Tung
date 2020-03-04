package Models;

public class Room extends Services {
    private String freeService;

    public Room() {
    }

    public Room(String id, String serviceName, double areaUser, double rentalCosts, int maxNumberOfPeople, String rentType, String freeService) {
        super(id, serviceName, areaUser, rentalCosts, maxNumberOfPeople, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
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
                        "\nFree Service: " + this.freeService);
    }
}
