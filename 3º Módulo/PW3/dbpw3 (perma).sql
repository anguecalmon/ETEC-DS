-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 28-Abr-2023 às 01:23
-- Versão do servidor: 5.7.36
-- versão do PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `dbpw3`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblaboratorio`
--

DROP TABLE IF EXISTS `tblaboratorio`;
CREATE TABLE IF NOT EXISTS `tblaboratorio` (
  `idLaboratorio` int(11) NOT NULL AUTO_INCREMENT,
  `laboratorio` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idLaboratorio`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbreclamacao`
--

DROP TABLE IF EXISTS `tbreclamacao`;
CREATE TABLE IF NOT EXISTS `tbreclamacao` (
  `idReclamacao` int(11) NOT NULL AUTO_INCREMENT,
  `idLab` int(11) DEFAULT NULL,
  `pc` varchar(250) DEFAULT NULL,
  `titulo` varchar(250) DEFAULT NULL,
  `descricao` varchar(250) DEFAULT NULL,
  `dtCriacao` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`idReclamacao`),
  KEY `idLab` (`idLab`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbreclamacao`
--

INSERT INTO `tbreclamacao` (`idReclamacao`, `idLab`, `pc`, `titulo`, `descricao`, `dtCriacao`) VALUES
(1, 1, 'PC 1', 'Reclamação sobre o PC 1 do Lab01', 'Problemas de perfomance no PC', '06/10;2004');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
