-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-10-2021 a las 04:47:46
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `analisis_ii`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `procedimiento_accesos` (IN `cod` INT, IN `us` VARCHAR(50), IN `rol` VARCHAR(50), IN `tipob` VARCHAR(50))  INSERT 
INTO bitacora_accesos (codigo_usuario,usuario,fecha,rol,tipo) VALUES(cod,us,SYSDATE(),rol,tipob)$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `procedimiento_reclamos` (IN `cod_reclamo` INT, IN `cod_us` INT, IN `nom` VARCHAR(50), IN `rol_us` VARCHAR(50), IN `us` VARCHAR(50), IN `est` VARCHAR(50))  INSERT 
INTO bitacora_reclamos (codigo_usuario,usuario,rol,fecha,nombre,codigo_reclamo,estado) VALUES
(cod_us,us,rol_us,SYSDATE(),nom,cod_reclamo,est)$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `codigo_administrador` int(11) NOT NULL,
  `usuario_codigo_usuario` int(11) NOT NULL,
  `nombre_administrador` varchar(50) NOT NULL,
  `apellido_administrador` varchar(50) NOT NULL,
  `correo_administrador` varchar(60) NOT NULL,
  `telefono_administrador` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bitacora_accesos`
--

CREATE TABLE `bitacora_accesos` (
  `codigo_usuario` int(11) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `fecha` date NOT NULL,
  `rol` varchar(30) NOT NULL,
  `tipo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `bitacora_accesos`
--

INSERT INTO `bitacora_accesos` (`codigo_usuario`, `usuario`, `fecha`, `rol`, `tipo`) VALUES
(3, 'car', '2021-09-16', 'cliente', ''),
(5, 'klee', '2021-09-16', 'cliente', 'Creacion'),
(5, 'klee', '2021-09-16', 'cliente', 'Ingreso'),
(2, 'user', '2021-09-16', 'cliente', 'Ingreso'),
(5, 'klee', '2021-09-16', 'cliente', 'Ingreso'),
(6, 'jose', '2021-09-16', 'cliente', 'Creacion'),
(6, 'jose', '2021-09-16', 'cliente', 'Ingreso'),
(2, 'user', '2021-09-16', 'cliente', 'Ingreso'),
(5, 'klee', '2021-09-18', 'cliente', 'Ingreso'),
(5, 'klee', '2021-09-21', 'cliente', 'Ingreso'),
(5, 'klee', '2021-09-27', 'cliente', 'Ingreso'),
(5, 'klee', '2021-09-27', 'cliente', 'Ingreso'),
(5, 'klee', '2021-09-27', 'cliente', 'Ingreso'),
(5, 'klee', '2021-09-27', 'cliente', 'Ingreso'),
(5, 'klee', '2021-09-27', 'cliente', 'Ingreso'),
(0, ' klee ', '2021-09-27', 'cliente', 'Actualizacion'),
(5, ' klee ', '2021-09-27', 'cliente', 'Actualizacion'),
(5, 'klee', '2021-09-27', 'cliente', 'Ingreso'),
(5, 'Kysun', '2021-09-27', 'cliente', 'Actualizacion'),
(5, 'klee', '2021-09-27', 'cliente', 'Ingreso'),
(5, 'kysun', '2021-09-27', 'cliente', 'Actualizacion'),
(0, '', '2021-09-27', '', 'Ingreso'),
(5, 'kysun', '2021-09-27', 'cliente', 'Ingreso'),
(5, 'klee', '2021-09-27', 'cliente', 'Actualizacion'),
(5, 'klee', '2021-09-29', 'cliente', 'Ingreso'),
(5, 'klee', '2021-10-07', 'cliente', 'Ingreso'),
(5, 'klee', '2021-10-07', 'cliente', 'Ingreso'),
(5, 'klee', '2021-10-07', 'cliente', 'Ingreso'),
(4, 'aaa', '2021-10-08', 'cliente', 'Ingreso'),
(5, 'klee', '2021-10-08', 'cliente', 'Ingreso'),
(5, 'klee', '2021-10-08', 'cliente', 'Ingreso'),
(5, 'klee', '2021-10-08', 'cliente', 'Ingreso'),
(5, 'klee', '2021-10-08', 'cliente', 'Ingreso'),
(5, 'klee', '2021-10-09', 'cliente', 'Ingreso'),
(3, 'carmen', '2021-10-09', 'cliente', 'Ingreso'),
(5, 'klee', '2021-10-11', 'cliente', 'Ingreso'),
(5, 'klee', '2021-10-18', 'cliente', 'Ingreso'),
(5, 'klee', '2021-10-18', 'cliente', 'Ingreso'),
(5, 'klee', '2021-10-18', 'cliente', 'Ingreso'),
(5, 'klee', '2021-10-18', 'cliente', 'Ingreso'),
(5, 'klee', '2021-10-20', 'cliente', 'Ingreso'),
(5, 'klee', '2021-10-20', 'cliente', 'Ingreso'),
(8, 'kyung', '2021-10-20', 'cliente', 'Creacion'),
(4, 'dani', '2021-10-20', 'cliente', 'Ingreso'),
(9, 'us', '2021-10-20', 'cliente', 'Creacion'),
(10, 'dario', '2021-10-20', 'cliente', 'Creacion'),
(11, 'prueba', '2021-10-20', 'cliente', 'Creacion'),
(12, 'prueba2', '2021-10-20', 'cliente', 'Creacion'),
(13, 'kyung', '2021-10-20', 'cliente', 'Creacion'),
(14, 'kyung', '2021-10-20', 'cliente', 'Creacion'),
(15, 'kyung', '2021-10-20', 'cliente', 'Creacion'),
(15, 'kyung', '2021-10-20', 'cliente', 'Ingreso'),
(16, 'kuser', '2021-10-20', 'cliente', 'Creacion'),
(17, 'yo', '2021-10-20', 'cliente', 'Creacion'),
(17, 'yo', '2021-10-20', 'cliente', 'Ingreso'),
(17, 'yo', '2021-10-21', 'cliente', 'Ingreso'),
(17, '', '2021-10-21', 'cliente', 'Actualizacion'),
(17, 'yo', '2021-10-21', 'cliente', 'Ingreso'),
(17, 'yo', '2021-10-21', 'cliente', 'Actualizacion'),
(17, 'yo', '2021-10-21', 'cliente', 'Actualizacion'),
(17, 'yo', '2021-10-21', 'cliente', 'Actualizacion'),
(17, 'jram', '2021-10-21', 'cliente', 'Actualizacion'),
(17, 'jram', '2021-10-21', 'cliente', 'Ingreso'),
(17, 'jram', '2021-10-21', 'cliente', 'ActualizacionClave'),
(17, 'jram', '2021-10-21', 'cliente', 'Ingreso'),
(17, 'jram', '2021-10-22', 'cliente', 'Ingreso'),
(17, 'jram', '2021-10-22', 'cliente', 'Ingreso'),
(17, 'jram', '2021-10-22', 'cliente', 'Ingreso'),
(17, 'jram', '2021-10-22', 'cliente', 'Ingreso'),
(17, 'jram', '2021-10-23', 'cliente', 'Ingreso'),
(17, 'jram', '2021-10-23', 'cliente', 'ActualizacionClave'),
(17, 'jram', '2021-10-23', 'cliente', 'Ingreso'),
(17, 'jram', '2021-10-23', 'cliente', 'Ingreso'),
(17, 'jram', '2021-10-28', 'cliente', 'Ingreso'),
(17, 'jram', '2021-10-28', 'cliente', 'Ingreso'),
(18, 'admin', '2021-10-28', 'cliente', 'Creacion'),
(17, 'jram', '2021-10-29', 'cliente', 'Ingreso'),
(17, 'jram', '2021-10-29', 'cliente', 'Ingreso');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bitacora_modificaciones`
--

CREATE TABLE `bitacora_modificaciones` (
  `fecha` date NOT NULL,
  `producto` varchar(50) NOT NULL,
  `tipo` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `bitacora_modificaciones`
--

INSERT INTO `bitacora_modificaciones` (`fecha`, `producto`, `tipo`) VALUES
('0000-00-00', 'Atun', 'mariscos'),
('0000-00-00', 'Atun salado', 'pescados');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bitacora_reclamos`
--

CREATE TABLE `bitacora_reclamos` (
  `codigo_usuario` int(11) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `rol` varchar(50) NOT NULL,
  `fecha` date NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `codigo_reclamo` int(11) NOT NULL,
  `estado` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `bitacora_reclamos`
--

INSERT INTO `bitacora_reclamos` (`codigo_usuario`, `usuario`, `rol`, `fecha`, `nombre`, `codigo_reclamo`, `estado`) VALUES
(6, 'jose', 'cliente', '2021-09-16', 'jose', 21, 'enviado'),
(5, 'klee', 'cliente', '2021-09-18', 'klee', 0, 'enviado'),
(5, 'klee', 'cliente', '2021-09-28', 'klee', 0, 'enviado'),
(5, 'klee', 'cliente', '2021-09-28', 'klee', 0, 'enviado'),
(5, 'klee', 'cliente', '2021-09-28', 'klee', 0, 'enviado'),
(5, 'klee', 'cliente', '2021-09-28', 'klee', 0, 'enviado'),
(5, 'klee', 'cliente', '2021-09-28', 'klee', 24, 'enviado'),
(5, 'klee', 'cliente', '2021-10-08', 'klee', 25, 'enviado'),
(3, 'carmen', 'cliente', '2021-10-09', 'carmen', 26, 'enviado'),
(17, 'jram', 'cliente', '2021-10-29', 'jram', 27, 'enviado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carretilla_compra`
--

CREATE TABLE `carretilla_compra` (
  `codigo_factura` int(11) NOT NULL,
  `codigo_producto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `carretilla_compra`
--

INSERT INTO `carretilla_compra` (`codigo_factura`, `codigo_producto`, `cantidad`) VALUES
(3, 1, 2),
(3, 2, 2),
(4, 4, 2),
(4, 3, 3),
(4, 2, 1),
(6, 2, 2),
(7, 2, 2),
(8, 2, 10),
(9, 2, 8),
(10, 1, 2),
(10, 3, 1),
(11, 3, 2),
(12, 2, 5),
(13, 4, 2),
(13, 2, 2),
(14, 4, 2),
(14, 2, 2),
(15, 4, 2),
(15, 2, 2),
(15, 4, 2),
(15, 2, 2),
(17, 4, 2),
(17, 2, 2),
(18, 4, 2),
(18, 2, 2),
(19, 4, 2),
(19, 2, 2),
(20, 4, 2),
(20, 2, 2),
(21, 2, 9),
(21, 5, 5),
(22, 5, 3);

--
-- Disparadores `carretilla_compra`
--
DELIMITER $$
CREATE TRIGGER `venta` AFTER INSERT ON `carretilla_compra` FOR EACH ROW UPDATE producto SET `cantidad_producto` = `cantidad_producto` - new.`cantidad` WHERE `codigo_producto` = new.`codigo_producto`
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudad`
--

CREATE TABLE `ciudad` (
  `codigo_ciudad` int(11) NOT NULL,
  `nombre_ciudad` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `ciudad`
--

INSERT INTO `ciudad` (`codigo_ciudad`, `nombre_ciudad`) VALUES
(1, 'Escuintla'),
(2, 'Ciudad2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `codigo_cliente` int(11) NOT NULL,
  `nombre_cliente` varchar(45) NOT NULL,
  `apellido_cliente` varchar(45) NOT NULL,
  `telefono_cliente` int(11) NOT NULL,
  `correo_cliente` varchar(45) NOT NULL,
  `direccion_cliente` varchar(45) NOT NULL,
  `codigo_usuario` int(11) NOT NULL,
  `codigo_ciudad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`codigo_cliente`, `nombre_cliente`, `apellido_cliente`, `telefono_cliente`, `correo_cliente`, `direccion_cliente`, `codigo_usuario`, `codigo_ciudad`) VALUES
(5, 'ana', 'maria', 12345678, 'ana@', 'calle sur', 2, 1),
(6, 'carmen', 'rojo', 12341234, 'car@', 'calle', 3, 1),
(7, 'aaa', 'aaa', 1234, 'aaa@', 'aaa', 4, 1),
(8, 'Kysun ', 'Ly ', 41919309, 'kleea@miumg.edu.gt  ', 'cañadas    ', 5, 1),
(9, 'jose', 'diaz', 1234, 'd@', 'calle', 6, 1),
(16, 'KYUNG', 'LEE', 12345678, 'CORREO', 'calle', 15, 2),
(17, 'wwww', 'wwww', 12345678, 'CORREO', 'aa', 16, 2),
(18, 'jorge    ', 'ramirez    ', 12345678, 'qwe     ', 'qwe     ', 17, 1),
(19, 'Kyung', 'Lee', 11431165, 'klee@', 'calle 3', 18, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE `empresa` (
  `codigo_empresa` int(11) NOT NULL,
  `nombre_empresa` varchar(50) NOT NULL,
  `telefono_empresa` int(8) NOT NULL,
  `correo_empresa` varchar(30) NOT NULL,
  `direccion_empresa` varchar(50) NOT NULL,
  `mision` varchar(200) NOT NULL,
  `vision` varchar(200) NOT NULL,
  `codigo_ciudad` int(11) NOT NULL,
  `estado` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `empresa`
--

INSERT INTO `empresa` (`codigo_empresa`, `nombre_empresa`, `telefono_empresa`, `correo_empresa`, `direccion_empresa`, `mision`, `vision`, `codigo_ciudad`, `estado`) VALUES
(3, 'Super Mercado', 12345678, 'supermarket@gmail.com', 'Escuintla, Palin', 'Nuestra misión es convertirnos en una cadena de supermercados a nivel nacional al tiempo que ofrecemos un amplio surtido de productos de calidad a unos precios competitivos.', 'Consolidarnos como una cadena de supermercados cercana, donde el cliente siempre esté bien atendido y pueda realizar su compra de manera agradable y satisfactoria. ', 1, 'inactivo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado_reclamo`
--

CREATE TABLE `estado_reclamo` (
  `codigo_estado` int(11) NOT NULL,
  `estado` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `estado_reclamo`
--

INSERT INTO `estado_reclamo` (`codigo_estado`, `estado`) VALUES
(1, 'Enviado'),
(2, 'Recibido'),
(3, 'Procesando'),
(4, 'Terminado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `codigo_factura` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `fecha_factura` date NOT NULL,
  `codigo_cliente` int(11) DEFAULT NULL,
  `metodo_pago` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`codigo_factura`, `total`, `fecha_factura`, `codigo_cliente`, `metodo_pago`) VALUES
(1, 0, '0000-00-00', NULL, NULL),
(2, 200, '0000-00-00', NULL, NULL),
(3, 70, '2021-10-07', 5, NULL),
(4, 52, '2021-10-07', 8, NULL),
(5, 150, '2021-10-07', 8, NULL),
(6, 30, '2021-10-07', 8, NULL),
(7, 30, '2021-10-07', 8, NULL),
(8, 150, '2021-10-07', 8, NULL),
(9, 120, '2021-10-08', 8, NULL),
(10, 49, '2021-10-08', 8, NULL),
(11, 18, '2021-10-08', NULL, NULL),
(12, 75, '2021-10-08', 8, 'Tarjeta de credito'),
(13, 40, '2021-10-09', 6, 'Tarjeta de credito'),
(14, 40, '2021-10-11', 8, 'Contra entrega'),
(15, 80, '2021-10-11', 8, 'Contra entrega'),
(16, 9010, '2021-10-18', 8, 'Contra entrega'),
(17, 40, '2021-10-18', 8, 'Contra entrega'),
(18, 40, '2021-10-22', NULL, 'Contra entrega'),
(19, 40, '2021-10-22', NULL, 'Tarjeta de credito'),
(20, 40, '2021-10-23', 18, 'Tarjeta de credito'),
(21, 200, '2021-10-28', NULL, 'Contra entrega'),
(22, 39, '2021-10-29', 18, 'Contra entrega');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `preguntas`
--

CREATE TABLE `preguntas` (
  `codigo` int(11) NOT NULL,
  `pregunta` varchar(100) NOT NULL,
  `descripcion` varchar(250) NOT NULL,
  `estado` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `preguntas`
--

INSERT INTO `preguntas` (`codigo`, `pregunta`, `descripcion`, `estado`) VALUES
(1, '¿Como realizar una compra?', 'Para  comprar primero debe buscar el producto a comprar, presionar el boton de comprar, dirigirse al carrito y procesar compra.', 'activo'),
(2, '¿Como agrego mas dudas?', 'Para agregar mas dudas, por el momento solo se puede hacer por medio de la base de datos', 'activo'),
(3, 'Como ingresar a mi usuario?', 'Para ingresar al usuario, primero debe buscar el icono...', 'activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `codigo_producto` int(11) NOT NULL,
  `nombre_producto` varchar(45) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `precio_producto` float NOT NULL,
  `cantidad_producto` int(11) NOT NULL,
  `Tipo_producto` varchar(20) NOT NULL,
  `imagen` varchar(100) NOT NULL,
  `codigo_proveedor` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`codigo_producto`, `nombre_producto`, `descripcion`, `precio_producto`, `cantidad_producto`, `Tipo_producto`, `imagen`, `codigo_proveedor`) VALUES
(1, 'Aceite Patrona 500 lm', 'Botella de aceite de 500ml', 20, 347, 'despensa', 'aceite.jpg', 1),
(2, 'Gaseosa Coca cola 3ltr', 'botella de gaeosa de 3 litros', 15, 150, 'bebida', 'gas.jpg', 1),
(3, 'Jabon liquido Olimpo 500ml', 'botella de jabon liquido 500 ml', 9, 497, 'higiene', 'jabon.jpg', 3),
(4, 'Jamon premier pequeño 5 unidades', 'paquete de jamon premier 5 unidades', 5, 584, 'carne', 'jamon.jpg', 2),
(5, 'Aceite real 500 lm', 'aceite de real', 13.5, 42, 'despensa', 'aceite.jpg', 1),
(7, 'Atun real', 'atun enlatado 200gr', 9, 200, 'pescados', 'atun.jpg', 2);

--
-- Disparadores `producto`
--
DELIMITER $$
CREATE TRIGGER `modificaciones` AFTER INSERT ON `producto` FOR EACH ROW INSERT INTO bitacora_modificaciones (`fecha`, `producto`, `tipo`) VALUES ('sysdate()',new.nombre_producto,new.Tipo_producto)
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `codigo_proveedor` int(11) NOT NULL,
  `nombre_proveedor` varchar(45) NOT NULL,
  `telefono_proveedor` int(11) NOT NULL,
  `direccion_proveedor` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`codigo_proveedor`, `nombre_proveedor`, `telefono_proveedor`, `direccion_proveedor`) VALUES
(1, 'AciteSA', 11111456, 'Proveedor de aceite'),
(2, 'Carnes S.A.', 12345678, 'Escuintla'),
(3, 'Limpieza Inc.', 12345678, 'Escuintla');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reclamos`
--

CREATE TABLE `reclamos` (
  `codigo_reclamo` int(11) NOT NULL,
  `codigo_tipo` int(11) NOT NULL,
  `descripcion_reclamo` varchar(60) DEFAULT NULL,
  `codigo_estado` int(11) NOT NULL,
  `codigo_cliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `reclamos`
--

INSERT INTO `reclamos` (`codigo_reclamo`, `codigo_tipo`, `descripcion_reclamo`, `codigo_estado`, `codigo_cliente`) VALUES
(24, 2, 'retraso', 1, 8),
(25, 2, 'tarde', 1, 8),
(26, 2, 'producto tarde', 1, 6),
(27, 2, 'tardo', 1, 18);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `codigo_rol` int(11) NOT NULL,
  `nombre_rol` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`codigo_rol`, `nombre_rol`) VALUES
(1, 'cliente'),
(2, 'administrador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `solicitante`
--

CREATE TABLE `solicitante` (
  `codigo_solicitante` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `telefono` int(11) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `codigo_ciudad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `solicitante`
--

INSERT INTO `solicitante` (`codigo_solicitante`, `nombre`, `apellido`, `correo`, `telefono`, `direccion`, `codigo_ciudad`) VALUES
(7, 'pedro', 'Raiz', 'aaa', 12345678, 'calle azul', 1),
(8, 'jbardo', 'aaa', 'jjjj@gmail.com', 12345678, 'calle norte', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_reclamo`
--

CREATE TABLE `tipo_reclamo` (
  `codigo_tipo_reclamo` int(11) NOT NULL,
  `nombre_tipo_reclamo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tipo_reclamo`
--

INSERT INTO `tipo_reclamo` (`codigo_tipo_reclamo`, `nombre_tipo_reclamo`) VALUES
(1, 'Mal estado'),
(2, 'Retraso');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `codigo_usuario` int(11) NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `contrasena_usuario` varchar(100) NOT NULL,
  `estado_usuario` varchar(45) NOT NULL,
  `codigo_rol` int(11) NOT NULL,
  `fecha_creacion_usuario` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`codigo_usuario`, `usuario`, `contrasena_usuario`, `estado_usuario`, `codigo_rol`, `fecha_creacion_usuario`) VALUES
(2, 'user1', 'pass', 'inactivo', 1, '2021-09-16'),
(3, 'carmen', 'con', 'inactivo', 1, '0000-00-00'),
(4, 'dani', 'aaa', 'inactivo', 1, '2021-09-16'),
(5, 'klee', '0908', 'inactivo', 1, '2021-09-16'),
(6, 'jose', 'con', 'inactivo', 1, '2021-09-16'),
(7, 'carro', 'carro', 'inactivo', 1, '2021-10-08'),
(15, 'kyung', '$2y$10$WriCPZ4PSoNCVmoQg3hFOueWzrHAD6uEi5OLF2', 'activo', 1, '2021-10-20'),
(16, 'kuser', '$2y$10$akQsN191N4aFvQ1iXcPxQe4skLTPwxGykVyuDs', 'activo', 1, '2021-10-20'),
(17, 'jram', '$2y$10$XNrjRf6UMRa9HR9MsJ/yRO2XI7cGkfnwF/NzGSxFa.fXbnQ6BgSXq', 'activo', 1, '2021-10-20'),
(18, 'admin', '123', 'activo', 2, '2021-10-28');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`codigo_administrador`,`usuario_codigo_usuario`),
  ADD KEY `fk_administrador_usuario1` (`usuario_codigo_usuario`);

--
-- Indices de la tabla `carretilla_compra`
--
ALTER TABLE `carretilla_compra`
  ADD KEY `codigo_factura` (`codigo_factura`),
  ADD KEY `codigo_producto` (`codigo_producto`);

--
-- Indices de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  ADD PRIMARY KEY (`codigo_ciudad`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`codigo_cliente`),
  ADD KEY `codigo_usuario` (`codigo_usuario`),
  ADD KEY `codigo_ciudad` (`codigo_ciudad`);

--
-- Indices de la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`codigo_empresa`),
  ADD KEY `codigo_ciudad` (`codigo_ciudad`);

--
-- Indices de la tabla `estado_reclamo`
--
ALTER TABLE `estado_reclamo`
  ADD PRIMARY KEY (`codigo_estado`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`codigo_factura`);

--
-- Indices de la tabla `preguntas`
--
ALTER TABLE `preguntas`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`codigo_producto`),
  ADD KEY `codigo_proveedor` (`codigo_proveedor`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`codigo_proveedor`);

--
-- Indices de la tabla `reclamos`
--
ALTER TABLE `reclamos`
  ADD PRIMARY KEY (`codigo_reclamo`),
  ADD KEY `codigo_estado` (`codigo_estado`),
  ADD KEY `codigo_tipo` (`codigo_tipo`),
  ADD KEY `codigo_cliente` (`codigo_cliente`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`codigo_rol`);

--
-- Indices de la tabla `solicitante`
--
ALTER TABLE `solicitante`
  ADD PRIMARY KEY (`codigo_solicitante`),
  ADD KEY `codigo_ciudad` (`codigo_ciudad`);

--
-- Indices de la tabla `tipo_reclamo`
--
ALTER TABLE `tipo_reclamo`
  ADD PRIMARY KEY (`codigo_tipo_reclamo`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`codigo_usuario`),
  ADD KEY `codigo_rol` (`codigo_rol`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  MODIFY `codigo_ciudad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `codigo_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `empresa`
--
ALTER TABLE `empresa`
  MODIFY `codigo_empresa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `estado_reclamo`
--
ALTER TABLE `estado_reclamo`
  MODIFY `codigo_estado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `codigo_factura` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `preguntas`
--
ALTER TABLE `preguntas`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `codigo_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `codigo_proveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `reclamos`
--
ALTER TABLE `reclamos`
  MODIFY `codigo_reclamo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `codigo_rol` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `solicitante`
--
ALTER TABLE `solicitante`
  MODIFY `codigo_solicitante` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `tipo_reclamo`
--
ALTER TABLE `tipo_reclamo`
  MODIFY `codigo_tipo_reclamo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `codigo_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD CONSTRAINT `fk_administrador_usuario1` FOREIGN KEY (`usuario_codigo_usuario`) REFERENCES `usuario` (`codigo_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `carretilla_compra`
--
ALTER TABLE `carretilla_compra`
  ADD CONSTRAINT `carretilla_compra_ibfk_1` FOREIGN KEY (`codigo_factura`) REFERENCES `factura` (`codigo_factura`),
  ADD CONSTRAINT `carretilla_compra_ibfk_2` FOREIGN KEY (`codigo_producto`) REFERENCES `producto` (`codigo_producto`);

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`codigo_usuario`) REFERENCES `usuario` (`codigo_usuario`),
  ADD CONSTRAINT `cliente_ibfk_2` FOREIGN KEY (`codigo_ciudad`) REFERENCES `ciudad` (`codigo_ciudad`);

--
-- Filtros para la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD CONSTRAINT `empresa_ibfk_1` FOREIGN KEY (`codigo_ciudad`) REFERENCES `ciudad` (`codigo_ciudad`);

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`codigo_proveedor`) REFERENCES `proveedor` (`codigo_proveedor`);

--
-- Filtros para la tabla `reclamos`
--
ALTER TABLE `reclamos`
  ADD CONSTRAINT `reclamos_ibfk_1` FOREIGN KEY (`codigo_estado`) REFERENCES `estado_reclamo` (`codigo_estado`) ON UPDATE CASCADE,
  ADD CONSTRAINT `reclamos_ibfk_2` FOREIGN KEY (`codigo_tipo`) REFERENCES `tipo_reclamo` (`codigo_tipo_reclamo`),
  ADD CONSTRAINT `reclamos_ibfk_3` FOREIGN KEY (`codigo_cliente`) REFERENCES `cliente` (`codigo_cliente`);

--
-- Filtros para la tabla `solicitante`
--
ALTER TABLE `solicitante`
  ADD CONSTRAINT `solicitante_ibfk_1` FOREIGN KEY (`codigo_ciudad`) REFERENCES `ciudad` (`codigo_ciudad`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`codigo_rol`) REFERENCES `rol` (`codigo_rol`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
