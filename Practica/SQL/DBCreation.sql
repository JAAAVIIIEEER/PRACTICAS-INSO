create database if not exists `RentLeonDB`;

use `RentLeonDB`;

create table if not exists `Empleados` (
    `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Clave primaria',
    `Usuario` varchar(12) NOT NULL COMMENT 'Usuario para conexión al sistema',
    `Contraseña` varchar(12) not null,
    `DNI` char(9) NOT NULL,
    `Tipo` varchar(20) not null, 
    `Nombre` varchar(50) NOT NULL COMMENT 'nombre cliente',
    `Apellidos` varchar(100) NOT NULL COMMENT 'Apellidos cliente',
    `Telefono` int(9) NOT NULL COMMENT 'móvil',
    `Email` varchar(100) default null, 
    `Ciudad` varchar(20) not null,
	`Calle` varchar(50) not null,
	`Numero` smallint not null,
    `Codigo_postal` int(5) not null,
    PRIMARY KEY (`ID`),
    UNIQUE KEY `Usuario` (`Usuario`),
    UNIQUE KEY `telefono` (`telefono`),
    UNIQUE KEY `DNI` (`DNI`),
    FULLTEXT KEY `apellidos` (`apellidos`)
);

create table if not exists `Alquileres` (
    `ID` int(6) NOT NULL AUTO_INCREMENT COMMENT 'Clave primaria',
    PRIMARY KEY (`ID`)
);

create table if not exists `Tiendas` (
    `ID` int(3) NOT NULL AUTO_INCREMENT COMMENT 'Clave primaria',
    PRIMARY KEY (`ID`)
);

create table if not exists `Clientes` (
    `DNI` char(9) NOT NULL COMMENT 'Clave primaria',
    PRIMARY KEY (`DNI`)
);

create table if not exists `Coches` (
    `ID` int(4) NOT NULL AUTO_INCREMENT COMMENT 'Clave primaria',
    PRIMARY KEY (`ID`)
);

create table if not exists `Incidencias` (
    `ID` int(5) NOT NULL AUTO_INCREMENT COMMENT 'Clave primaria',
    PRIMARY KEY (`ID`)
);

create table if not exists `Ofertas` (
    `ID` int(4) NOT NULL AUTO_INCREMENT COMMENT 'Clave primaria',
    PRIMARY KEY (`ID`)
);
