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