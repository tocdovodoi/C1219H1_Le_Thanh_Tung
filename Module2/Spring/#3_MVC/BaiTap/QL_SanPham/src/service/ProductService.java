package service;

import model.Product;

import java.util.List;

public interface ProductService {
    //    findAll(): Trả về danh sách tất cả sản phẩm
    List<Product> findAll();
    //    save(): Lưu một sản phẩm
    void save(Product product);
    //    findById(): Tìm một sản phẩm theo Id
    Product findById(int id);
    //    update(): Cập nhật thông tin của một sản phẩm
    void update(int id, Product product);
    //    remove(): Xoá một sản phẩm khỏi danh sách
    void remove(int id);
}
