-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
-- ----------------------------------------------------------------------------
-- Join 3 bảng khach_hangid_bo_phan, hop_dong, loai_khach
-- tìm những khách hàng Diamond
-- group by loai_khach 
-- count id_hop_dong để đếm số lần đặt phòng
-- ----------------------------------------------------------------------------
use case_study_furama_resort;
select khach_hang.id_khach_hang,khach_hang.ho_ten,loai_khach.ten_loai_khach,count(id_hop_dong) as 'số lần đặt phòng'
from khach_hang
inner join hop_dong
on khach_hang.id_khach_hang = hop_dong.id_khach_hang
inner join loai_khach
on khach_hang.id_loai_khach =loai_khach.id_loai_khach
where loai_khach.ten_loai_khach = 'Diamond'
group by hop_dong.id_khach_hang
