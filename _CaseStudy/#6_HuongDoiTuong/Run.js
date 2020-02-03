let listCustomers = [];
let validateBirthday = /^((0)[1-9][1-2][0-9]|(3)[0-1])(\/)((0)[1-9]|((1)[0-2]))(\/)\d{4}$/;

function displayMainMenu() {
    let check = true;
    do {
        let chooseMenu = prompt("Please select the function" +
            "\n1. Add New Customer" +
            "\n2. Display Information Customer" +
            "\n3. Display Total Pay of Customer" +
            "\n4. Edit Information Customer" +
            "\n5. Delete Customer" +
            "\n6. Exit");
        switch (chooseMenu) {
            case "1":
                addNewCustomer();
                break;
            case "2":
                displayCustomer();
                break;
            case "3":

                break;
            case "4":
                editCustomer();
                break;
            case "5":
                deleteCustomer();
                break;
            case "6":
                check = false;
                alert("Good bye!");
                break;
            default:
                alert("Please choose again");
                break;
        }
    } while (check);
}

//Hàm display Customer
function displayCustomer() {
    let result = "";
    for (let i = 0; i < arrNameCustomer.length; i++) {
        result += "\n" + (i + 1) + ". Name: " + arrNameCustomer[i] + " - Id Card: " + arrIdCardCustomer[i];
    }
    let checkChooseDisplay = true;
    do {
        let chooseDisplay = parseInt(prompt(result + "\n" + (arrNameCustomer.length + 1) + ". Back"));
        switch (chooseDisplay) {
            case (arrNameCustomer.length + 1):
                checkChooseDisplay = false;
                break;
            default:
                alert("Plese choose " + (arrNameCustomer.length + 1) + " to back");
                break;
        }
    } while (checkChooseDisplay);
}

//Hàm edit Customer
function editCustomer() {
    var resultEdit = "";
    for (let i = 0; i < arrNameCustomer.length; i++) {
        resultEdit += "\n" + (i + 1) + ". Name: " + arrNameCustomer[i] + " - Id Card: " + arrIdCardCustomer[i];
    }
    let chooseEdit = parseInt(prompt("Choose Customer you want edit?\n" + resultEdit));
    for (let i = 0; i < arrNameCustomer.length; i++) {
        if (chooseEdit === (i + 1)) {
            arrNameCustomer[i] = prompt("Enter new name Customer!");
            arrIdCardCustomer[i] = prompt("Enter new Id Customer");
            break;
        }
    }
    alert("List Customer after edit");
    displayCustomer();
}

//Hàm delete Customer
function deleteCustomer() {
    let resultDelete = "";
    for (let i = 0; i < arrNameCustomer.length; i++) {
        resultDelete += "\n" + (i + 1) + ". Name: " + arrNameCustomer[i] + " - Id Card: " + arrIdCardCustomer[i];
    }
    let indexDelete = prompt("Choose Customer you want to delete" + resultDelete);
    let checkDelete = confirm("Are you sure?");
    if (checkDelete === true) {
        arrNameCustomer.splice(Number.parseInt(indexDelete) - 1, 1); //Xoá ký tự tại vị trí (bắt đầu và kết thúc)
        arrIdCardCustomer.splice(Number.parseInt(indexDelete) - 1, 1);
        alert("List Customer after Delete");
        displayCustomer();
    } else {
        displayMainMenu();
    }
}

function addNewCustomer() {
let cus = new Customer();
    cus.setNameCustomer(prompt("Enter name Customer"));
    cus.setIdCard(prompt("Enter id Card"));
    cus.setBirthdayCustomer(prompt("Enter Birthday Customer dd/mm/YYYY"));
    cus.setEmailCustomer(prompt("Enter Email Customer"));
    cus.setAddressCustomer(prompt("Enter Address Customer"));
    cus.setTypeCustomer(prompt("Enter Type Customer"));
    cus.setDiscount(prompt("Enter Discount"));
    cus.setNumberOfAccompaying(prompt("Enter Number of Accompaying"));
    cus.setTypeRoom(prompt("Enter Type Room"));
    cus.setRentDays(prompt("Enter Rent Day"));
    cus.setTypeService(prompt("Enter Type Service"));
    listCustomers.push(cus);
}
