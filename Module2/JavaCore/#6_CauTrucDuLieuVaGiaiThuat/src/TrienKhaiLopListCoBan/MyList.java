package TrienKhaiLopListCoBan;

import java.util.Arrays;

public class MyList <E> {
    private int size = 0;
    private int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList(int size, int DEFAULT_CAPACITY, Object[] elements) {
        this.size = size;
        this.DEFAULT_CAPACITY = DEFAULT_CAPACITY;
        this.elements = elements;
    }


    //Constructor không có tham số
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //Phương thức tăng gấp đôi kích thước phần tử
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    //Phương thức thêm một phần tử vào cuối của danh sách
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    //Phương thức trả về phần tử vừa ở vị trí thứ i trong danh sách
    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
}
