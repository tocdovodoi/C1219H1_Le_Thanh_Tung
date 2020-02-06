//Tạo 1 mảng chứa danh sách Customer
let arrListCustomers = [];


//Chạy menu chính
displayMainMenu();

//Menu chính
function displayMainMenu() {
        let chooseMenu = prompt("Please select the function" +
            "\n1. Add New Customers" +
            "\n2. Display Information Customers" +
            "\n3. Edit Information Customers" +
            "\n4. Delete Customer" +
            "\n5. Exit");
        switch (chooseMenu) {
            case "1":
                addNewCustomer();
                break;
            case "2":
                displayCustomers();
                break;
            case "3":
                editCustomer();
                break;
            case "4":
                deleteCustomer();
                break;
            case "5":
                alert("Good bye!");
                return 0;
            default:
                alert("Please choose again");
                break;
        }
}

//Hàm add New Customer
function addNewCustomer() {
    let arrInfo = [];
    let nameCustomer = prompt("Enter Name Customer: ");
    let idCard = prompt("Enter ID Card: ");
    let birthdayCustomer = prompt("Enter Birthday Customer (dd/MM/yyy): ");
    let emailCustomer = prompt("Enter Email Customer: ");
    let addressCustomer = prompt("Enter Address Customer: ");
    let typeCustomer = prompt("Enter Type Customer: ");
    let discount = prompt("Enter Discount: ");
    let numberOfAccompaying = prompt("Enter Number Of Accompaying: ");
    let typeRoom = prompt("Enter Type Room: ");
    let rentDays = prompt("Enter Rent Days: ");
    let typeService = prompt("Enter Type Service: ");
    arrInfo.push(nameCustomer);
    arrInfo.push(idCard);
    arrInfo.push(birthdayCustomer);
    arrInfo.push(emailCustomer);
    arrInfo.push(addressCustomer);
    arrInfo.push(typeCustomer);
    arrInfo.push(discount);
    arrInfo.push(numberOfAccompaying);
    arrInfo.push(typeRoom);
    arrInfo.push(rentDays);
    arrInfo.push(typeService);
    arrListCustomers.push(arrInfo);
    displayMainMenu();
}

//Hàm display Customers
function displayCustomers() {
    let result = "";
    for (let i = 0; i < arrListCustomers.length; i++) {
        result += "\n" + (i + 1) + " .Name: " + arrListCustomers[i][0] + "; idCard: " + arrListCustomers[i][1];
    }
    result += "\n" + (arrListCustomers.length + 1) + " .Back to menu";
    let chooseDisplayInfo = prompt(result);
    if (parseInt(chooseDisplayInfo) !== arrListCustomers.length + 1) {
        displayInfomationCustomer(parseInt(chooseDisplayInfo) - 1);
    } else {
        displayMainMenu();
    }

}

//Hàm displayInfomationCustomer
function displayInfomationCustomer(index) {
    alert("Infomation of Customer: " +
        "\nName: " + arrListCustomers[index][0] +
        "\nIdCard: " + arrListCustomers[index][1] +
        "\nBirthday: " + arrListCustomers[index][2] +
        "\nEmail: " + arrListCustomers[index][3] +
        "\nAddress: " + arrListCustomers[index][4] +
        "\nType Customer: " + arrListCustomers[index][5] +
        "\nDiscount: " + arrListCustomers[index][6] +
        "\nNumber Of Accompaying: " + arrListCustomers[index][7] +
        "\nType Room: " + arrListCustomers[index][8] +
        "\nRent Days: " + arrListCustomers[index][9] +
        "\nType Service: " + arrListCustomers[index][10]);
    displayMainMenu();
}

//Hàm edit Customer
function editCustomers() {


}

//Hàm delete Customer
function deleteCustomer() {


}