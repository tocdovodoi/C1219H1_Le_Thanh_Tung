package Controllers;

public class MainController {
    public static void main(String[] args) {
        disPlayMainMenu();
    }

    private static void disPlayMainMenu() {
        System.out.println("--------------Main menu--------------");
        System.out.println("1. Add New Services." +
                "\n2. Show Services." +
                "\n3. Add New Customer." +
                "\n4. Show Information of Customer" +
                "\n5. Add New Booking" +
                "\n6. Show Information of Employee" +
                "\n7. Exit");
    }
}

