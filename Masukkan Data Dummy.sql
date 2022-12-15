/*MENGISI DATA*/
USE Perusahaan_Pizza
INSERT INTO Pegawai (Fullname, User_name, Pass_word)
VALUES ('Febrina Kurniawati', 'Febri Kurnia', 'KurniawatiFEBRI123'), 
('Heri Apriadi', 'Heri Apriadi', '000apriadi'),
('Yuliani Lestari', 'Yuliana', 'yuli14n4le5t4r1'),
('Raniya Farah', 'Raniya Farah', 'Raniya15'),
('Jamine Sarah', 'Jamine Farah', 'Sarah1543')


INSERT INTO Pembeli (Nama, Notelp, ALamat, User_name, Pass_word, Id_member)
VALUES ('Dewi Ratna', '082154878833', 'Jl. Kembang No.08, Blimbing, Kota Malang', 'Dewi Ratna', '123Dewi', 'M0001'),
('Sopyan Hadi', '083445636889', 'Jl. Ps.Gadang 7, Sukun, Kota Malang', 'Sopyan Hadi', 'Sopheeyan', 'M0002'),
('Irwan Suprapto', '087865554327', 'Jl. Cicukang 22-20, Arcamanik, Kota Bandung', 'Irwan Supraptohehe', 'IrwanSup!', NULL),
('Dedi Hermantole', '082333336547', 'Jl. Speedboat 16-2, Arcamanik, Kota Bandung', 'Dedi Hermantole', '0DediHHHH21', NULL),
('Sophia Sari', '082132725674', 'Gg. Dakota Raya No.106, Cicendo, Kota Bandung', 'Sophia Sari58', 'Itssophiaaa', NULL),
('Pandua Sahrial', '083243335698', 'Medong, Mekarjaya, Banten', 'Pandua Sahrial', 'panduaaaja87', NULL),
('Muhammad Idris', '082100003254', 'Jl. Kristal 5, Bandar Mataram, Lampung', 'Muhammad Idrisss', 'Middris!009', NULL),
('Fadhillah Sarifuddin', '098764532444', 'Jl. Simpang Kepuh, Sukun, Kota Malang', 'Fadhillah Sarifuddin', 'Fadhillahsecond34', 'M0003'),
('Fitri Hidayah', '085678465212', 'Sawojajar 2, Kedungkandang, Kota Malang', 'Fitri Hidayah', 'Fitrihidden099', 'M0004'),
('Wahyuni Lubis', '086324928883', 'Jl. Ikan Mas VI No.18, Lowokwaru, Kota Malang', 'Wahyuni Lubis', 'Wahyunicantikss@', 'M0005')

INSERT INTO Kartu_Member (Nama_lengkap, Tipe_member)
VALUES ('Dewi Ratna', 'Gold'),
('Sopyan Hadi', 'Platinum'),
('Fadhillah Sarifuddin', 'Platinum'),
('Ftiri Hidayah', 'Gold'),
('Wahyuni Lubis', 'Bronze')


INSERT INTO Menu (Nama, Harga)
VALUES ('Splitza Signature', '90000'),
('Splitza Classis', '80000'),
('Meat Lovers Chicken', '76000'),
('Pepperoni', '86000'),
('Super Supremen Chicken', '76000'),
('Beef Lasagna', '30000'),
('Beef Spagetthi', '45000'),
('Creamy Beef', '46000'),
('Chicken Aglio Olio Spagetthi', '57000'),
('Chicken Canelloni', '60000'),
('Tea', '15500'),
('Milk', '12000'),
('Lychee Tea', '20000'),
('Taro Milk', '25000'),
('Lemon tea', '7000')


INSERT INTO Bahan_baku (Nama, Harga)
VALUES('Tepung protein tinggi', '45000'),
('Tepung protein tinggi', '45000'),
('Ayama cincang', '35000'),
('Sosis', '20000'),
('Daging sapi giling', '50000'),
('Smoked beef', '30000'),
('Telur', '30000'),
('Saus bolognase', '34000'),
('Margarin', '15000'),
('Keju mozarella', '20000'),
('Teh Celup', '35000'),
('Buah leci', '10000'),
('Serbuk taro', '60000'),
('Susu cair', '15000'),
('Buah melon', '30000'),
('Buah lemon', '45000'),
('Buah jeruk', '30000'),
('Coklat bubuk', '30000'),
('Serbuk cappucino', '35000'),
('Air galon', '20000')

INSERT INTO Id_produk_Bahanbaku (Id_produk_Bahanbaku, Id_produk)
VALUES ('B0001', 'MN0001'), ('B0001', 'MN0002'), ('B0001', 'MN0003'), ('B0001', 'MN0004'), ('B0001', 'MN0005'), ('B0002', 'MN0001'), 
('B0002', 'MN0002'), ('B0002', 'MN0003'), ('B0002', 'MN0004'), ('B0002', 'MN0005'), ('B0003', 'MN0001'), ('B0003', 'MN0002'), ('B0003', 'MN0006'), 
('B0004', 'MN0007'), ('B0004', 'MN0008'), ('B0004', 'MN0009'), ('B0005', 'MN0006'), ('B0005', 'MN0007'), ('B0005', 'MN0008'), ('B0006', 'MN0009'), 
('B0006', 'MN0010'), ('B0007', 'MN0007'), ('B0007', 'MN0008'), ('B0008', 'MN0006'), ('B0008', 'MN0007'), ('B0008', 'MN0008'), ('B0008', 'MN0009'), 
('B0008', 'MN0010'), ('B0009', 'MN0006'), ('B0009', 'MN0007'), ('B0010', 'MN0003'), ('B0011', 'MN0011'), ('B0012', 'MN0013'), ('B0013', 'MN0014'), 
('B0014', 'MN0012'), ('B0015', 'MN0014'), ('B0016', 'MN0015'), ('B0017', 'MN0012'), ('B0018', 'MN0011'), ('B0018', 'MN0012'), ('B0019', 'MN0013'), 
('B0019', 'MN0014'), ('B0020', 'MN0011'), ('B0020', 'MN0012'), ('B0020', 'MN0013'), ('B0020', 'MN0014'), ('B0020', 'MN0015')

INSERT INTO Pembayaran (Metode_pembayaran)
VALUES ('Kartu Member'), ('Kartu Member'), ('Mandiri'), ('BCA'), ('BCA'), ('Mandiri'), ('Dana e-wallet'), ('Kartu Member'), ('Kartu Member'), ('Kartu Member') 


INSERT INTO Delivery_Boy (Nama_dboy, No_telpdboy, Plat_kendaraan)
VALUES ('Rachmat Said', '082132729877', 'N 5683 ACD'), 
('Dedi Surajat', '082367665498', 'D 8864 EAK'), 
('Asep Nana Sehendi', '082135669863', 'BE 7324 SU'), 
('Dodi Rochman', '089007845673', 'A 6759 WO'), 
('hariono Bala', '082132524328', 'B 5032 SW') 

INSERT INTO Pesanan(Tanggal_pesanan, Tanggal_pengiriman, Id_pembayaran, Id_pembeli, Id_dboy, Id_pegawai, Id_member)
VALUES ('15 September 2022', '15 September 2022', '000-0001', 'PB0001', 'DB0001', 'PG0004', 'M0001'),
('15 September 2022', '15 September 2022', '000-0002', 'PB0002', 'DB0001', 'PG0004', 'M0001'),
('15 September 2022', '15 September 2022', '000-0003', 'PB0003', 'DB0002', 'PG0004', 'M0002'),
('15 September 2022', '15 September 2022', '000-0004', 'PB0004', 'DB0002', 'PG0004', NULL),
('16 September 2022', '16 September 2022', '000-0005', 'PB0005', 'DB0002', 'PG0001', NULL),
('16 September 2022', '16 September 2022', '000-0006', 'PB0006', 'DB0004', 'PG0001', NULL),
('17 September 2022', '17 September 2022', '000-0007', 'PB0007', 'DB0003', 'PG0003', NULL),
('18 September 2022', '18 September 2022', '000-0008', 'PB0008', 'DB0001', 'PG0002', 'M0003'),
('18 September 2022', '18 September 2022', '000-0009', 'PB0009', 'DB0001', 'PG0002', 'M0004'),
('18 September 2022', '18 September 2022', '000-0010', 'PB0010', 'DB0001', 'PG0002', 'M0005')


INSERT INTO Id_produk_Pesanan (Id_produk_Pesanan, Id_produk)
VALUES ('P0001', 'MN0001'), ('P0001', 'MN0012'), ('P0002', 'MN0003'), ('P0003', 'MN0007'), ('P0003', 'MN0012'), 
('P0004', 'MN0006'), ('P0004', 'MN0015'), ('P0005', 'MN0005'), ('P0005', 'MN0001'), ('P0006', 'MN0014'), 
('P0007', 'MN0009'), ('P0007', 'MN0013'), ('P0008', 'MN0013'), ('P0009', 'MN0005'), ('P0009', 'MN0011'), 
('P0010', 'MN0007'), ('P0010', 'MN0011') 