package Controllers;

import Commons.FuncGeneric;
import Models.Employee;

import java.util.*;

import static Controllers.MainController.backMainMenu;

public class EmployeeController {

    //Show Information of Employee
    public static void showInformationEmployee() {
        ArrayList<Employee> employeeList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.EMPLOYEE);
        Map<String, Employee> map = new HashMap<>();
        for (Employee employee : employeeList) {
            map.put(employee.getId(), employee);
        }
        displayMap(map);
        backMainMenu();
    }

    public static void displayMap(Map<String, Employee> map) {
        for (Map.Entry m : map.entrySet()) {
            System.out.println("key" + m.getKey() +
            "\n" + m.getValue().toString());
        }
    }
}
