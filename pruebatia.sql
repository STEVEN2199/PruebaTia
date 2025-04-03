CREATE DATABASE  IF NOT EXISTS `pruebatia` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `pruebatia`;
-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: pruebatia
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_potencia`
--

DROP TABLE IF EXISTS `tbl_potencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_potencia` (
  `id_potencia` bigint NOT NULL AUTO_INCREMENT,
  `hostilidad` varchar(25) DEFAULT NULL,
  `potencia` varchar(25) DEFAULT NULL,
  `ubicacion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_potencia`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_potencia`
--

LOCK TABLES `tbl_potencia` WRITE;
/*!40000 ALTER TABLE `tbl_potencia` DISABLE KEYS */;
INSERT INTO `tbl_potencia` VALUES (1,'97','ESTADOS UNIDOS','NORTEAMERICA'),(2,'98','RUSIA','EUROPA'),(3,'95','INGLATERRA','EUROPA');
/*!40000 ALTER TABLE `tbl_potencia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_tropas`
--

DROP TABLE IF EXISTS `tbl_tropas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_tropas` (
  `id_tropa` bigint NOT NULL AUTO_INCREMENT,
  `frente` varchar(25) DEFAULT NULL,
  `hora_despliegue` varchar(25) DEFAULT NULL,
  `numero_tropas` int DEFAULT NULL,
  `potencia_id` bigint DEFAULT NULL,
  `tipo_tropas` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id_tropa`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_tropas`
--

LOCK TABLES `tbl_tropas` WRITE;
/*!40000 ALTER TABLE `tbl_tropas` DISABLE KEYS */;
INSERT INTO `tbl_tropas` VALUES (1,'EU','08:00',500000,1,'TERRESTRE'),(2,'EU','13:00',2000,1,'AEREA'),(3,'EU','10:00',2500,1,'MARITIMA'),(4,'NA','10:00',88000,1,'TERRESTRE'),(5,'NA','14:00',3000,1,'AEREA'),(6,'NA','12:00',3500,1,'MARITIMA'),(7,'EUOR','07:00',750000,2,'TERRESTRE'),(8,'EUOR','09:00',5500,2,'AEREA'),(9,'EUOR','09:30',4500,2,'MARITIMA'),(10,'EUOC','06:30',700000,3,'TERRESTRE'),(11,'EUOC','12:00',5000,3,'AEREA'),(12,'EUOC','14:00',4000,3,'MARITIMA');
/*!40000 ALTER TABLE `tbl_tropas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-04-03 10:04:21
