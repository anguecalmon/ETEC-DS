-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 16-Jun-2023 às 01:20
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
-- Estrutura da tabela `tbcontato`
--

DROP TABLE IF EXISTS `tbcontato`;
CREATE TABLE IF NOT EXISTS `tbcontato` (
  `idContato` int(11) NOT NULL AUTO_INCREMENT,
  `dtCriacao` date DEFAULT NULL,
  `nome` varchar(250) DEFAULT NULL,
  `email` varchar(250) DEFAULT NULL,
  `assunto` varchar(250) DEFAULT NULL,
  `mensagem` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`idContato`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbcontato`
--

INSERT INTO `tbcontato` (`idContato`, `dtCriacao`, `nome`, `email`, `assunto`, `mensagem`) VALUES
(1, '2023-05-11', 'andré', 'calmon@gmail.com', 'teste teste', 'alguma');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblaboratorio`
--

DROP TABLE IF EXISTS `tblaboratorio`;
CREATE TABLE IF NOT EXISTS `tblaboratorio` (
  `idLaboratorio` int(11) NOT NULL AUTO_INCREMENT,
  `Laboratorio` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`idLaboratorio`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tblaboratorio`
--

INSERT INTO `tblaboratorio` (`idLaboratorio`, `Laboratorio`) VALUES
(1, 'Laboratorio 1'),
(2, 'Laboratorio 2'),
(3, 'Laboratorio 3'),
(4, 'Laboratorio 4');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbpc`
--

DROP TABLE IF EXISTS `tbpc`;
CREATE TABLE IF NOT EXISTS `tbpc` (
  `idPc` int(11) NOT NULL AUTO_INCREMENT,
  `Pc` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`idPc`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbpc`
--

INSERT INTO `tbpc` (`idPc`, `Pc`) VALUES
(1, 'Pc 01'),
(2, 'Pc 02'),
(3, 'Pc 03'),
(4, 'Pc 04');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbreclamacao`
--

DROP TABLE IF EXISTS `tbreclamacao`;
CREATE TABLE IF NOT EXISTS `tbreclamacao` (
  `idRec` int(11) NOT NULL AUTO_INCREMENT,
  `idLaboratorio` int(11) DEFAULT NULL,
  `idPc` int(11) DEFAULT NULL,
  `titulo` varchar(250) DEFAULT NULL,
  `descricao` varchar(250) DEFAULT NULL,
  `dtCriacao` date DEFAULT NULL,
  PRIMARY KEY (`idRec`),
  KEY `idLaboratorio` (`idLaboratorio`),
  KEY `idPc` (`idPc`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbreclamacao`
--

INSERT INTO `tbreclamacao` (`idRec`, `idLaboratorio`, `idPc`, `titulo`, `descricao`, `dtCriacao`) VALUES
(1, 1, 4, 'quebrou o cabo', 'cabo de internet esta sem fio', '2002-02-23');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
