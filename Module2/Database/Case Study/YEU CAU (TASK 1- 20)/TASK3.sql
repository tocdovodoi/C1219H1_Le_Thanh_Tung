-- 3.	Hiển thị thông tin của tất cả khách hàng 
-- có độ tuổi từ 18 đến 50 tuổi 
-- và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
-- --------------------------------------------
-- between lấy cả 18 và 50
-- in để nhóm các câu lệnh or
-- --------------------------------------------
use case_study_furama_resort;
select * from khach_hang
where
(year(curdate())- year(ngay_sinh) between 18 and 50)  and dia_chi in('Da Nang', 'Quang Tri')
