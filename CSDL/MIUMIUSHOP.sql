CREATE DATABASE MIUMIUSHOP
GO

USE MIUMIUSHOP
GO

CREATE TABLE Slides(
	MaSlide int IDENTITY(1,1) PRIMARY KEY,
	TenSlide nvarchar(100),
	HinhAnh varchar(100),
	NoiDung nvarchar(300),
	Link nvarchar(100),
	TrangThai nvarchar(30)
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
	TenDangNhap varchar(30) UNIQUE NOT NULL,
	MatKhau varchar(30) NOT NULL,
	LoaiTaiKhoan varchar(10)
)

CREATE TABLE ThongTinLienHeShop(
	MaLienHeShop int PRIMARY KEY,
	DiaChi nvarchar(100),
	SoDienThoai varchar(10),
	TenShop nvarchar(300),
)


CREATE TABLE ThongTinLienHe_KhachHang(
	MaThongTinLienHe_KhachHang int IDENTITY(1,1) PRIMARY KEY,
	HoTen nvarchar(100),
	DiaChi nvarchar(300),
	SoDienThoai varchar(10),
)

CREATE TABLE HoaDon(
	MaHoaDon int IDENTITY(1,1) PRIMARY KEY,
	TongTien int,
	NgayLapHoaDon datetime,
	TrangThai nvarchar(30),
	MaThongTinLienHe_KhachHang int,
	ID int,
	FOREIGN KEY(ID) REFERENCES TaiKhoan(ID) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY(MaThongTinLienHe_KhachHang) REFERENCES ThongTinLienHe_KhachHang(MaThongTinLienHe_KhachHang) ON DELETE CASCADE ON UPDATE CASCADE
)

CREATE TABLE ChiTietHoaDon(
	MaHoaDon int,
	MaSanPham int,
	SoLuong int,
	FOREIGN KEY(MaHoaDon) REFERENCES HoaDon(MaHoaDon) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY(MaSanPham) REFERENCES SanPham(MaSanPham) ON DELETE CASCADE ON UPDATE CASCADE,
	PRIMARY KEY(MaHoaDon, MaSanPham)
)




INSERT INTO Slides VALUES('AAAA A', 'h01.png', 'Test thu', 'google.com', N'Hiển thị')
INSERT INTO Slides VALUES('BBBB BBB', 'h02.png', 'Test thu', 'google.com', N'Hiển thị')

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
SELECT * FROM ThongTinLienHe_KhachHang
SELECT * FROM ChiTietHoaDon
SELECT * FROM HoaDon


drop table Slides



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

INSERT INTO HoaDon(TongTien, NgayLapHoaDon, TrangThai, MaThongTinLienHe_KhachHang, ID) 
VALUES (18000, GETDATE(), N'Chờ xác nhận', 1, 26)


INSERT INTO ThongTinLienHe_KhachHang (DiaChi, SoDienThoai)
VALUES('111', '0000')

INSERT INTO ThongTinLienHe_KhachHang (DiaChi, SoDienThoai) VALUES('njjnljn', '0373559622')

SELect SCOPE_IDENTITY() AS 'maHoaDon'


SELECT HoaDon.MaHoaDon, HoaDon.TongTien, HoaDon.NgayLapHoaDon, HoaDon.TrangThai,
	SanPham.MaSanPham, SanPham.TenSanPham, SanPham.Gia, ThongTinLienHe_KhachHang.HoTen, 
	ThongTinLienHe_KhachHang.MaThongTinLienHe_KhachHang, ThongTinLienHe_KhachHang.DiaChi, ThongTinLienHe_KhachHang.SoDienThoai, ChiTietHoaDon.SoLuong
FROM HoaDon INNER JOIN ThongTinLienHe_KhachHang ON HoaDon.MaThongTinLienHe_KhachHang = ThongTinLienHe_KhachHang.MaThongTinLienHe_KhachHang
INNER JOIN ChiTietHoaDon ON HoaDon.MaHoaDon = ChiTietHoaDon.MaHoaDon
INNER JOIN SanPham ON SanPham.MaSanPham = ChiTietHoaDon.MaSanPham
WHERE HoaDon.MaHoaDon = 5


UPDATE HoaDon SET HoaDon.NgayLapHoaDon = N'Xác nhận' WHERE HoaDon.MaHoaDon = 1

UPDATE ThongTinLienHe_KhachHang SET HoTen = '', DiaChi ='', SoDienThoai = '' WHERE MaThongTinLienHe_KhachHang = 1

SELECT TOP 3 * FROM SanPham WHERE NoiBat = 1

UPDATE SanPham 
SET TenSanPham = N'Trà ô long 2', HinhAnh = 'h01.png', Gia = 2000, MoTa = N'Mô tả ô long', NgayCapNhat = GETDATE(), SanPhamMoi = 1, NoiBat = 1, MaLoaiSanPham = 13 
WHERE MaSanPham = 2