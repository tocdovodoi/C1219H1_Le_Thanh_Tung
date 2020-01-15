displayCustomer();
//Menu chính
function displayMainMenu() {
    let check = true;
    do {
        let chooseMenu = prompt("Vui lòng chọn chức năng! " +
            "\n1. Add New Customer" +
            "\n2. Display Information Customer" +
            "\n3. Edit Information Customer" +
            "\n4. Delete Customer" +
            "\n5. Exit");
        switch (chooseMenu) {
            case "1":
                addNewCustomer();
                break;
            case "2":
                displayCustomer();
                break;
            case "3":
                editCustomer();
                break;
            case "4":
                deleteCustomer();
                break;
            case "5":
                check = false;
                alert("Exit");
                break;
            default:
                alert("Vui lòng chọn chức năng 1-5");
                break;
        }
    } while (check);
}
//Hàm add New Customer
function addNewCustomer() {

}
//Hàm display Customer
function displayCustomer() {

}
//Hàm edit Customer
function editCustomer() {

}
//Hàm delete Customer
function deleteCustomer() {

}