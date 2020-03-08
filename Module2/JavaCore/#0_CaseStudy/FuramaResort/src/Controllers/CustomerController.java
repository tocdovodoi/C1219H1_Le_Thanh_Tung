package Controllers;

import Commons.FuncGeneric;
import Commons.FuncValidation;
import Commons.FuncWireAndReadFileCSV;
import Commons.ScannerUtils;
import Models.Customer;

import java.util.ArrayList;

import static Controllers.MainController.backMainMenu;
import static Controllers.ServiceController.*;

public class CustomerController {

    //Add New Customer
    public static void addNewCustomer() {
        Customer customer = new Customer();

        //Set name customer
        customer.setFullName(FuncValidation.getValidCustomerName(ENTER_CUSTOMER_NAME, INVALID_CUSTOMER_NAME));

        //Set birthday customer
        customer.setBirthday(FuncValidation.getValidbirthday(ENTER_CUSTOMER_BIRTHDAY,INVALID_CUSTOMER_BIRTHDAY));

        //Set Gender
        String gender = FuncValidation.getValidGender(ENTER_CUSTOMER_GENDER, INVALID_CUSTOMER_GENDER);
        customer.setGender(Character.toUpperCase(gender.charAt(0)) + gender.substring(1,gender.length()).toLowerCase());

        //Set id Card
        customer.setIdCard(FuncValidation.getValidIdCard(ENTER_CUSTOMER_IDCARD, INVALID_CUSTOMER_IDCARD));

        //Set phone
        System.out.println("Nhập số điện thoại");
        customer.setPhone(ScannerUtils.scanner.nextLine());

        //Set email
        customer.setEmail(FuncValidation.getValidEmail(ENTER_CUSTOMER_EMAIL, INVALID_CUSTOMER_EMAIL));

        //Set type Customer
        System.out.println("Nhập kiểu customer");
        customer.setCustomerType(ScannerUtils.scanner.nextLine());

        //Set address
        System.out.println("Nhập địa chỉ");
        customer.setAddress(ScannerUtils.scanner.nextLine());

        //Get list Customer from CSV
        ArrayList<Customer> customerList = FuncGeneric.getListFromCSV(FuncGeneric.EntityType.CUSTOMER);

        //add customer to list
        customerList.add(customer);

        //write file CSV
        FuncWireAndReadFileCSV.writeCustomerToFileCsv(customerList);

        System.out.println("----------Add Customer: " + customer.getFullName() + " Successfully ");
        backMainMenu();
    }

    //Show Information of Customer
    public static void showInformationCustomer() {

    }
}
