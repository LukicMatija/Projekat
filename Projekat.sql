/*
SQLyog Community v13.1.9 (64 bit)
MySQL - 10.4.27-MariaDB : Database - projekat
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`projekat` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `projekat`;

/*Table structure for table `grad` */

DROP TABLE IF EXISTS `grad`;

CREATE TABLE `grad` (
  `ZIPCode` varchar(5) NOT NULL,
  `Ime` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ZIPCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `grad` */

/*Table structure for table `kompanija` */

DROP TABLE IF EXISTS `kompanija`;

CREATE TABLE `kompanija` (
  `IDKompanije` int(11) NOT NULL AUTO_INCREMENT,
  `PIB` varchar(8) DEFAULT NULL,
  `Ime` varchar(50) DEFAULT NULL,
  `Kontakt` varchar(50) DEFAULT NULL,
  `Mail` varchar(100) DEFAULT NULL,
  `Mesto` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`IDKompanije`),
  KEY `Mesto` (`Mesto`),
  CONSTRAINT `kompanija_ibfk_1` FOREIGN KEY (`Mesto`) REFERENCES `grad` (`ZIPCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `kompanija` */

/*Table structure for table `praksa` */

DROP TABLE IF EXISTS `praksa`;

CREATE TABLE `praksa` (
  `IDPrakse` int(11) NOT NULL AUTO_INCREMENT,
  `IDStudenta` int(11) DEFAULT NULL,
  `IDKompanije` int(11) DEFAULT NULL,
  `DatumOd` date DEFAULT NULL,
  `DatumDo` date DEFAULT NULL,
  PRIMARY KEY (`IDPrakse`),
  UNIQUE KEY `UQ_Praksa` (`IDStudenta`,`IDKompanije`),
  KEY `IDKompanije` (`IDKompanije`),
  CONSTRAINT `praksa_ibfk_1` FOREIGN KEY (`IDStudenta`) REFERENCES `student` (`IDStudenta`),
  CONSTRAINT `praksa_ibfk_2` FOREIGN KEY (`IDKompanije`) REFERENCES `kompanija` (`IDKompanije`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `praksa` */

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `IDStudenta` int(11) NOT NULL AUTO_INCREMENT,
  `JMBG` varchar(13) DEFAULT NULL,
  `Ime` varchar(50) DEFAULT NULL,
  `Prezime` varchar(50) DEFAULT NULL,
  `DatumRodjenja` date DEFAULT NULL,
  `mail` varchar(100) DEFAULT NULL,
  `StudentskiMail` varchar(100) DEFAULT NULL,
  `Kontakt` varchar(15) DEFAULT NULL,
  `Indeks` varchar(10) DEFAULT NULL,
  `StudijskiProgram` varchar(100) DEFAULT NULL,
  `StepenStudija` varchar(100) DEFAULT NULL,
  `MestoRodjenja` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`IDStudenta`),
  KEY `MestoRodnjea` (`MestoRodjenja`),
  CONSTRAINT `student_ibfk_1` FOREIGN KEY (`MestoRodjenja`) REFERENCES `grad` (`ZIPCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `student` */

/*Table structure for table `ugovor` */

DROP TABLE IF EXISTS `ugovor`;

CREATE TABLE `ugovor` (
  `IDUgovora` int(11) NOT NULL AUTO_INCREMENT,
  `IDKompanije` int(11) DEFAULT NULL,
  `DatumOd` date DEFAULT NULL,
  `DatumDo` date DEFAULT NULL,
  `Aktivan` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`IDUgovora`),
  KEY `IDKompanije` (`IDKompanije`),
  CONSTRAINT `ugovor_ibfk_1` FOREIGN KEY (`IDKompanije`) REFERENCES `kompanija` (`IDKompanije`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `ugovor` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
