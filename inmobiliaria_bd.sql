-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 04, 2023 at 08:21 PM
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
  `cuitInquilino` int(20) NOT NULL,
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
  `tipo` varchar(15) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `direccion` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `superficie` double NOT NULL,
  `precio` double NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `idPropietario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `inmueble`
--

INSERT INTO `inmueble` (`idInmueble`, `tipo`, `direccion`, `superficie`, `precio`, `estado`, `idPropietario`) VALUES
(4, 'LOCAL', '	Avenida San Martín	8997	 ', 72, 117922, 1, 3),
(6, 'LOCAL', '	Avenida San Martín	7836	 ', 165, 73711, 1, 29),
(7, '	DEPARTAMEN', '	Buenos Aires	677	 ', 7, 169761, 1, 15),
(8, '	DEPOSITO	 ', '	Avenida Libertador	3396	 ', 119, 107086, 1, 2),
(13, 'OFICINA', '	9 de Julio	6233	 ', 17, 123216, 1, 32),
(14, 'LOCAL', '	Avenida Juárez	6103	 ', 1, 139630, 1, 27),
(16, 'LOCAL', '	Avenida Juárez	8576	 ', 45, 114008, 1, 19),
(18, 'LOCAL', '	Avenida Juárez	809	 ', 134, 146946, 1, 25),
(19, 'LOCAL', '	Morelos	2391	 ', 45, 190752, 1, 21),
(20, '	DEPARTAMEN', '	Avenida Reforma	8703	 ', 75, 184522, 1, 18),
(21, '	DEPOSITO	 ', '	Colón	9607	 ', 187, 86150, 1, 28),
(22, 'OFICINA', '	Avenida Hidalgo	1872	 ', 99, 127038, 1, 24),
(23, 'LOCAL', '	16 de Septiembre	3726	 ', 173, 126518, 1, 29),
(24, 'LOCAL', '	Avenida Principal	9396	 ', 112, 176268, 1, 35),
(25, '	DEPARTAMEN', '	Central	1405	 ', 116, 112712, 1, 32),
(26, '	DEPOSITO	 ', '	Avenida Benito Juárez	5098	 ', 147, 188008, 1, 35),
(27, 'OFICINA', '	Independencia	2017	 ', 94, 92284, 1, 25),
(28, 'LOCAL', '	Avenida Revolución	3175	 ', 67, 76486, 1, 20),
(29, 'LOCAL', '	20 de Noviembre	7355	 ', 34, 168937, 1, 19),
(30, '	DEPARTAMEN', '	Avenida 5 de Mayo	1450	 ', 36, 168503, 1, 33),
(31, '	DEPOSITO	 ', '	25 de Mayo	299	 ', 73, 75597, 1, 16),
(32, 'OFICINA', '	Avenida Constitución	5058	 ', 152, 134802, 1, 35),
(33, 'LOCAL', '	1 de Mayo	6600	 ', 64, 190668, 1, 29),
(34, 'LOCAL', '	Avenida San Martín	4418	 ', 167, 138825, 1, 30),
(35, '	DEPARTAMEN', '	Buenos Aires	8438	 ', 34, 116256, 1, 22),
(36, '	DEPOSITO	 ', '	Avenida Libertador	7933	 ', 162, 159466, 1, 25),
(37, 'OFICINA', '	9 de Julio	1988	 ', 11, 182158, 1, 24),
(38, 'LOCAL', '	Avenida Juárez	1516	 ', 145, 170929, 1, 32),
(39, 'LOCAL', '	Morelos	2867	 ', 65, 144555, 1, 24),
(40, '	DEPARTAMEN', '	Avenida Reforma	9520	 ', 7, 93961, 1, 21),
(41, '	DEPOSITO	 ', '	Colón	5475	 ', 115, 83618, 1, 31),
(42, 'OFICINA', '	Avenida Hidalgo	8399	 ', 94, 180869, 1, 22),
(43, 'LOCAL', '	16 de Septiembre	7835	 ', 55, 197469, 1, 26);

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
(6, 46575461, '	BARRIOS	 ', '	ALAN GABRIEL	 ', '	Avenida Principal	2519	', 2147483647, '	abarrios@gmail.com	 ', 1),
(7, 47006080, '	BIANCUCCI	 ', '	FRANCO	 ', '	Central	7276	', 2147483647, '	fbiancucci@gmail.com	 ', 1),
(8, 46542081, '	CORONEL	 ', '	LAUTARO TOMÁS	 ', '	Avenida Benito Juárez	337	', 2147483647, '	lcoronel@gmail.com	 ', 1),
(9, 46540729, '	DI GIACINTI	 ', '	VITTORIO	 ', '	Independencia	4600	', 2147483647, '	vdi giacinti@gmail.com	 ', 1),
(10, 47133409, '	FERNANDEZ	 ', '	MATÍAS ANDRÉS	 ', '	Avenida Revolución	3176	', 2147483647, '	mfernandez@gmail.com	 ', 1),
(11, 47208152, '	GENNAI	 ', '	FRANCISCO LEANDRO	 ', '	20 de Noviembre	58	', 2147483647, '	fgennai@gmail.com	 ', 1),
(12, 47133441, '	GENTILLI PEROZZI	 ', '	MARTÁN EMMANUEL ROBERTO	 ', '	Avenida 5 de Mayo	1248	', 2147483647, '	mgentilli perozzi@gmail.com	 ', 1),
(13, 46750214, '	LENCINA	 ', '	NAHUEL HERNÁN	 ', '	25 de Mayo	8391	', 2147483647, '	nlencina@gmail.com	 ', 1),
(14, 46996787, '	LORENZONI	 ', '	GUSTAVO DAVID	 ', '	Avenida Constitución	7333	', 2147483647, '	glorenzoni@gmail.com	 ', 1),
(15, 46653805, '	MARZILI ALMIRÓN	 ', '	BRANDON AGUSTÍN	 ', '	1 de Mayo	4154	', 2147483647, '	bmarzili almirón@gmail.com	 ', 1),
(16, 46969681, '	MORONI	 ', '	MATEO	 ', '	Avenida San Martín	9102	', 2147483647, '	mmoroni@gmail.com	 ', 1),
(17, 46290892, '	PEREIRA	 ', '	MATEO NICOLÁS	 ', '	Buenos Aires	4320	', 2147483647, '	mpereira@gmail.com	 ', 1),
(18, 46653828, '	RIGGIO	 ', '	TIZIANO SEBASTIÁN	 ', '	Avenida Libertador	1140	', 2147483647, '	triggio@gmail.com	 ', 1),
(19, 47038766, '	RIVAS	 ', '	SANTIAGO	 ', '	9 de Julio	690	', 2147483647, '	srivas@gmail.com	 ', 1),
(20, 47074780, '	ROSALES	 ', '	FRANCO LEONEL	 ', '	Avenida Juárez	5163	', 2147483647, '	frosales@gmail.com	 ', 1),
(21, 46996785, '	SANCHEZ	 ', '	EMILIANO MARTÍN	 ', '	Morelos	5075	', 2147483647, '	esanchez@gmail.com	 ', 1),
(22, 47074713, '	SANDOVAL	 ', '	VALENTINO JOEL	 ', '	Avenida Reforma	2642	', 2147483647, '	vsandoval@gmail.com	 ', 1),
(23, 45951079, '	VEGA	 ', '	ENZO OSCAR	 ', '	Colón	2600	', 2147483647, '	evega@gmail.com	 ', 1),
(24, 46999480, '	YOFRA	 ', '	VICENTE TOBIAS	 ', '	Avenida Hidalgo	5226	', 2147483647, '	vyofra@gmail.com	 ', 1),
(25, 47038751, '	ZECCA	 ', '	LISANDRO GABRIEL	 ', '	16 de Septiembre	8703	', 2147483647, '	lzecca@gmail.com	 ', 1);

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
(2, '	ACOSTA	 ', '	PABLO DANIEL	 ', 45654077, 1, 2147483647, '	pacosta@gmail.com	'),
(3, '	AGUILERA	 ', '	ALAN AGUSTÍN	 ', 45508699, 1, 2147483647, '	aaguilera@gmail.com	'),
(14, '	FARIAS	 ', '	TIAGO SEBASTIÁN	 ', 46368650, 1, 2147483647, '	tfarias@gmail.com	'),
(15, '	GAMARRA	 ', '	SANTIAGO NICOLÁS	 ', 46220680, 1, 2147483647, '	sgamarra@gmail.com	'),
(16, '	GOMEZ	 ', '	ENZO EDUARDO	 ', 46494265, 1, 2147483647, '	egomez@gmail.com	'),
(17, '	MACIEL	 ', '	FAUSTO	 ', 45827317, 1, 2147483647, '	fmaciel@gmail.com	'),
(18, '	MALDONADO	 ', '	FACUNDO DAMIÁN	 ', 46368695, 1, 2147483647, '	fmaldonado@gmail.com	'),
(19, '	MARI	 ', '	JUAN PABLO	 ', 46218441, 1, 2147483647, '	jmari@gmail.com	'),
(20, '	MARRON	 ', '	MÁXIMO VALENTIN	 ', 46218407, 1, 2147483647, '	mmarron@gmail.com	'),
(21, '	MEDINA	 ', '	PABLO EZEQUIEL	 ', 45827100, 1, 2147483647, '	pmedina@gmail.com	'),
(22, '	MENDOZA	 ', '	EMILIO JOAQUIN	 ', 46263757, 1, 2147483647, '	emendoza@gmail.com	'),
(23, '	MONTEDORO	 ', '	JOAQUIN LISANDRO	 ', 45988405, 1, 2147483647, '	jmontedoro@gmail.com	'),
(24, '	MUÑOZ	 ', '	SANTIAGO HERNÁN	 ', 46497065, 1, 2147483647, '	smuñoz@gmail.com	'),
(25, '	NUÑEZ	 ', '	VALENTIN JAVIER	 ', 46041085, 1, 2147483647, '	vnuñez@gmail.com	'),
(26, '	PEREIRA	 ', '	MARCOS JOAQUIN	 ', 46290891, 1, 2147483647, '	mpereira@gmail.com	'),
(27, '	PONCE	 ', '	JUAN PABLO	 ', 45827091, 1, 2147483647, '	jponce@gmail.com	'),
(28, '	RIVAS	 ', '	LISANDRO	 ', 46294850, 1, 2147483647, '	lrivas@gmail.com	'),
(29, '	RODRIGUEZ	 ', '	AGUSTIN EZEQUIEL	 ', 46270042, 1, 2147483647, '	arodriguez@gmail.com	'),
(30, '	ROSSI	 ', '	VALENTINO	 ', 46542002, 1, 2147483647, '	vrossi@gmail.com	'),
(31, '	RUELLI	 ', '	SEBASTIÁN DANIEL	 ', 46542006, 1, 2147483647, '	sruelli@gmail.com	'),
(32, '	RUIZ DIAZ	 ', '	JOAQUIN	 ', 46497062, 1, 2147483647, '	jruiz diaz@gmail.com	'),
(33, '	RUPANI	 ', '	LISANDRO NATANAEL	 ', 46218527, 1, 2147483647, '	lrupani@gmail.com	'),
(34, '	SACCHI	 ', '	EMANUEL	 ', 45267765, 1, 2147483647, '	esacchi@gmail.com	'),
(35, '	SANCHEZ	 ', '	MÁXIMO AGUSTIN	 ', 46368647, 1, 2147483647, '	msanchez@gmail.com	'),
(50, '	MARZILI ALMIRÓN	 ', '	BRANDON AGUSTÍN	 ', 46653805, 1, 2147483647, '	bmarzili almirón@gmail.com	'),
(63, 'Apellido', 'Nombre', 111, 1, 123456789, 'correo@example.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `alquiler`
--
ALTER TABLE `alquiler`
  ADD PRIMARY KEY (`idAlquiler`),
  ADD UNIQUE KEY `CuitInquilino` (`cuitInquilino`),
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
  MODIFY `idAlquiler` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `inmueble`
--
ALTER TABLE `inmueble`
  MODIFY `idInmueble` int(60) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=50;

--
-- AUTO_INCREMENT for table `inquilino`
--
ALTER TABLE `inquilino`
  MODIFY `idInquilino` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `propietario`
--
ALTER TABLE `propietario`
  MODIFY `idPropietario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=64;

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
