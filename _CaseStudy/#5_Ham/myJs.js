//Tạo 2 mảng chứa name và id Customer
let arrNameCustomer = ["Le Thanh Tung", "A.Duc Handsome", "A.Trung Kute"];
let arrIdCardCustomer = ["172948183", "12345678", "87654321"];


//Chạy menu chính
displayMainMenu();

//Menu chính
function displayMainMenu() {
    let check = true;
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
    alert("List Customer after add");
    displayCustomer();
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
    arrNameCustomer.splice(Number.parseInt(indexDelete) - 1, 1); //Xoá ký tự tại vị trí (bắt đầu và kết thúc)
    arrIdCardCustomer.splice(Number.parseInt(indexDelete) - 1, 1);
    alert("List Customer after Delete");
    displayCustomer();
}