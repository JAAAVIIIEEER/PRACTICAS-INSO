-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: rentleondb
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `alquileres`
--

create database if not exists `RentLeonDB`;

use `RentLeonDB`; 

DROP TABLE IF EXISTS `alquileres`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alquileres` (
  `AlquilerID` int NOT NULL AUTO_INCREMENT COMMENT 'Clave primaria',
  `FechaRecogida` date NOT NULL,
  `DiasAlquilados` int unsigned NOT NULL,
  `CosteTotal` int unsigned NOT NULL,
  `CocheAlquilado` int NOT NULL,
  `Empleado` int DEFAULT NULL,
  `Cliente` char(9) NOT NULL,
  `Oferta` int DEFAULT NULL,
  PRIMARY KEY (`AlquilerID`),
  KEY `CocheAlquilado_idx` (`CocheAlquilado`),
  KEY `Empleado_idx` (`Empleado`),
  KEY `Cliente_idx` (`Cliente`),
  KEY `Ofertas_idx` (`Oferta`),
  CONSTRAINT `Cliente` FOREIGN KEY (`Cliente`) REFERENCES `clientes` (`DNI`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `CocheAlquilado` FOREIGN KEY (`CocheAlquilado`) REFERENCES `coches` (`CocheID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `Empleado` FOREIGN KEY (`Empleado`) REFERENCES `empleados` (`EmpleadoID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `Ofertas` FOREIGN KEY (`Oferta`) REFERENCES `ofertas` (`OfertaID`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alquileres`
--

LOCK TABLES `alquileres` WRITE;
/*!40000 ALTER TABLE `alquileres` DISABLE KEYS */;
/*!40000 ALTER TABLE `alquileres` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `DNI` char(9) NOT NULL COMMENT 'Clave primaria',
  `Nombre` varchar(20) NOT NULL, 
  `Apellido1` varchar(40) NOT NULL,
  `Apellido2` varchar(40) NOT NULL,
  `TipoVia` varchar(45) DEFAULT NULL,
  `NombreVia` varchar(45) DEFAULT NULL,
  `Portal` int unsigned DEFAULT NULL,
  `Piso` int unsigned DEFAULT NULL,
  `Letra` char(1) DEFAULT NULL,
  `CodigoPostal` varchar(5) DEFAULT NULL,
  `Telefono` varchar(15) NOT NULL,
  `CorreoElectronico` varchar(45) NOT NULL,
  `FechaNacimiento` DATE NOT NULL,
  PRIMARY KEY (`DNI`),
  UNIQUE KEY `NombreCompleto_UNIQUE` (`Nombre`, `Apellido1`, `Apellido2`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `coches`
--

DROP TABLE IF EXISTS `vehiculos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehiculos` (
  `VehiculoID` int NOT NULL AUTO_INCREMENT COMMENT 'Clave primaria',
  `Matricula` varchar(45) NOT NULL,
  `Tipo` varchar(45) NOT NULL,
  `Combustible` varchar(45) NOT NULL,
  `Plazas` int unsigned NOT NULL,
  `CostePorDia` int unsigned NOT NULL,
  `Extras` varchar(250) DEFAULT NULL,
  `Tienda` int NOT NULL,
  PRIMARY KEY (`VehiculoID`),
  UNIQUE KEY `Matricula_UNIQUE` (`Matricula`),
  KEY `Tienda_idx` (`Tienda`),
  CONSTRAINT `Tienda` FOREIGN KEY (`Tienda`) REFERENCES `tiendas` (`TiendaID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coches`
--

LOCK TABLES `vehiculos` WRITE;
/*!40000 ALTER TABLE `vehiculos` DISABLE KEYS */;
/*!40000 ALTER TABLE `vehiculos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleados`
--

DROP TABLE IF EXISTS `empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleados` (
  `EmpleadoID` int NOT NULL AUTO_INCREMENT COMMENT 'Clave primaria',
  `UsuarioDNI` char(9) NOT NULL COMMENT 'Usuario para conexión al sistema',
  `Contraseña` varchar(12) NOT NULL,
  `Tipo` varchar(20) NOT NULL,
  `Nombre` varchar(20) NOT NULL, 
  `Apellido1` varchar(40) NOT NULL,
  `Apellido2` varchar(40) NOT NULL,
  `Telefono` varchar(15) NOT NULL COMMENT 'móvil',
  `Email` varchar(100) NOT NULL,
  `FechaNacimiento` DATE NOT NULL,
  PRIMARY KEY (`EmpleadoID`),
  UNIQUE KEY `Usuario` (`UsuarioDNI`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `incidencias`
--

DROP TABLE IF EXISTS `incidencias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `incidencias` (
  `IncidenciaID` int NOT NULL,
  `AlquilerID` int NOT NULL COMMENT 'Clave primaria',
  `Tipo` varchar(45) NOT NULL,
  `Estado` tinyint unsigned NOT NULL DEFAULT '1',
  PRIMARY KEY (`IncidenciaID`,`AlquilerID`),
  CONSTRAINT `AlquilerID` FOREIGN KEY (`IncidenciaID`) REFERENCES `alquileres` (`AlquilerID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `incidencias`
--

LOCK TABLES `incidencias` WRITE;
/*!40000 ALTER TABLE `incidencias` DISABLE KEYS */;
/*!40000 ALTER TABLE `incidencias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ofertas`
--

DROP TABLE IF EXISTS `ofertas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ofertas` (
  `OfertaID` int NOT NULL AUTO_INCREMENT COMMENT 'Clave primaria',
  `Descuento` int unsigned NOT NULL,
  `Estado` tinyint NOT NULL DEFAULT '1',
  PRIMARY KEY (`OfertaID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ofertas`
--

LOCK TABLES `ofertas` WRITE;
/*!40000 ALTER TABLE `ofertas` DISABLE KEYS */;
/*!40000 ALTER TABLE `ofertas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tiendas`
--

DROP TABLE IF EXISTS `tiendas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tiendas` (
  `TiendaID` int NOT NULL AUTO_INCREMENT COMMENT 'Clave primaria',
  `Provincia` varchar(45) NOT NULL,
  `Municipio` varchar(45) NOT NULL,
  `NombreVia` varchar(45) NOT NULL,
  `Portal` int NOT NULL,
  `Telefono` int DEFAULT NULL,
  `CorreoElectronico` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`TiendaID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tiendas`
--

LOCK TABLES `tiendas` WRITE;
/*!40000 ALTER TABLE `tiendas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tiendas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-11 20:53:26

DELETE FROM `empleados` WHERE `UsuarioDNI`='admin';
INSERT INTO `empleados` (`UsuarioDNI`, `Contraseña`, `Tipo`, `Nombre`, `Apellido1`, `Apellido2`, `Telefono`, `Email`, `FechaNacimiento`) VALUES ('admin', 'admin', 'Administrador', 'admin', 'admin', 'admin', 0, 'admin@admin.com', 1/1/1900);
