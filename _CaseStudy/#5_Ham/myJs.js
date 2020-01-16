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
}

//Hàm display Customer
function displayCustomer() {
    infoCustomer();
    let checkChooseDisplay = true;
    do {
        let chooseDisplay = prompt("\n0. Back" + infoCustomer());
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

//Hiển thị thông tin của một khách hàng bất kỳ - không cần thiết
// function displayInfomationCustomer() {
//
// }

//Hàm in ra danh sách customer
function infoCustomer() {
    let result = "";
    for (let i = 0; i < arrNameCustomer.length; i++) {
        result += "\n" + (i + 1) + ". Name: " + arrNameCustomer[i] + " - Id Card: " + arrIdCardCustomer[i];
    }
    return result;
}

//Hàm edit Customer
function editCustomer() {
    let chooseEdit = parseInt(prompt("Choose Customer you want edit?\n" + infoCustomer()));
    for (let i = 0; i < arrNameCustomer.length; i++) {
        if (chooseEdit === (i + 1)) {
            arrNameCustomer[i] = prompt("Enter new name Customer!");
            arrIdCardCustomer[i] = prompt("Enter new Id Customer");
            break;
        }
    }
}

//Hàm delete Customer
function deleteCustomer() {
    let indexDelete = prompt("Choose Customer you want to delete" + infoCustomer());
    arrNameCustomer.splice(Number.parseInt(indexDelete) - 1, 1); //Xoá ký tự tại vị trí (bắt đầu và kết thúc)
    arrIdCardCustomer.splice(Number.parseInt(indexDelete) - 1, 1);
    alert("List Customer after delete\n" + infoCustomer());
}