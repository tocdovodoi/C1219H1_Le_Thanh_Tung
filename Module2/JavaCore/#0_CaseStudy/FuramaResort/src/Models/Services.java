package Models;

public abstract class Services {
    private String id;
    private String serviceName;
    private double areaUser;
    private double reantalCosts;
    private int maxNumberOfPeople;
    private String rentType;

    public Services() {
    }

    public Services(String id, String serviceName, double areaUser, double reantalCosts, int maxNumberOfPeople, String rentType) {
        this.id = id;
        this.serviceName = serviceName;
        this.areaUser = areaUser;
        this.reantalCosts = reantalCosts;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.rentType = rentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getAreaUser() {
        return areaUser;
    }

    public void setAreaUser(double areaUser) {
        this.areaUser = areaUser;
    }

    public double getReantalCosts() {
        return reantalCosts;
    }

    public void setReantalCosts(double reantalCosts) {
        this.reantalCosts = reantalCosts;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public abstract void showInfor();
}
