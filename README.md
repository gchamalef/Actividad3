# Actividad_3
---
## Sistema de Gestion de Empleados
###### Este es un proyecto de tarea para la universidad de una aplicación de gestión de empleados desarrollado en Java utilizando el entorno de desarrollo NetBeans. La aplicación se conecta a una base de datos para almacenar y recuperar información de los clientes. El proyecto fue desarrollado utilizando Apache NetBeans 18 como IDE.
---
## Uso

###### 1. Clona este repositorio en tu máquina local.
###### 2. Asegúrate de tener Java JDK instalado.
###### 3. Abre el proyecto en Apache NetBeans 18 u otro entorno de desarrollo compatible.
###### 4. Asegurate de tener una base de datos configurada.
###### 4. Compila y ejecuta el archivo `Main.java`.
###### 4. La aplicacion se abrira y se conectara a la base de datos para que puedas comenzar a gestionar los empleados.
---
## Base de Datos

###### La aplicación utiliza una base de datos para almacenar y recuperar la información de los empleados. Asegúrate de tener la base de datos configurada correctamente antes de ejecutar la aplicación.
```sql
CREATE DATABASE `db_empresa`;
USE `db_empresa`;

CREATE TABLE `empleados` (
  `id_empleado` int NOT NULL AUTO_INCREMENT,
  `codigo` varchar(20) DEFAULT NULL,
  `nombres` varchar(60) DEFAULT NULL,
  `apellidos` varchar(60) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `telefono` varchar(8) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `id_puesto` smallint DEFAULT NULL,
  PRIMARY KEY (`id_empleado`),
  KEY `id_puesto_puesto_empreados_idx` (`id_puesto`),
  CONSTRAINT `id_puesto_puesto_empreados` FOREIGN KEY (`id_puesto`) REFERENCES `puestos` (`id_puesto`) ON UPDATE CASCADE
);

CREATE TABLE `puestos` (
  `id_puesto` smallint NOT NULL AUTO_INCREMENT,
  `puesto` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id_puesto`)
);
```
---
## Funcionalidades

###### - Para agregar un empleado, ingresa los datos en los campos proporcionados y presiona el botón "Agregar".
###### - Para editar un cliente, selecciona un cliente de la tabla y modifica los campos. Luego, presiona el botón "Actualizar".
###### - Para eliminar un cliente, selecciona un cliente de la tabla y presiona el botón "Eliminar".
###### -Para limpiar el registro, presiona el botón "Limpiar"
---
## Características

###### - Agregar, editar y eliminar informacion de empleados.
###### - Visualizar una lista de empleados en una tabla.
---
## Contribución

###### Contribuciones no son necesarias para esta tarea, ya que es un proyecto individual para la universidad.
---
