package Controllers;

import Commons.ScannerUtils;
import Models.Villa;

import static Commons.Menu.displayMainMenu;
import static Commons.Menu.displayMenuBackToMain;
import static Controllers.BookingController.addNewBooking;
import static Controllers.CustomerController.addNewCustomer;
import static Controllers.CustomerController.showInformationCustomer;
import static Controllers.EmployeeController.showInformationEmployee;
import static Controllers.ServiceController.addNewServices;
import static Controllers.ServiceController.showServices;

public class MainController {
    public static void processMain() {
        try {
            displayMainMenu();
            processMainMenu();
        } catch (Exception e) {
            backMainMenu();
        }
    }

    public static void processMainMenu() {
        switch (ScannerUtils.scanner.nextLine()) {
            case "1":
                addNewServices();
                break;
            case "2":
                showServices();
                break;
            case "3":
                addNewCustomer();
                break;
            case "4":
                showInformationCustomer();
                break;
            case "5":
                addNewBooking();
                break;
            case "6":
                showInformationEmployee();
                break;
            case "7":
                System.exit(0);
                break;
            default:
                System.out.println("Please choose (1-7). Enter to continue!");
                System.out.println();
                displayMainMenu();
        }
    }

    public static void backMainMenu() {
        displayMenuBackToMain();
        processMain();
    }
}
