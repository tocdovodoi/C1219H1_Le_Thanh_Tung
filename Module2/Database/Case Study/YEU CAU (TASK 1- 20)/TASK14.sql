-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung.
-- ----------------------------------------------------------------------------------------
use case_study_furama_resort;
select 
hop_dong.id_hop_dong,
loai_dich_vu.ten_loai_dich_vu,
dich_vu_di_kem.ten_dich_vu_di_kem,
count(hop_dong_chi_tiet.id_dich_vu_di_kem) as so_lan_su_dung
from hop_dong
inner join dich_vu on dich_vu.id_dich_vu = hop_dong.id_dich_vu
inner join loai_dich_vu on loai_dich_vu.id_loai_dich_vu = dich_vu.id_loai_dich_vu
inner join hop_dong_chi_tiet on hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
inner join dich_vu_di_kem on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
group by dich_vu_di_kem.ten_dich_vu_di_kem 
having so_lan_su_dung = 1;
