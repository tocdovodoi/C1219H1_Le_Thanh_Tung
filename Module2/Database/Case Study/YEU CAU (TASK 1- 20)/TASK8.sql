-- 8.	Hiển thị thông tin HoTenKhachHang có trong hệ thống, với yêu cầu HoThenKhachHang không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên
-- -------------------------------------------------------------------------------------------------------
use case_study_furama_resort;
-- Cách 1: distinct
select  distinct khach_hang.ho_ten from khach_hang
-- -------------------------------------------------------------------------------------------------------
-- Cách 2: Dùng distinctrow
-- select  distinctrow khach_hang.ho_ten from khach_hang
-- -------------------------------------------------------------------------------------------------------
-- Cách 3: Dùng group by
-- select khach_hang.ho_ten from khach_hang group by khach_hang.ho_ten
-- -------------------------------------------------------------------------------------------------------
-- Cách 4: Dùng union
-- select khach_hang.ho_ten from khach_hang union select khach_hang.ho_ten from khach_hang
-- -------------------------------------------------------------------------------------------------------


