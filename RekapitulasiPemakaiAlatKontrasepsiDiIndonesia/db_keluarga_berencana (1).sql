-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 04, 2020 at 11:57 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_keluarga_berencana`
--

-- --------------------------------------------------------

--
-- Table structure for table `list_kontrasepsi`
--

CREATE TABLE `list_kontrasepsi` (
  `id_Kontrasepsi` int(11) NOT NULL,
  `nama_kontrasepsi` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `list_kontrasepsi`
--

INSERT INTO `list_kontrasepsi` (`id_Kontrasepsi`, `nama_kontrasepsi`) VALUES
(1, 'Pil'),
(2, 'Kondom'),
(3, 'UID');

-- --------------------------------------------------------

--
-- Table structure for table `list_pemakai_kontrasepsi`
--

CREATE TABLE `list_pemakai_kontrasepsi` (
  `Id_List` int(11) NOT NULL,
  `Id_Propinsi` int(11) NOT NULL,
  `Id_Kontrasepsi` int(11) NOT NULL,
  `Jumlah_Pemakai` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `list_pemakai_kontrasepsi`
--

INSERT INTO `list_pemakai_kontrasepsi` (`Id_List`, `Id_Propinsi`, `Id_Kontrasepsi`, `Jumlah_Pemakai`) VALUES
(1, 1, 1, 50),
(2, 1, 2, 66),
(3, 1, 3, 25),
(4, 2, 1, 100),
(5, 2, 2, 75),
(6, 2, 3, 50),
(7, 1, 2, 40),
(8, 2, 2, 65),
(9, 3, 1, 90);

-- --------------------------------------------------------

--
-- Table structure for table `list_propinsi`
--

CREATE TABLE `list_propinsi` (
  `id_propinsi` int(11) NOT NULL,
  `nama_propinsi` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `list_propinsi`
--

INSERT INTO `list_propinsi` (`id_propinsi`, `nama_propinsi`) VALUES
(1, 'Aceh'),
(2, 'Sumatera Utara'),
(3, 'Sumatera Barat'),
(4, 'Riau'),
(5, 'Kepulauan Riau'),
(6, 'Jambi'),
(7, 'Bangka Belitung'),
(8, 'Sumatera Selatan'),
(9, 'Lampung');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `list_kontrasepsi`
--
ALTER TABLE `list_kontrasepsi`
  ADD PRIMARY KEY (`id_Kontrasepsi`);

--
-- Indexes for table `list_pemakai_kontrasepsi`
--
ALTER TABLE `list_pemakai_kontrasepsi`
  ADD PRIMARY KEY (`Id_List`);

--
-- Indexes for table `list_propinsi`
--
ALTER TABLE `list_propinsi`
  ADD PRIMARY KEY (`id_propinsi`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `list_kontrasepsi`
--
ALTER TABLE `list_kontrasepsi`
  MODIFY `id_Kontrasepsi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `list_pemakai_kontrasepsi`
--
ALTER TABLE `list_pemakai_kontrasepsi`
  MODIFY `Id_List` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `list_propinsi`
--
ALTER TABLE `list_propinsi`
  MODIFY `id_propinsi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
