-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 31-Mar-2023 às 01:33
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
  `nome` varchar(250) DEFAULT NULL,
  `email` varchar(250) DEFAULT NULL,
  `assunto` varchar(250) DEFAULT NULL,
  `mensagem` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`idContato`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblaboratorio`
--

DROP TABLE IF EXISTS `tblaboratorio`;
CREATE TABLE IF NOT EXISTS `tblaboratorio` (
  `idLaboratorio` int(11) NOT NULL AUTO_INCREMENT,
  `laboratorio` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`idLaboratorio`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tblaboratorio`
--

INSERT INTO `tblaboratorio` (`idLaboratorio`, `laboratorio`) VALUES
(1, 'Lab01'),
(2, 'Lab02'),
(3, 'Lab03'),
(4, 'Lab04');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbreclamacao`
--

DROP TABLE IF EXISTS `tbreclamacao`;
CREATE TABLE IF NOT EXISTS `tbreclamacao` (
  `idRec` int(11) NOT NULL AUTO_INCREMENT,
  `idLab` varchar(50) NOT NULL,
  `pc` int(11) NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `descricao` varchar(500) NOT NULL,
  `dtCriacao` varchar(10) NOT NULL,
  PRIMARY KEY (`idRec`),
  UNIQUE KEY `pc` (`pc`),
  UNIQUE KEY `idLab_4` (`idLab`,`pc`,`titulo`,`descricao`,`dtCriacao`),
  UNIQUE KEY `idLab_5` (`idLab`,`pc`,`titulo`,`descricao`,`dtCriacao`),
  KEY `idLab` (`idLab`),
  KEY `idLab_3` (`idLab`),
  KEY `idLab_6` (`idLab`,`pc`,`titulo`,`descricao`,`dtCriacao`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbreclamacao`
--

INSERT INTO `tbreclamacao` (`idRec`, `idLab`, `pc`, `titulo`, `descricao`, `dtCriacao`) VALUES
(1, '1', 2, 'titu rec', 'desc', '2023-03-09');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tbreclamacao`
--
ALTER TABLE `tbreclamacao` ADD FULLTEXT KEY `idLab_2` (`idLab`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
