package Controllers;

import Commons.ScannerUtils;
import Models.Services;
import Models.Villa;
import com.sun.org.apache.xpath.internal.functions.FuncGenerateId;

import java.util.ArrayList;

import static Commons.Menu.*;

public class ServiceController {

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
//                addNewHouse();
                break;
            case "3":
//                addNewRoom();
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

    }

    //2. Show Service
    public static void showServices() {
    }
}
