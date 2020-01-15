//Tạo 2 mảng chứa name và id Customer
let arrNameCustomer = [];
let arrIdCardCustomer = [];


//Chạy menu chính
displayMainMenu();
//check là biến toàn cục của Main menu
var check = true;

//Menu chính
function displayMainMenu() {
    var check = true;
    do {
        let chooseMenu = prompt("Please select the function" +
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
                alert("Good bye!");
                break;
            default:
                alert("Please choose again");
                break;
        }
    } while (check);
}

//Hàm add New Customer
function addNewCustomer() {
    arrNameCustomer.push(prompt("Enter name Customer"));
    arrIdCardCustomer.push(prompt("Enter Id Card Customer"));
}

//Hàm display Customer
function displayCustomer() {
    let result = "";
    for (let i = 0; i < arrNameCustomer.length; i++) {
        result += "\n" + (i + 1) + ". Name: " + arrNameCustomer[i] + " - Id Card: " + arrIdCardCustomer[i];
    }
    let checkChooseDisplay = true;
    do {
        let chooseDisplay = prompt("\n0. Back" + result);
        switch (chooseDisplay) {
            case "0":
                checkChooseDisplay = false;
                break;
            default:
                alert("Plese choose 0 to back");
                break;
        }
    } while (checkChooseDisplay);
}

//Hàm edit Customer
function editCustomer() {

}

//Hàm delete Customer
function deleteCustomer() {

}