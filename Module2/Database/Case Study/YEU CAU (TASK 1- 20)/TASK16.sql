-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019.
-- Không xóa những nhân viên chưa từng lập được hợp đồng - tùy cách hiểu của đề
-- ---------------------------------------------------------------------------------
use case_study_furama_resort;
-- -------------Tìm xem từ năm 2017 đến 2019 có nhân viên nào chưa lập dc hợp đồng--
select 
nhan_vien.id_nhan_vien, 
nhan_vien.ho_ten, 
hop_dong.id_hop_dong, 
hop_dong.ngay_lam_hop_dong 
from nhan_vien
left join hop_dong on hop_dong.id_nhan_vien = nhan_vien.id_nhan_vien
where not year(hop_dong.ngay_lam_hop_dong) between 2017 and 2019;
-- ---------------------------------------------------------------------------------
-- -------------Xóa trường bảo vệ khóa ngoại----------------------------------------
SET FOREIGN_KEY_CHECKS = 0;
-- -------------Xóa nhân viên theo yêu cầu------------------------------------------
delete from nhan_vien where nhan_vien.id_nhan_vien in (
	select hop_dong.id_nhan_vien
	from hop_dong
	where hop_dong.id_nhan_vien not IN (
		select hop_dong.id_nhan_vien
		from hop_dong
		where year(hop_dong.ngay_lam_hop_dong) between 2017 and 2019 order by id_nhan_vien
	)
);
-- -------------Thiết lập lại trường bảo vệ khóa ngoại-------------------------------
SET FOREIGN_KEY_CHECKS = 1;
