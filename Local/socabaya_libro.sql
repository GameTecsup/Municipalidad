-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: socabaya
-- ------------------------------------------------------
-- Server version	8.0.12

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
-- Table structure for table `libro`
--

DROP TABLE IF EXISTS `libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `libro` (
  `id` int(50) NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `autor` varchar(50) NOT NULL,
  `categoria` varchar(100) NOT NULL,
  `editorial` varchar(50) NOT NULL,
  `fecha_ingreso` date NOT NULL,
  `descripcion` varchar(500) NOT NULL,
  `cantidad` int(11) NOT NULL,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libro`
--

LOCK TABLES `libro` WRITE;
/*!40000 ALTER TABLE `libro` DISABLE KEYS */;
INSERT INTO `libro` VALUES (1,'A','Picasso','CIENCIA Y TECNICA BIBLIOGRAFICAS','Paquito','2011-06-16','La verdad de los poetas paduanos es la simplicidad de las cosas y de los hechos.',1),(2,'bebe','Gabriel','EL LIBRO','Coveña','2016-02-10','Incluso hay un piano roll que puede ingresar datos MIDI, como notas y valores de velocidad, para que luego Ableton Live pueda leerlos una vez que importe la pista.',2),(3,'casa','Lopez','BIBLIOTECOLOGIA','Santos','2020-02-03','Una parte más potente y sorprendente del piano roll es la capacidad de seleccionar e implementar instantáneamente estructuras de acordes con una sola nota. Como Dylan muestra en el ejemplo de video, al escribir ‘m’ (para menor) en una nota raíz, Excel reproducirá automáticamente las notas necesarias para crear el acorde deseado.',2),(4,'dado','Nata','CIENCIA Y TECNICA BIBLIOGRAFICAS','Paquito','2020-02-03','La verdad de los poetas paduanos es la simplicidad de las cosas y de los hechos.',2),(5,'dadito','Nata','CIENCIA Y TECNICA BIBLIOGRAFICAS','Paquito','2018-02-14','La verdad de los poetas paduanos es la simplicidad de las cosas y de los hechos.',1),(6,'emilio','Nata','CIENCIA Y TECNICA BIBLIOGRAFICAS','Paquito','2016-02-10','La verdad de los poetas paduanos es la simplicidad de las cosas y de los hechos.',2),(7,'emilita','Nata','CIENCIA Y TECNICA BIBLIOGRAFICAS','Paquito','2020-02-22','La verdad de los poetas paduanos es la simplicidad de las cosas y de los hechogggs.',2),(8,'Los pitufos','Nata','CONOCIMIENTO-CIENCIA-ERUDICION','Paquito','2020-02-03','La verdad de los poetas paduanos es la simplicidad de las cosas y de los hechos.',2),(9,'Los pitufos','Nata','CIENCIA Y TECNICA BIBLIOGRAFICAS','Paquito','2028-02-18','La verdad de los poetas paduanos es la simplicidad de las cosas y de los hechos.',2),(10,'Patatas','Nata','CIENCIA Y TECNICA BIBLIOGRAFICAS','Paquito','2018-02-14','La verdad de los poetas paduanos es la simplicidad de las cosas y de los hechos.',2),(12,'Los pitufos','Nata','EL LIBRO','Paquito','2020-02-03','La verdad de los poetas paduanos es la simplicidad de las cosas y de los hechos.',1),(13,'Kintaro','pola','BIBLIOTECOLOGIA','Paquito','2020-02-03','La verdad de los poetas paduanos es la simplicidad de las cosas y de los hechos.',1),(16,'Los libros','Nata','CIENCIA Y TECNICA BIBLIOGRAFICAS','Paquito','2020-02-03','La verdad de los poetas paduanos es la simplicidad de las cosas y de los hechos.',1),(17,'Patatas','Nata','CIENCIA Y TECNICA BIBLIOGRAFICAS','Paquito','2018-02-14','La verdad de los poetas paduanos es la simplicidad de las cosas y de los hechos.',2),(18,'Patatas','HIja','CIENCIA Y TECNICA BIBLIOGRAFICAS','Paquito','2020-02-01','La verdad de los poetas paduanos es la simplicidad de las cosas y de los hechos.',2),(20,'da','da','CIENCIA Y TECNICA BIBLIOGRAFICAS','da','2020-02-14','dada',1);
/*!40000 ALTER TABLE `libro` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-16 21:42:17
