-- 7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
-- của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 
-- nhưng chưa từng được Khách hàng đặt phòng  trong năm 2019.
-- ----------------------------------------------------------------------------------------------
use case_study_furama_resort;
select 
dich_vu.id_dich_vu,
dich_vu.ten_dich_vu,
dich_vu.dien_tich,
dich_vu.so_nguoi_toi_da,
dich_vu.chi_phi_thue,
loai_dich_vu.ten_loai_dich_vu
from dich_vu
inner join loai_dich_vu 
on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
where exists 	(select hop_dong.id_hop_dong from hop_dong 
				 where year(hop_dong.ngay_lam_hop_dong) = '2018' 
				 and hop_dong.id_dich_vu = dich_vu.id_dich_vu)
and not exists 	(select hop_dong.id_hop_dong from hop_dong 
				 where year(hop_dong.ngay_lam_hop_dong) = '2019'
				 and hop_dong.id_dich_vu = dich_vu.id_dich_vu)
