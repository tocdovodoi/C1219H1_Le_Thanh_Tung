-- TASK 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống 
-- có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 ký tự.
-- ----------------------------------
use case_study_furama_resort;
select * 
from nhan_vien
-- {Tìm theo chữ cái đầu của ho_ten, câu lệnh dài}
-- where (ho_ten like 'H%' or ho_ten like 'T%' or ho_ten like 'K%') and length(ho_ten) <=15; 
-- -----------------------------------------------------------------------------------------
-- {Tìm theo chữ cái đầu của tên)
where ho_ten regexp '^([a-z][A-Z]+ ){1,}(H|T|K)+' and length(ho_ten) <=15; 
-- -----------------------------------------------------------------------------------------
-- {Tìm theo chữ cái đầu của ho_ten)
-- where ho_ten regexp '^(H|T|K)' and length(ho_ten) <=15;
-- -----------------------------------------------------------------------------------------
