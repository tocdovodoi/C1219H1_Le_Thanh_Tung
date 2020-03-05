package Controllers;

import Commons.FuncGeneric;
import Commons.FuncWireAndReadFileCSV;
import Commons.ScannerUtils;
import Models.House;
import Models.Room;
import Models.Services;
import Models.Villa;
import java.util.ArrayList;

import static Commons.FuncGeneric.displayList;
import static Commons.Menu.*;
import static Controllers.MainController.*;

public class ServiceController {

    public static void  addNewServices() {
        displayMenuAddNewService();
        processMenuAddNewService();
    }

    //1. Add New Service
    public static Services addNewServices(Services services) {
        //Set Service ID
        System.out.println("Enter service ID: ");
        services.setId(ScannerUtils.scanner.nextLine());

        //Set Service name
        System.out.println("Enter service name: ");
        services.setServiceName(ScannerUtils.scanner.nextLine());

        //Set Area Used
        System.out.println("Enter Area Used: ");
        services.setAreaUser(Double.parseDouble(ScannerUtils.scanner.nextLine()));

        //Set Rental Costs
        System.out.println("Enter Rental Costs: ");
        services.setRentalCosts(Double.parseDouble(ScannerUtils.scanner.nextLine()));

        //Set Max Number Of People
        System.out.println("Enter Max Number Of People: ");
        services.setMaxNumberOfPeople(Integer.parseInt(ScannerUtils.scanner.nextLine()));

        //Set Rent Type
        System.out.println("Enter Rent Type: ");
        services.setRentType(ScannerUtils.scanner.nextLine());

        return services;
    }

    private static void processMenuAddNewService() {
        switch (ScannerUtils.scanner.nextLine()) {
            case "1":
                addNewVilla();
                break;
            case "2":
                addNewHouse();
                break;
            case "3":
                addNewRoom();
                break;
            case "4":
//                processMain();
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

    //Add New Villa
    public static void addNewVilla() {
        Services villa = new Villa();
        villa = addNewServices(villa);

        //Room Standard
        System.out.println("Enter Room Standard: ");
        ((Villa) villa).setRoomStandard(ScannerUtils.scanner.nextLine());

        //Convenient Description
        System.out.println("Enter onvenient Description: ");
        ((Villa) villa).setConvenientDescription(ScannerUtils.scanner.nextLine());

        //Area Pool
        System.out.println("Enter Area Pool: ");
        ((Villa) villa).setAreaPool(Double.parseDouble(ScannerUtils.scanner.nextLine()));

        //Number Of Floors
        System.out.println("Enter Number Of Floors: ");
        ((Villa) villa).setNumberOfFloors(Integer.parseInt(ScannerUtils.scanner.nextLine()));

        //Get List Villa from CSV
        ArrayList<Villa> villaList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.VILLA);

        //Add Villa List
        villaList.add((Villa) villa);

        //write to csv
        FuncWireAndReadFileCSV.writeVillaToFileCsv(villaList);

        System.out.println("----Add Villa: " + villa.getServiceName() + " Successfully");

        backMainMenu();
    }

    //Add New House
    public static void addNewHouse() {
        Services house = new House();
        house = addNewServices(house);

        //Room Standard
        System.out.println("Enter Room Standard: ");
        ((House) house).setRoomStandard(ScannerUtils.scanner.nextLine());

        //Convenient Description
        System.out.println("Enter onvenient Description: ");
        ((House) house).setConvenientDescription(ScannerUtils.scanner.nextLine());

        //Number Of Floors
        System.out.println("Enter Number Of Floors: ");
        ((House) house).setNumberOfFloors(Integer.parseInt(ScannerUtils.scanner.nextLine()));

        //Get List House from CSV
        ArrayList<House> houseList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.HOUSE);

        //Add House List
        houseList.add((House) house);

        //write to csv
        FuncWireAndReadFileCSV.writeHouseToFileCsv(houseList);

        System.out.println("----Add House: " + house.getServiceName() + " Successfully");

        backMainMenu();
    }

    //Add New Room
    public static void addNewRoom() {
        Services room = new Room();
        room = addNewServices(room);

        //free Service
        System.out.println("Enter Room Standard: ");
        ((Room) room).setFreeService(ScannerUtils.scanner.nextLine());


        //Get List Room from CSV
        ArrayList<Room> roomList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.ROOM);

        //Add Room List
        roomList.add((Room) room);

        //write to csv
        FuncWireAndReadFileCSV.writeRoomToFileCsv(roomList);

        System.out.println("----Add Room: " + room.getServiceName() + " Successfully");

        backMainMenu();
    }

    //2. Show Service
    public static void showServices() {
        displayMenuShowService();
        processMenuShowService();
    }

    private static void processMenuShowService() {
        switch (ScannerUtils.scanner.nextLine()) {
            case "1":
                showVilla();
                break;
            case "2":
//                showHome();
                break;
            case "3":
//                showRoom();
                break;
            case "4":
//                showAllNameVilla();
                break;
            case "5":
//                showAllNameHouse();
                break;
            case "6":
//                showAllNameRoom();
                break;
            case "7":
                processMain();
                System.out.println("--------------------------");
                break;
            case "8":
                System.exit(0);
                break;
            default:
                System.out.println("Nhập sai hiển thị lại Menu");
                backMainMenu();
                break;
        }
    }

    public static void showVilla() {
        ArrayList<Villa> villasList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.VILLA);
        displayList(villasList);
        backMainMenu();
    }
}
