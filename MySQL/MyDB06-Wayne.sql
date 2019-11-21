-- MySQL dump 10.13  Distrib 8.0.18, for macos10.14 (x86_64)
--
-- Host: 127.0.0.1    Database: daycare
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `classroom`
--

DROP TABLE IF EXISTS `classroom`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `classroom` (
  `classroom_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`classroom_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2101 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classroom`
--

LOCK TABLES `classroom` WRITE;
/*!40000 ALTER TABLE `classroom` DISABLE KEYS */;
INSERT INTO `classroom` VALUES (1100),(1200),(2100);
/*!40000 ALTER TABLE `classroom` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `classroom_group_info`
--

DROP TABLE IF EXISTS `classroom_group_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `classroom_group_info` (
  `cg_record_id` int(11) NOT NULL AUTO_INCREMENT,
  `classroom_id` int(10) unsigned NOT NULL,
  `group_info_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`cg_record_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classroom_group_info`
--

LOCK TABLES `classroom_group_info` WRITE;
/*!40000 ALTER TABLE `classroom_group_info` DISABLE KEYS */;
INSERT INTO `classroom_group_info` VALUES (1,1100,11),(2,1100,12),(3,1100,13),(4,1200,14),(5,2100,21),(6,2200,22);
/*!40000 ALTER TABLE `classroom_group_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `group_info`
--

DROP TABLE IF EXISTS `group_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `group_info` (
  `group_info_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `low` int(10) unsigned DEFAULT NULL,
  `high` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`group_info_id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `group_info`
--

LOCK TABLES `group_info` WRITE;
/*!40000 ALTER TABLE `group_info` DISABLE KEYS */;
INSERT INTO `group_info` VALUES (11,6,12),(12,6,12),(13,6,12),(14,6,12),(21,13,24),(22,13,24);
/*!40000 ALTER TABLE `group_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `group_info_teacher`
--

DROP TABLE IF EXISTS `group_info_teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `group_info_teacher` (
  `gt_record_id` int(11) NOT NULL AUTO_INCREMENT,
  `group_info_id` int(10) unsigned NOT NULL,
  `teacher_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`gt_record_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `group_info_teacher`
--

LOCK TABLES `group_info_teacher` WRITE;
/*!40000 ALTER TABLE `group_info_teacher` DISABLE KEYS */;
INSERT INTO `group_info_teacher` VALUES (1,11,1),(2,12,2),(3,13,3),(4,14,4),(5,21,5),(6,22,6);
/*!40000 ALTER TABLE `group_info_teacher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `record`
--

DROP TABLE IF EXISTS `record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `record` (
  `stu_id` int(10) unsigned NOT NULL,
  `dose_001` tinyint(3) unsigned DEFAULT NULL,
  `date_001` date DEFAULT NULL,
  `dose_002` tinyint(3) unsigned DEFAULT NULL,
  `date_002` date DEFAULT NULL,
  `dose_003` tinyint(3) unsigned DEFAULT NULL,
  `date_003` date DEFAULT NULL,
  `dose_004` tinyint(3) unsigned DEFAULT NULL,
  `date_004` date DEFAULT NULL,
  `dose_005` tinyint(3) unsigned DEFAULT NULL,
  `date_005` date DEFAULT NULL,
  `dose_006` tinyint(3) unsigned DEFAULT NULL,
  `date_006` date DEFAULT NULL,
  `require_004` tinyint(1) NOT NULL,
  `require_005` tinyint(1) NOT NULL,
  `require_006` tinyint(1) NOT NULL,
  PRIMARY KEY (`stu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `record`
--

LOCK TABLES `record` WRITE;
/*!40000 ALTER TABLE `record` DISABLE KEYS */;
/*!40000 ALTER TABLE `record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `student_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `gender` char(1) NOT NULL,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `gpa` double(5,2) DEFAULT NULL,
  `birth_date` date NOT NULL,
  `register_date` date NOT NULL,
  `parent_first_name` varchar(20) NOT NULL,
  `parent_last_name` varchar(20) NOT NULL,
  `parent_phone` varchar(20) NOT NULL,
  `parent_email` varchar(30) NOT NULL,
  `parent_address` varchar(50) NOT NULL,
  `parent_gender` char(1) NOT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'M','Jimmy','Green',85.00,'2018-12-03','2019-09-04','Lily','Green','111-111-1111','lily@gmail.com','9 Washington Street, Boston, MA','F'),(2,'F','Sally','Smith',90.00,'2019-01-05','2019-09-04','Lucy','Smith','222-111-1111','lucy@gmail.com','19 Washington Street, Boston, MA','F'),(3,'F','Lizzy','Johnson',78.00,'2019-02-23','2019-09-04','Mary','Johnson','333-111-1111','mary@gmail.com','29 Washington Street, Boston, MA','F'),(4,'M','Markie','Williams',96.00,'2019-03-19','2019-09-04','Bill','Williams','444-111-1111','bill@gmail.com','7 Green Street, Boston, MA','M'),(5,'M','Johnny','Jones',72.00,'2018-08-08','2019-09-04','Daniel','Jones','555-111-1111','daniel@gmail.com','29 Green Street, Boston, MA','M'),(6,'M','Bobby','Brown',86.00,'2018-06-01','2019-09-04','Bonnie','Brown','666-111-1111','bonnie@gmail.com','19 Green Street, Boston, MA','F'),(7,'M','Bill','Miller',76.00,'2018-04-08','2019-09-04','Stefan','Miller','777-111-1111','stefan@gmail.com','129 Huntington Street, Boston, MA','M'),(8,'M','Bear','Moore',88.00,'2018-01-01','2019-09-04','Ava','Moore','888-111-1111','ava@gmail.com','109 Huntington Street, Boston, MA','F'),(9,'M','Dameon','Taylor',79.00,'2017-12-29','2019-09-04','Dan','Taylor','999-111-1111','dan@gmail.com','209 Green Street, Boston, MA','M'),(10,'F','Emma','Thomas',92.00,'2018-04-08','2019-09-04','Olivia','Thomas','111-311-1111','olivia@gmail.com','29 Shill Street, Boston, MA','F'),(11,'F','Ava','Jackson',89.00,'2018-04-08','2019-09-04','Isabella','Jackson','111-411-1111','isebella@gmail.com','209 Shill Street, Boston, MA','F'),(12,'F','Sophia','White',99.00,'2018-04-08','2019-09-04','Amelia','White','111-511-1111','amelia@gmail.com','99 Shill Street, Boston, MA','F'),(13,'F','Emily','Harris',77.00,'2018-04-08','2019-09-04','Elizabeth','Harris','111-611-1111','elizabeth@gmail.com','29 Robison Street, Boston, MA','F'),(14,'F','Mila','Martin',66.00,'2018-04-08','2019-09-04','Ella','Martin','111-711-1111','ella@gmail.com','9 Robison Street, Boston, MA','F'),(15,'F','Avery','Thompson',82.00,'2018-04-08','2019-09-04','Sofia','Thompson','111-811-1111','sofia@gmail.com','109 Robison Street, Boston, MA','F'),(16,'M','Aaron','Garcia',92.00,'2018-04-08','2019-09-04','Abe','Garcia','111-911-1111','abe@gmail.com','209 Robison Street, Boston, MA','M'),(17,'M','Abram','Martinez',76.00,'2018-04-08','2019-09-04','Allen','Martinez','111-121-1111','allen@gmail.com','29 Snell Street, Boston, MA','M'),(18,'M','Alva','Robinson',90.00,'2018-04-08','2019-09-04','Amado','Robinson','111-131-1111','amado@gmail.com','109 Snell Street, Boston, MA','M'),(19,'M','Anderson','Clark',72.00,'2018-04-08','2019-09-04','Ali','Clark','111-141-1111','ali@gmail.com','209 Snell Street, Boston, MA','M'),(20,'M','Antone','Lewis',72.00,'2018-04-08','2019-09-04','Ariel','Lewis','111-151-1111','ariel@gmail.com','309 Snell Street, Boston, MA','M'),(21,'M','Aron','Lee',72.00,'2018-04-08','2017-09-04','Martin','Lee','111-161-1111','martin@gmail.com','369 Snell Street, Boston, MA','M'),(22,'M','Noe','Walker',72.00,'2018-04-08','2017-09-04','Nick','Walker','111-171-1111','nick@gmail.com','29 Dino Street, Boston, MA','M'),(23,'M','Neil','Allen',72.00,'2018-04-08','2017-09-04','Ned','Allen','111-181-1111','ned@gmail.com','109 Dino Street, Boston, MA','M'),(24,'M','Leo','Young',72.00,'2018-04-08','2019-09-04','Lou','Young','111-191-1111','lou@gmail.com','69 Dino Street, Boston, MA','M'),(25,'M','Larry','King',72.00,'2018-04-08','2019-09-04','Lane','King','111-112-1111','lane@gmail.com','209 Dino Street, Boston, MA','M'),(26,'M','Lacy','Wright',72.00,'2018-04-08','2019-09-04','Larry','Wright','111-113-1111','larry@gmail.com','309 Dino Street, Boston, MA','M'),(27,'M','Hollis','Hill',72.00,'2018-04-08','2019-09-04','Henry','Hill','111-114-1111','henry@gmail.com','409 Dino Street, Boston, MA','M'),(28,'F','Sophia','Anderson',80.00,'2017-12-01','2019-09-04','Mia','Anderson','111-211-1111','mia@gmail.com','19 Shill Street, Boston, MA','F'),(29,'F','Lucy','Roberts',72.00,'2018-04-08','2019-09-04','Anna','Roberts','111-111-5111','anna@gmail.com','29 Red Street, Boston, MA','F'),(30,'F','Caroline','Turner',72.00,'2018-04-08','2018-09-04','Nova','Turner','111-311-6111','nova@gmail.com','19 Red Street, Boston, MA','F'),(31,'F','Everly','Phillips',72.00,'2018-04-08','2018-09-04','Emilia','Phillips','111-311-7111','emilia@gmail.com','39 Red Street, Boston, MA','F'),(32,'F','Maya','Parker',72.00,'2018-04-08','2018-09-04','Willow','Parker','111-311-8111','willow@gmail.com','49 Red Street, Boston, MA','F'),(33,'F','Naomi','Evans',72.00,'2018-04-08','2018-09-04','Elena','Evans','111-311-9111','elena@gmail.com','109 Red Street, Boston, MA','F');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacher` (
  `teacher_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `gender` char(1) NOT NULL,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `credits` int(10) unsigned DEFAULT NULL,
  `wage` double(8,2) DEFAULT NULL,
  `register_date` date NOT NULL,
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES (1,'M','Adam','Smith',99,20000.00,'2006-09-04'),(2,'M','Noah','Johnson',89,15000.00,'2016-09-04'),(3,'F','Kathy','Williams',97,19000.00,'2008-09-04'),(4,'F','Emma','Brown',69,10300.00,'2009-09-04'),(5,'M','Logan','Davis',79,10010.00,'2011-09-04'),(6,'F','Olivia','Wilson',92,10020.00,'2012-09-04');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher_student`
--

DROP TABLE IF EXISTS `teacher_student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacher_student` (
  `ts_record_id` int(11) NOT NULL AUTO_INCREMENT,
  `teacher_id` int(10) unsigned NOT NULL,
  `student_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`ts_record_id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher_student`
--

LOCK TABLES `teacher_student` WRITE;
/*!40000 ALTER TABLE `teacher_student` DISABLE KEYS */;
INSERT INTO `teacher_student` VALUES (1,1,1),(2,1,2),(3,1,3),(4,1,4),(5,2,5),(6,2,6),(7,2,7),(8,2,8),(9,3,9),(10,3,10),(11,3,11),(12,3,12),(13,4,13),(14,4,14),(15,4,15),(16,4,16),(17,5,17),(18,5,18),(19,5,19),(20,5,20),(21,5,21),(22,6,22),(23,6,23),(24,6,24),(25,6,25);
/*!40000 ALTER TABLE `teacher_student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vaccine`
--

DROP TABLE IF EXISTS `vaccine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vaccine` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `total_dose` int(10) unsigned NOT NULL,
  `valid_month` int(10) unsigned NOT NULL,
  `days_between_doses_1` int(10) unsigned DEFAULT NULL,
  `days_between_doses_2` int(10) unsigned DEFAULT NULL,
  `days_between_doses_3` int(10) unsigned DEFAULT NULL,
  `name` varchar(20) NOT NULL,
  `description` varchar(50) NOT NULL,
  `is_required_s_t` char(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vaccine`
--

LOCK TABLES `vaccine` WRITE;
/*!40000 ALTER TABLE `vaccine` DISABLE KEYS */;
INSERT INTO `vaccine` VALUES (1,2,12,15,NULL,NULL,'Hib','Other details of vaccine','F'),(2,4,24,17,17,25,'DTaP','Other details of vaccine','F'),(3,3,15,20,20,NULL,'Polio','Other details of vaccine','F'),(4,3,16,30,30,35,'HB','Other details of vaccine','T'),(5,1,8,NULL,NULL,NULL,'MMR','Other details of vaccine','T'),(6,1,6,NULL,NULL,NULL,'Varicella','Other details of vaccine','T');
/*!40000 ALTER TABLE `vaccine` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-20 22:40:00
