//Tạo 1 mảng chứa danh sách Customer
let arrListCustomers = [];
let checkEditCustomer = false;

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
            chooseEditCustomer();
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
        checkEditCustomer = false;
        displayMainMenu();
    }

}

//Hàm displayInfomationCustomer
function displayInfomationCustomer(index) {
    if (checkEditCustomer = true) {
        let chooseInfoEdit = prompt(
            "Choose edit: " +
            "\n1.Name: " + arrListCustomers[index][0] +
            "\n2.IdCard: " + arrListCustomers[index][1] +
            "\n3.Birthday: " + arrListCustomers[index][2] +
            "\n4.Email: " + arrListCustomers[index][3] +
            "\n5.Address: " + arrListCustomers[index][4] +
            "\n6.Type Customer: " + arrListCustomers[index][5] +
            "\n7.Discount: " + arrListCustomers[index][6] +
            "\n8.Number Of Accompaying: " + arrListCustomers[index][7] +
            "\n9.Type Room: " + arrListCustomers[index][8] +
            "\n10.Rent Days: " + arrListCustomers[index][9] +
            "\n11.Type Service: " + arrListCustomers[index][10] +
            "\n12. Back"
        );
        if (chooseInfoEdit.toString() !== "12") {
            editInfomationCustomer(parseInt(chooseInfoEdit) - 1);
        } else {
            displayCustomers();
        }
    } else {
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
}

function chooseEditCustomer() {
    checkEditCustomer = true;
    displayCustomers();
}


//Hàm edit Customer
function editInfomationCustomer(index) {
    let editInfo = prompt("Enter info you want change: ");
    switch (index) {
        case 0:
            arrListCustomers[index][0] = editInfo;
            break;
        case 1:
            arrListCustomers[index][1] = editInfo;
            break;
        case 2:
            arrListCustomers[index][2] = editInfo;
            break;
        case 3:
            arrListCustomers[index][3] = editInfo;
            break;
        case 4:
            arrListCustomers[index][4] = editInfo;
            break;
        case 5:
            arrListCustomers[index][5] = editInfo;
            break;
        case 6:
            arrListCustomers[index][6] = editInfo;
            break;
        case 7:
            arrListCustomers[index][7] = editInfo;
            break;
        case 8:
            arrListCustomers[index][8] = editInfo;
            break;
        case 9:
            arrListCustomers[index][9] = editInfo;
            break;
        case 10:
            arrListCustomers[index][10] = editInfo;
            break;
        case 11:
            arrListCustomers[index][11] = editInfo;
            break;
        default:
            alert("Fail");
            return;
    }
    checkEditCustomer = false;
    displayMainMenu();
}

//Hàm delete Customer
function deleteCustomer() {


}