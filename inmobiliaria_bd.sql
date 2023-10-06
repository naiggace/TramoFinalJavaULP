-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 06, 2023 at 06:12 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inmobiliaria_bd`
--

-- --------------------------------------------------------

--
-- Table structure for table `alquiler`
--

CREATE TABLE `alquiler` (
  `idAlquiler` int(11) NOT NULL,
  `idInquilino` int(11) NOT NULL,
  `idInmueble` int(11) NOT NULL,
  `cuitInquilino` text NOT NULL,
  `lugarTrabajo` varchar(60) NOT NULL,
  `nombreGarante` varchar(50) NOT NULL,
  `dniGarante` int(11) NOT NULL,
  `fechaInicio` date NOT NULL,
  `fechaFin` date NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `montoAlquiler` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `inmueble`
--

CREATE TABLE `inmueble` (
  `idInmueble` int(60) NOT NULL,
  `tipo` varchar(15) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `superficie` double NOT NULL,
  `precio` double NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `idPropietario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `inmueble`
--

INSERT INTO `inmueble` (`idInmueble`, `tipo`, `direccion`, `superficie`, `precio`, `estado`, `idPropietario`) VALUES
(60, 'LOCAL', 'Avenida San Martín 2096', 344, 164111, 1, 106),
(61, 'DEPARTAMENTO', 'Buenos Aires 7197', 341, 111183, 1, 95),
(62, 'DEPOSITO', 'Avenida Libertador 3447', 307, 188402, 1, 96),
(63, 'OFICINA', '9 de Julio 424', 398, 126273, 1, 103),
(64, 'LOCAL', 'Avenida Juárez 8242', 264, 142996, 1, 102),
(65, 'LOCAL', 'Morelos 4009', 265, 155186, 1, 98),
(66, 'DEPARTAMENTO', 'Avenida Reforma 4364', 312, 185598, 1, 100),
(67, 'DEPOSITO', 'Colón 9725', 215, 157708, 1, 108),
(68, 'OFICINA', 'Avenida Hidalgo 2355', 364, 151024, 1, 108),
(69, 'LOCAL', '16 de Septiembre 4996', 239, 134363, 1, 109),
(70, 'LOCAL', 'Avenida Principal 8510', 345, 167587, 1, 95),
(71, 'DEPARTAMENTO', 'Central 7560', 258, 71351, 1, 107),
(72, 'DEPOSITO', 'Avenida Benito Juárez 6679', 201, 164237, 1, 108),
(73, 'OFICINA', 'Independencia 5868', 397, 199017, 1, 105),
(74, 'LOCAL', 'Avenida Revolución 5777', 251, 88160, 1, 107),
(75, 'LOCAL', '20 de Noviembre 2344', 395, 104746, 1, 110),
(76, 'DEPARTAMENTO', 'Avenida 5 de Mayo 9195', 343, 117670, 1, 97),
(77, 'DEPOSITO', '25 de Mayo 5147', 284, 80536, 1, 99),
(78, 'OFICINA', 'Avenida Constitución 1147', 335, 143473, 1, 108),
(79, 'LOCAL', '1 de Mayo 7114', 315, 159454, 1, 104),
(80, 'LOCAL', 'Avenida San Martín 6885', 324, 135058, 1, 96),
(81, 'DEPARTAMENTO', 'Buenos Aires 6233', 287, 86756, 1, 104),
(82, 'DEPOSITO', 'Avenida Libertador 2059', 295, 198951, 1, 101),
(83, 'OFICINA', '9 de Julio 1281', 330, 174253, 1, 104),
(84, 'LOCAL', 'Avenida Juárez 737', 391, 161712, 1, 97),
(85, 'LOCAL', 'Morelos 3841', 282, 138295, 1, 96),
(86, 'DEPARTAMENTO', 'Avenida Reforma 3616', 303, 156243, 1, 100),
(87, 'DEPOSITO', 'Colón 3273', 311, 132667, 1, 104),
(88, 'OFICINA', 'Avenida Hidalgo 4125', 230, 195354, 1, 107),
(89, 'LOCAL', '16 de Septiembre 1103', 300, 71919, 1, 102);

-- --------------------------------------------------------

--
-- Table structure for table `inquilino`
--

CREATE TABLE `inquilino` (
  `idInquilino` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `direccion` varchar(60) DEFAULT NULL,
  `telefono` int(11) NOT NULL,
  `email` varchar(60) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `inquilino`
--

INSERT INTO `inquilino` (`idInquilino`, `dni`, `apellido`, `nombre`, `direccion`, `telefono`, `email`, `estado`) VALUES
(41, 46497062, 'RUIZ DIAZ', 'JOAQUIN', 'Avenida San Martín 3536', 2147483647, 'jruiz diaz@gmail.com ', 1),
(42, 46218527, 'RUPANI', 'LISANDRO NATANAEL', 'Buenos Aires 1558', 2147483647, 'lrupani@gmail.com ', 1),
(43, 45267765, 'SACCHI', 'EMANUEL', 'Avenida Libertador 9440', 2147483647, 'esacchi@gmail.com ', 1),
(44, 46368647, 'SANCHEZ', 'MÁXIMO AGUSTIN', '9 de Julio 7601', 2147483647, 'msanchez@gmail.com ', 1),
(45, 46043874, 'SCHVABAUER', 'IVAN', 'Avenida Juárez 2557', 2147483647, 'ischvabauer@gmail.com ', 1);

-- --------------------------------------------------------

--
-- Table structure for table `propietario`
--

CREATE TABLE `propietario` (
  `idPropietario` int(11) NOT NULL,
  `apellido` varchar(60) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `dni` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `telefono` int(11) NOT NULL,
  `email` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `propietario`
--

INSERT INTO `propietario` (`idPropietario`, `apellido`, `nombre`, `dni`, `estado`, `telefono`, `email`) VALUES
(91, 'ACOSTA ', 'PABLO DANIEL', 45654077, 1, 2147483647, 'pacosta@gmail.com'),
(92, 'AGUILERA ', 'ALAN AGUSTIN', 45508699, 1, 2147483647, 'aaguilera@gmail.com'),
(93, 'ALLIONE ', 'ESTEFANO', 46218481, 1, 2147483647, 'eallione@gmail.com'),
(94, 'BARCOS ', 'GUIDO IVAN', 46466604, 1, 2147483647, 'gbarcos@gmail.com'),
(95, 'BAYER ', 'RENZO NICOLAS', 45988203, 1, 2147483647, 'rbayer@gmail.com'),
(96, 'BRACHET ', 'FACUNDO', 46542031, 1, 2147483647, 'fbrachet@gmail.com'),
(97, 'BULLANO ', 'JOAQUIN MATIAS', 46043882, 1, 2147483647, 'jbullano@gmail.com'),
(98, 'CAPPELLETTI ', 'MATEO MARIANO', 46041071, 1, 2147483647, 'mcappelletti@gmail.com'),
(99, 'CARASSAI ', 'VALENTIN', 46371880, 1, 2147483647, 'vcarassai@gmail.com'),
(100, 'CUCCIOLETTA ', 'FABRICIO JESUS', 46220707, 1, 2147483647, 'fcuccioletta@gmail.com'),
(101, 'DOSE ', 'FRANCO', 46445929, 1, 2147483647, 'fdose@gmail.com'),
(102, 'ESTIBIARRIA ', 'TOMAS BAUTISTA', 46220698, 1, 2147483647, 'testibiarria@gmail.com'),
(103, 'FARIAS ', 'TIAGO SEBASTIAN', 46368650, 1, 2147483647, 'tfarias@gmail.com'),
(104, 'GAMARRA ', 'SANTIAGO NICOLAS', 46220680, 1, 2147483647, 'sgamarra@gmail.com'),
(105, 'GOMEZ ', 'ENZO EDUARDO', 46494265, 1, 2147483647, 'egomez@gmail.com'),
(106, 'MACIEL ', 'FAUSTO', 45827317, 1, 2147483647, 'fmaciel@gmail.com'),
(107, 'MALDONADO ', 'FACUNDO DAMIAN', 46368695, 1, 2147483647, 'fmaldonado@gmail.com'),
(108, 'MARI ', 'JUAN PABLO', 46218441, 1, 2147483647, 'jmari@gmail.com'),
(109, 'MARRON ', 'MAXIMO VALENTIN', 46218407, 1, 2147483647, 'mmarron@gmail.com'),
(110, 'MEDINA ', 'PABLO EZEQUIEL', 45827100, 1, 2147483647, 'pmedina@gmail.com'),
(111, 'MENDOZA ', 'EMILIO JOAQUIN', 46263757, 1, 2147483647, 'emendoza@gmail.com'),
(112, 'MONTEDORO ', 'JOAQUIN LISANDRO', 45988405, 1, 2147483647, 'jmontedoro@gmail.com'),
(113, 'MUÑOZ ', 'SANTIAGO HERNAN', 46497065, 1, 2147483647, 'smuñoz@gmail.com'),
(114, 'NUÑEZ ', 'VALENTIN JAVIER', 46041085, 1, 2147483647, 'vnuñez@gmail.com'),
(115, 'PEREIRA ', 'MARCOS JOAQUIN', 46290891, 1, 2147483647, 'mpereira@gmail.com'),
(116, 'PONCE ', 'JUAN PABLO', 45827091, 1, 2147483647, 'jponce@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `alquiler`
--
ALTER TABLE `alquiler`
  ADD PRIMARY KEY (`idAlquiler`),
  ADD KEY `idInquilino` (`idInquilino`,`idInmueble`),
  ADD KEY `idInmueble` (`idInmueble`);

--
-- Indexes for table `inmueble`
--
ALTER TABLE `inmueble`
  ADD PRIMARY KEY (`idInmueble`),
  ADD UNIQUE KEY `Dirección` (`direccion`),
  ADD KEY `idPropietario` (`idPropietario`);

--
-- Indexes for table `inquilino`
--
ALTER TABLE `inquilino`
  ADD PRIMARY KEY (`idInquilino`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indexes for table `propietario`
--
ALTER TABLE `propietario`
  ADD PRIMARY KEY (`idPropietario`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `alquiler`
--
ALTER TABLE `alquiler`
  MODIFY `idAlquiler` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `inmueble`
--
ALTER TABLE `inmueble`
  MODIFY `idInmueble` int(60) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=90;

--
-- AUTO_INCREMENT for table `inquilino`
--
ALTER TABLE `inquilino`
  MODIFY `idInquilino` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- AUTO_INCREMENT for table `propietario`
--
ALTER TABLE `propietario`
  MODIFY `idPropietario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=118;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `alquiler`
--
ALTER TABLE `alquiler`
  ADD CONSTRAINT `alquiler_ibfk_1` FOREIGN KEY (`idInquilino`) REFERENCES `inquilino` (`idInquilino`),
  ADD CONSTRAINT `alquiler_ibfk_2` FOREIGN KEY (`idInmueble`) REFERENCES `inmueble` (`idInmueble`);

--
-- Constraints for table `inmueble`
--
ALTER TABLE `inmueble`
  ADD CONSTRAINT `inmueble_ibfk_1` FOREIGN KEY (`idPropietario`) REFERENCES `propietario` (`idPropietario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
