let listCustomers = [];
let validateBirthday = /^((0)[1-9]|[1-2][0-9]|(3)[0-1])(\/)((0)[1-9]|((1)[0-2]))(\/)\d{4}$/;
let validateEmail = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

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


function addNewCustomer() {
    let checkBirday = true;
    let checkEmail = true;
    let cus = new Customer();
    cus.setNameCustomer(prompt("Enter name Customer"));
    cus.setIdCard(prompt("Enter id Card"));
    do {
        cus.setBirthdayCustomer(prompt("Enter Birthday Customer dd/mm/YYYY"));
        if (validateBirthday.test(cus.getBirthdayCustomer())) {
            checkBirday = false;
        } else {
            alert("Birthday is invalid. Please try again!");
        }
    } while (checkBirday);
    do {
        cus.setEmailCustomer(prompt("Enter Email Customer  (tung@gmail.com)"));
        if (validateEmail.test(cus.getEmailCustomer())) {
            checkEmail = false;
        } else {
            alert("Email is invalid. Please try again!");
        }
    } while (checkEmail);
    cus.setAddressCustomer(prompt("Enter Address Customer"));
    cus.setTypeCustomer(prompt("Enter Type Customer"));
    cus.setDiscount(prompt("Enter Discount"));
    cus.setNumberOfAccompaying(prompt("Enter Number of Accompaying"));
    cus.setTypeRoom(prompt("Enter Type Room"));
    cus.setRentDays(prompt("Enter Rent Day"));
    cus.setTypeService(prompt("Enter Type Service"));
    listCustomers.push(cus);
}

//Hàm display Customer
function displayCustomer() {
    let result = "";
    for (let i = 0; i < listCustomers.length; i++) {
        result += "\n" + (i + 1) + ". Name: " + listCustomers[i].getNameCustomer() +
            " - Id Card: " + listCustomers[i].getIdCard();
    }
    result += "\n" + (listCustomers.length + 1) + ".Back to menu.";
    let chooseDisplayInfor = prompt(result);
}

//Hàm edit Customer
function editCustomer() {
    let checkEdit = true;

    do {
        let chooseEdit = prompt(
            "Choose Information Customer You Want Edit: \n" +
            "1. Name: " + nameCustomer +
            "\n2. ID Card: " + idCard +
            "\n3. Birthday: " + birthdayCustomer +
            "\n4. Email: " + emailCustomer +
            "\n5. Address: " + addressCustomer +
            "\n6. Type Customer: " + typeCustomer +
            "\n7. Discount: " + discount +
            "\n8 .Number Of Accompaying: " + numberOfAccompaying +
            "\n9. Type Room: " + typeRoom +
            "\n10. Rent Days: " + rentDays +
            "\n11. Type Service: " + typeService +
            "\n12. Exit!");
        switch (chooseEdit) {
            case "1":
                this.setNameCustomer = prompt("Enter name you want edit");
                break;
            case "2":
                this.setIdCard = prompt("Enter id you want edit");
                break;
            case "3":
                this.setBirthdayCustomer = prompt("Enter birthday you want edit (dd/MM/yyy)");
                break;
            case "4":
                this.setEmailCustomer = prompt("Enter email you want edit");
                break;
            case "5":
                this.setAddressCustomer = prompt("Enter address you want edit");
                break;
            case "6":
                this.setTypeCustomer = prompt("Enter typeCustomer you want edit");
                break;
            case "7":
                this.setDiscount = prompt("Enter discount you want edit");
                break;
            case "8":
                this.setNumberOfAccompaying = prompt("Enter Number Of Accompaying you want edit");
                break;
            case "9":
                this.setTypeRoom = prompt("Enter Type Room you want edit");
                break;
            case "10":
                this.setRentDays = prompt("Enter Rent Days you want edit");
                break;
            case "11":
                this.setTypeService = prompt("Enter Type Service you want edit");
                break;
            case "12":
                alert("Bạn đã sửa xong!");
                checkEdit = false;
                break;
            default:
                alert("Field !!");
        }
    } while (checkEdit);
    displayCustomer();
}
//Hàm kiểm tra có xoá hay không
function chooseDeleteCustomer() {
    let checkDeleteCustomer  = true;
    displayCustomer();
}
//Hàm delete Customer
function deleteCustomer(index) {
    let chooseConfirm = prompt(
        "Are you sure delete Customer : Name: " + listCustomers[index][this.getNameCustomer()] +
        "; idCard: " + listCustomers[index][this.getIdCard()] +
        "\n1.Yes\n2.No");
}

displayMainMenu();