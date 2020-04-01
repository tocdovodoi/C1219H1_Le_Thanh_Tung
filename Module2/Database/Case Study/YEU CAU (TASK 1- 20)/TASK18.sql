-- 18.	Xóa những khách hàng có hợp đồng trước năm 2016 
-- (chú ý ràng buộc giữa các bảng).
-- ---------------------------------------------------------------------------------
delete khach_hang,hop_dong,hop_dong_chi_tiet from khach_hang 
inner join hop_dong on hop_dong.id_khach_hang = khach_hang.id_khach_hang
inner join hop_dong_chi_tiet on hop_dong_chi_tiet.id_hop_dong = hop_dong.id_hop_dong
where not exists(select hop_dong.id_hop_dong 
			where year(hop_dong.ngay_lam_hop_dong) > 2016
			and khach_hang.id_khach_hang = hop_dong.id_khach_hang);