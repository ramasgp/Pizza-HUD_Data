/*CREATE DATABASE*/
CREATE DATABASE Perusahaan_Pizza

/*USE DATABASE*/
USE Perusahaan_Pizza

/*CREATE Relasi Pegawai*/
CREATE TABLE Pegawai (
ID int identity(1, 1) NOT NULL,
Id_pegawai as convert(varchar(30), ('PG' + right('0000' + cast(ID as varchar(4)), 4)))persisted not null primary key,
Fullname varchar(50) NOT NULL,
User_name varchar(30) NOT NULL,
Pass_word varchar(30) NOT NULL
)

/*CREATE Relasi Kartu Member*/
CREATE TABLE Kartu_Member (
ID int identity(1, 1) NOT NULL,
Id_member  as convert(varchar(30),('M' + right('0000' + cast(ID as varchar(4)), 4)))persisted not null primary key,
Nama_lengkap varchar(30) NOT NULL,
Tipe_member varchar(30) NOT NULL
)

/*CREATE Relasi Pembayaran*/
CREATE TABLE Pembayaran (
ID int identity(1, 1) NOT NULL,
Id_pembayaran as convert(varchar(30), ('000-' + right('0000' + cast(ID as varchar(4)), 4)))persisted not null primary key,
Metode_pembayaran varchar(30) NOT NULL
)

/*CREATE Relasi Delivery Boy*/
CREATE TABLE Delivery_Boy (
ID int identity(1, 1) NOT NULL,
Id_dboy as convert(varchar(30), ('DB' + right('0000' + cast(ID as varchar(4)), 4)))persisted not null primary key,
Nama_dboy varchar(30) NOT NULL,
No_telpdboy varchar(12) NOT NULL,
Plat_kendaraan varchar(20) NOT NULL
)

/*CREATE Relasi Generalization Menu*/
CREATE TABLE Menu (
ID int identity(1, 1) NOT NULL,
Id_produk as convert(varchar(30), ('MN' + right('0000' + cast(ID as varchar(4)), 4)))persisted not null primary key,
Nama varchar(30) NOT NULL,
Harga varchar(30) NOT NULL
)

/*CREATE Relasi Bahan Baku*/
CREATE TABLE Bahan_baku (
ID int identity(1, 1) NOT NULL,
Id_bahanbaku as convert(varchar(30), ('B' + right('0000' + cast(ID as varchar(4)), 4)))persisted not null primary key,
Nama varchar(30) NOT NULL,
Harga varchar(30) NOT NULL
)

/*CREATE Relasi Id_produk_Bahanbaku*/
CREATE TABLE Id_produk_Bahanbaku (
ID int identity(1, 1) NOT NULL,
Id_produk_Bahanbaku varchar(30) NOT NULL FOREIGN KEY REFERENCES Bahan_baku(Id_bahanbaku),
Id_produk varchar(30) NOT NULL FOREIGN KEY REFERENCES Menu(Id_produk),
PRIMARY KEY (Id_produk_Bahanbaku, Id_produk)
)

/*CREATE Relasi Pembeli*/
CREATE TABLE Pembeli (
ID int identity(1, 1) NOT NULL,
Id_pembeli as  convert(varchar(30), ('PB' + right('0000' + cast(ID as varchar(4)), 4)))persisted not null primary key,
Nama varchar(255) NOT NULL,
Notelp varchar(12) NOT NULL,
Alamat varchar(50) NOT NULL,
User_name varchar(30) NOT NULL,
Pass_word varchar(30) NOT NULL,
Id_member varchar(30) FOREIGN KEY REFERENCES Kartu_Member(Id_member)
)

/*CREATE Relasi Id_Produk_Pembeli*/
CREATE TABLE Id_Produk_Pembeli (
ID int identity(1, 1) NOT NULL,
Id_produk_Pembeli varchar(30) NOT NULL FOREIGN KEY REFERENCES Pembeli(Id_pembeli),
Id_produk varchar(30) NOT NULL FOREIGN KEY REFERENCES Menu(Id_produk),
PRIMARY KEY (Id_produk_Pembeli, Id_produk)
)

/*CREATE Relasi Pesanan*/
CREATE TABLE Pesanan (
ID int identity(1, 1) NOT NULL,
Id_pesanan  as  convert(varchar(30), ('P' + right('0000' + cast(ID as varchar(4)), 4)))persisted not null primary key,
Tanggal_pesanan datetime NOT NULL,
Tanggal_pengiriman datetime NOT NULL,
Id_pembayaran varchar(30) FOREIGN KEY REFERENCES Pembayaran(Id_pembayaran),
Id_pembeli varchar(30) FOREIGN KEY REFERENCES Pembeli(Id_pembeli),
Id_dboy varchar(30) FOREIGN KEY REFERENCES Delivery_Boy(Id_dboy),
Id_pegawai varchar(30) FOREIGN KEY REFERENCES Pegawai(Id_pegawai),
Id_member varchar(30) FOREIGN KEY REFERENCES Kartu_Member(Id_member)
)

/*CREATE Relasi Id_produk_Pesanan*/
CREATE TABLE Id_produk_Pesanan (
ID int identity(1, 1) NOT NULL,
Id_produk_Pesanan varchar(30) NOT NULL FOREIGN KEY REFERENCES Pesanan(Id_pesanan),
Id_produk varchar(30) NOT NULL FOREIGN KEY REFERENCES Menu(Id_produk),
PRIMARY KEY (Id_produk_Pesanan, Id_produk)
)

