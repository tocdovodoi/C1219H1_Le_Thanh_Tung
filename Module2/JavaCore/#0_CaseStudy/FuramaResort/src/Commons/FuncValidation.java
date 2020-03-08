package Commons;

import CustomerException.*;
import Models.House;
import Models.Room;
import Models.Services;
import Models.Villa;

import java.util.Calendar;

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

    //validate name
    public static boolean isValidNameService(String string) {
        pattern = "^(([A-Z][a-z]+\\s{0,1})+)$";
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

    public static String getValidCustomerName(String strDisplay, String errMes) {
        String result = "";
        System.out.println(strDisplay);
        try {
            result = ScannerUtils.scanner.nextLine();
            if (!isValidNameService(result)) {
                throw new NameException(errMes);
            }
        } catch (NameException e) {
            System.out.println(errMes);
            result = getValidCustomerName(strDisplay, errMes);
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

    //validate birthday
    public static boolean isValidBirthday(String str) {
        pattern = "^([0][1-9]|[1-2][0-9]|[3][0-1])\\/([0][1-9]|[1][0-2])\\/(\\d{4})$";
        return str.matches(pattern);
    }

    public static String getValidbirthday(String strDisplay, String errMes) {
        String result = null;
        System.out.println(strDisplay);
        try {
            result = ScannerUtils.scanner.nextLine();
            if (!isValidBirthday(result)) {
                throw new BirthdayException(errMes);
            }
            int year = Integer.parseInt(result.substring(6, 10));
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            if (year <= 1900 || (currentYear) - year <= 18) {
                throw new BirthdayException(errMes);
            }
        } catch (BirthdayException e) {
            System.out.println(errMes);
            result = getValidbirthday(strDisplay, errMes);
        }
        return result;
    }

    public static boolean isValidGender(String string) {
        pattern = "^(Male|Female|Unknow)$";
        return string.matches(pattern);
    }

    public static String getValidGender(String strDisplay, String errMes) {
        String result = null;
        System.out.println(strDisplay);
        try {
            result = ScannerUtils.scanner.nextLine();
            if (!isValidGender(result)) {
                throw new GenderException(errMes);
            }
        } catch (GenderException e) {
            System.out.println(errMes);
            result = getValidGender(strDisplay, errMes);
        }
        return result;
    }

    public static boolean isValidIdCard(String str) {
        pattern = "^\\d{9}$";
        return str.matches(pattern);
    }

    public static String getValidIdCard(String strDisplay, String errMes) {
        String result = null;
        System.out.println(strDisplay);
        try {
            result = ScannerUtils.scanner.nextLine();
            if (!isValidIdCard(result)) {
                throw new IdCardException(errMes);
            }
        } catch (IdCardException e) {
            System.out.println(errMes);
            result = getValidIdCard(strDisplay, errMes);
        }
        return result;
    }

    public static boolean isValidEmail(String str) {
        pattern = "^[A-Za-z0-9+_.-]+@(.+)$";
        return str.matches(pattern);
    }

    public static String getValidEmail(String strDisplay, String errMes) {
        String result = null;
        System.out.println(strDisplay);
        try {
            result = ScannerUtils.scanner.nextLine();
            if (!isValidEmail(result)) {
                throw new EmailException(errMes);
            }
        } catch (EmailException e) {
            System.out.println(errMes);
            result = getValidEmail(strDisplay, errMes);
        }
        return result;
    }
}
