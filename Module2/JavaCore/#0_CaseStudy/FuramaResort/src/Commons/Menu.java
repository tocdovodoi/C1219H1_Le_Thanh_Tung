package Commons;

public class Menu {

    //Main Menu
    public static void displayMainMenu() {
        System.out.println("--------------Main menu--------------");
        System.out.println("1. Add New Services." +
                "\n2. Show Services." +
                "\n3. Add New Customer." +
                "\n4. Show Information of Customer" +
                "\n5. Add New Booking" +
                "\n6. Show Information of Employee" +
                "\n7. Exit");
        System.out.print("---Please select one function below: ");
    }

    //Service Menu
    public static void displayMenuAddNewService() {
        System.out.println("--------------Add new service menu--------------");
        System.out.println("1. Add New Villa." +
                "\n2. Add New House." +
                "\n3. Add New Room." +
                "\n4. Back to menu" +
                "\n5. Exit");
        System.out.print("---Please select one function below: ");
    }


    public static void displayMenuBackToMain() {
        System.out.println("-------------Enter to continue-----------");
        ScannerUtils.scanner.nextLine();
    }
}

