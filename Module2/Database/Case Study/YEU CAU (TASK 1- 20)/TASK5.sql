-- 5.	Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong, TenDichVu, NgayLamHopDong, NgayKetThuc, TongTien 
-- (Với TongTien được tính theo công thức như sau: ChiPhiThue + SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) 
-- cho tất cả các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
-- --------------------------------------------------------------------------------------------------------------------
-- yêu cầu phải dùng left join khach_hang với tất cả các table còn lại 
-- group by ho_ten và sắp sếp id_khach_hang
-- --------------------------------------------------------------------------------------------------------------------
use case_study_furama_resort;
select 
khach_hang.id_khach_hang,
khach_hang.ho_ten,
loai_khach.ten_loai_khach,
hop_dong.id_hop_dong,
dich_vu.ten_dich_vu,
hop_dong.ngay_lam_hop_dong,
hop_dong.ngay_ket_thuc,
hop_dong.tien_dat_coc,
dich_vu.chi_phi_thue+hop_dong_chi_tiet.so_luong*dich_vu_di_kem.gia as 'Tong tien'
from khach_hang
left join hop_dong
on khach_hang.id_khach_hang = hop_dong.id_khach_hang
left join dich_vu
on dich_vu.id_dich_vu = hop_dong.id_hop_dong
left join loai_khach
on khach_hang.id_loai_khach = loai_khach.id_loai_khach
left join hop_dong_chi_tiet
on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
left join dich_vu_di_kem
on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
group by ho_ten
order by id_khach_hang
