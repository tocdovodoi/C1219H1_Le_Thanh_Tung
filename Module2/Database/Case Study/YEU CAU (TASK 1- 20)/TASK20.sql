-- 20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, 
-- thông tin hiển thị bao gồm ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.
use case_study_furama_resort;
select 
nhan_vien.id_nhan_vien as id,
nhan_vien.ho_ten as 'Họ tên',
nhan_vien.email,
nhan_vien.sdt,
nhan_vien.ngay_sinh as 'Ngày sinh',
nhan_vien.dia_chi as 'Địa chỉ',
'Nhân viên' as 'Ghi chú'
from nhan_vien
union all
select 
khach_hang.id_khach_hang as id,
khach_hang.ho_ten as 'Họ tên',
khach_hang.email,
khach_hang.sdt,
khach_hang.ngay_sinh as 'Ngày sinh',
khach_hang.dia_chi as 'Địa chỉ',
'Khách hàng' as 'Ghi chú'
from khach_hang