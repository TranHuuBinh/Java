CREATE TABLE Khach
(
	MaKhach		varchar(5) NOT NULL PRIMARY KEY,
    TenKhach 	nvarchar(30) NOT NULL,
    DiaChi 		nvarchar(50),
    DienThoai	varchar(12)
);

CREATE TABLE NhanVien
(
	MaNV		varchar(5) NOT NULL PRIMARY KEY,
    TenNV		nvarchar(30) NOT NULL,
    GioiTinh	varchar(3) NOT NULL,
    DiaChi		nvarchar(50),
    DienThoai 	varchar(12),
    NgaySinh	date
);

CREATE TABLE HDBan
(
	MaHDBan		varchar(5) NOT NULL PRIMARY KEY,
    MaNhanVien	varchar(5) NOT NULL,
    NgayBan		date NOT NULL,
    MaKhach		varchar(5) NOT NULL,
    TongTien	decimal(15,2) NOT NULL,
    FOREIGN KEY (MaNhanVien) REFERENCES NhanVien (MaNV),
    FOREIGN KEY (MaKhach) REFERENCES Khach (MaKhach)
);

CREATE TABLE CTHDBan
(
	MaHDBan 	varchar(5) NOT NULL,
    MaHang		varchar(5) NOT NULL,
    SoLuong		int NOT NULL,
    DonGia		decimal(15,2) NOT NULL,
    ThanhTien	decimal(15,2) NOT NULL,
    PRIMARY KEY(MaHDBan,MaHang),
    FOREIGN KEY (MaHDBan) REFERENCES HDBan (MaHDBan),
    FOREIGN KEY (MaHang) REFERENCES Hang (MaHang)
);

CREATE TABLE Hang
(
	MaHang 		varchar(5) NOT NULL PRIMARY KEY,
    TenHang 	nvarchar(40) NOT NULL,
    SoLuong		int NOT NULL,
    DonGiaNhap	decimal(15,2) NOT NULL,
    DonGiaBan 	decimal(15,2) NOT NULL,
    GhiChu		nvarchar(50)
);

INSERT INTO Khach VALUES('K0001','Michael Jackon','America','0196857184');
INSERT INTO Khach VALUES('K0002','Mike Tompkin','Arab Saudi','012345678');
INSERT INTO Khach VALUES('K0003','Felix','Swedden','098765123');

INSERT INTO NhanVien VALUES('N0001','Jesus Christ',1,'112 Mandision Street','0666666666','1995/07/17');
INSERT INTO NhanVien VALUES('N0002','Budha Arist',0,'New York','0112233445','1993/02/25');
INSERT INTO NhanVien VALUES('N0003','Mandle Ahem',1,'Canadia','099775533','1992/03/06');

UPDATE NhanVien SET GioiTinh='Nam' WHERE MaNV='N0001';
UPDATE NhanVien SET GioiTinh='Nu' WHERE MaNV='N0002';
UPDATE NhanVien SET GioiTinh='Nam' WHERE MaNV='N0003';

INSERT INTO HDBan VALUES ('H0001','N0001','2018/07/15','K0001',1500000);
INSERT INTO HDBan VALUES ('H0002','N0002','2018/07/16','K0002',225000);
INSERT INTO HDBan VALUES ('H0003','N0003','2018/07/17','K0003',200000);

INSERT INTO CTHDBan VALUES ('H0001','M0001',15,10000,1500000);
INSERT INTO CTHDBan VALUES ('H0002','M0002',25,8000,225000);
INSERT INTO CTHDBan VALUES ('H0003','M0003',8,25000,200000);

INSERT INTO Hang VALUES ('M0001','Item 1',50,5000,10000,'');
INSERT INTO Hang VALUES ('M0002','Item 2',50,5000,8000,'');
INSERT INTO Hang VALUES ('M0003','Item 3',50,15000,25000,'');