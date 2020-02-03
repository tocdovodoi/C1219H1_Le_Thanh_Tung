let Customer = function () {
    //nameCustomer
    this.setNameCustomer = function (nameCustomer) {
        this.nameCustomer = nameCustomer;
    };
    this.getNameCustomer = function () {
        return this.nameCustomer;
    };

    //idCard
    this.setIdCard = function (idCard) {
        this.idCard = idCard;
    };
    this.getIdCard = function () {
        return this.idCard;
    };

    //birthdayCustomer
    this.setBirthdayCustomer = function (birthdayCustomer) {
        this.birthdayCustomer = birthdayCustomer;
    };
    this.getBirthdayCustomer = function () {
        return this.birthdayCustomer;
    };

    //emailCustomer
    this.setEmailCustomer = function (emailCustomer) {
        this.emailCustomer = emailCustomer;
    };
    this.getEmailCustomer = function () {
        return this.emailCustomer;
    };

    //addressCustomer
    this.setAddressCustomer = function (addressCustomer) {
        this.addressCustomer = addressCustomer;
    };
    this.getAddressCustomer = function () {
        return this.addressCustomer;
    };

    //typeCustomer
    this.setTypeCustomer = function (typeCustomer) {
        this.typeCustomer = typeCustomer;
    };
    this.getTypeCustomer = function () {
        return this.typeCustomer;
    };

    //discount
    this.setDiscount = function (discount) {
        this.discount = discount;
    };
    this.getDiscount = function () {
        return this.discount;
    };

    //numberOfAccompaying
    this.setNumberOfAccompaying = function (numberOfAccompaying) {
        this.numberOfAccompaying = numberOfAccompaying;
    };
    this.getNumberOfAccompaying = function () {
        return this.numberOfAccompaying;
    };

    //typeRoom
    this.setTypeRoom = function (typeRoom) {
        this.typeRoom = typeRoom;
    };
    this.getTypeRoom = function () {
        return this.typeRoom;
    };

    //rentDays
    this.setRentDays = function (rentDays) {
        this.rentDays = rentDays;
    };
    this.getRentDays = function () {
        return this.rentDays;
    };

    //typeService
    this.setTypeService = function (typeService) {
        this.typeService = typeService;
    };
    this.getTypeService = function () {
        return this.typeService;
    };

    //method
    this.totalPays = function () {
        let moneyPerDays = 0;
        if (typeService === "Villa") {
            moneyPerDays = 500;
        } else if (typeService === "House") {
            moneyPerDays = 300;
        } else {
            moneyPerDays = 100;
        }
        return moneyPerDays = parseFloat(this.getRentDays()) * (1 - parseFloat(this.getDiscount()) / 100);
    }
};