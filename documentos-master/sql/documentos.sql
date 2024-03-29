-- phpMyAdmin SQL Dump
-- version 3.5.8.1deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Sep 22, 2013 at 08:10 AM
-- Server version: 5.5.32-0ubuntu0.13.04.1
-- PHP Version: 5.4.9-4ubuntu2.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `documentos`
--

-- --------------------------------------------------------

--
-- Table structure for table `administrador`
--

CREATE TABLE IF NOT EXISTS `administrador` (
  `login` int(11) NOT NULL,
  `clave` int(11) NOT NULL,
  `numero_documento` int(11) NOT NULL,
  `nombres` int(11) NOT NULL,
  `apellido1` varchar(50) NOT NULL,
  `apellido2` varchar(50) NOT NULL,
  PRIMARY KEY (`numero_documento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `denuncia`
--

CREATE TABLE IF NOT EXISTS `denuncia` (
  `id_denuncia` int(11) NOT NULL,
  `fecha_denuncia` date NOT NULL,
  `fecha_perdida` date NOT NULL,
  `hora_perdida` time NOT NULL,
  PRIMARY KEY (`id_denuncia`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `documento`
--

CREATE TABLE IF NOT EXISTS `documento` (
  `id_documento` int(11) NOT NULL,
  `no_documento` varchar(30) NOT NULL,
  `id_tipo_documento` int(11) NOT NULL,
  `id_denuncia` int(11) NOT NULL,
  `documento_funcionario` varchar(20) NOT NULL,
  `documento_usuario_reporta` varchar(20) NOT NULL,
  `documento_usuario_denuncia` varchar(20) NOT NULL,
  `id_estado` int(11) NOT NULL,
  PRIMARY KEY (`id_documento`),
  KEY `documento_funcionario` (`documento_funcionario`),
  KEY `documento_usuario_reporta` (`documento_usuario_reporta`),
  KEY `documento_usuario_denuncia` (`documento_usuario_denuncia`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `estado`
--

CREATE TABLE IF NOT EXISTS `estado` (
  `id_estado` int(11) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  PRIMARY KEY (`id_estado`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `funcionario`
--

CREATE TABLE IF NOT EXISTS `funcionario` (
  `numero_documento` varchar(20) NOT NULL,
  `nombres` varchar(50) NOT NULL,
  `apellido1` varchar(50) NOT NULL,
  `apellido2` varchar(50) NOT NULL,
  `clave` varchar(20) NOT NULL,
  PRIMARY KEY (`numero_documento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tipo_documento`
--

CREATE TABLE IF NOT EXISTS `tipo_documento` (
  `id_tipo` int(11) NOT NULL,
  `nombre` int(11) NOT NULL,
  `descripcion` int(11) NOT NULL,
  PRIMARY KEY (`id_tipo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `usuario_denuncia`
--

CREATE TABLE IF NOT EXISTS `usuario_denuncia` (
  `documento_usuario_denuncia` varchar(20) NOT NULL,
  `nombres` int(11) NOT NULL,
  `apellido1` int(11) NOT NULL,
  `apellido2` int(11) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  `correo` varchar(50) NOT NULL,
  PRIMARY KEY (`documento_usuario_denuncia`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `usuario_reporta`
--

CREATE TABLE IF NOT EXISTS `usuario_reporta` (
  `documento_usuario_reporta` varchar(20) NOT NULL,
  `nombres` int(11) NOT NULL,
  `apellido1` int(11) NOT NULL,
  `apellido2` int(11) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  `correo` varchar(50) NOT NULL,
  PRIMARY KEY (`documento_usuario_reporta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `documento`
--
ALTER TABLE `documento`
  ADD CONSTRAINT `documento_ibfk_4` FOREIGN KEY (`documento_funcionario`) REFERENCES `funcionario` (`numero_documento`),
  ADD CONSTRAINT `documento_ibfk_2` FOREIGN KEY (`documento_usuario_reporta`) REFERENCES `usuario_reporta` (`documento_usuario_reporta`),
  ADD CONSTRAINT `documento_ibfk_3` FOREIGN KEY (`documento_usuario_denuncia`) REFERENCES `usuario_denuncia` (`documento_usuario_denuncia`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
