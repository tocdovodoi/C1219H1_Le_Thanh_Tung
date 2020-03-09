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
                "\n7. Booking Movie Ticket 4D" +
                "\n8. Find Employee" +
                "\n9. Exit");
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

    //Show Service
    public static void displayMenuShowService() {
        System.out.println("--------------Show service menu--------------");
        System.out.println("1. Show All Villa." +
                "\n2. Show All House." +
                "\n3. Show All Room." +
                "\n4. Show All Name Villa" +
                "\n5. Show All Name House" +
                "\n6. Show All Name Name" +
                "\n7. Back to menu" +
                "\n8. Exit");
        System.out.print("---Please select one function below: ");
    }

    //Booking Menu
    public static void displayMenuBooking() {
        System.out.println("--------------Booking menu--------------");
        System.out.println("1. Booking Villa." +
                "\n2. Booking House." +
                "\n3. Booking Room." +
                "\n4. Back to menu" +
                "\n5. Exit");
        System.out.print("---Please select one function below: ");
    }

    public static void displayMenuBookingMovieTicket4D() {
        System.out.println("--------------Booking menu ticket 4D--------------");
        System.out.println("1. Booking movie ticket." +
                "\n2. Show customer booking movie ticket." +
                "\n3. Back to menu" +
                "\n4. Exit");
        System.out.print("---Please select one function below: ");
    }

    public static void displayMenuBackToMain() {
        System.out.println("-------------Enter to continue-----------");
        ScannerUtils.scanner.nextLine();
    }
}

