create database case_study_furama_resort;
use case_study_furama_resort;
-- table nhan vien
CREATE TABLE nhan_vien (
	id_nhan_vien INT NOT NULL primary key auto_increment,
    ho_ten VARCHAR(45) NOT NULL,
    ngay_sinh DATE,
    cmnd_nhan_vien VARCHAR(45),
    luong VARCHAR(45),
    sdt VARCHAR(45),
    email VARCHAR(45),
    dia_chi VARCHAR(45),
	id_vi_tri INT NOT NULL,
    id_trinh_do INT NOT NULL,
    id_bo_phan INT NOT NULL
);

-- table vi tri
CREATE TABLE vi_tri (
	id_vi_tri INT NOT NULL primary key auto_increment,
    ten_vi_tri VARCHAR(45)
);

-- table trinh do
CREATE TABLE trinh_do (
	id_trinh_do INT NOT NULL primary key auto_increment,
    trinh_do VARCHAR(45)
);

-- table bo phan
CREATE TABLE bo_phan (
	id_bo_phan INT NOT NULL primary key auto_increment,
    ten_bo_phan VARCHAR(45)
);

-- table khach hang
CREATE TABLE khach_hang (
	id_khach_hang INT NOT NULL primary key auto_increment,
    ho_ten VARCHAR(45),
    ngay_sinh DATE,
    cmnd_khach_hang VARCHAR(45),
    sdt VARCHAR(45),
	email VARCHAR(45),
    dia_chi VARCHAR(45),
	id_loai_khach INT NOT NULL
);

-- table loai khach hang
CREATE TABLE loai_khach (
	id_loai_khach INT NOT NULL primary key auto_increment,
    ten_loai_khach VARCHAR(45)
);

-- table hop dong
CREATE TABLE hop_dong (
	id_hop_dong INT NOT NULL primary key auto_increment,
    ngay_lam_hop_dong DATE,
    ngay_ket_thuc DATE,
    tien_dat_coc INT,
	id_nhan_vien INT NOT NULL,
    id_khach_hang INT NOT NULL,
    id_dich_vu INT NOT NULL
);

-- table hop dong chi tiet
CREATE TABLE hop_dong_chi_tiet (
	id_hop_dong_chi_tiet INT NOT NULL primary key auto_increment,
    so_luong INT,
	id_hop_dong INT NOT NULL,
    id_dich_vu_di_kem INT NOT NULL
);

-- table dich vu
CREATE TABLE dich_vu (
	id_dich_vu INT NOT NULL primary key auto_increment,
    ten_dich_vu VARCHAR(45),
    dien_tich INT,
    so_tang INT,
    so_nguoi_toi_da INT,
    chi_phi_thue INT,
	trang_thai VARCHAR(45),
    id_kieu_thue INT NOT NULL,
    id_loai_dich_vu INT NOT NULL
);

-- table kieu thue
CREATE TABLE kieu_thue (
	id_kieu_thue INT NOT NULL primary key auto_increment,
    ten_kieu_thue VARCHAR(45),
    gia INT
);

-- table loai dich vu
CREATE TABLE loai_dich_vu (
	id_loai_dich_vu INT NOT NULL primary key auto_increment,
    ten_loai_dich_vu VARCHAR(45)
);

-- table dich vu di kem
CREATE TABLE dich_vu_di_kem (
	id_dich_vu_di_kem INT NOT NULL primary key auto_increment,
    ten_dich_vu_di_kem VARCHAR(45),
    gia INT,
    don_vi INT,
    trang_thai VARCHAR(45)
);

-- thiet lap khoa ngoai
-- table nhan_vien
alter table nhan_vien
add constraint fk_id_vi_tri foreign key (id_vi_tri) references vi_tri (id_vi_tri),
add constraint fk_id_trinh_do foreign key (id_trinh_do) references trinh_do (id_trinh_do),
add constraint fk_id_bo_phan foreign key (id_bo_phan) references bo_phan (id_bo_phan);
-- -------------------------
-- table hop_dong
alter table hop_dong
add constraint fk_id_nhan_vien foreign key (id_nhan_vien) references nhan_vien (id_nhan_vien),
add constraint fk_id_khach_hang foreign key (id_khach_hang) references khach_hang (id_khach_hang),
add constraint fk_id_dich_vu foreign key (id_dich_vu) references dich_vu (id_dich_vu);
-- -------------------------
-- table khach_hang
alter table khach_hang
add constraint fk_id_loai_khach foreign key (id_loai_khach) references loai_khach (id_loai_khach);
-- -------------------------
-- table dich_vu
alter table dich_vu
add constraint fk_id_kieu_thue foreign key (id_kieu_thue) references kieu_thue (id_kieu_thue),
add constraint fk_id_loai_dich_vu foreign key (id_loai_dich_vu) references loai_dich_vu (id_loai_dich_vu);
-- -------------------------
-- table hop_dong_chi_tiet
alter table hop_dong_chi_tiet
add constraint fk_id_hop_dong foreign key (id_hop_dong) references hop_dong (id_hop_dong),
add constraint fk_id_dich_vu_di_kem foreign key (id_dich_vu_di_kem) references dich_vu_di_kem (id_dich_vu_di_kem);
-- -------------------------

