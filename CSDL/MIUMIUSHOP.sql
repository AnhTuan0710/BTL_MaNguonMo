CREATE DATABASE MIUMIUSHOP
GO

USE MIUMIUSHOP
GO

CREATE TABLE Slides(
	MaSlide int PRIMARY KEY,
	TenSlide nvarchar(100),
	HinhAnh varchar(100),
	NoiDung nvarchar(300),
	Link nvarchar(100),
	TrangThai varchar(30)
)

CREATE TABLE LoaiSanPham(
	MaLoaiSanPham int PRIMARY KEY,
	TenLoaiSanPham nvarchar(100)
)

CREATE TABLE MENU(
	MaDanhMuc int PRIMARY KEY,
	TenDanhMuc nvarchar(30),
	Link varchar(100)
)


CREATE TABLE SanPham(
	MaSanPham int PRIMARY KEY,
	TenSanPham nvarchar(30),
	HinhAnh varchar(30),
	Gia int,
	GiaGiam int,
	SoLuongCon int,
	MoTa nvarchar(300),
	NgayTao datetime,
	NgayCapNhat datetime,
	SanPhamMoi BIT,
	NoiBat BIT,
	MaLoaiSanPham int,
	FOREIGN KEY(MaLoaiSanPham) REFERENCES LoaiSanPham(MaLoaiSanPham) ON DELETE CASCADE ON UPDATE CASCADE
)


CREATE TABLE TaiKhoan(
	ID int IDENTITY(1,1) PRIMARY KEY,
	TenDangNhap varchar(30) UNIQUE,
	MatKhau varchar(30),
	LoaiTaiKhoan varchar(10)
)

CREATE TABLE ThongTinLienHeShop(
	MaLienHeShop int PRIMARY KEY,
	DiaChi nvarchar(100),
	SoDienThoai varchar(10),
	TenShop nvarchar(300),
)

CREATE TABLE HoaDon(
	MaHoaDon int IDENTITY(1,1) PRIMARY KEY,
	TongTien int,
	NgayLapHoaDon datetime,
	TrangThai nvarchar(30),
	MaThongTinLienHe_KhachHang int,
	ID int,
	FOREIGN KEY(ID) REFERENCES TaiKhoan(ID) ON DELETE CASCADE ON UPDATE CASCADE
)

CREATE TABLE ChiTietHoaDon(
	MaHoaDon int,
	MaSanPham int,
	SoLuong int,
	FOREIGN KEY(MaHoaDon) REFERENCES HoaDon(MaHoaDon) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY(MaSanPham) REFERENCES SanPham(MaSanPham) ON DELETE CASCADE ON UPDATE CASCADE,
	PRIMARY KEY(MaHoaDon, MaSanPham)
)

CREATE TABLE ThongTinLienHe_KhachHang(
	MaThongTinLienHe_KhachHang int IDENTITY(1,1) PRIMARY KEY,
	DiaChi nvarchar(300),
	SoDienThoai varchar(10),
	MaHoaDon int,
	FOREIGN KEY(MaHoaDon) REFERENCES HoaDon(MaHoaDon) ON DELETE CASCADE ON UPDATE CASCADE
)


CREATE TABLE NguoiDung(
	MaNguoiDung int PRIMARY KEY,
	HoTen nvarchar(30),
	DiaChi nvarchar(300),
	SoDienThoai char(10),
	Email varchar(30),
	ID int,
	FOREIGN KEY(ID) REFERENCES TaiKhoan(ID) ON DELETE CASCADE ON UPDATE CASCADE
)












CREATE TABLE MangXaHoi(
	MaMangXaHoi int PRIMARY KEY,
	Ten nvarchar(30),
	Link varchar(300),
	MaLienHeShop int,
	FOREIGN KEY(MaLienHeShop) REFERENCES LienHeShop(MaLienHeShop) ON DELETE CASCADE ON UPDATE CASCADE,
)



INSERT INTO Slides VALUES(1, 'AAAA A', 'h01.png', 'Test thu', 'google.com', 'hien thi')
INSERT INTO Slides VALUES(2, 'BBBB BBB', 'h02.png', 'Test thu', 'google.com', 'hien thi')

INSERT INTO LoaiSanPham VALUES(11, N'Đồ ăn nhanh')
INSERT INTO LoaiSanPham VALUES(12, N'Đồ uống')
INSERT INTO LoaiSanPham VALUES(13, N'Cơm')

INSERT INTO MENU VALUES(1, N'Trang chủ','')
INSERT INTO MENU VALUES(2, N'Sản phẩm','')
INSERT INTO MENU VALUES(3, N'Giỏ hàng','')
INSERT INTO MENU VALUES(4, N'Bài viết','')
INSERT INTO MENU VALUES(5, N'Liên hệ','')

INSERT INTO SanPham VALUES(1, N'Trà sữa', 'h01.png', 12000, 10000, 9999, N'mô tả trà sữa', GETDATE(), GETDATE(), 1, 1, 12)
INSERT INTO SanPham VALUES(2, N'Trà đào', 'h02.png', 12000, 10000, 9999, N'mô tả trà đào', GETDATE(), GETDATE(), 1, 1, 12)
INSERT INTO SanPham VALUES(3, N'Trà ô long', 'h01.png', 12000, 10000, 9999, N'mô tả trà ô long', GETDATE(), GETDATE(), 1, 1, 12)
INSERT INTO SanPham VALUES(4, N'Chân gà nướng', 'h01.png', 8000, 10000, 9999, N'mô tả chân gà nướng', GETDATE(), GETDATE(), 1, 1, 11)
INSERT INTO SanPham VALUES(5, N'Bánh bao', 'h01.png', 10000, 10000, 9999, N'mô tả bánh bao', GETDATE(), GETDATE(), 1, 1, 11)
INSERT INTO SanPham VALUES(6, N'Nem rán', 'h01.png', 10000, 10000, 9999, N'mô tả gà rán', GETDATE(), GETDATE(), 1, 1, 11)
INSERT INTO SanPham VALUES(7, N'Cơm rang', 'h02.png', 25000, 25000, 9999, N'mô tả cơm', GETDATE(), GETDATE(), 1, 1, 13)
INSERT INTO SanPham VALUES(8, N'Cơm sườn', 'h01.png', 12000, 10000, 9999, N'mô tả cơm sườn', GETDATE(), GETDATE(), 1, 1, 13)
INSERT INTO SanPham VALUES(9, N'Trà sữa', 'h01.png', 12000, 10000, 9999, N'mô tả trà sữa', GETDATE(), GETDATE(), 1, 1, 12)
INSERT INTO SanPham VALUES(10, N'Trà sữa', 'h01.png', 12000, 10000, 9999, N'mô tả trà sữa', GETDATE(), GETDATE(), 1, 1, 12)
INSERT INTO SanPham VALUES(11, N'Trà sữa', 'h01.png', 12000, 10000, 9999, N'mô tả trà sữa', GETDATE(), GETDATE(), 1, 1, 12)
INSERT INTO SanPham VALUES(12, N'Trà sữa', 'h01.png', 12000, 10000, 9999, N'mô tả trà sữa', GETDATE(), GETDATE(), 1, 1, 12)
INSERT INTO SanPham VALUES(13, N'Trà sữa', 'h01.png', 12000, 10000, 9999, N'mô tả trà sữa', GETDATE(), GETDATE(), 1, 1, 12)
INSERT INTO SanPham VALUES(14, N'Trà sữa', 'h01.png', 12000, 10000, 9999, N'mô tả trà sữa', GETDATE(), GETDATE(), 1, 1, 12)
INSERT INTO SanPham VALUES(15, N'Trà sữa', 'h01.png', 12000, 10000, 9999, N'mô tả trà sữa', GETDATE(), GETDATE(), 1, 1, 12)
INSERT INTO SanPham VALUES(16, N'Trà sữa', 'h01.png', 12000, 10000, 9999, N'mô tả trà sữa', GETDATE(), GETDATE(), 1, 1, 12)
INSERT INTO SanPham VALUES(17, N'Trà sữa', 'h01.png', 12000, 10000, 9999, N'mô tả trà sữa', GETDATE(), GETDATE(), 1, 1, 12)
INSERT INTO SanPham VALUES(18, N'Trà sữa', 'h01.png', 12000, 10000, 9999, N'mô tả trà sữa', GETDATE(), GETDATE(), 1, 1, 12)
INSERT INTO SanPham VALUES(19, N'Trà sữa', 'h01.png', 12000, 10000, 9999, N'mô tả trà sữa', GETDATE(), GETDATE(), 1, 1, 12)
INSERT INTO SanPham VALUES(20, N'Trà sữa', 'h01.png', 12000, 10000, 9999, N'mô tả trà sữa', GETDATE(), GETDATE(), 1, 1, 12)
INSERT INTO SanPham VALUES(21, N'Trà sữa', 'h01.png', 12000, 10000, 9999, N'mô tả trà sữa', GETDATE(), GETDATE(), 1, 1, 12)
INSERT INTO SanPham VALUES(22, N'Trà sữa', 'h01.png', 12000, 10000, 9999, N'mô tả trà sữa', GETDATE(), GETDATE(), 1, 1, 12)
INSERT INTO SanPham VALUES(23, N'Trà sữa', 'h01.png', 12000, 10000, 9999, N'mô tả trà sữa', GETDATE(), GETDATE(), 1, 1, 12)
INSERT INTO SanPham VALUES(24, N'Trà sữa16', 'h01.png', 12000, 10000, 9999, N'mô tả trà sữa', GETDATE(), GETDATE(), 1, 1, 12)
INSERT INTO SanPham VALUES(25, N'Trà sữa17', 'h01.png', 12000, 10000, 9999, N'mô tả trà sữa', GETDATE(), GETDATE(), 1, 1, 12)

INSERT INTO ThongTinLienHeShop VALUES(1, N'Bắc Từ Liêm, Hà Nội', '0982646116', N'MIUMIU Quán')

INSERT INTO TaiKhoan(TenDangNhap, MatKhau) VALUES('aa', '123')



SELECT * FROM Slides
SELECT * FROM LoaiSanPham
SELECT * FROM MENU
SELECT * FROM SanPham
SELECT * FROM TaiKhoan
SELECT * FROM ThongTinLienHeShop


drop table TaiKhoan



SELECT MaSanPham, TenSanPham, HinhAnh, Gia, GiaGiam, SoLuongCon, MoTa, NgayTao, NgayCapNhat, SanPhamMoi, NoiBat, LoaiSanPham.MaLoaiSanPham, LoaiSanPham.TenLoaiSanPham
FROM SanPham INNER JOIN LoaiSanPham ON SanPham.MaLoaiSanPham = LoaiSanPham.MaLoaiSanPham
WHERE SanPham.MaSanPham = 1


;WITH Results_CTE AS
(
    SELECT MaSanPham, TenSanPham, HinhAnh, Gia, GiaGiam, SoLuongCon, MoTa, NgayTao, NgayCapNhat, SanPhamMoi, NoiBat, LoaiSanPham.MaLoaiSanPham, LoaiSanPham.TenLoaiSanPham, ROW_NUMBER() OVER (ORDER BY MaSanPham) AS RowNum
    FROM SanPham INNER JOIN LoaiSanPham ON SanPham.MaLoaiSanPham = LoaiSanPham.MaLoaiSanPham
	WHERE LoaiSanPham.MaLoaiSanPham = 12
)
SELECT *
FROM Results_CTE
WHERE RowNum >= 9
AND RowNum < 9 + 9

SELECT * FROM taiKhoan WHERE TenDangNhap = 'aaa' AND MatKhau = '123'



;WITH Results_CTE AS   
(  
    SELECT MaSanPham, TenSanPham, HinhAnh, Gia, GiaGiam, SoLuongCon, MoTa, NgayTao, NgayCapNhat, SanPhamMoi, NoiBat, LoaiSanPham.MaLoaiSanPham, LoaiSanPham.TenLoaiSanPham, ROW_NUMBER() OVER (ORDER BY MaSanPham, LoaiSanPham.MaLoaiSanPham) AS RowNum   
    FROM SanPham INNER JOIN LoaiSanPham ON SanPham.MaLoaiSanPham = LoaiSanPham.MaLoaiSanPham   
 	 WHERE LoaiSanPham.MaLoaiSanPham = 12    
)  
SELECT *  
FROM Results_CTE   
WHERE RowNum >=   19   
AND RowNum <=   (25);
