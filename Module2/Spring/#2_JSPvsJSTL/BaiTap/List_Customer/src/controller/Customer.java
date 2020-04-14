package controller;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String birthday;
    private String Address;
    private String image;
    private static List<Customer> list;

    static {
        list = new ArrayList<>();
        list.add(new Customer("Mai Văn Hoàn","1983-08-20","Hà Nội","/dđ"));
        list.add(new Customer("Nguyễn Văn Nam","1983-08-21","Bắc Giang","/ddd"));
        list.add(new Customer("Nguyễn Thái Hòa","1983-08-22","Nam Định","/ddd"));
        list.add(new Customer("Trần Đăng Khoa","1983-08-23","Hà Tây","/ddd"));
        list.add(new Customer("Nguyễn Đình Thi","1983-08-24","Hà Nội","/ddd"));
    }

    public Customer() {
    }

    public Customer(String name, String birthday, String address, String image) {
        this.name = name;
        this.birthday = birthday;
        Address = address;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public static List<Customer> getList() {
        return list;
    }

    public static void setList(List<Customer> list) {
        Customer.list = list;
    }
}
