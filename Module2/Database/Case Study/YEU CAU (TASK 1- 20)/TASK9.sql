-- 9.	Thực hiện thống kê doanh thu theo tháng, 
-- nghĩa là tương ứng với mỗi tháng trong năm 2019 
-- thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
-- ---------------------------------------------------
use case_study_furama_resort;
select 
month(hop_dong.ngay_lam_hop_dong) as Thang_2019,
count(hop_dong.id_khach_hang) as So_khach_hang_dat_phong
from hop_dong
where year(hop_dong.ngay_lam_hop_dong) = 2019
group by month(hop_dong.ngay_lam_hop_dong) 
order by Thang_2019