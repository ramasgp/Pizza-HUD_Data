-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 19, 2023 at 04:43 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `siakad`
--

-- --------------------------------------------------------

--
-- Table structure for table `failed_jobs`
--

CREATE TABLE `failed_jobs` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `uuid` varchar(255) NOT NULL,
  `connection` text NOT NULL,
  `queue` text NOT NULL,
  `payload` longtext NOT NULL,
  `exception` longtext NOT NULL,
  `failed_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nama` varchar(255) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`id`, `nama`, `alamat`, `created_at`, `updated_at`) VALUES
(1, 'Cemani Viktor Saefullah', 'Kpg. Ters. Kiaracondong No. 920, Kendari 95237, Papua', NULL, NULL),
(2, 'Sari Anastasia Mardhiyah', 'Jln. Jend. A. Yani No. 897, Tangerang 39832, NTB', NULL, NULL),
(3, 'Maya Suryatmi M.M.', 'Gg. Achmad No. 127, Palopo 19214, Kaltara', NULL, NULL),
(4, 'Jessica Hariyah', 'Psr. Bah Jaya No. 254, Tangerang Selatan 88474, Kaltim', NULL, NULL),
(5, 'Yessi Pertiwi', 'Kpg. Nakula No. 737, Bitung 83952, Kalbar', NULL, NULL),
(6, 'Zamira Kiandra Wahyuni', 'Jr. Baladewa No. 355, Solok 25529, Kaltim', NULL, NULL),
(7, 'Imam Bagiya Napitupulu', 'Ki. Industri No. 193, Bengkulu 75742, Aceh', NULL, NULL),
(8, 'Jasmin Safitri', 'Ds. Lumban Tobing No. 871, Pagar Alam 35415, Malut', NULL, NULL),
(9, 'Nardi Gatra Santoso M.Farm', 'Gg. Warga No. 997, Sorong 53367, Gorontalo', NULL, NULL),
(10, 'Indah Yuliarti', 'Psr. Aceh No. 158, Surakarta 54574, Pabar', NULL, NULL),
(11, 'Citra Nasyiah', 'Jln. Salam No. 141, Pontianak 62084, Malut', NULL, NULL),
(12, 'Halima Melani S.IP', 'Gg. Bank Dagang Negara No. 443, Tangerang 31562, Babel', NULL, NULL),
(13, 'Ciaobella Rahmawati', 'Jln. Bakau Griya Utama No. 128, Denpasar 84744, Maluku', NULL, NULL),
(14, 'Bagya Manullang S.I.Kom', 'Psr. Ronggowarsito No. 484, Sabang 20353, Sultra', NULL, NULL),
(15, 'Luthfi Widodo', 'Ds. Bambon No. 109, Tangerang 27936, Riau', NULL, NULL),
(16, 'Vega Prakasa', 'Kpg. Ikan No. 878, Surakarta 46101, Kaltara', NULL, NULL),
(17, 'Mahfud Asmianto Siregar', 'Jr. Sunaryo No. 251, Pangkal Pinang 74161, Sumbar', NULL, NULL),
(18, 'Puspa Astuti', 'Ki. Baja No. 193, Padangpanjang 92643, Sumsel', NULL, NULL),
(19, 'Akarsana Maulana', 'Psr. Tangkuban Perahu No. 143, Bandung 45145, Riau', NULL, NULL),
(20, 'Mariadi Jagaraga Budiman', 'Ki. Suharso No. 125, Makassar 70240, Gorontalo', NULL, NULL),
(21, 'Juli Usyi Yuniar', 'Ds. Bahagia  No. 368, Probolinggo 60134, Sulut', NULL, NULL),
(22, 'Legawa Martaka Pranowo', 'Jr. Sutarto No. 906, Bogor 74180, Maluku', NULL, NULL),
(23, 'Uchita Hasanah', 'Ki. Bak Air No. 744, Bogor 71991, Jateng', NULL, NULL),
(24, 'Fitriani Melani', 'Jr. Gedebage Selatan No. 448, Banda Aceh 82616, Pabar', NULL, NULL),
(25, 'Darmaji Waluyo S.T.', 'Jr. Baung No. 969, Bengkulu 24210, Kalsel', NULL, NULL),
(26, 'Asmadi Halim', 'Gg. Suharso No. 612, Parepare 99507, Jambi', NULL, NULL),
(27, 'Kurnia Waluyo', 'Ki. Tubagus Ismail No. 265, Sabang 30789, Sulut', NULL, NULL),
(28, 'Taswir Lulut Marpaung', 'Gg. Otto No. 975, Samarinda 40712, Bengkulu', NULL, NULL),
(29, 'Azalea Vera Pertiwi S.Ked', 'Ds. Dipenogoro No. 253, Batam 70560, DKI', NULL, NULL),
(30, 'Lega Nashiruddin S.Farm', 'Dk. R.E. Martadinata No. 872, Sorong 84809, Sulteng', NULL, NULL),
(31, 'Ajeng Siska Hartati', 'Psr. Astana Anyar No. 472, Surakarta 85700, Sumut', NULL, NULL),
(32, 'Melinda Hastuti', 'Dk. Sutan Syahrir No. 177, Surakarta 61691, Jatim', NULL, NULL),
(33, 'Dalima Hana Pertiwi S.Kom', 'Jln. Wahidin Sudirohusodo No. 644, Gunungsitoli 55950, Bengkulu', NULL, NULL),
(34, 'Juli Diah Yuniar S.Kom', 'Jln. Kartini No. 444, Sawahlunto 70915, Sumut', NULL, NULL),
(35, 'Ulva Pertiwi S.H.', 'Dk. Yohanes No. 542, Bukittinggi 77797, Riau', NULL, NULL),
(36, 'Tira Hassanah M.Kom.', 'Psr. Babah No. 871, Cilegon 57593, Kepri', NULL, NULL),
(37, 'Puti Dina Mulyani M.M.', 'Jr. Tubagus Ismail No. 675, Pematangsiantar 44555, Sulbar', NULL, NULL),
(38, 'Gaduh Wibisono', 'Jln. Barat No. 156, Administrasi Jakarta Pusat 72639, Banten', NULL, NULL),
(39, 'Tina Putri Nurdiyanti', 'Gg. Kebangkitan Nasional No. 663, Palembang 46011, Sumsel', NULL, NULL),
(40, 'Simon Sihombing S.Pt', 'Ki. Babah No. 863, Lubuklinggau 24316, Kepri', NULL, NULL),
(41, 'Ophelia Tari Namaga', 'Ds. Basuki Rahmat  No. 379, Medan 82969, Banten', NULL, NULL),
(42, 'Wani Lestari', 'Kpg. Umalas No. 357, Lhokseumawe 30193, Kalsel', NULL, NULL),
(43, 'Ina Yuniar', 'Dk. Soekarno Hatta No. 833, Manado 91852, Sulbar', NULL, NULL),
(44, 'Prabawa Siregar', 'Dk. Mahakam No. 533, Tanjung Pinang 88139, Kaltara', NULL, NULL),
(45, 'Rosman Irawan', 'Dk. Bara No. 382, Tual 24445, Gorontalo', NULL, NULL),
(46, 'Mulyanto Dipa Prabowo', 'Psr. Sutarto No. 989, Blitar 27672, Sulut', NULL, NULL),
(47, 'Asmadi Napitupulu', 'Ki. K.H. Wahid Hasyim (Kopo) No. 704, Surakarta 67904, Kaltim', NULL, NULL),
(48, 'Vivi Rahmi Novitasari S.Pt', 'Psr. Sampangan No. 369, Singkawang 78348, Aceh', NULL, NULL),
(49, 'Faizah Wijayanti S.Psi', 'Kpg. Gegerkalong Hilir No. 766, Ternate 42483, Sulut', NULL, NULL),
(50, 'Jasmin Winarsih', 'Kpg. Aceh No. 202, Administrasi Jakarta Timur 81543, Sulteng', NULL, NULL),
(51, 'Mutia Fujiati S.I.Kom', 'Psr. Dr. Junjunan No. 147, Padangsidempuan 11733, Sulut', NULL, NULL),
(52, 'Rini Agustina', 'Ds. Umalas No. 63, Sawahlunto 15948, Bengkulu', NULL, NULL),
(53, 'Wirda Ida Mandasari', 'Kpg. Cokroaminoto No. 224, Batu 58529, Kepri', NULL, NULL),
(54, 'Marsudi Manullang', 'Dk. Soekarno Hatta No. 509, Makassar 49797, DIY', NULL, NULL),
(55, 'Sarah Hariyah', 'Dk. Juanda No. 756, Dumai 34441, Kaltim', NULL, NULL),
(56, 'Ikin Prasasta S.IP', 'Jr. B.Agam 1 No. 166, Sungai Penuh 90609, Kalsel', NULL, NULL),
(57, 'Lembah Zulkarnain', 'Psr. Padang No. 703, Bau-Bau 23867, NTB', NULL, NULL),
(58, 'Karman Uwais', 'Kpg. Sutarto No. 493, Tangerang 19425, Jambi', NULL, NULL),
(59, 'Muni Jayeng Ramadan S.Sos', 'Jr. Kyai Mojo No. 833, Administrasi Jakarta Pusat 71018, Jatim', NULL, NULL),
(60, 'Adikara Lazuardi M.Kom.', 'Psr. Kalimalang No. 763, Pagar Alam 20218, Sulut', NULL, NULL),
(61, 'Padma Purwanti S.Kom', 'Ds. Abdullah No. 671, Parepare 82936, Bengkulu', NULL, NULL),
(62, 'Dipa Simanjuntak', 'Dk. Baja No. 986, Bengkulu 76801, Sumut', NULL, NULL),
(63, 'Vera Jessica Hariyah', 'Gg. Jamika No. 379, Sibolga 30151, Jambi', NULL, NULL),
(64, 'Hafshah Mardhiyah', 'Jln. Wahid No. 201, Bau-Bau 49475, Lampung', NULL, NULL),
(65, 'Karen Lestari', 'Kpg. Baranang No. 410, Tomohon 33235, Jatim', NULL, NULL),
(66, 'Usyi Najwa Rahmawati', 'Kpg. Baladewa No. 21, Bima 32406, Maluku', NULL, NULL),
(67, 'Galar Marpaung', 'Ki. Raden No. 526, Singkawang 51049, Sulteng', NULL, NULL),
(68, 'Wahyu Natsir S.Gz', 'Kpg. Rajawali No. 152, Tanjungbalai 94854, Sumbar', NULL, NULL),
(69, 'Farah Jasmin Hastuti', 'Kpg. Hang No. 305, Payakumbuh 30007, Jatim', NULL, NULL),
(70, 'Uda Jamal Waskita S.Psi', 'Dk. Rajawali No. 540, Pekalongan 35088, Sulbar', NULL, NULL),
(71, 'Harja Jail Ardianto', 'Dk. Wahid No. 535, Tanjungbalai 31405, Jatim', NULL, NULL),
(72, 'Rahmi Ciaobella Yolanda M.M.', 'Ds. Mulyadi No. 840, Gorontalo 56518, Kaltim', NULL, NULL),
(73, 'Wani Rahimah', 'Kpg. Mulyadi No. 613, Palangka Raya 76432, Bengkulu', NULL, NULL),
(74, 'Maida Yuni Yulianti M.Ak', 'Jln. Untung Suropati No. 226, Administrasi Jakarta Barat 75180, Jambi', NULL, NULL),
(75, 'Kezia Dinda Astuti', 'Jr. Karel S. Tubun No. 38, Bitung 90014, Kalteng', NULL, NULL),
(76, 'Damu Wahyudin S.E.I', 'Jln. Ekonomi No. 883, Tanjungbalai 19207, Bali', NULL, NULL),
(77, 'Kairav Firgantoro', 'Gg. Dago No. 888, Prabumulih 70312, Papua', NULL, NULL),
(78, 'Safina Kusmawati S.I.Kom', 'Dk. Adisucipto No. 870, Medan 78553, Sulut', NULL, NULL),
(79, 'Yahya Waluyo', 'Dk. Teuku Umar No. 197, Palembang 20475, Sultra', NULL, NULL),
(80, 'Oni Mandasari', 'Psr. Labu No. 256, Magelang 60404, Sulsel', NULL, NULL),
(81, 'Karja Lazuardi S.Pt', 'Psr. Basuki No. 502, Metro 51205, Sulbar', NULL, NULL),
(82, 'Maida Sarah Utami', 'Ds. Daan No. 328, Sungai Penuh 89322, Sumut', NULL, NULL),
(83, 'Ayu Pertiwi', 'Ki. Industri No. 362, Mojokerto 23155, Lampung', NULL, NULL),
(84, 'Ulva Kasiyah Puspita', 'Gg. Cikutra Barat No. 215, Batu 11403, Papua', NULL, NULL),
(85, 'Rangga Haryanto M.Ak', 'Jr. Bakti No. 524, Yogyakarta 61173, DIY', NULL, NULL),
(86, 'Maria Irma Haryanti M.M.', 'Jln. B.Agam Dlm No. 950, Gorontalo 81016, Banten', NULL, NULL),
(87, 'Bakiman Pranata Situmorang S.Farm', 'Ds. BKR No. 635, Banjarbaru 30641, Malut', NULL, NULL),
(88, 'Ulya Rahmawati', 'Ki. Babadan No. 872, Binjai 93570, Kaltim', NULL, NULL),
(89, 'Shania Rika Puspita', 'Gg. Ahmad Dahlan No. 848, Mojokerto 95551, Kalbar', NULL, NULL),
(90, 'Laila Cinthia Pertiwi S.Farm', 'Jr. Bakaru No. 563, Bau-Bau 86218, Sulut', NULL, NULL),
(91, 'Jamil Sihotang S.H.', 'Dk. Baranangsiang No. 90, Palu 99415, Kalsel', NULL, NULL),
(92, 'Zalindra Melani', 'Gg. Ir. H. Juanda No. 507, Payakumbuh 62997, Pabar', NULL, NULL),
(93, 'Satya Prasetyo', 'Psr. Soekarno Hatta No. 82, Tangerang Selatan 36565, DKI', NULL, NULL),
(94, 'Sari Hariyah', 'Ki. Sutoyo No. 711, Magelang 19768, Kalteng', NULL, NULL),
(95, 'Galak Rajata', 'Kpg. Wora Wari No. 458, Tidore Kepulauan 53402, DKI', NULL, NULL),
(96, 'Candra Tirtayasa Tampubolon S.IP', 'Ds. Bata Putih No. 658, Bontang 79442, Jateng', NULL, NULL),
(97, 'Ika Rahayu S.Farm', 'Jln. Wora Wari No. 963, Serang 46166, Sumut', NULL, NULL),
(98, 'Artanto Prasetyo', 'Jr. Ters. Buah Batu No. 19, Tual 31868, Babel', NULL, NULL),
(99, 'Ami Nasyiah S.IP', 'Dk. Halim No. 317, Solok 67191, Sultra', NULL, NULL),
(100, 'Amelia Pertiwi', 'Ki. Suryo Pranoto No. 684, Pematangsiantar 56211, Banten', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `migrations`
--

CREATE TABLE `migrations` (
  `id` int(10) UNSIGNED NOT NULL,
  `migration` varchar(255) NOT NULL,
  `batch` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `migrations`
--

INSERT INTO `migrations` (`id`, `migration`, `batch`) VALUES
(1, '2014_10_12_000000_create_users_table', 1),
(2, '2014_10_12_100000_create_password_reset_tokens_table', 1),
(3, '2019_08_19_000000_create_failed_jobs_table', 1),
(4, '2019_12_14_000001_create_personal_access_tokens_table', 1),
(5, '2023_05_25_013915_create_mahasiswas_table', 1);

-- --------------------------------------------------------

--
-- Table structure for table `password_reset_tokens`
--

CREATE TABLE `password_reset_tokens` (
  `email` varchar(255) NOT NULL,
  `token` varchar(255) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `personal_access_tokens`
--

CREATE TABLE `personal_access_tokens` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `tokenable_type` varchar(255) NOT NULL,
  `tokenable_id` bigint(20) UNSIGNED NOT NULL,
  `name` varchar(255) NOT NULL,
  `token` varchar(64) NOT NULL,
  `abilities` text DEFAULT NULL,
  `last_used_at` timestamp NULL DEFAULT NULL,
  `expires_at` timestamp NULL DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `email_verified_at` timestamp NULL DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `remember_token` varchar(100) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `failed_jobs`
--
ALTER TABLE `failed_jobs`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `failed_jobs_uuid_unique` (`uuid`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `migrations`
--
ALTER TABLE `migrations`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `password_reset_tokens`
--
ALTER TABLE `password_reset_tokens`
  ADD PRIMARY KEY (`email`);

--
-- Indexes for table `personal_access_tokens`
--
ALTER TABLE `personal_access_tokens`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `personal_access_tokens_token_unique` (`token`),
  ADD KEY `personal_access_tokens_tokenable_type_tokenable_id_index` (`tokenable_type`,`tokenable_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `users_email_unique` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `failed_jobs`
--
ALTER TABLE `failed_jobs`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- AUTO_INCREMENT for table `migrations`
--
ALTER TABLE `migrations`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `personal_access_tokens`
--
ALTER TABLE `personal_access_tokens`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
