package Commons;

public class FuncWireAndReadCSV {
    public static final char DEFAULT_SEPARATOR = ',';
    public static final char DEFAULT_QUOTE = '"';
    public static final int NUM_OF_LINE_SKIP = 1;

    public static final String pathVilla = "FuramaResort/src/Data/Villa.csv";
    public static final String pathHouse = "FuramaResort/src/Data/House.csv";
    public static final String pathRoom = "FuramaResort/src/Data/Room.csv";

    //header Villa.csv
    public static String[] headerRecordVilla = new String[]{"id", "service", "areaUsed",
            "rentalCosts", "maxNumberOfPeople", "rentType", "roomStandard",
            "convenientDescription", "areaPool", "numberOfFloors"};

    //header House.csv
    public static String[] headerRecordHouse = new String[]{"id", "service", "areaUsed",
            "rentalCosts", "maxNumberOfPeople", "rentType", "freeService"};

    //header Room.csv
    public static String[] headerRecordRoom = new String[]{"id", "service", "areaUsed",
            "rentalCosts", "maxNumberOfPeople", "rentType", "roomStandard","convenientDescription","numberOfFloors"};



}

