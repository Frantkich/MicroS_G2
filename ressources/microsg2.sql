-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Dec 15, 2020 at 03:32 PM
-- Server version: 8.0.18
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `microsg2`
--

-- --------------------------------------------------------

--
-- Table structure for table `article`
--

DROP TABLE IF EXISTS `article`;
CREATE TABLE IF NOT EXISTS `article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `author_id` int(11) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `article`
--

INSERT INTO `article` (`id`, `author_id`, `category_id`, `content`, `date`, `title`) VALUES
(1, 22, 3, 'Nulla justo. Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis. Sed ante. Vivamus tortor. Duis mattis egestas metus. Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque ', '2020-03-04', 'Customer-focused'),
(2, 5, 5, 'Suspendisse accumsan tortor quis turpis. Sed ante. Vivamus tortor. Duis mattis egestas metus. Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh. Quisque id justo sit amet', '2020-06-07', 'interface'),
(3, 22, 9, 'Morbi a ipsum. Integer a nibh. In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet. Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat du', '2020-03-21', 'adapter'),
(4, 13, 2, 'Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus. Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel ', '2020-01-06', 'Distributed'),
(5, 19, 4, 'Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem. Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat. Praesent blandit. Nam nulla. Integer pede justo, lacinia eget, tin', '2020-05-28', 'attitude'),
(6, 8, 7, 'Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risus dapibus augue, vel accumsan tellus nisi eu orci. Mauris lacinia sapien quis libero. Nullam sit amet turpis elementum ligula ve', '2020-05-24', 'background'),
(7, 4, 2, 'Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl. Aenean lectus. Pellentesque eget nunc. Donec quis orci eget orci vehicula c', '2020-07-07', 'system engine'),
(8, 21, 2, 'In sagittis dui vel nisl. Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus. Suspendisse potenti. In eleifend quam a odio. In hac habitasse platea dictumst. Maecenas ut massa quis augue luctus tincidunt. Nulla mollis molestie ', '2020-07-04', 'middleware'),
(9, 25, 3, 'Nulla tellus. In sagittis dui vel nisl. Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus. Suspendisse potenti. In eleifend quam a odio. In hac habitasse platea dictumst. Maecenas ut massa quis augue luctus tincidunt. Nulla mo', '2020-01-08', 'alliance'),
(10, 25, 10, 'Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl. Aenean lectus. Pellentesque eget nunc. Donec quis orci eget orci vehicula c', '2020-10-15', 'moratorium'),
(11, 8, 1, 'Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est. Phasellus sit amet erat. Nulla tempus. Vivamus in felis eu sapien cursus vestibulum. Proin eu mi. Nulla ac enim. In tempor, turpis nec euismod scelerisque, quam', '2020-01-05', 'Enterprise-wide'),
(12, 25, 4, 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien iaculis congue. Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl. Aenean lectus. Pe', '2020-03-20', 'motivating'),
(13, 4, 6, 'Cras pellentesque volutpat dui. Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam. S', '2020-08-17', 'Synergistic'),
(14, 10, 3, 'Aenean auctor gravida sem. Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio. Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim. Lorem ipsum dolor sit amet, consectetuer adipiscing', '2020-03-03', 'uniform'),
(15, 17, 9, 'Nulla justo. Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis. Sed ante. Vivamus tortor. Duis mattis egestas metus. Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque ', '2020-05-06', 'groupware'),
(16, 22, 9, 'Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus. Suspendisse potenti. In eleifend quam a odio. In hac habitasse platea dictumst. Maecenas ut massa quis augue luctus tincidunt. Nulla mollis molestie lorem. Quisque ut erat. Cu', '2020-08-10', '4th generation'),
(17, 17, 5, 'Etiam justo. Etiam pretium iaculis justo. In hac habitasse platea dictumst. Etiam faucibus cursus urna. Ut tellus. Nulla ut erat id mauris vulputate elementum. Nullam varius. Nulla facilisi. Cras non velit nec nisi vulputate nonummy. Maecenas tincidunt la', '2020-07-20', 'web-enabled'),
(18, 2, 10, 'Nulla mollis molestie lorem. Quisque ut erat. Curabitur gravida nisi at nibh. In hac habitasse platea dictumst. Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem. Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. V', '2020-02-04', 'Profound'),
(19, 17, 3, 'Vivamus tortor. Duis mattis egestas metus. Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh. Quisque id justo sit amet sapien dignissim vestibulum. Vestibulum ante ipsum', '2019-12-16', 'Versatile'),
(20, 1, 9, 'In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem. Duis aliquam convallis nunc. Proin at turpis a pede posuere nonummy. Integer non velit. Donec diam neque, vestibulum eget, vulputate ut, ultrices ve', '2020-09-21', 'upward-trending'),
(21, 16, 3, 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis. Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus. Mauris eni', '2020-10-06', 'Extended'),
(22, 18, 2, 'Duis mattis egestas metus. Aenean fermentum. Donec ut mauris eget massa tempor convallis. Nulla neque libero, convallis eget, eleifend luctus, ultricies eu, nibh. Quisque id justo sit amet sapien dignissim vestibulum. Vestibulum ante ipsum primis in fauci', '2020-11-30', 'task-force'),
(23, 19, 10, 'In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet. Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui. Maecenas tristique, est et t', '2019-12-15', 'Fundamental'),
(24, 4, 9, 'Curabitur convallis. Duis consequat dui nec nisi volutpat eleifend. Donec ut dolor. Morbi vel lectus in quam fringilla rhoncus. Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis. Integer aliquet, massa id lobortis convallis, tortor risu', '2020-03-25', 'database'),
(25, 7, 7, 'Nullam molestie nibh in lectus. Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoq', '2020-10-26', 'reciprocal'),
(26, 4, 10, 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Donec pharetra, magna vestibulum aliquet ultrices, erat tortor sollicitudin mi, sit amet lobortis sapien sapien non mi. Integer ac neque. Duis bibendum. Morbi non quam', '2020-05-15', 'Multi-channelled'),
(27, 10, 2, 'Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo. Aliquam quis turpis eget elit sodales scelerisque. Mauris sit amet eros. Suspendisse accumsan tortor quis turpis. Sed ante. Viv', '2020-01-30', 'Cross-platform'),
(28, 1, 9, 'Morbi non lectus. Aliquam sit amet diam in magna bibendum imperdiet. Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis. Fusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel ', '2020-07-22', 'Managed'),
(29, 11, 9, 'Morbi ut odio. Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin interdum mauris non ligula pellentesque ultrices. Phasellus id sapien in sapien ia', '2020-10-05', 'encoding'),
(30, 2, 2, 'Praesent lectus. Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio. Curabitur convallis. Duis consequat dui nec nisi volut', '2020-01-25', 'Cloned'),
(31, 8, 9, 'In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet. Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui. Maecenas tristique, est et t', '2020-04-20', '6th generation'),
(32, 17, 8, 'Nullam molestie nibh in lectus. Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus vestibulum sagittis sapien. Cum sociis natoq', '2020-08-09', 'bandwidth-monitored'),
(33, 7, 4, 'In eleifend quam a odio. In hac habitasse platea dictumst. Maecenas ut massa quis augue luctus tincidunt. Nulla mollis molestie lorem. Quisque ut erat. Curabitur gravida nisi at nibh. In hac habitasse platea dictumst. Aliquam augue quam, sollicitudin vita', '2020-11-27', 'Exclusive'),
(34, 1, 2, 'Nulla tellus. In sagittis dui vel nisl. Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus. Suspendisse potenti. In eleifend quam a odio. In hac habitasse platea dictumst. Maecenas ut massa quis augue luctus tincidunt. Nulla mo', '2020-08-24', 'benchmark'),
(35, 17, 4, 'Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem. Integer tincidunt ante vel ipsum. Praesent blandit lacinia erat. Vestibulum sed magna at nunc commodo placerat. Praesent blandit. Nam nulla. Integer pede justo, lacinia eget, tin', '2020-11-27', 'product'),
(36, 11, 2, 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin risus. Praesent lectus. Vestibulum quam sapien, varius ut, blandit non, interdum in, ante. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibu', '2020-08-02', 'Phased'),
(37, 5, 5, 'Fusce posuere felis sed lacus. Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem. Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam m', '2020-07-11', 'project'),
(38, 19, 5, 'Cras non velit nec nisi vulputate nonummy. Maecenas tincidunt lacus at velit. Vivamus vel nulla eget eros elementum pellentesque. Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus. Phasellus in fel', '2020-06-05', 'ability'),
(39, 7, 1, 'Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus. Suspendisse potenti. In eleifend quam a odio. In hac habitasse platea dictumst. Maecenas ut massa quis augue luctus tincidunt. Nulla mollis molestie lorem. Quisque ut erat. Cu', '2020-05-19', 'definition'),
(40, 18, 5, 'Nulla facilisi. Cras non velit nec nisi vulputate nonummy. Maecenas tincidunt lacus at velit. Vivamus vel nulla eget eros elementum pellentesque. Quisque porta volutpat erat. Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus. ', '2020-05-06', 'Public-key'),
(41, 9, 2, 'Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus. Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus. Cum sociis nato', '2019-12-18', 'Persistent'),
(42, 11, 8, 'Vestibulum rutrum rutrum neque. Aenean auctor gravida sem. Praesent id massa id nisl venenatis lacinia. Aenean sit amet justo. Morbi ut odio. Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo. In blandit ultrices enim. Lorem ipsum dolor s', '2020-11-20', 'needs-based'),
(43, 10, 3, 'Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla. Nunc purus. Phasellus in felis. Donec semper sapien a libero. Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis. Ut at dolor quis odio consequat', '2020-08-01', 'Expanded'),
(44, 21, 9, 'Morbi non quam nec dui luctus rutrum. Nulla tellus. In sagittis dui vel nisl. Duis ac nibh. Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus. Suspendisse potenti. In eleifend quam a odio. In hac habitasse platea dictumst. Maecenas ut massa', '2020-08-19', 'Reduced'),
(45, 15, 6, 'In quis justo. Maecenas rhoncus aliquam lacus. Morbi quis tortor id nulla ultrices aliquet. Maecenas leo odio, condimentum id, luctus nec, molestie sed, justo. Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui. Maecenas tristique, est et t', '2020-06-08', 'intermediate'),
(46, 17, 6, 'Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus. Pellentesque at nulla. Suspendisse potenti. Cras in purus eu magna vulputate luctus. Cum sociis natoque penatibus ', '2020-10-27', 'grid-enabled'),
(47, 14, 8, 'Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa. Donec dapibus. Duis at velit eu est congue elementum. In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum ', '2019-12-19', 'upward-trending'),
(48, 3, 1, 'Pellentesque viverra pede ac diam. Cras pellentesque volutpat dui. Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae', '2020-03-25', 'support'),
(49, 18, 4, 'Nunc nisl. Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa. Donec dapibus. Duis at velit eu est congue elementum. In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat', '2020-10-17', 'Seamless'),
(50, 15, 6, 'Donec quis orci eget orci vehicula condimentum. Curabitur in libero ut massa volutpat convallis. Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo. Maecenas pulvinar lobortis est. Phasellus sit amet erat. Nulla tempus. Vivamus in felis eu sapi', '2020-06-28', 'workforce');

-- --------------------------------------------------------

--
-- Table structure for table `author`
--

DROP TABLE IF EXISTS `author`;
CREATE TABLE IF NOT EXISTS `author` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `author`
--

INSERT INTO `author` (`id`, `email`, `password`, `username`) VALUES
(1, 'Järna', 'Sweden', 'vreihill0'),
(2, 'Sherwood Park', 'Canada', 'fcocks1'),
(3, 'Tolú', 'Colombia', 'mrehme2'),
(4, 'Lembursawah', 'Indonesia', 'amouth3'),
(5, 'Åhus', 'Sweden', 'mdutteridge4'),
(6, 'Korostyshiv', 'Ukraine', 'pollet5'),
(7, 'Jindong', 'China', 'gfeldmus6'),
(8, 'Astorga', 'Brazil', 'djones7'),
(9, 'Katyr-Yurt', 'Russia', 'ngrevel8'),
(10, 'Monte', 'Portugal', 'acorbishley9'),
(11, 'Kamionka', 'Poland', 'orodenborcha'),
(12, 'Woken', 'China', 'fhandoverb'),
(13, 'Santiago', 'Philippines', 'bluetkemeyersc'),
(14, 'Shisui', 'Japan', 'sbodend'),
(15, 'Dinghuo', 'China', 'hjohanssone'),
(16, 'Jianghua', 'China', 'fharcarsef'),
(17, 'Undurkhaan', 'Mongolia', 'oreckhouseg'),
(18, 'Komprachcice', 'Poland', 'npeppinh'),
(19, 'Munduk', 'Indonesia', 'zjohanssoni'),
(20, 'Laâyoune / El Aaiún', 'Western Sahara', 'kilchukj'),
(21, 'Áno Sýros', 'Greece', 'tgailork'),
(22, 'Yanglin', 'China', 'cshilloml'),
(23, 'Paris 07', 'France', 'imanniem'),
(24, 'Botucatu', 'Brazil', 'smcgraylen'),
(25, 'El Plan', 'Honduras', 'cstraseo');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE IF NOT EXISTS `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id`, `name`) VALUES
(1, 'Saturn'),
(2, 'Jaguar'),
(3, 'Aston Martin'),
(4, 'Honda'),
(5, 'Dodge'),
(6, 'Acura'),
(7, 'Honda'),
(8, 'Kia'),
(9, 'Ford'),
(10, 'Renault');

-- --------------------------------------------------------

--
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
CREATE TABLE IF NOT EXISTS `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `article_id` int(11) DEFAULT NULL,
  `author_id` int(11) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=251 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `comment`
--

INSERT INTO `comment` (`id`, `article_id`, `author_id`, `content`, `date`) VALUES
(1, 6, 13, 'Praesent id massa id nisl venenatis lacinia.', '2020-04-15'),
(2, 10, 8, 'Proin at turpis a pede posuere nonummy.', '2020-07-15'),
(3, 44, 21, 'Integer ac neque.', '2020-05-06'),
(4, 12, 8, 'Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo.', '2020-11-08'),
(5, 37, 15, 'Integer ac leo.', '2020-02-02'),
(6, 28, 11, 'Nulla tempus.', '2020-07-04'),
(7, 32, 20, 'Etiam faucibus cursus urna.', '2020-04-22'),
(8, 43, 22, 'Quisque ut erat.', '2020-12-03'),
(9, 36, 4, 'Duis aliquam convallis nunc.', '2020-10-16'),
(10, 21, 13, 'Proin risus.', '2019-12-20'),
(11, 31, 22, 'Integer ac leo.', '2020-12-05'),
(12, 25, 4, 'Proin at turpis a pede posuere nonummy.', '2020-08-06'),
(13, 19, 24, 'Sed sagittis.', '2020-11-01'),
(14, 43, 2, 'In hac habitasse platea dictumst.', '2020-07-25'),
(15, 42, 16, 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit.', '2020-09-02'),
(16, 37, 9, 'Curabitur gravida nisi at nibh.', '2020-07-12'),
(17, 10, 2, 'Suspendisse ornare consequat lectus.', '2020-07-11'),
(18, 46, 25, 'Nulla tellus.', '2020-03-19'),
(19, 19, 9, 'Nulla mollis molestie lorem.', '2020-11-24'),
(20, 43, 8, 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio.', '2020-06-12'),
(21, 43, 4, 'In hac habitasse platea dictumst.', '2020-08-24'),
(22, 7, 14, 'Donec quis orci eget orci vehicula condimentum.', '2020-03-05'),
(23, 11, 25, 'Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla.', '2020-08-17'),
(24, 8, 23, 'Curabitur at ipsum ac tellus semper interdum.', '2020-11-28'),
(25, 41, 16, 'In est risus, auctor sed, tristique in, tempus sit amet, sem.', '2020-07-12'),
(26, 27, 12, 'Integer a nibh.', '2020-08-10'),
(27, 25, 19, 'Maecenas ut massa quis augue luctus tincidunt.', '2019-12-15'),
(28, 44, 18, 'Morbi quis tortor id nulla ultrices aliquet.', '2020-06-08'),
(29, 35, 22, 'Vestibulum sed magna at nunc commodo placerat.', '2020-01-22'),
(30, 12, 11, 'Quisque id justo sit amet sapien dignissim vestibulum.', '2020-11-25'),
(31, 19, 25, 'Etiam vel augue.', '2020-04-28'),
(32, 46, 23, 'In hac habitasse platea dictumst.', '2020-02-25'),
(33, 9, 11, 'In hac habitasse platea dictumst.', '2020-09-17'),
(34, 13, 15, 'Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci.', '2020-04-09'),
(35, 24, 3, 'Duis ac nibh.', '2020-10-16'),
(36, 27, 23, 'Integer ac leo.', '2020-08-05'),
(37, 7, 20, 'Morbi porttitor lorem id ligula.', '2020-10-23'),
(38, 24, 9, 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio.', '2020-11-27'),
(39, 19, 9, 'In hac habitasse platea dictumst.', '2020-12-10'),
(40, 22, 4, 'Integer ac leo.', '2020-12-07'),
(41, 34, 10, 'Phasellus id sapien in sapien iaculis congue.', '2020-10-16'),
(42, 44, 4, 'Donec semper sapien a libero.', '2020-02-16'),
(43, 15, 22, 'Nulla mollis molestie lorem.', '2020-12-02'),
(44, 12, 9, 'Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc.', '2020-04-18'),
(45, 35, 22, 'Integer a nibh.', '2020-08-15'),
(46, 14, 12, 'Vestibulum quam sapien, varius ut, blandit non, interdum in, ante.', '2020-08-08'),
(47, 37, 14, 'Proin leo odio, porttitor id, consequat in, consequat ut, nulla.', '2020-07-10'),
(48, 15, 1, 'Nunc nisl.', '2020-04-26'),
(49, 10, 4, 'Duis consequat dui nec nisi volutpat eleifend.', '2020-07-23'),
(50, 35, 3, 'Vestibulum rutrum rutrum neque.', '2020-07-03'),
(51, 11, 2, 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit.', '2020-05-10'),
(52, 45, 1, 'In hac habitasse platea dictumst.', '2020-07-29'),
(53, 40, 25, 'Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis.', '2019-12-19'),
(54, 23, 16, 'Vestibulum sed magna at nunc commodo placerat.', '2020-06-20'),
(55, 20, 7, 'Ut at dolor quis odio consequat varius.', '2020-05-08'),
(56, 49, 6, 'Proin leo odio, porttitor id, consequat in, consequat ut, nulla.', '2020-01-10'),
(57, 36, 11, 'Phasellus id sapien in sapien iaculis congue.', '2020-08-29'),
(58, 13, 18, 'Duis consequat dui nec nisi volutpat eleifend.', '2020-07-06'),
(59, 6, 19, 'Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo.', '2020-05-28'),
(60, 6, 25, 'Integer tincidunt ante vel ipsum.', '2020-04-01'),
(61, 49, 4, 'Duis at velit eu est congue elementum.', '2020-09-29'),
(62, 5, 2, 'Maecenas ut massa quis augue luctus tincidunt.', '2020-04-12'),
(63, 40, 10, 'Nunc rhoncus dui vel sem.', '2020-08-21'),
(64, 15, 19, 'Maecenas tincidunt lacus at velit.', '2020-05-17'),
(65, 20, 18, 'Etiam vel augue.', '2020-05-08'),
(66, 7, 19, 'Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc.', '2020-02-04'),
(67, 25, 18, 'Nullam porttitor lacus at turpis.', '2020-01-16'),
(68, 45, 23, 'Proin eu mi.', '2020-05-04'),
(69, 46, 4, 'Nulla tellus.', '2020-10-05'),
(70, 13, 11, 'Morbi non lectus.', '2020-02-11'),
(71, 36, 21, 'Etiam faucibus cursus urna.', '2020-07-24'),
(72, 27, 1, 'Maecenas pulvinar lobortis est.', '2020-03-21'),
(73, 41, 1, 'In hac habitasse platea dictumst.', '2020-01-28'),
(74, 23, 4, 'Duis bibendum.', '2020-01-09'),
(75, 12, 25, 'In hac habitasse platea dictumst.', '2020-07-27'),
(76, 6, 16, 'Cras mi pede, malesuada in, imperdiet et, commodo vulputate, justo.', '2020-11-23'),
(77, 28, 16, 'Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl.', '2020-09-08'),
(78, 38, 1, 'Nunc purus.', '2020-09-23'),
(79, 20, 18, 'Nulla suscipit ligula in lacus.', '2020-01-21'),
(80, 28, 18, 'Pellentesque viverra pede ac diam.', '2020-02-29'),
(81, 41, 15, 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Duis faucibus accumsan odio.', '2020-11-24'),
(82, 6, 1, 'Maecenas tincidunt lacus at velit.', '2020-06-24'),
(83, 2, 8, 'Quisque porta volutpat erat.', '2020-09-23'),
(84, 23, 12, 'Proin leo odio, porttitor id, consequat in, consequat ut, nulla.', '2020-05-30'),
(85, 27, 1, 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam.', '2020-05-07'),
(86, 13, 9, 'Proin interdum mauris non ligula pellentesque ultrices.', '2020-04-21'),
(87, 19, 16, 'Morbi a ipsum.', '2020-08-08'),
(88, 20, 13, 'Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue.', '2020-03-21'),
(89, 30, 7, 'Curabitur gravida nisi at nibh.', '2020-03-22'),
(90, 27, 3, 'Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl.', '2020-03-24'),
(91, 7, 13, 'Pellentesque ultrices mattis odio.', '2020-04-21'),
(92, 37, 13, 'Nam dui.', '2020-03-31'),
(93, 24, 10, 'Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante.', '2020-04-26'),
(94, 45, 13, 'Vestibulum sed magna at nunc commodo placerat.', '2020-05-07'),
(95, 43, 2, 'Morbi porttitor lorem id ligula.', '2020-09-16'),
(96, 43, 15, 'Etiam justo.', '2020-02-16'),
(97, 17, 14, 'Sed vel enim sit amet nunc viverra dapibus.', '2020-05-12'),
(98, 16, 16, 'Etiam justo.', '2019-12-31'),
(99, 34, 9, 'Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl.', '2020-01-28'),
(100, 13, 7, 'Suspendisse potenti.', '2020-10-28'),
(101, 32, 2, 'Integer ac neque.', '2020-08-08'),
(102, 6, 10, 'In hac habitasse platea dictumst.', '2020-10-07'),
(103, 22, 25, 'Cras non velit nec nisi vulputate nonummy.', '2020-10-03'),
(104, 22, 6, 'In congue.', '2020-02-24'),
(105, 35, 10, 'Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis.', '2020-02-02'),
(106, 10, 12, 'Integer ac leo.', '2020-02-12'),
(107, 2, 18, 'Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla.', '2020-08-16'),
(108, 35, 15, 'Mauris lacinia sapien quis libero.', '2020-08-09'),
(109, 48, 16, 'Nulla ac enim.', '2020-01-28'),
(110, 12, 14, 'Sed accumsan felis.', '2020-10-21'),
(111, 7, 5, 'Nam tristique tortor eu pede.', '2020-01-01'),
(112, 48, 5, 'Fusce lacus purus, aliquet at, feugiat non, pretium quis, lectus.', '2020-02-28'),
(113, 40, 24, 'Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.', '2020-06-07'),
(114, 45, 2, 'Suspendisse accumsan tortor quis turpis.', '2020-08-24'),
(115, 36, 4, 'Duis bibendum.', '2020-02-01'),
(116, 32, 9, 'Nulla justo.', '2020-06-22'),
(117, 7, 15, 'Ut tellus.', '2020-07-07'),
(118, 10, 5, 'Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl.', '2020-07-17'),
(119, 37, 4, 'Maecenas rhoncus aliquam lacus.', '2020-09-10'),
(120, 37, 9, 'Etiam vel augue.', '2020-08-24'),
(121, 32, 19, 'Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis.', '2020-09-09'),
(122, 24, 7, 'Nullam varius.', '2020-01-05'),
(123, 44, 11, 'Nam nulla.', '2020-03-28'),
(124, 21, 19, 'Donec dapibus.', '2020-05-07'),
(125, 49, 6, 'Sed ante.', '2020-04-01'),
(126, 40, 17, 'Nam dui.', '2020-08-18'),
(127, 24, 18, 'Maecenas ut massa quis augue luctus tincidunt.', '2020-02-02'),
(128, 30, 10, 'Nulla ut erat id mauris vulputate elementum.', '2020-09-08'),
(129, 11, 13, 'Aenean lectus.', '2020-06-18'),
(130, 47, 14, 'Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue.', '2020-09-19'),
(131, 11, 24, 'Nullam molestie nibh in lectus.', '2020-05-19'),
(132, 23, 21, 'In quis justo.', '2020-02-07'),
(133, 8, 17, 'Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa.', '2020-01-10'),
(134, 4, 17, 'Phasellus sit amet erat.', '2020-08-06'),
(135, 31, 16, 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam.', '2020-11-04'),
(136, 50, 7, 'Morbi quis tortor id nulla ultrices aliquet.', '2020-04-26'),
(137, 27, 19, 'In hac habitasse platea dictumst.', '2020-01-17'),
(138, 32, 17, 'Donec vitae nisi.', '2020-11-20'),
(139, 7, 8, 'Duis bibendum.', '2020-03-12'),
(140, 5, 7, 'Phasellus sit amet erat.', '2020-05-20'),
(141, 19, 5, 'Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem.', '2020-05-27'),
(142, 14, 25, 'Nulla justo.', '2020-02-13'),
(143, 43, 10, 'Aenean lectus.', '2020-09-28'),
(144, 43, 21, 'Aenean auctor gravida sem.', '2020-06-07'),
(145, 18, 15, 'Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla.', '2020-03-21'),
(146, 27, 18, 'Maecenas tincidunt lacus at velit.', '2020-04-12'),
(147, 38, 6, 'Curabitur in libero ut massa volutpat convallis.', '2020-08-22'),
(148, 19, 11, 'Vestibulum sed magna at nunc commodo placerat.', '2020-07-05'),
(149, 9, 7, 'Aenean lectus.', '2020-05-12'),
(150, 5, 9, 'Nulla ac enim.', '2020-03-13'),
(151, 5, 18, 'Nulla justo.', '2020-07-28'),
(152, 35, 21, 'Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.', '2020-03-21'),
(153, 27, 24, 'Donec ut dolor.', '2020-03-04'),
(154, 18, 3, 'Morbi non quam nec dui luctus rutrum.', '2020-12-10'),
(155, 21, 11, 'Maecenas ut massa quis augue luctus tincidunt.', '2020-05-06'),
(156, 32, 16, 'Pellentesque eget nunc.', '2020-07-17'),
(157, 23, 19, 'Pellentesque at nulla.', '2020-11-13'),
(158, 28, 18, 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam.', '2020-06-24'),
(159, 47, 3, 'Vivamus in felis eu sapien cursus vestibulum.', '2020-11-12'),
(160, 50, 2, 'Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla.', '2020-11-29'),
(161, 44, 25, 'Nulla suscipit ligula in lacus.', '2020-01-21'),
(162, 17, 22, 'Morbi non lectus.', '2020-05-27'),
(163, 22, 3, 'Cras pellentesque volutpat dui.', '2020-12-08'),
(164, 35, 22, 'Morbi non quam nec dui luctus rutrum.', '2020-11-01'),
(165, 11, 7, 'Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem.', '2020-10-16'),
(166, 23, 11, 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris viverra diam vitae quam.', '2020-05-21'),
(167, 39, 1, 'Mauris lacinia sapien quis libero.', '2020-10-21'),
(168, 8, 7, 'Nunc purus.', '2020-08-16'),
(169, 4, 5, 'Integer pede justo, lacinia eget, tincidunt eget, tempus vel, pede.', '2020-09-06'),
(170, 4, 17, 'Morbi a ipsum.', '2020-08-17'),
(171, 48, 9, 'Sed ante.', '2019-12-18'),
(172, 43, 1, 'Nullam molestie nibh in lectus.', '2020-07-28'),
(173, 8, 4, 'Integer ac leo.', '2020-06-23'),
(174, 8, 18, 'Pellentesque viverra pede ac diam.', '2020-07-24'),
(175, 42, 8, 'Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue.', '2020-03-28'),
(176, 7, 20, 'Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc.', '2020-05-11'),
(177, 9, 17, 'Maecenas pulvinar lobortis est.', '2020-11-03'),
(178, 15, 8, 'Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa.', '2020-09-10'),
(179, 37, 15, 'Donec posuere metus vitae ipsum.', '2020-11-30'),
(180, 47, 18, 'Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem.', '2020-07-02'),
(181, 29, 19, 'Sed vel enim sit amet nunc viverra dapibus.', '2020-04-28'),
(182, 18, 14, 'Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue.', '2020-01-23'),
(183, 23, 4, 'Quisque id justo sit amet sapien dignissim vestibulum.', '2020-09-25'),
(184, 32, 9, 'Aenean auctor gravida sem.', '2020-05-08'),
(185, 49, 7, 'Mauris ullamcorper purus sit amet nulla.', '2020-11-14'),
(186, 46, 21, 'Nulla nisl.', '2020-10-02'),
(187, 39, 21, 'Fusce congue, diam id ornare imperdiet, sapien urna pretium nisl, ut volutpat sapien arcu sed augue.', '2020-05-27'),
(188, 1, 20, 'Pellentesque at nulla.', '2020-10-18'),
(189, 20, 4, 'Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci.', '2020-05-06'),
(190, 7, 18, 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est.', '2020-11-28'),
(191, 39, 18, 'Nulla suscipit ligula in lacus.', '2020-03-01'),
(192, 5, 6, 'Nulla justo.', '2020-10-28'),
(193, 1, 6, 'Maecenas rhoncus aliquam lacus.', '2020-05-04'),
(194, 40, 19, 'Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo.', '2019-12-24'),
(195, 15, 20, 'Vivamus tortor.', '2020-07-16'),
(196, 12, 1, 'Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci.', '2020-02-22'),
(197, 38, 19, 'Morbi ut odio.', '2020-03-26'),
(198, 13, 24, 'Morbi odio odio, elementum eu, interdum eu, tincidunt in, leo.', '2020-10-12'),
(199, 37, 14, 'Nullam porttitor lacus at turpis.', '2020-09-07'),
(200, 3, 11, 'Pellentesque viverra pede ac diam.', '2020-10-25'),
(201, 18, 2, 'In est risus, auctor sed, tristique in, tempus sit amet, sem.', '2020-11-18'),
(202, 15, 22, 'Aliquam erat volutpat.', '2020-03-12'),
(203, 43, 17, 'Quisque arcu libero, rutrum ac, lobortis vel, dapibus at, diam.', '2020-06-13'),
(204, 32, 25, 'Duis ac nibh.', '2020-01-26'),
(205, 26, 20, 'Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa.', '2020-05-08'),
(206, 18, 3, 'Proin interdum mauris non ligula pellentesque ultrices.', '2020-10-18'),
(207, 7, 6, 'Mauris ullamcorper purus sit amet nulla.', '2020-01-14'),
(208, 12, 14, 'In congue.', '2020-05-31'),
(209, 43, 16, 'Proin leo odio, porttitor id, consequat in, consequat ut, nulla.', '2020-09-05'),
(210, 41, 23, 'Integer non velit.', '2019-12-15'),
(211, 48, 5, 'Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem.', '2020-03-23'),
(212, 20, 7, 'Donec dapibus.', '2020-12-14'),
(213, 41, 11, 'Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis.', '2020-09-28'),
(214, 50, 1, 'Sed ante.', '2020-01-29'),
(215, 42, 24, 'Etiam vel augue.', '2020-02-17'),
(216, 10, 6, 'Integer ac neque.', '2020-03-06'),
(217, 44, 9, 'Vestibulum ac est lacinia nisi venenatis tristique.', '2020-07-14'),
(218, 45, 14, 'Quisque erat eros, viverra eget, congue eget, semper rutrum, nulla.', '2020-08-26'),
(219, 35, 15, 'Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc.', '2020-04-04'),
(220, 41, 6, 'Duis bibendum.', '2020-06-15'),
(221, 10, 14, 'Vivamus vel nulla eget eros elementum pellentesque.', '2020-09-06'),
(222, 9, 23, 'Etiam pretium iaculis justo.', '2019-12-24'),
(223, 37, 17, 'Quisque arcu libero, rutrum ac, lobortis vel, dapibus at, diam.', '2020-11-18'),
(224, 24, 25, 'Nullam molestie nibh in lectus.', '2020-06-08'),
(225, 38, 24, 'Nullam orci pede, venenatis non, sodales sed, tincidunt eu, felis.', '2020-09-23'),
(226, 29, 16, 'Cras in purus eu magna vulputate luctus.', '2020-04-03'),
(227, 1, 8, 'Nunc nisl.', '2020-02-27'),
(228, 25, 10, 'Donec dapibus.', '2020-06-26'),
(229, 34, 23, 'Maecenas tristique, est et tempus semper, est quam pharetra magna, ac consequat metus sapien ut nunc.', '2020-08-26'),
(230, 12, 23, 'Aliquam augue quam, sollicitudin vitae, consectetuer eget, rutrum at, lorem.', '2020-11-21'),
(231, 23, 17, 'Nunc nisl.', '2020-09-25'),
(232, 35, 20, 'Morbi non quam nec dui luctus rutrum.', '2020-08-15'),
(233, 19, 10, 'Sed ante.', '2020-02-06'),
(234, 8, 18, 'In tempor, turpis nec euismod scelerisque, quam turpis adipiscing lorem, vitae mattis nibh ligula nec sem.', '2020-12-08'),
(235, 27, 24, 'Suspendisse potenti.', '2020-10-16'),
(236, 39, 15, 'Vivamus tortor.', '2020-07-24'),
(237, 39, 21, 'Morbi vel lectus in quam fringilla rhoncus.', '2020-09-29'),
(238, 48, 17, 'Nam nulla.', '2020-09-28'),
(239, 20, 4, 'In sagittis dui vel nisl.', '2020-09-28'),
(240, 23, 9, 'In blandit ultrices enim.', '2020-10-18'),
(241, 11, 10, 'Cras pellentesque volutpat dui.', '2020-10-27'),
(242, 12, 22, 'Vivamus tortor.', '2020-05-11'),
(243, 45, 20, 'Maecenas rhoncus aliquam lacus.', '2020-05-23'),
(244, 39, 14, 'Nulla ac enim.', '2020-05-04'),
(245, 3, 16, 'Nulla tempus.', '2020-05-19'),
(246, 34, 13, 'Fusce posuere felis sed lacus.', '2020-01-15'),
(247, 42, 20, 'Praesent id massa id nisl venenatis lacinia.', '2020-04-19'),
(248, 30, 6, 'Donec semper sapien a libero.', '2020-08-06'),
(249, 40, 22, 'Morbi quis tortor id nulla ultrices aliquet.', '2020-06-19'),
(250, 47, 7, 'Proin at turpis a pede posuere nonummy.', '2019-12-30');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
