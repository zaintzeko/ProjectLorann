-- phpMyAdmin SQL Dump
-- version 4.4.15.5
-- http://www.phpmyadmin.net
--
-- Host: localhost:8889
-- Generation Time: Jun 16, 2016 at 09:25 PM
-- Server version: 5.5.49-log
-- PHP Version: 7.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `lorann`--
CREATE DATABASE `lorann` ;

USE `lorann` ;

DELIMITER $$
--
-- Procedures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `LorannMap`(IN `p_level` INT(5))
    READS SQL DATA
    SQL SECURITY INVOKER
SELECT mapbyelement.PosX ,mapbyelement.PosY ,element.NameElement

FROM element NATURAL JOIN mapbyelement NATURAL JOIN map

WHERE map.NumberLevel=p_level$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `element`
--

CREATE TABLE IF NOT EXISTS `element` (
  `IDElement` int(11) NOT NULL,
  `NameElement` varchar(50) CHARACTER SET utf16 COLLATE utf16_bin DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `element`
--

INSERT INTO `element` (`IDElement`, `NameElement`) VALUES
(10, '-'),
(2, 'G'),
(1, 'L'),
(7, 'S'),
(5, 'T'),
(9, 'd'),
(4, 'g'),
(13, 'k'),
(11, 'l'),
(12, 'o'),
(8, 's'),
(6, 't');

-- --------------------------------------------------------

--
-- Table structure for table `map`
--

CREATE TABLE IF NOT EXISTS `map` (
  `IDMap` int(11) NOT NULL,
  `NumberLevel` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `map`
--

INSERT INTO `map` (`IDMap`, `NumberLevel`) VALUES
(1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `mapbyelement`
--

CREATE TABLE IF NOT EXISTS `mapbyelement` (
  `IDPositionElement` int(11) NOT NULL,
  `PosX` int(11) DEFAULT NULL,
  `PosY` int(11) DEFAULT NULL,
  `IDMap` int(11) DEFAULT NULL,
  `IDElement` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mapbyelement`
--

INSERT INTO `mapbyelement` (`IDPositionElement`, `PosX`, `PosY`, `IDMap`, `IDElement`) VALUES
(1, 6, 0, 1, 12),
(2, 7, 0, 1, 10),
(3, 8, 0, 1, 12),
(4, 9, 0, 1, 10),
(5, 10, 0, 1, 10),
(6, 11, 0, 1, 10),
(7, 12, 0, 1, 10),
(8, 13, 0, 1, 10),
(9, 14, 0, 1, 10),
(10, 15, 0, 1, 10),
(11, 16, 0, 1, 10),
(12, 17, 0, 1, 10),
(13, 18, 0, 1, 12),
(14, 3, 1, 1, 12),
(15, 4, 1, 1, 10),
(16, 5, 1, 1, 10),
(17, 6, 1, 1, 12),
(18, 7, 1, 1, 6),
(19, 8, 1, 1, 11),
(20, 18, 1, 1, 12),
(21, 19, 1, 1, 12),
(22, 3, 2, 1, 11),
(23, 8, 2, 1, 11),
(24, 19, 2, 1, 11),
(25, 0, 3, 1, 12),
(26, 1, 3, 1, 10),
(27, 2, 3, 1, 10),
(28, 3, 3, 1, 12),
(29, 8, 3, 1, 11),
(30, 12, 3, 1, 6),
(31, 19, 3, 1, 11),
(32, 0, 4, 1, 11),
(33, 2, 4, 1, 6),
(34, 4, 4, 1, 12),
(35, 5, 4, 1, 10),
(36, 6, 4, 1, 10),
(37, 7, 4, 1, 10),
(38, 8, 4, 1, 12),
(39, 9, 4, 1, 10),
(40, 10, 4, 1, 10),
(41, 11, 4, 1, 10),
(42, 12, 4, 1, 10),
(43, 13, 4, 1, 10),
(44, 14, 4, 1, 12),
(45, 19, 4, 1, 12),
(46, 0, 5, 1, 11),
(47, 1, 5, 1, 6),
(48, 4, 5, 1, 4),
(49, 12, 5, 1, 13),
(50, 19, 5, 1, 9),
(51, 0, 6, 1, 11),
(52, 2, 6, 1, 6),
(53, 4, 6, 1, 12),
(54, 5, 6, 1, 10),
(55, 6, 6, 1, 10),
(56, 7, 6, 1, 10),
(57, 8, 6, 1, 12),
(58, 9, 6, 1, 10),
(59, 10, 6, 1, 10),
(60, 11, 6, 1, 10),
(61, 12, 6, 1, 10),
(62, 13, 6, 1, 10),
(63, 14, 6, 1, 12),
(64, 19, 6, 1, 12),
(65, 0, 7, 1, 12),
(66, 1, 7, 1, 10),
(67, 2, 7, 1, 10),
(68, 3, 7, 1, 12),
(69, 8, 7, 1, 11),
(70, 12, 7, 1, 6),
(71, 19, 7, 1, 11),
(72, 3, 8, 1, 11),
(73, 8, 8, 1, 11),
(74, 19, 8, 1, 11),
(75, 3, 9, 1, 12),
(76, 4, 9, 1, 10),
(77, 5, 9, 1, 10),
(78, 6, 9, 1, 12),
(79, 7, 9, 1, 6),
(80, 8, 9, 1, 11),
(81, 18, 9, 1, 12),
(82, 19, 9, 1, 12),
(83, 6, 10, 1, 12),
(84, 7, 10, 1, 10),
(85, 8, 10, 1, 12),
(86, 9, 10, 1, 10),
(87, 10, 10, 1, 10),
(88, 11, 10, 1, 10),
(89, 12, 10, 1, 10),
(90, 13, 10, 1, 10),
(91, 14, 10, 1, 10),
(92, 15, 10, 1, 10),
(93, 16, 10, 1, 10),
(94, 17, 10, 1, 10),
(95, 18, 10, 1, 12),
(96, 17, 5, 1, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `element`
--
ALTER TABLE `element`
  ADD PRIMARY KEY (`IDElement`),
  ADD UNIQUE KEY `NameElement` (`NameElement`);

--
-- Indexes for table `map`
--
ALTER TABLE `map`
  ADD PRIMARY KEY (`IDMap`),
  ADD UNIQUE KEY `NumberLevel` (`NumberLevel`);

--
-- Indexes for table `mapbyelement`
--
ALTER TABLE `mapbyelement`
  ADD PRIMARY KEY (`IDPositionElement`),
  ADD KEY `FK_MapByElement_IDMap` (`IDMap`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `element`
--
ALTER TABLE `element`
  MODIFY `IDElement` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=14;
--
-- AUTO_INCREMENT for table `map`
--
ALTER TABLE `map`
  MODIFY `IDMap` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `mapbyelement`
--
ALTER TABLE `mapbyelement`
  MODIFY `IDPositionElement` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=97;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `mapbyelement`
--
ALTER TABLE `mapbyelement`
  ADD CONSTRAINT `FK_MapByElement_IDMap` FOREIGN KEY (`IDMap`) REFERENCES `map` (`IDMap`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
