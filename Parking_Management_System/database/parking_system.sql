-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: parkir_system
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
-- Table structure for table `admin_table`
--

USE parking_system;

DROP TABLE IF EXISTS `admin_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin_table` (
  `id_admin` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `pass` varchar(255) NOT NULL,
  PRIMARY KEY (`id_admin`)
);
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin_table`
--

LOCK TABLES `admin_table` WRITE;
/*!40000 ALTER TABLE `admin_table` DISABLE KEYS */;
INSERT INTO `admin_table` VALUES ('admin1','adminpark','admin12345');
/*!40000 ALTER TABLE `admin_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jenis_kendaraan`
--

DROP TABLE IF EXISTS `jenis_kendaraan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jenis_kendaraan` (
  `id_jenis_kendaraan` varchar(255) NOT NULL,
  `tipe_kendaraan` varchar(255) NOT NULL,
  `tarif` int NOT NULL,
  PRIMARY KEY (`id_jenis_kendaraan`)
);
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jenis_kendaraan`
--

LOCK TABLES `jenis_kendaraan` WRITE;
/*!40000 ALTER TABLE `jenis_kendaraan` DISABLE KEYS */;
INSERT INTO `jenis_kendaraan` VALUES ('TYPE1','Mobil',5000),('TYPE2','Motor',3000),('TYPE3','Truk',10000),('TYPE4','Bus',12000);
/*!40000 ALTER TABLE `jenis_kendaraan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kendaraan`
--

DROP TABLE IF EXISTS `kendaraan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kendaraan` (
  `nopol` varchar(255) NOT NULL,
  `tanggal` date NOT NULL,
  `id_membership` varchar(255) NOT NULL,
  `id_jenis_kendaraan` varchar(255) NOT NULL,
  `merk` varchar(255) NOT NULL,
  `jam_masuk` time NOT NULL,
  `jam_keluar` time DEFAULT NULL,
  PRIMARY KEY (`nopol`)
);
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kendaraan`
--

LOCK TABLES `kendaraan` WRITE;
/*!40000 ALTER TABLE `kendaraan` DISABLE KEYS */;
INSERT INTO `kendaraan` VALUES ('AB 0258 IB','2022-12-10','0','TYPE2','Yamaha','17:56:23',NULL),('AB 1880 RY','2022-12-10','0','TYPE1','Honda','11:02:04',NULL),('AB 2080 FS','2022-12-10','0','TYPE3','Scania','19:42:59',NULL),('AB 2941 TV','2022-12-10','0','TYPE2','Honda','03:12:23',NULL),('AB 7663 GW','2022-12-10','0','TYPE2','Yamaha','03:28:51',NULL),('AB 8288 JC','2022-12-10','0','TYPE1','Toyota','01:01:52',NULL),('AB 8712 LO','2022-12-10','0','TYPE2','Honda','21:53:29',NULL),('AB 8860 GE','2022-12-10','0','TYPE1','Mitsubishi','05:07:02',NULL),('B 0552 FP','2022-12-10','0','TYPE2','Suzuki','06:55:38',NULL),('B 0730 DH','2022-12-10','0','TYPE2','Suzuki','05:16:52',NULL),('B 4003 WI','2022-12-10','0','TYPE3','Hino','15:22:04',NULL),('B 5203 MY','2022-12-10','0','TYPE2','Honda','19:53:16',NULL),('B 6163 JC','2022-12-10','0','TYPE2','BMW','18:30:12',NULL),('B 6545 LX','2022-12-10','0','TYPE2','Yamaha','22:10:34',NULL),('B 7341 PU','2022-12-10','0','TYPE2','Suzuki','10:16:05',NULL),('B 7531 EW','2022-12-10','0','TYPE1','Honda','20:53:32',NULL),('B 7542 AH','2022-12-10','0','TYPE2','Suzuki','03:31:25',NULL),('B 9284 II','2022-12-10','0','TYPE2','Kawasaki','01:23:27',NULL),('B 9579 HR','2022-12-10','0','TYPE2','Honda','15:08:54',NULL),('B 9650 ZW','2022-12-10','0','TYPE2','Honda','13:17:17',NULL),('D 1942 BO','2022-12-10','0','TYPE1','Nissan','09:59:27',NULL),('D 5793 HQ','2022-12-10','0','TYPE3','Isuzu','06:59:23',NULL),('D 6254 JT','2022-12-10','0','TYPE4','Mercedes','09:09:25',NULL),('D 6515 AI','2022-12-10','0','TYPE1','Nissan','19:08:20',NULL),('D 6759 XQ','2022-12-10','0','TYPE2','Honda','21:17:12',NULL),('D 7225 YY','2022-12-10','0','TYPE4','Mercedes','07:50:48',NULL),('E 0965 BD','2022-12-10','0','TYPE2','BMW','06:25:22',NULL),('E 1177 BM','2022-12-10','0','TYPE2','Suzuki','20:58:42',NULL),('E 1512 WI','2022-12-10','0','TYPE2','BMW','17:02:16',NULL),('E 1864 XY','2022-12-10','0','TYPE1','Toyota','21:06:27',NULL),('E 2072 MA','2022-12-10','0','TYPE2','Suzuki','13:06:34',NULL),('E 2875 YG','2022-12-10','0','TYPE1','Toyota','08:48:00',NULL),('E 3462 LU','2022-12-10','0','TYPE3','Mitsubishi','03:13:13',NULL),('E 4759 CF','2022-12-10','0','TYPE2','BMW','04:11:45',NULL),('E 4960 PJ','2022-12-10','0','TYPE2','Honda','00:58:21',NULL),('E 6837 FY','2022-12-10','0','TYPE1','Toyota','16:34:38',NULL),('E 6913 OV','2022-12-10','0','TYPE1','Nissan','12:47:56',NULL),('E 7275 RZ','2022-12-10','0','TYPE2','Yamaha','03:57:09',NULL),('E 8478 SS','2022-12-10','0','TYPE1','Honda','07:25:31',NULL),('E 8633 DJ','2022-12-10','0','TYPE2','Yamaha','07:56:53',NULL),('E 9787 WI','2022-12-10','0','TYPE2','Honda','20:50:55',NULL),('F 0126 VE','2022-12-10','0','TYPE1','Toyota','05:25:28',NULL),('F 0822 OP','2022-12-10','0','TYPE1','Mitsubishi','03:29:44',NULL),('F 0992 SV','2022-12-10','0','TYPE2','Yamaha','15:46:34',NULL),('F 1330 UP','2022-12-10','0','TYPE2','Suzuki','21:16:49',NULL),('F 3712 BB','2022-12-10','0','TYPE1','Honda','22:27:26',NULL),('F 4748 RK','2022-12-10','0','TYPE1','Mitsubishi','15:38:32',NULL),('F 5148 YI','2022-12-10','0','TYPE2','Kawasaki','10:20:16',NULL),('F 5217 ZT','2022-12-10','0','TYPE3','Scania','03:29:48',NULL),('F 6815 GS','2022-12-10','0','TYPE2','Yamaha','11:37:47',NULL),('F 7051 LC','2022-12-10','0','TYPE1','Nissan','21:43:19',NULL),('F 7940 YB','2022-12-10','0','TYPE3','Scania','20:29:18',NULL),('H 1414 UX','2022-12-10','0','TYPE2','Suzuki','11:50:36',NULL),('H 2472 XN','2022-12-10','0','TYPE2','Honda','11:00:21',NULL),('H 2885 BZ','2022-12-10','0','TYPE1','Nissan','17:11:34',NULL),('H 2973 XG','2022-12-10','0','TYPE1','Hyundai','21:48:00',NULL),('H 3526 XF','2022-12-10','0','TYPE1','Mitsubishi','12:52:18',NULL),('H 4007 EM','2022-12-10','0','TYPE2','Honda','20:13:15',NULL),('H 4533 GB','2022-12-10','0','TYPE4','Mercedes','00:39:17',NULL),('H 6170 GD','2022-12-10','0','TYPE1','Mitsubishi','13:08:35',NULL),('H 6359 VA','2022-12-10','0','TYPE2','Honda','19:16:23',NULL),('H 6481 NY','2022-12-10','0','TYPE2','BMW','06:29:00',NULL),('H 6891 DB','2022-12-10','0','TYPE2','BMW','05:12:58',NULL),('H 7614 QX','2022-12-10','0','TYPE2','BMW','07:45:06',NULL),('H 7643 TW','2022-12-10','0','TYPE2','Kawasaki','12:42:53',NULL),('H 8841 MK','2022-12-10','0','TYPE1','Toyota','03:26:10',NULL),('H 9021 JJ','2022-12-10','0','TYPE2','Honda','18:27:50',NULL),('H 9158 FD','2022-12-10','0','TYPE1','Hyundai','23:17:26',NULL);
/*!40000 ALTER TABLE `kendaraan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kendaraan_payment`
--

DROP TABLE IF EXISTS `kendaraan_payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kendaraan_payment` (
  `id_kendaraan_payment` int NOT NULL AUTO_INCREMENT,
  `nopol` varchar(255) NOT NULL,
  `id_payment` varchar(255) NOT NULL,
  `id_status_payment` varchar(255) NOT NULL,
  PRIMARY KEY (`id_kendaraan_payment`)
);
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kendaraan_payment`
--

LOCK TABLES `kendaraan_payment` WRITE;
/*!40000 ALTER TABLE `kendaraan_payment` DISABLE KEYS */;
INSERT INTO `kendaraan_payment` VALUES (1,'H 6359 VA','002','BL'),(2,'E 2072 MA','001','BL'),(3,'E 8633 DJ','002','BL'),(4,'B 6163 JC','002','BL'),(5,'H 7643 TW','002','BL'),(6,'E 4960 PJ','002','BL'),(7,'B 7341 PU','002','BL'),(8,'D 6759 XQ','001','BL'),(9,'H 9021 JJ','002','BL'),(10,'B 5203 MY','002','BL'),(11,'AB 8712 LO','002','BL'),(12,'E 1177 BM','002','BL'),(13,'H 4007 EM','002','BL'),(14,'E 1512 WI','002','BL'),(15,'E 4759 CF','002','BL'),(16,'F 5148 YI','002','BL'),(17,'AB 2941 TV','001','BL'),(18,'F 0992 SV','002','BL'),(19,'B 0730 DH','001','BL'),(20,'H 6481 NY','001','BL'),(21,'AB 7663 GW','002','BL'),(22,'AB 0258 IB','001','BL'),(23,'B 0552 FP','001','BL'),(24,'H 7614 QX','002','BL'),(25,'B 6545 LX','001','BL'),(26,'E 0965 BD','002','BL'),(27,'H 2472 XN','002','BL'),(28,'B 9579 HR','001','BL'),(29,'F 6815 GS','002','BL'),(30,'E 7275 RZ','001','BL'),(31,'B 9284 II','002','BL'),(32,'H 1414 UX','002','BL'),(33,'B 9650 ZW','001','BL'),(34,'B 7542 AH','002','BL'),(35,'H 6891 DB','001','BL'),(36,'F 1330 UP','001','BL'),(37,'E 9787 WI','002','BL'),(38,'D 6515 AI','002','BL'),(39,'D 1942 BO','001','BL'),(40,'B 7531 EW','001','BL'),(41,'E 1864 XY','001','BL'),(42,'H 2885 BZ','002','BL'),(43,'H 8841 MK','002','BL'),(44,'H 6170 GD','001','BL'),(45,'E 2875 YG','001','BL'),(46,'F 0822 OP','001','BL'),(47,'AB 8860 GE','001','BL'),(48,'F 3712 BB','002','BL'),(49,'E 6837 FY','002','BL'),(50,'F 0126 VE','002','BL'),(51,'AB 1880 RY','001','BL'),(52,'F 7051 LC','002','BL'),(53,'H 3526 XF','001','BL'),(54,'AB 8288 JC','002','BL'),(55,'E 8478 SS','001','BL'),(56,'F 4748 RK','001','BL'),(57,'H 9158 FD','001','BL'),(58,'E 6913 OV','002','BL'),(59,'H 2973 XG','002','BL'),(60,'B 4003 WI','001','BL'),(61,'AB 2080 FS','001','BL'),(62,'D 5793 HQ','002','BL'),(63,'E 3462 LU','002','BL'),(64,'F 7940 YB','001','BL'),(65,'F 5217 ZT','001','BL'),(66,'H 4533 GB','001','BL'),(67,'D 6254 JT','001','BL'),(68,'D 7225 YY','001','BL');
/*!40000 ALTER TABLE `kendaraan_payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `membership`
--

DROP TABLE IF EXISTS `membership`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `membership` (
  `id_membership` varchar(255) NOT NULL,
  `status_member` varchar(255) NOT NULL,
  PRIMARY KEY (`id_membership`)
);
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `membership`
--

LOCK TABLES `membership` WRITE;
/*!40000 ALTER TABLE `membership` DISABLE KEYS */;
INSERT INTO `membership` VALUES ('0','Nonmember'),('1','Member');
/*!40000 ALTER TABLE `membership` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment` (
  `id_payment` varchar(255) NOT NULL,
  `metode_pembayaran` varchar(255) NOT NULL,
  PRIMARY KEY (`id_payment`)
);
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
INSERT INTO `payment` VALUES ('001','Cash'),('002','Flazz'),('003','Member Card');
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `status_payment`
--

DROP TABLE IF EXISTS `status_payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `status_payment` (
  `id_status_payment` varchar(255) NOT NULL,
  `keterangan` varchar(255) NOT NULL,
  PRIMARY KEY (`id_status_payment`)
);
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `status_payment`
--

LOCK TABLES `status_payment` WRITE;
/*!40000 ALTER TABLE `status_payment` DISABLE KEYS */;
INSERT INTO `status_payment` VALUES ('BL','Belum Lunas'),('L','Lunas');
/*!40000 ALTER TABLE `status_payment` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-01-16 17:27:11
