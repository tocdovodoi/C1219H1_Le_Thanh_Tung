-- 10.	Hiển thị thông tin tương ứng với từng Hợp đồng 
-- thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, SoLuongDichVuDiKem 
-- (được tính dựa trên việc count các IDHopDongChiTiet).
-- ------------------------------------------------------------------------------------------------
use case_study_furama_resort;
select 
hop_dong.id_hop_dong, 
hop_dong.ngay_lam_hop_dong, 
hop_dong.ngay_ket_thuc, 
hop_dong.tien_dat_coc,
count(dich_vu_di_kem.id_dich_vu_di_kem) as so_luong_dich_vu_di_kem
from hop_dong
inner join hop_dong_chi_tiet on hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
inner join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
group by hop_dong.id_hop_dong