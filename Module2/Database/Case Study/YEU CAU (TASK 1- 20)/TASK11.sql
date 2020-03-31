-- 11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng 
-- có TenLoaiKhachHang là “Silver” 
-- và có địa chỉ là “Da Nang” hoặc “Lam Dong”.
-- -------------------Đề bị sửa đổi chút ít do thiếu database---------------------
use case_study_furama_resort;
select 
khach_hang.id_khach_hang,
khach_hang.ho_ten,
khach_hang.dia_chi,
loai_khach.ten_loai_khach,
dich_vu_di_kem.id_dich_vu_di_kem, 
dich_vu_di_kem.ten_dich_vu_di_kem
from hop_dong
inner join khach_hang on khach_hang.id_khach_hang = hop_dong.id_khach_hang
inner join loai_khach on loai_khach.id_loai_khach = khach_hang.id_loai_khach
inner join hop_dong_chi_tiet on hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
inner join dich_vu_di_kem on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
where loai_khach.ten_loai_khach = 'Silver' and (khach_hang.dia_chi = 'Da Nang' or khach_hang.dia_chi = 'Lam Dong')