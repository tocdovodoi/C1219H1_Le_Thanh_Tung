package Commons;

import Models.House;
import Models.Room;
import Models.Villa;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static Commons.FuncWireAndReadFileCSV.*;

public class FuncGeneric {
    public enum EntityType {
        VILLA,
        HOUSE,
        ROOM,
        CUSTOMER
    }

    public static <E> void displayList(ArrayList<E> list) {
        int i = 1;
        System.out.println("-------------------List---------------------");
        for (E item : list) {
            System.out.println("No: " + i);
            if (item instanceof Villa) {
                ((Villa) item).showInfor();
            } else if (item instanceof House) {
                ((House) item).showInfor();
            } else if (item instanceof Room) {
                ((Room) item).showInfor();
            }
            i++;
            System.out.println("--------------------------------------");
        }
    }

    public static <E> ArrayList<E> getListFromCSV(EntityType entityType) {
        String csvPath = "";
        String[] headerRecord;
        switch (entityType) {
            case VILLA:
                csvPath = pathVilla;
                headerRecord = headerRecordVilla;
                break;
            case HOUSE:
                csvPath = pathHouse;
                headerRecord = headerRecordHouse;
                break;
            case ROOM:
                csvPath = pathRoom;
                headerRecord = headerRecordRoom;
                break;
            default:
                throw new IllegalStateException("Unexepted value: " + entityType);
        }

        Path path = Paths.get(csvPath);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(csvPath);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        ColumnPositionMappingStrategy<E> strategy = new ColumnPositionMappingStrategy<>();
        switch (entityType) {
            case VILLA:
                strategy.setType((Class<? extends E>) Villa.class);
                break;
            case HOUSE:
                strategy.setType((Class<? extends E>) House.class);
                break;
            case ROOM:
                strategy.setType((Class<? extends E>) Room.class);
                break;
        }
        strategy.setColumnMapping(headerRecord);
        CsvToBean<E> csvToBean = null;
        try {
            csvToBean = new CsvToBeanBuilder<E>(new FileReader(csvPath))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return (ArrayList<E>) csvToBean.parse();
    }
}
