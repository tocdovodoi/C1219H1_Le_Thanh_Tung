let listCustomers = [];
let validateBirthday = /^((0)[1-9]|[1-2][0-9]|(3)[0-1])(\/)((0)[1-9]|((1)[0-2]))(\/)\d{4}$/;

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
                // displayCustomer();
                break;
            case "3":

                break;
            case "4":
                // editCustomer();
                break;
            case "5":
                // deleteCustomer();
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
displayMainMenu();