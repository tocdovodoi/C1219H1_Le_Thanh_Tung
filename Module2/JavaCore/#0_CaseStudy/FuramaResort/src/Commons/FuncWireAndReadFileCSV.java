package Commons;

import Models.Customer;
import Models.House;
import Models.Room;
import Models.Villa;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.ArrayList;

public class FuncWireAndReadFileCSV {
    public static final char DEFAULT_SEPARATOR = ',';
    public static final char DEFAULT_QUOTE = '"';
    public static final int NUM_OF_LINE_SKIP = 1;

    public static final String pathVilla = "src/Data/Villa.csv";
    public static final String pathHouse = "src/Data/House.csv";
    public static final String pathRoom = "src/Data/Room.csv";
    public static final String pathCustomer = "src/Data/Customer.csv";
    public static final String pathBooking = "src/Data/Booking.csv";

    //header Villa.csv
    public static String[] headerRecordVilla = new String[]{"id", "serviceName", "areaUser",
            "rentalCosts", "maxNumberOfPeople", "rentType", "roomStandard",
            "convenientDescription", "areaPool", "numberOfFloors"};

    //header House.csv
    public static String[] headerRecordHouse = new String[]{"id", "serviceName", "areaUser",
            "rentalCosts", "maxNumberOfPeople", "rentType", "roomStandard", "convenientDescription", "numberOfFloors"};

    //header Room.csv
    public static String[] headerRecordRoom = new String[]{"id", "serviceName", "areaUser",
            "rentalCosts", "maxNumberOfPeople", "rentType", "freeService"};

    //header Customer.csv
    public static String[] headerRecordCustomer = new String[]{"fullName", "birthday", "gender",
            "idCard", "phone", "email", "customerType", "address"};

    //header Booking.csv
    public static String[] headerRecordBooking = new String[]{"fullName", "birthday", "gender",
            "idCard", "phone", "email", "customerType", "address","id","serviceName","areaUser",
            "rentalCosts","maxNumberOfPeople","rentType"};

    //Func write Villa to File CSV
    public static void writeVillaToFileCsv(ArrayList<Villa> arrayList) {
        try {
            FileWriter writer = new FileWriter(pathVilla);
            CSVWriter csvWriter = new CSVWriter(writer);
            csvWriter.writeNext(headerRecordVilla);
            for (Villa villa : arrayList) {
                csvWriter.writeNext(new String[]{
                        villa.getId(),
                        villa.getServiceName(),
                        String.valueOf(villa.getAreaUser()),
                        String.valueOf(villa.getRentalCosts()),
                        String.valueOf(villa.getMaxNumberOfPeople()),
                        villa.getRentType(),
                        villa.getRoomStandard(),
                        villa.getConvenientDescription(),
                        String.valueOf(villa.getAreaPool()),
                        String.valueOf(villa.getNumberOfFloors())});
            }
            csvWriter.close();  //Lỗi runtime khi lưu file CSV
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Func write House to File CSV
    public static void writeHouseToFileCsv(ArrayList<House> arrayList) {
        try {
            Writer writer = new FileWriter(pathHouse);
            CSVWriter csvWriter = new CSVWriter(writer);
            csvWriter.writeNext(headerRecordHouse);
            for (House house : arrayList) {
                csvWriter.writeNext(new String[]{
                        house.getId(),
                        house.getServiceName(),
                        String.valueOf(house.getAreaUser()),
                        String.valueOf(house.getRentalCosts()),
                        String.valueOf(house.getMaxNumberOfPeople()),
                        house.getRentType(),
                        house.getRoomStandard(),
                        house.getConvenientDescription(),
                        String.valueOf(house.getNumberOfFloors())});
            }
            csvWriter.close();  //Lỗi runtime khi lưu file CSV
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Func write Room to File CSV
    public static void writeRoomToFileCsv(ArrayList<Room> arrayList) {
        try {
            Writer writer = new FileWriter(pathRoom);
            CSVWriter csvWriter = new CSVWriter(writer);
            csvWriter.writeNext(headerRecordRoom);
            for (Room room : arrayList) {
                csvWriter.writeNext(new String[]{
                        room.getId(),
                        room.getServiceName(),
                        String.valueOf(room.getAreaUser()),
                        String.valueOf(room.getRentalCosts()),
                        String.valueOf(room.getMaxNumberOfPeople()),
                        room.getRentType(),
                        String.valueOf(room.getFreeService())});
            }
            csvWriter.close();  //Lỗi runtime khi lưu file CSV
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Func write Customer to File CSV
    public static void writeCustomerToFileCsv(ArrayList<Customer> arrayList) {
        try {
            Writer writer = new FileWriter(pathCustomer);
            CSVWriter csvWriter = new CSVWriter(writer);
            csvWriter.writeNext(headerRecordCustomer);
            for (Customer customer : arrayList) {
                csvWriter.writeNext(new String[]{
                        customer.getFullName(),
                        customer.getBirthday(),
                        customer.getGender(),
                        customer.getIdCard(),
                        customer.getPhone(),
                        customer.getEmail(),
                        customer.getCustomerType(),
                        customer.getAddress()});
            }
            csvWriter.close();  //Lỗi runtime khi lưu file CSV
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Func get Booking File CSV
    public static ArrayList<Customer> getBookingFileCSV() {
        ArrayList<Customer> listCustomer = new ArrayList<>();
        try (Reader reader = new FileReader(pathBooking);
             CSVReader csvReader = new CSVReader(reader);
        ) {
            String[] line;
            csvReader.skip(1);
            while ((line = csvReader.readNext()) != null) {
                Customer customer = new Customer();
                Villa villa = new Villa();
                int post = 0;
                customer.setFullName(line[post++]);
                customer.setBirthday(line[post++]);
                customer.setGender(line[post++]);
                customer.setIdCard(line[post++]);
                customer.setPhone(line[post++]);
                customer.setEmail(line[post++]);
                customer.setAddress(line[post++]);
                customer.setCustomerType(line[post++]);

                villa.setId(line[post++]);
                villa.setServiceName(line[post++]);
                villa.setAreaUser(Double.parseDouble(line[post++]));
                villa.setRentalCosts(Double.parseDouble(line[post++]));
                villa.setMaxNumberOfPeople(Integer.parseInt(line[post++]));
                villa.setRentType(line[post++]);
                customer.setServices(villa);
                listCustomer.add(customer);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return listCustomer;
    }

    //Func write Booking to File CSV
    public static void writeBookingToFileCSV(ArrayList<Customer> arrayList) {
        try {
            Writer writer = new FileWriter(pathBooking);
            CSVWriter csvWriter = new CSVWriter(writer);
            csvWriter.writeNext(headerRecordBooking);
            for (Customer customer : arrayList) {
                csvWriter.writeNext(new String[]{

                        //thông tin customer
                        customer.getFullName(),
                        customer.getBirthday(),
                        customer.getGender(),
                        customer.getIdCard(),
                        customer.getPhone(),
                        customer.getEmail(),
                        customer.getCustomerType(),
                        customer.getAddress(),

                        //thông tin dịch vụ
                        customer.getServices().getId(),
                        customer.getServices().getServiceName(),
                        String.valueOf(customer.getServices().getAreaUser()),
                        String.valueOf(customer.getServices().getRentalCosts()),
                        String.valueOf(customer.getServices().getMaxNumberOfPeople()),
                        customer.getServices().getRentType()
                });
            }
            csvWriter.close();  //Lỗi runtime khi lưu file CSV
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}

