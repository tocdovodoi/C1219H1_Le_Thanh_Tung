-- 12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, 
-- SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem 
-- (được tính dựa trên tổng Hợp đồng chi tiết), 
-- TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 
-- nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019.
-- ---------------------------------------------------------------------------------------
use case_study_furama_resort;
select 
hop_dong.id_hop_dong,
nhan_vien.ho_ten as ho_ten_nhan_vien,
khach_hang.ho_ten as ho_ten_khach_hang,
khach_hang.sdt,
dich_vu.ten_dich_vu,
count(hop_dong_chi_tiet.id_dich_vu_di_kem) as so_luong_dich_vu_di_kem,
sum(hop_dong.tien_dat_coc) as tong_tien_dat_coc,
hop_dong.ngay_lam_hop_dong
from hop_dong
inner join nhan_vien on nhan_vien.id_nhan_vien = hop_dong.id_nhan_vien
inner join khach_hang on khach_hang.id_khach_hang = hop_dong.id_khach_hang
inner join dich_vu on dich_vu.id_dich_vu = hop_dong.id_dich_vu
inner join hop_dong_chi_tiet on hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
where exists 	(select hop_dong.id_hop_dong from hop_dong 
				 where hop_dong.ngay_lam_hop_dong between '2019-10-01' and '2019-12-31')
and not exists  (select hop_dong.id_hop_dong 
				 where hop_dong.ngay_lam_hop_dong between '2019-06-01' and '2019-06-30')