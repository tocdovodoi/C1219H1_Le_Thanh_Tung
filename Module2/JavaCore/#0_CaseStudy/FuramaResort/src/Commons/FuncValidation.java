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
        } else if (services instanceof House) {
            pattern = "^SVHO-\\d{4}$";
        } else if (services instanceof Room) {
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

    public static String getValidFreeService(String strDisplay, String errMes) {
        System.out.println(strDisplay);
        String result = ScannerUtils.scanner.nextLine();
        if (!isValidNameService(result)) {
            System.out.println(errMes);
            result = getValidName(strDisplay, errMes);
        }
        return result;
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

    public static String getValidName(String strDisplay, String errMes) {
        System.out.println(strDisplay);
        String result = ScannerUtils.scanner.nextLine();
        if (!isValidNameService(result)) {
            System.out.println(errMes);
        }
        return result;
    }

//    public static double getValidNumberDouble(String strDisplay, String errMes) {
//        return getValidNumberDouble(strDisplay,errMes,null);
//    }

    public static double getValidNumberDouble(String strDisplay, String errMes, Double min) {
        double result = 0.0;
        System.out.println(strDisplay);
        try {
            result = Double.parseDouble(ScannerUtils.scanner.nextLine());
            if (min != null && result <= min) {
                throw new Exception(errMes);
            }
        } catch (Exception e) {
            System.out.println(errMes);
            result = getValidNumberDouble(strDisplay, errMes, min);
        }
        return result;
    }

//    public static Integer getValidNumberInterger(String strDisplay, String errMes, Integer min) {
//        return getValidNumberInterger(strDisplay, errMes, 0, null);
//    }

    public static Integer getValidNumberInterger(String strDisplay, String errMes, Integer min, Integer max) {
        int result = 0;
        System.out.println(strDisplay);
        try {
            result = Integer.parseInt(ScannerUtils.scanner.nextLine());
            if (min != null && result <= min) {
                throw new Exception(errMes);
            }
            if (max != null && result >= max) {
                throw new Exception(errMes);
            }
        } catch (Exception e) {
            System.out.println(errMes);
            result = getValidNumberInterger(strDisplay, errMes, min, max);
        }
        return result;
    }
}
