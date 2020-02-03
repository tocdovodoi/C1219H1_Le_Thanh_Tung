let Customer = function () {

    //Set
    setNameCustomer(nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    setIdCard(idCard) {
        this.idCard = idCard;
    }

    setBirthdayCustomer(birthdayCustomer) {
        this.birthdayCustomer = birthdayCustomer;
    }

    setEmailCustomer(emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    setAddressCustomer(addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    setTypeCustomer(typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    setDiscount(discount) {
        this.discount = discount;
    }

    setNumberOfAccompaying(numberOfAccompaying) {
        this.numberOfAccompaying = numberOfAccompaying;
    }

    setTypeRoom(typeRoom) {
        this.typeRoom = typeRoom;
    }

    setRentDays(rentDays) {
        this.rentDays = rentDays;
    }

    setTypeService(typeService) {
        this.typeService = typeService;
    }

    //Get
    getNameCustomer() {
        return this.nameCustomer;
    }

    getIdCard() {
        return this.idCard;
    }

    getBirthdayCustomer() {
        return this.birthdayCustomer;
    }

    getEmailCustomer() {
        return this.emailCustomer;
    }

    getAddressCustomer() {
        return this.addressCustomer;
    }

    getTypeCustomer() {
        return this.typeCustomer;
    }

    getDiscount() {
        return this.discount;
    }

    getNumberOfAccompaying() {
        return this.numberOfAccompaying;
    }

    getTypeRoom() {
        return this.typeRoom;
    }

    getRentDays() {
        return this.rentDays;
    }

    getTypeService() {
        return this.typeService;
    }

    //Total
    TotalPay(rentDays, discount) {
        return 500 * Number.parseInt(rentDays) * (1 - Number.parseFloat(discount) / 100);
    }
}