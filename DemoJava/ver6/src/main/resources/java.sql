-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 29, 2023 at 03:31 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `id` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `brand` varchar(50) NOT NULL,
  `color` varchar(50) NOT NULL,
  `image` text NOT NULL,
  `price` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `name`, `brand`, `color`, `image`, `price`) VALUES
(1, 'Giày thể thao Adidas Ultra Boost ', 'Adidas', 'Black', '1.png', 1250),
(2, 'Giày thể thao Adidas Ultra Boost 21', 'Adidas', 'Black', '2.png', 1300),
(3, 'Giày thể thao Adidas Ultra Boost 22', 'Adidas', 'White', '3.png', 1400),
(4, 'Giày thể thao Nike Air Jordan 1 Rebellionaire', 'Nike', 'Gray', '4.png', 1600),
(5, 'Giày thể thao Nike Air Jordan 1 Volt Gold', 'Nike', 'Yellow', '5.png', 1300),
(6, 'Giày thể thao Nike Air Jordan 1 Chicago', 'Nike', 'Red', '6.png', 1100),
(7, 'Giày thể thao Nike Air Jordan 1 PSG Paris', 'Nike', 'Black', '7.png', 1100),
(8, 'Giày thể thao Nike Dunk Oragane', 'Nike', 'White', '8.png', 950),
(9, 'Giày thể thao Nike SB Dunk Low Otomo', 'Nike', 'Gray', '9.png', 1500),
(10, 'Giày thể thao Nike Dunk Gray Fog', 'Nike', 'Gray', '10.png', 1100),
(11, 'Giày thể thao Adidas Yeezt V2 Static Black', 'Adidas', 'Black', '11.png', 1200),
(12, 'Giày thể thao Adidas Yeezy V2 Cloud White', 'Adidas', 'White', '12.png', 1200),
(13, 'Giày thể thao Nike Air Force Reigning Champ', 'Nike', 'Gray', '13.png', 1300),
(14, 'New Balance 2002R Cream', 'New Balance', 'White', '14.png', 1100),
(15, 'New Balance 550 Aime Leon', 'New Balance', 'White', '15.png', 1100),
(16, 'New Balance CRT 300 Navy', 'New Balance', 'Gray', '16.png', 950),
(17, 'New Balance CRT 300 Beige ', 'New Balance', 'Gray', '17.png', 950),
(18, 'New Balance 550 Aime Leon Dore Red', 'New Balance', 'Red', '18.png', 950);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `age` int(11) NOT NULL,
  `email` varchar(50) NOT NULL,
  `ielts` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`) VALUES
(1, 'dung', 'deptrai'),
(2, 'puc', 'peo');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
