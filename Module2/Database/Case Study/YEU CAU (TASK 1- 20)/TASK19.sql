-- 19.	Cập nhật giá cho các Dịch vụ đi kèm 
-- được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.
-- Làm 4 lần và đã update được 6 row
-- ------------------------------------------------------------
use case_study_furama_resort;
update dich_vu_di_kem 	inner join (select dich_vu_di_kem.ten_dich_vu_di_kem as ten_dich_vu_di_kem
									from hop_dong_chi_tiet 
									inner join dich_vu_di_kem on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
									group by dich_vu_di_kem.id_dich_vu_di_kem
									having count(hop_dong_chi_tiet.id_dich_vu_di_kem) >4) as temp
set dich_vu_di_kem.gia = dich_vu_di_kem.gia*2 
where dich_vu_di_kem.ten_dich_vu_di_kem = temp.ten_dich_vu_di_kem;
