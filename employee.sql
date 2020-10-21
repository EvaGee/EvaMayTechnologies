-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 18, 2020 at 12:57 PM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `employee`
--

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `StaffId` varchar(255) NOT NULL,
  `LastName` varchar(255) NOT NULL,
  `FirstName` varchar(255) NOT NULL,
  `MiddleName` varchar(255) DEFAULT NULL,
  `Password` varchar(255) NOT NULL,
  `Designation` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`StaffId`, `LastName`, `FirstName`, `MiddleName`, `Password`, `Designation`) VALUES
('EM12301', 'Ng\'ang\'a', 'Eva', 'Mwende', 'EM12301', 'Staff'),
('EM12302', 'Yatich', 'Leila', 'Mwilu', 'EM12302', 'Staff'),
('EM12304', 'Kirui', 'Brenda', 'Chebiwott', 'EM12304', 'Staff'),
('EM12305', 'Githinji', 'Eva', 'Wanjiru', 'EM12305', 'Staff'),
('EM12306', 'Kibet', 'Adida', '', 'EM12306', 'Staff'),
('EM12307', 'Wafula', 'Agatha', 'Mwende', 'EM12307', 'Staff'),
('EM12308', 'Gitau', 'Titus', 'Mwangi', 'EM12308', 'Staff'),
('EM12309', 'Musau', 'Leila', '', 'EM12309', 'Staff'),
('EM12310', 'Naila', 'Karey', 'Wanjiku', 'EM12310', 'Staff'),
('EM12312', 'Ng\'ang\'a', 'Candace', 'Wairimu', 'EM12312', 'Staff'),
('EM12313', 'Odhiambo', 'Claire', 'Apok', 'EM12313', 'Staff'),
('HEM15301', 'Benjamin', 'Rose', '', 'HEM15301', 'HR Manager'),
('MEM15301', 'Lokiit', 'Festus', 'Kolo', 'MEM15301', 'Overall Manager'),
('SEM16501', 'Kimeu', 'Francis', 'Kido', 'SEM16501', 'Supervisor');

-- --------------------------------------------------------

--
-- Table structure for table `staffdetails`
--

CREATE TABLE `staffdetails` (
  `StaffId` varchar(255) NOT NULL,
  `Email` varchar(255) NOT NULL,
  `PhoneNo` varchar(255) NOT NULL,
  `Phoneno2` varchar(255) DEFAULT NULL,
  `Gender` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`StaffId`),
  ADD UNIQUE KEY `StaffId` (`StaffId`);

--
-- Indexes for table `staffdetails`
--
ALTER TABLE `staffdetails`
  ADD PRIMARY KEY (`Email`),
  ADD KEY `StaffId` (`StaffId`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `staffdetails`
--
ALTER TABLE `staffdetails`
  ADD CONSTRAINT `staffdetails_ibfk_1` FOREIGN KEY (`StaffId`) REFERENCES `staff` (`StaffId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
