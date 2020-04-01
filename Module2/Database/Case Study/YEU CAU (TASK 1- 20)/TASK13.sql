-- 13.	Hiển thị thông tin các Dịch vụ đi kèm 
-- được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
-- --------------------------------------------------------------------
use case_study_furama_resort;
-- Tạo bảng tạm 1 -----------------------------------------------------
create temporary table temp 
select 
dich_vu_di_kem.ten_dich_vu_di_kem,
count(hop_dong_chi_tiet.id_dich_vu_di_kem) as so_lan_su_dung from hop_dong_chi_tiet
inner join dich_vu_di_kem on dich_vu_di_kem.id_dich_vu_di_kem = hop_dong_chi_tiet.id_dich_vu_di_kem
group by dich_vu_di_kem.ten_dich_vu_di_kem;
-- --------------------------------------------------------------------
select * from temp; -- select số lần sử dụng của bảng temp
-- Tạo bảng tạm 2 -----------------------------------------------------
create temporary table temp2
select max(temp.so_lan_su_dung) as max_so_lan_su_dung from temp;
select * from temp2;
-- --------------------------------------------------------------------
select * from temp
inner join temp2
on temp.so_lan_su_dung = temp2.max_so_lan_su_dung;
-- ---------------Sau khi tạo bảng tạm, xóa các bảng đó ---------------
drop temporary table temp;
drop temporary table temp2;



