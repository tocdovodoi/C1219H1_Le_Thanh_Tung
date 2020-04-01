-- 17.	Cập nhật thông tin những khách hàng 
-- có TenLoaiKhachHang từ  Platinium lên Diamond, 
-- chỉ cập nhật những khách hàng đã từng đặt phòng 
-- với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.
-- ------------------------------------------------------------------
use case_study_furama_resort;
update khach_hang, (select hop_dong.id_khach_hang as id, sum(hop_dong.tong_tien) as tong_tien
					from hop_dong
                    where year(hop_dong.ngay_lam_hop_dong) = 2019
                    group by hop_dong.id_khach_hang
                    having tong_tien>100000000) as temp 
set khach_hang.id_loai_khach = (select loai_khach.id_loai_khach 
								from loai_khach 
                                where loai_khach.ten_loai_khach = 'Diamond')
where khach_hang.id_loai_khach = (select loai_khach.id_loai_khach 
								from loai_khach 
                                where loai_khach.ten_loai_khach = 'Platinium')
and temp.id = khach_hang.id_khach_hang;