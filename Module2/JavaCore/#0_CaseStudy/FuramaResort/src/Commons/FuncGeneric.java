package Commons;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import static Commons.FuncWireAndReadCSV.*;

public class FuncGeneric {
    public enum EntityType {
        VILLA,
        HOUSE,
        ROOM
    }

    public static <E> ArrayList<E> getListFromCSV(EntityType entityType) throws IOException {
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


    }
}
