-- 6.	Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue, TenLoaiDichVu 
-- của tất cả các loại Dịch vụ chưa từng được Khách hàng thực hiện 
-- đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
-- ----------------------------------------------------------------------
-- Yêu cầu phải inner join table dich_vu và table hop_dong, loai_dich_vu
-- ----------------------------------------------------------------------
use case_study_furama_resort;
-- select 
-- dich_vu.id_dich_vu,
-- dich_vu.ten_dich_vu,
-- dich_vu.dien_tich,
-- dich_vu.chi_phi_thue,
-- loai_dich_vu.ten_loai_dich_vu
-- from dich_vu
-- inner join loai_dich_vu
-- on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
-- inner join hop_dong
-- on dich_vu.id_dich_vu = hop_dong.id_dich_vu
-- where not hop_dong.ngay_lam_hop_dong between '2019-01-01' and '2019-03-31'
----------------------------------------------------------------------
-- Dùng exists kết quả tương tự
select 
dich_vu.id_dich_vu,
dich_vu.ten_dich_vu,
dich_vu.dien_tich,
dich_vu.chi_phi_thue,
loai_dich_vu.ten_loai_dich_vu
from dich_vu
inner join loai_dich_vu
on dich_vu.id_loai_dich_vu = loai_dich_vu.id_loai_dich_vu
where not exists(select hop_dong.id_dich_vu 
				 from hop_dong 
                 where (hop_dong.ngay_lam_hop_dong between '2019-01-01' and '2019-03-31')
                 and hop_dong.id_dich_vu = dich_vu.id_dich_vu);
