package Commons;

import Models.Villa;
import Views.Main;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Villa villa = new Villa("SVVL-3333", "sss", 23, 52, 3, null, null, null, 5, 3);
        ArrayList<Villa> villas = new ArrayList<>();
        villas.add(villa);
        FuncWireAndReadFileCSV.writeVillaToFileCsv(villas);
    }
}
