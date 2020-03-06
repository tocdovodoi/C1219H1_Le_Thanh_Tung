package Commons;

import Models.House;
import Models.Room;
import Models.Services;
import Models.Villa;

public class FuncValidation {
    public static String pattern = "";

    public static boolean isValidIdServices(Services services, String string) {
        if (services instanceof Villa) {
            pattern = "^SVVL-\\d{4}$";
        }
        else if (services instanceof House) {
            pattern = "^SVHO-\\d{4}$";
        }
        else if (services instanceof Room) {
            pattern = "^SVRO-\\d{4}$";
        }
        return string.matches(pattern);
    }

    public static boolean isValidNameService(String string) {
        pattern = "^([A-Z][a-z]+)$";
        //Kí tự đầu viết hoa, kí tự sau viết thường
        return string.matches(pattern);
    }

    public static boolean isValidFreeService(String string) {
        pattern = "^massage|karaoke|food|drink|car$";
        return string.matches(pattern);
    }

    public static String getValidService(Services services, String strDisplay, String errMes) {
        System.out.println(strDisplay);
        String result = ScannerUtils.scanner.nextLine();
        if (!isValidIdServices(services, result)) {
            System.out.println(errMes);
            result = getValidService(services, strDisplay, errMes);
        }
        return result;
    }
}
