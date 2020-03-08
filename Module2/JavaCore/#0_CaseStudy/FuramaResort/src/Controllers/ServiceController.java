package Controllers;

import Commons.FuncGeneric;
import Commons.FuncValidation;
import Commons.FuncWireAndReadFileCSV;
import Commons.ScannerUtils;
import Models.House;
import Models.Room;
import Models.Services;
import Models.Villa;
import java.util.ArrayList;

import static Commons.FuncGeneric.displayList;
import static Commons.FuncGeneric.showAllNameNotDulicate;
import static Commons.Menu.*;
import static Controllers.MainController.*;

public class ServiceController {

    //Service
    public static final String ENTER_SERVICE_ID = "Nhập ID dịch vụ";
    public static final String INVALID_SERVICE_ID = "ID dịch vụ định dạng kiểu SVXX-YYYY";
    public static final String ENTER_SERVICE_NAME = "Nhập tên dịch vụ";
    public static final String INVALID_SERVICE_NAME = "Chữ cái đầu viết hoa, các chữ sau viết thường";
    public static final String ENTER_AREA_USED = "Nhập diện tích sử dụng";
    public static final String INVALID_AREA_USED = "Diện tích sử dụng phải là số thực lớn hơn 30m2";
    public static final String ENTER_RENTAL_COSTS = "Nhập chi phí thuê";
    public static final String INVALID_RENTAL_COSTS = "Chi phí thuê phải là số dương";
    public static final String ENTER_MAX_NUMBER_PEOPLE = "Nhập số lượng người thuê";
    public static final String INVALID_MAX_NUMBER_PEOPLE = "Số lượng người tối đa phải >0 và nhỏ hơn <20";
    public static final String ENTER_RENT_TYPE = "Nhập kiểu thuê";
    public static final String INVALID_RENT_TYPE = "Chữ cái đầu viết hoa, các chữ sau viết thường";
    public static final String ENTER_ROOM_STANDARD = "Nhập tiêu chuẩn phòng";
    public static final String INVALID_ROOM_STANDARD = "Chữ cái đầu viết hoa, các chữ sau viết thường";
    public static final String ENTER_AREA_POOL = "Nhập diện tích hồ bơi";
    public static final String INVALID_AREA_POOL = "Diện tích hồ bơi phải là số thực lớn hơn 30m2";
    public static final String ENTER_NUMBER_OF_FLOOR = "Nhập số tầng";
    public static final String INVALID_NUMBER_OF_FLOOR = "Số tầng phải là số nguyên dương";
    public static final String ENTER_FREE_SERVICE = "Nhập dịch vụ đi kèm";
    public static final String INVALID_FREE_SERVICE = "Dịch vụ đi kèm phải là các giá trị: massage, karaoke, food, drink, car";

    //Customer
    public static final String ENTER_CUSTOMER_NAME = "Nhập tên";
    public static final String INVALID_CUSTOMER_NAME = "Chữ cái đầu viết hoa, các chữ sau viết thường";
    public static final String ENTER_CUSTOMER_BIRTHDAY = "Nhập ngày sinh";
    public static final String INVALID_CUSTOMER_BIRTHDAY = "Ngày sinh theo định dạng dd/MM/yyy, năm sinh >1900 và nhỏ hơn ngày hiện tại là 18 năm";
    public static final String ENTER_CUSTOMER_GENDER = "Nhập giới tính";
    public static final String INVALID_CUSTOMER_GENDER = "Male hoặc Female hoặc Unknow";
    public static final String ENTER_CUSTOMER_IDCARD = "Nhập Id";
    public static final String INVALID_CUSTOMER_IDCARD = "ID Card gồm 9 chữ số";
    public static final String ENTER_CUSTOMER_EMAIL = "Nhập email";
    public static final String INVALID_CUSTOMER_EMAIL = "Email phải đúng định dạng abc@abc.abc";

    public static void  addNewServices() {
        displayMenuAddNewService();
        processMenuAddNewService();
    }

    //1. Add New Service
    public static Services addNewServices(Services services) {
        //Set Service ID
        services.setId(FuncValidation.getValidService(services,ENTER_SERVICE_ID,INVALID_SERVICE_ID));

        //Set Service name
        services.setServiceName(FuncValidation.getValidName(ENTER_SERVICE_NAME,INVALID_SERVICE_NAME));

        //Set Area Used
        services.setAreaUser(FuncValidation.getValidNumberDouble(ENTER_AREA_USED,INVALID_AREA_USED,30.0));

        //Set Rental Costs
        services.setRentalCosts(FuncValidation.getValidNumberDouble(ENTER_RENTAL_COSTS, INVALID_RENTAL_COSTS, 0.0));

        //Set Max Number Of People
        services.setMaxNumberOfPeople(FuncValidation.getValidNumberInterger(ENTER_MAX_NUMBER_PEOPLE,INVALID_MAX_NUMBER_PEOPLE,0,20));

        //Set Rent Type
        services.setRentType(FuncValidation.getValidName(ENTER_RENT_TYPE,INVALID_RENT_TYPE));

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

    //Add New Villa
    public static void addNewVilla() {
        Services villa = new Villa();
        villa = addNewServices(villa);

        //Room Standard
        ((Villa) villa).setRoomStandard(FuncValidation.getValidName(ENTER_ROOM_STANDARD,INVALID_ROOM_STANDARD));

        //Convenient Description
        System.out.println("Nhập tên tiện ích: ");
        ((Villa) villa).setConvenientDescription(ScannerUtils.scanner.nextLine());

        //Area Pool
        ((Villa) villa).setAreaPool(FuncValidation.getValidNumberDouble(ENTER_AREA_POOL,INVALID_AREA_POOL,30.0));

        //Number Of Floors
        ((Villa) villa).setNumberOfFloors(FuncValidation.getValidNumberInterger(ENTER_NUMBER_OF_FLOOR,INVALID_NUMBER_OF_FLOOR,0,20));

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
        ((House) house).setRoomStandard(FuncValidation.getValidName(ENTER_ROOM_STANDARD,INVALID_ROOM_STANDARD));

        //Convenient Description
        System.out.println("Nhập tên tiện ích: ");
        ((House) house).setConvenientDescription(ScannerUtils.scanner.nextLine());

        //Number Of Floors
        ((House) house).setNumberOfFloors(FuncValidation.getValidNumberInterger(ENTER_NUMBER_OF_FLOOR,INVALID_NUMBER_OF_FLOOR,0,20));

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
        ((Room) room).setFreeService(FuncValidation.getValidFreeService(ENTER_FREE_SERVICE,INVALID_FREE_SERVICE));


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
                showHome();
                break;
            case "3":
                showRoom();
                break;
            case "4":
                showAllNameVilla();
                break;
            case "5":
                showAllNameHouse();
                break;
            case "6":
                showAllNameRoom();
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

    public static void showHome() {
        ArrayList<House> housesList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.HOUSE);
        displayList(housesList);
        backMainMenu();
    }

    public static void showRoom() {
        ArrayList<Room> roomsList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.ROOM);
        displayList(roomsList);
        backMainMenu();
    }

    public static void showAllNameVilla() {
        showAllNameNotDulicate(FuncGeneric.EntityType.VILLA);
    }

    public static void showAllNameHouse() {
        showAllNameNotDulicate(FuncGeneric.EntityType.HOUSE);
    }

    public static void showAllNameRoom() {
        showAllNameNotDulicate(FuncGeneric.EntityType.ROOM);
    }
}
