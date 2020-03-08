package Controllers;

import Commons.FuncGeneric;
import Commons.FuncWireAndReadFileCSV;
import Commons.ScannerUtils;
import Models.Customer;
import Models.House;
import Models.Room;
import Models.Villa;

import java.util.ArrayList;

import static Commons.FuncGeneric.displayList;
import static Commons.Menu.displayMenuBackToMain;
import static Commons.Menu.displayMenuBooking;
import static Controllers.MainController.backMainMenu;
import static Controllers.MainController.processMain;

public class BookingController {

    //Add New Booking
    public static void addNewBooking() {
        ArrayList<Customer> customerList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.CUSTOMER);
        displayList(customerList);
        System.out.println("Chọn 1 customer để thực hiện booking");
        Customer customer = new Customer();
        customer = customerList.get(Integer.parseInt(ScannerUtils.scanner.nextLine()) - 1);
        displayMenuBooking();
        processMenuBooking(customer);

        //get list customer from file CSV
        ArrayList<Customer> listBooking = FuncWireAndReadFileCSV.getBookingFileCSV();
        //add customer to list
        listBooking.add(customer);
        //write to csv
        FuncWireAndReadFileCSV.writeBookingToFileCSV(listBooking);
        System.out.println("--------Add Booking for: " + customer.getFullName() + " Successfully");
        backMainMenu();
    }

    public static void processMenuBooking(Customer customer) {
        switch (ScannerUtils.scanner.nextLine()) {
            case "1":
                ArrayList<Villa> villaList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.VILLA);
                displayList(villaList);
                System.out.println("Chọn Villa thực hiện booking ");
                Villa villa = villaList.get(Integer.parseInt(ScannerUtils.scanner.nextLine()) - 1);
                customer.setServices(villa);
                break;
            case "2":
                ArrayList<House> houseList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.HOUSE);
                displayList(houseList);
                System.out.println("Chọn House thực hiện booking ");
                House house = houseList.get(Integer.parseInt(ScannerUtils.scanner.nextLine()) - 1);
                customer.setServices(house);
                break;
            case "3":
                ArrayList<Room> roomList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.ROOM);
                displayList(roomList);
                System.out.println("Chọn Room thực hiện booking ");
                Room room = roomList.get(Integer.parseInt(ScannerUtils.scanner.nextLine()) - 1);
                customer.setServices(room);
                break;
            case "4":
                processMain();
                System.out.println("\n-------------------------");
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Nhập sai hiển thị lại Menu");
                displayMenuBackToMain();
                break;
        }
    }
}
