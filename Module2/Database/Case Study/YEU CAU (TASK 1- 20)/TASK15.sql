-- 15.	Hiển thi thông tin của tất cả nhân viên 
-- bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi 
-- mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.
-- ------------------------------------------------------------------
use case_study_furama_resort;
select 
nhan_vien.id_nhan_vien,
nhan_vien.ho_ten as ho_ten_nhan_vien,
trinh_do.trinh_do,
bo_phan.ten_bo_phan,
nhan_vien.sdt,
nhan_vien.dia_chi,
count(hop_dong.id_nhan_vien) as so_lan_tao_hop_dong
from nhan_vien
inner join hop_dong on hop_dong.id_nhan_vien = nhan_vien.id_nhan_vien
inner join bo_phan on bo_phan.id_bo_phan = nhan_vien.id_bo_phan
inner join trinh_do on trinh_do.id_trinh_do = nhan_vien.id_trinh_do
where hop_dong.ngay_lam_hop_dong between '2018-01-01' and '2019-12-31'
group by nhan_vien.ho_ten
having so_lan_tao_hop_dong <=3
