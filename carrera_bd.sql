-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-07-2021 a las 18:36:44
-- Versión del servidor: 10.1.9-MariaDB
-- Versión de PHP: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `carrera_bd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carrera`
--

CREATE TABLE `carrera` (
  `carrera_no` int(11) NOT NULL,
  `primer_lugar` varchar(100) NOT NULL,
  `segundo_lugar` varchar(100) NOT NULL,
  `tercer_lugar` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `carrera`
--

INSERT INTO `carrera` (`carrera_no`, `primer_lugar`, `segundo_lugar`, `tercer_lugar`) VALUES
(1, 'Marc Marquez', 'Valentino Rossi', 'Danilo Petrucci');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `corredores_circuito`
--

CREATE TABLE `corredores_circuito` (
  `carrera_no` int(11) NOT NULL,
  `nombre_corredor1` varchar(100) NOT NULL,
  `nombre_corredor2` varchar(100) NOT NULL,
  `nombre_corredor3` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `corredores_circuito`
--

INSERT INTO `corredores_circuito` (`carrera_no`, `nombre_corredor1`, `nombre_corredor2`, `nombre_corredor3`) VALUES
(1, 'Marc Marquez', 'Valentino Rossi', 'Danilo Petrucci');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `carrera`
--
ALTER TABLE `carrera`
  ADD PRIMARY KEY (`carrera_no`);

--
-- Indices de la tabla `corredores_circuito`
--
ALTER TABLE `corredores_circuito`
  ADD PRIMARY KEY (`carrera_no`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `carrera`
--
ALTER TABLE `carrera`
  MODIFY `carrera_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `corredores_circuito`
--
ALTER TABLE `corredores_circuito`
  MODIFY `carrera_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
