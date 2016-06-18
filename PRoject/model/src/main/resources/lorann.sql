-- phpMyAdmin SQL Dump
-- version 4.4.15.5
-- http://www.phpmyadmin.net
--
-- Host: localhost:8889
-- Generation Time: Jun 18, 2016 at 10:34 AM
-- Server version: 5.5.49-log
-- PHP Version: 7.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lorann`
--
CREATE DATABASE IF NOT EXISTS `lorann` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `lorann`;

DELIMITER $$
--
-- Procedures
--
DROP PROCEDURE IF EXISTS `LorannMap`$$
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

DROP TABLE IF EXISTS `element`;
CREATE TABLE IF NOT EXISTS `element` (
  `IDElement` int(11) NOT NULL,
  `NameElement` varchar(50) CHARACTER SET utf16 COLLATE utf16_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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

DROP TABLE IF EXISTS `map`;
CREATE TABLE IF NOT EXISTS `map` (
  `IDMap` int(11) NOT NULL,
  `NumberLevel` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `map`
--

INSERT INTO `map` (`IDMap`, `NumberLevel`) VALUES
(34, 1),
(35, 2),
(36, 3),
(37, 4),
(38, 5);

-- --------------------------------------------------------

--
-- Table structure for table `mapbyelement`
--

DROP TABLE IF EXISTS `mapbyelement`;
CREATE TABLE IF NOT EXISTS `mapbyelement` (
  `IDPositionElement` int(11) NOT NULL,
  `PosX` int(11) DEFAULT NULL,
  `PosY` int(11) DEFAULT NULL,
  `IDMap` int(11) DEFAULT NULL,
  `IDElement` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2049 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mapbyelement`
--

INSERT INTO `mapbyelement` (`IDPositionElement`, `PosX`, `PosY`, `IDMap`, `IDElement`) VALUES
(1520, 6, 0, 34, 12),
(1521, 7, 0, 34, 10),
(1522, 8, 0, 34, 12),
(1523, 9, 0, 34, 10),
(1524, 10, 0, 34, 10),
(1525, 11, 0, 34, 10),
(1526, 12, 0, 34, 10),
(1527, 13, 0, 34, 10),
(1528, 14, 0, 34, 10),
(1529, 15, 0, 34, 10),
(1530, 16, 0, 34, 10),
(1531, 17, 0, 34, 10),
(1532, 18, 0, 34, 12),
(1533, 3, 1, 34, 12),
(1534, 4, 1, 34, 10),
(1535, 5, 1, 34, 10),
(1536, 6, 1, 34, 12),
(1537, 7, 1, 34, 6),
(1538, 8, 1, 34, 11),
(1539, 18, 1, 34, 12),
(1540, 19, 1, 34, 12),
(1541, 3, 2, 34, 11),
(1542, 8, 2, 34, 11),
(1543, 19, 2, 34, 11),
(1544, 0, 3, 34, 12),
(1545, 1, 3, 34, 10),
(1546, 2, 3, 34, 10),
(1547, 3, 3, 34, 12),
(1548, 8, 3, 34, 11),
(1549, 12, 3, 34, 6),
(1550, 19, 3, 34, 11),
(1551, 0, 4, 34, 11),
(1552, 2, 4, 34, 6),
(1553, 4, 4, 34, 12),
(1554, 5, 4, 34, 10),
(1555, 6, 4, 34, 10),
(1556, 7, 4, 34, 10),
(1557, 8, 4, 34, 12),
(1558, 9, 4, 34, 10),
(1559, 10, 4, 34, 10),
(1560, 11, 4, 34, 10),
(1561, 12, 4, 34, 10),
(1562, 13, 4, 34, 10),
(1563, 14, 4, 34, 12),
(1564, 19, 4, 34, 12),
(1565, 0, 5, 34, 11),
(1566, 1, 5, 34, 6),
(1567, 4, 5, 34, 4),
(1568, 12, 5, 34, 13),
(1569, 17, 5, 34, 1),
(1570, 19, 5, 34, 9),
(1571, 0, 6, 34, 11),
(1572, 2, 6, 34, 6),
(1573, 4, 6, 34, 12),
(1574, 5, 6, 34, 10),
(1575, 6, 6, 34, 10),
(1576, 7, 6, 34, 10),
(1577, 8, 6, 34, 12),
(1578, 9, 6, 34, 10),
(1579, 10, 6, 34, 10),
(1580, 11, 6, 34, 10),
(1581, 12, 6, 34, 10),
(1582, 13, 6, 34, 10),
(1583, 14, 6, 34, 12),
(1584, 19, 6, 34, 12),
(1585, 0, 7, 34, 12),
(1586, 1, 7, 34, 10),
(1587, 2, 7, 34, 10),
(1588, 3, 7, 34, 12),
(1589, 8, 7, 34, 11),
(1590, 12, 7, 34, 6),
(1591, 19, 7, 34, 11),
(1592, 3, 8, 34, 11),
(1593, 8, 8, 34, 11),
(1594, 19, 8, 34, 11),
(1595, 3, 9, 34, 12),
(1596, 4, 9, 34, 10),
(1597, 5, 9, 34, 10),
(1598, 6, 9, 34, 12),
(1599, 7, 9, 34, 6),
(1600, 8, 9, 34, 11),
(1601, 18, 9, 34, 12),
(1602, 19, 9, 34, 12),
(1603, 6, 10, 34, 12),
(1604, 7, 10, 34, 10),
(1605, 8, 10, 34, 12),
(1606, 9, 10, 34, 10),
(1607, 10, 10, 34, 10),
(1608, 11, 10, 34, 10),
(1609, 12, 10, 34, 10),
(1610, 13, 10, 34, 10),
(1611, 14, 10, 34, 10),
(1612, 15, 10, 34, 10),
(1613, 16, 10, 34, 10),
(1614, 17, 10, 34, 10),
(1615, 18, 10, 34, 12),
(1616, 0, 0, 35, 12),
(1617, 1, 0, 35, 10),
(1618, 2, 0, 35, 10),
(1619, 3, 0, 35, 10),
(1620, 4, 0, 35, 10),
(1621, 5, 0, 35, 10),
(1622, 6, 0, 35, 10),
(1623, 7, 0, 35, 10),
(1624, 8, 0, 35, 10),
(1625, 9, 0, 35, 10),
(1626, 10, 0, 35, 10),
(1627, 11, 0, 35, 10),
(1628, 12, 0, 35, 10),
(1629, 13, 0, 35, 10),
(1630, 14, 0, 35, 10),
(1631, 15, 0, 35, 10),
(1632, 16, 0, 35, 10),
(1633, 17, 0, 35, 10),
(1634, 18, 0, 35, 10),
(1635, 19, 0, 35, 12),
(1636, 0, 1, 35, 11),
(1637, 2, 1, 35, 2),
(1638, 18, 1, 35, 5),
(1639, 19, 1, 35, 11),
(1640, 0, 2, 35, 11),
(1641, 9, 2, 35, 1),
(1642, 17, 2, 35, 12),
(1643, 19, 2, 35, 11),
(1644, 0, 3, 35, 11),
(1645, 7, 3, 35, 12),
(1646, 11, 3, 35, 12),
(1647, 17, 3, 35, 11),
(1648, 19, 3, 35, 11),
(1649, 0, 4, 35, 11),
(1650, 6, 4, 35, 12),
(1651, 7, 4, 35, 12),
(1652, 8, 4, 35, 12),
(1653, 10, 4, 35, 12),
(1654, 11, 4, 35, 12),
(1655, 12, 4, 35, 12),
(1656, 17, 4, 35, 11),
(1657, 18, 4, 35, 13),
(1658, 19, 4, 35, 11),
(1659, 0, 5, 35, 11),
(1660, 7, 5, 35, 12),
(1661, 8, 5, 35, 12),
(1662, 9, 5, 35, 12),
(1663, 10, 5, 35, 12),
(1664, 11, 5, 35, 12),
(1665, 17, 5, 35, 11),
(1666, 19, 5, 35, 11),
(1667, 0, 6, 35, 11),
(1668, 8, 6, 35, 12),
(1669, 9, 6, 35, 12),
(1670, 10, 6, 35, 12),
(1671, 17, 6, 35, 11),
(1672, 19, 6, 35, 11),
(1673, 0, 7, 35, 11),
(1674, 9, 7, 35, 9),
(1675, 17, 7, 35, 11),
(1676, 19, 7, 35, 11),
(1677, 0, 8, 35, 11),
(1678, 17, 8, 35, 11),
(1679, 19, 8, 35, 11),
(1680, 0, 9, 35, 11),
(1681, 17, 9, 35, 12),
(1682, 19, 9, 35, 11),
(1683, 0, 10, 35, 11),
(1684, 1, 10, 35, 8),
(1685, 17, 10, 35, 4),
(1686, 19, 10, 35, 11),
(1687, 0, 11, 35, 12),
(1688, 1, 11, 35, 10),
(1689, 2, 11, 35, 10),
(1690, 3, 11, 35, 10),
(1691, 4, 11, 35, 10),
(1692, 5, 11, 35, 10),
(1693, 6, 11, 35, 10),
(1694, 7, 11, 35, 10),
(1695, 8, 11, 35, 10),
(1696, 9, 11, 35, 10),
(1697, 10, 11, 35, 10),
(1698, 11, 11, 35, 10),
(1699, 12, 11, 35, 10),
(1700, 13, 11, 35, 10),
(1701, 14, 11, 35, 10),
(1702, 15, 11, 35, 10),
(1703, 16, 11, 35, 10),
(1704, 17, 11, 35, 12),
(1705, 18, 11, 35, 10),
(1706, 19, 11, 35, 12),
(1707, 2, 0, 36, 12),
(1708, 3, 0, 36, 10),
(1709, 4, 0, 36, 10),
(1710, 5, 0, 36, 10),
(1711, 6, 0, 36, 10),
(1712, 7, 0, 36, 10),
(1713, 8, 0, 36, 10),
(1714, 9, 0, 36, 10),
(1715, 10, 0, 36, 10),
(1716, 11, 0, 36, 10),
(1717, 12, 0, 36, 10),
(1718, 13, 0, 36, 10),
(1719, 14, 0, 36, 12),
(1720, 2, 1, 36, 11),
(1721, 4, 1, 36, 8),
(1722, 14, 1, 36, 11),
(1723, 2, 2, 36, 11),
(1724, 14, 2, 36, 11),
(1725, 2, 3, 36, 12),
(1726, 3, 3, 36, 10),
(1727, 4, 3, 36, 10),
(1728, 5, 3, 36, 12),
(1729, 8, 3, 36, 12),
(1730, 9, 3, 36, 10),
(1731, 10, 3, 36, 12),
(1732, 11, 3, 36, 6),
(1733, 12, 3, 36, 6),
(1734, 14, 3, 36, 11),
(1735, 5, 4, 36, 11),
(1736, 9, 4, 36, 4),
(1737, 10, 4, 36, 11),
(1738, 13, 4, 36, 12),
(1739, 14, 4, 36, 12),
(1740, 15, 4, 36, 10),
(1741, 16, 4, 36, 10),
(1742, 17, 4, 36, 10),
(1743, 18, 4, 36, 10),
(1744, 19, 4, 36, 12),
(1745, 2, 5, 36, 12),
(1746, 3, 5, 36, 10),
(1747, 4, 5, 36, 10),
(1748, 5, 5, 36, 12),
(1749, 9, 5, 36, 12),
(1750, 10, 5, 36, 11),
(1751, 19, 5, 36, 11),
(1752, 2, 6, 36, 11),
(1753, 8, 6, 36, 12),
(1754, 9, 6, 36, 10),
(1755, 10, 6, 36, 12),
(1756, 18, 6, 36, 13),
(1757, 19, 6, 36, 11),
(1758, 2, 7, 36, 11),
(1759, 8, 7, 36, 11),
(1760, 10, 7, 36, 12),
(1761, 11, 7, 36, 6),
(1762, 19, 7, 36, 11),
(1763, 2, 8, 36, 12),
(1764, 3, 8, 36, 9),
(1765, 8, 8, 36, 11),
(1766, 10, 8, 36, 12),
(1767, 11, 8, 36, 12),
(1768, 12, 8, 36, 10),
(1769, 13, 8, 36, 12),
(1770, 16, 8, 36, 12),
(1771, 17, 8, 36, 10),
(1772, 18, 8, 36, 10),
(1773, 19, 8, 36, 12),
(1774, 3, 9, 36, 12),
(1775, 4, 9, 36, 10),
(1776, 5, 9, 36, 12),
(1777, 6, 9, 36, 10),
(1778, 7, 9, 36, 10),
(1779, 8, 9, 36, 12),
(1780, 11, 9, 36, 11),
(1781, 16, 9, 36, 11),
(1782, 11, 10, 36, 11),
(1783, 13, 10, 36, 1),
(1784, 16, 10, 36, 11),
(1785, 11, 11, 36, 12),
(1786, 12, 11, 36, 10),
(1787, 13, 11, 36, 10),
(1788, 14, 11, 36, 10),
(1789, 15, 11, 36, 10),
(1790, 16, 11, 36, 12),
(1791, 0, 0, 37, 12),
(1792, 1, 0, 37, 10),
(1793, 2, 0, 37, 10),
(1794, 3, 0, 37, 10),
(1795, 4, 0, 37, 10),
(1796, 5, 0, 37, 10),
(1797, 6, 0, 37, 10),
(1798, 7, 0, 37, 10),
(1799, 8, 0, 37, 10),
(1800, 9, 0, 37, 10),
(1801, 10, 0, 37, 10),
(1802, 11, 0, 37, 10),
(1803, 12, 0, 37, 10),
(1804, 13, 0, 37, 10),
(1805, 14, 0, 37, 10),
(1806, 15, 0, 37, 12),
(1807, 16, 0, 37, 10),
(1808, 17, 0, 37, 10),
(1809, 18, 0, 37, 10),
(1810, 19, 0, 37, 12),
(1811, 0, 1, 37, 11),
(1812, 2, 1, 37, 1),
(1813, 15, 1, 37, 11),
(1814, 19, 1, 37, 11),
(1815, 0, 2, 37, 11),
(1816, 2, 2, 37, 12),
(1817, 3, 2, 37, 12),
(1818, 5, 2, 37, 12),
(1819, 6, 2, 37, 12),
(1820, 7, 2, 37, 6),
(1821, 8, 2, 37, 12),
(1822, 9, 2, 37, 10),
(1823, 10, 2, 37, 10),
(1824, 11, 2, 37, 10),
(1825, 12, 2, 37, 12),
(1826, 13, 2, 37, 12),
(1827, 15, 2, 37, 11),
(1828, 17, 2, 37, 12),
(1829, 19, 2, 37, 11),
(1830, 0, 3, 37, 11),
(1831, 2, 3, 37, 11),
(1832, 3, 3, 37, 6),
(1833, 5, 3, 37, 12),
(1834, 7, 3, 37, 12),
(1835, 11, 3, 37, 6),
(1836, 15, 3, 37, 11),
(1837, 17, 3, 37, 12),
(1838, 19, 3, 37, 11),
(1839, 0, 4, 37, 11),
(1840, 2, 4, 37, 12),
(1841, 4, 4, 37, 12),
(1842, 6, 4, 37, 12),
(1843, 7, 4, 37, 12),
(1844, 9, 4, 37, 12),
(1845, 10, 4, 37, 10),
(1846, 11, 4, 37, 12),
(1847, 15, 4, 37, 11),
(1848, 19, 4, 37, 11),
(1849, 0, 5, 37, 11),
(1850, 4, 5, 37, 11),
(1851, 5, 5, 37, 6),
(1852, 7, 5, 37, 11),
(1853, 8, 5, 37, 1),
(1854, 9, 5, 37, 12),
(1855, 11, 5, 37, 11),
(1856, 13, 5, 37, 12),
(1857, 15, 5, 37, 11),
(1858, 17, 5, 37, 12),
(1859, 19, 5, 37, 11),
(1860, 0, 6, 37, 11),
(1861, 2, 6, 37, 12),
(1862, 4, 6, 37, 11),
(1863, 6, 6, 37, 12),
(1864, 7, 6, 37, 12),
(1865, 11, 6, 37, 12),
(1866, 13, 6, 37, 11),
(1867, 15, 6, 37, 12),
(1868, 16, 6, 37, 12),
(1869, 19, 6, 37, 11),
(1870, 0, 7, 37, 11),
(1871, 1, 7, 37, 12),
(1872, 2, 7, 37, 11),
(1873, 4, 7, 37, 11),
(1874, 7, 7, 37, 11),
(1875, 8, 7, 37, 6),
(1876, 10, 7, 37, 8),
(1877, 13, 7, 37, 11),
(1878, 17, 7, 37, 12),
(1879, 19, 7, 37, 11),
(1880, 0, 8, 37, 11),
(1881, 2, 8, 37, 11),
(1882, 4, 8, 37, 11),
(1883, 6, 8, 37, 12),
(1884, 7, 8, 37, 12),
(1885, 8, 8, 37, 2),
(1886, 9, 8, 37, 5),
(1887, 10, 8, 37, 4),
(1888, 11, 8, 37, 12),
(1889, 13, 8, 37, 11),
(1890, 14, 8, 37, 12),
(1891, 15, 8, 37, 12),
(1892, 19, 8, 37, 11),
(1893, 0, 9, 37, 11),
(1894, 2, 9, 37, 12),
(1895, 4, 9, 37, 11),
(1896, 6, 9, 37, 12),
(1897, 7, 9, 37, 10),
(1898, 8, 9, 37, 12),
(1899, 10, 9, 37, 12),
(1900, 11, 9, 37, 12),
(1901, 13, 9, 37, 11),
(1902, 15, 9, 37, 12),
(1903, 19, 9, 37, 11),
(1904, 0, 10, 37, 11),
(1905, 1, 10, 37, 13),
(1906, 4, 10, 37, 11),
(1907, 13, 10, 37, 11),
(1908, 17, 10, 37, 12),
(1909, 19, 10, 37, 11),
(1910, 0, 11, 37, 12),
(1911, 1, 11, 37, 10),
(1912, 2, 11, 37, 10),
(1913, 3, 11, 37, 10),
(1914, 4, 11, 37, 12),
(1915, 5, 11, 37, 10),
(1916, 6, 11, 37, 10),
(1917, 7, 11, 37, 10),
(1918, 8, 11, 37, 10),
(1919, 9, 11, 37, 10),
(1920, 10, 11, 37, 10),
(1921, 11, 11, 37, 10),
(1922, 12, 11, 37, 10),
(1923, 13, 11, 37, 12),
(1924, 14, 11, 37, 10),
(1925, 15, 11, 37, 10),
(1926, 16, 11, 37, 10),
(1927, 17, 11, 37, 12),
(1928, 18, 11, 37, 9),
(1929, 19, 11, 37, 12),
(1930, 0, 0, 38, 12),
(1931, 1, 0, 38, 10),
(1932, 2, 0, 38, 10),
(1933, 3, 0, 38, 12),
(1934, 6, 0, 38, 12),
(1935, 7, 0, 38, 10),
(1936, 8, 0, 38, 10),
(1937, 9, 0, 38, 10),
(1938, 10, 0, 38, 10),
(1939, 11, 0, 38, 10),
(1940, 12, 0, 38, 10),
(1941, 13, 0, 38, 12),
(1942, 0, 1, 38, 11),
(1943, 1, 1, 38, 9),
(1944, 3, 1, 38, 11),
(1945, 5, 1, 38, 12),
(1946, 6, 1, 38, 12),
(1947, 13, 1, 38, 12),
(1948, 14, 1, 38, 10),
(1949, 15, 1, 38, 12),
(1950, 0, 2, 38, 11),
(1951, 1, 2, 38, 1),
(1952, 3, 2, 38, 12),
(1953, 4, 2, 38, 10),
(1954, 5, 2, 38, 12),
(1955, 8, 2, 38, 12),
(1956, 9, 2, 38, 10),
(1957, 10, 2, 38, 12),
(1958, 12, 2, 38, 8),
(1959, 15, 2, 38, 12),
(1960, 16, 2, 38, 10),
(1961, 17, 2, 38, 10),
(1962, 18, 2, 38, 12),
(1963, 0, 3, 38, 12),
(1964, 1, 3, 38, 12),
(1965, 6, 3, 38, 2),
(1966, 8, 3, 38, 11),
(1967, 10, 3, 38, 11),
(1968, 18, 3, 38, 12),
(1969, 19, 3, 38, 12),
(1970, 1, 4, 38, 11),
(1971, 7, 4, 38, 6),
(1972, 8, 4, 38, 11),
(1973, 10, 4, 38, 12),
(1974, 11, 4, 38, 10),
(1975, 12, 4, 38, 10),
(1976, 13, 4, 38, 10),
(1977, 14, 4, 38, 10),
(1978, 15, 4, 38, 10),
(1979, 16, 4, 38, 10),
(1980, 17, 4, 38, 12),
(1981, 19, 4, 38, 11),
(1982, 0, 5, 38, 12),
(1983, 1, 5, 38, 12),
(1984, 2, 5, 38, 10),
(1985, 3, 5, 38, 10),
(1986, 4, 5, 38, 10),
(1987, 5, 5, 38, 10),
(1988, 6, 5, 38, 10),
(1989, 7, 5, 38, 10),
(1990, 8, 5, 38, 12),
(1991, 17, 5, 38, 11),
(1992, 19, 5, 38, 11),
(1993, 0, 6, 38, 11),
(1994, 1, 6, 38, 6),
(1995, 2, 6, 38, 6),
(1996, 3, 6, 38, 6),
(1997, 10, 6, 38, 1),
(1998, 12, 6, 38, 12),
(1999, 13, 6, 38, 10),
(2000, 14, 6, 38, 10),
(2001, 15, 6, 38, 10),
(2002, 16, 6, 38, 10),
(2003, 17, 6, 38, 12),
(2004, 19, 6, 38, 11),
(2005, 0, 7, 38, 11),
(2006, 1, 7, 38, 6),
(2007, 2, 7, 38, 6),
(2008, 5, 7, 38, 12),
(2009, 6, 7, 38, 10),
(2010, 7, 7, 38, 10),
(2011, 8, 7, 38, 10),
(2012, 9, 7, 38, 12),
(2013, 11, 7, 38, 11),
(2014, 12, 7, 38, 13),
(2015, 19, 7, 38, 11),
(2016, 0, 8, 38, 12),
(2017, 1, 8, 38, 12),
(2018, 9, 8, 38, 11),
(2019, 11, 8, 38, 11),
(2020, 13, 8, 38, 2),
(2021, 17, 8, 38, 12),
(2022, 18, 8, 38, 10),
(2023, 19, 8, 38, 12),
(2024, 1, 9, 38, 12),
(2025, 2, 9, 38, 10),
(2026, 3, 9, 38, 10),
(2027, 4, 9, 38, 12),
(2028, 7, 9, 38, 5),
(2029, 9, 9, 38, 12),
(2030, 10, 9, 38, 10),
(2031, 11, 9, 38, 12),
(2032, 15, 9, 38, 12),
(2033, 16, 9, 38, 10),
(2034, 17, 9, 38, 12),
(2035, 4, 10, 38, 12),
(2036, 5, 10, 38, 10),
(2037, 6, 10, 38, 12),
(2038, 13, 10, 38, 12),
(2039, 14, 10, 38, 10),
(2040, 15, 10, 38, 12),
(2041, 6, 11, 38, 12),
(2042, 7, 11, 38, 10),
(2043, 8, 11, 38, 10),
(2044, 9, 11, 38, 10),
(2045, 10, 11, 38, 10),
(2046, 11, 11, 38, 10),
(2047, 12, 11, 38, 10),
(2048, 13, 11, 38, 12);

--
-- Indexes for dumped tables
--

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
-- AUTO_INCREMENT for table `map`
--
ALTER TABLE `map`
  MODIFY `IDMap` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=39;
--
-- AUTO_INCREMENT for table `mapbyelement`
--
ALTER TABLE `mapbyelement`
  MODIFY `IDPositionElement` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2049;
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
