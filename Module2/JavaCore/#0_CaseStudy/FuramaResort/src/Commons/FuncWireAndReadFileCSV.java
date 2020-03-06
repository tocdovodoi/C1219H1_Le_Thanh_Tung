package Commons;

import Models.House;
import Models.Room;
import Models.Villa;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class FuncWireAndReadFileCSV {
    public static final char DEFAULT_SEPARATOR = ',';
    public static final char DEFAULT_QUOTE = '"';
    public static final int NUM_OF_LINE_SKIP = 1;

    public static final String pathVilla = "src/Data/Villa.csv";
    public static final String pathHouse = "src/Data/House.csv";
    public static final String pathRoom = "src/Data/Room.csv";

    //header Villa.csv
    public static String[] headerRecordVilla = new String[]{"id", "serviceName", "areaUser",
            "rentalCosts", "maxNumberOfPeople", "rentType", "roomStandard",
            "convenientDescription", "areaPool", "numberOfFloors"};

    //header House.csv
    public static String[] headerRecordHouse = new String[]{"id", "serviceName", "areaUser",
            "rentalCosts", "maxNumberOfPeople", "rentType", "roomStandard","convenientDescription","numberOfFloors"};

    //header Room.csv
    public static String[] headerRecordRoom = new String[]{"id", "serviceName", "areaUser",
            "rentalCosts", "maxNumberOfPeople", "rentType", "freeService"};

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
            CSVWriter csvWriter = new CSVWriter(writer,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);
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
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Func write Room to File CSV
    public static void writeRoomToFileCsv(ArrayList<Room> arrayList) {
        try {
            Writer writer = new FileWriter(pathRoom);
            CSVWriter csvWriter = new CSVWriter(writer,
                    CSVWriter.DEFAULT_SEPARATOR,
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);
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
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}

