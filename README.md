<p align="center"><a href="https://kotlinlang.org/" target="_blank"><img src="https://developer.android.com/static/codelabs/basic-android-kotlin-compose-first-program/img/3bbebda874e6003b.png?hl=es-419" width="400"></a></p>

# Título del proyecto: Actividad 4 Proyecto sencillo de Tareas en Kotlin

## Tabla de Contenido
1. [Descripción](#descripción)
2. [Tecnologías](#tecnologías)
3. [IDE](#ide)
4. [Instalación](#instalación)
5. [Autores](#autores)
6. [Institución Académica](#institución-académica)

___
### Descripción: 

Introducción
El software desarrollado es una sencilla aplicación móvil desarrollada a través del lenguaje de programación Kotlin, que es la app permite el registro, edición y eliminación de tareas o actividades, para agregar tareas (título, descripción y un select con las opciones de (pendiente, empezada y terminada), el usuario debe estar registrado en la base de datos en SQLite, para ello la aplicación tiene una sección de Login (correo y contraseña) y Sign in (cuando no tenga una cuenta registrada, para lo cual requiere usuario, correo, contraseña y validación de la contraseña), la app permite editar la información de los perfiles de los registrados, y por último una funcionalidad, para establecer el tema del sistema en modo oscuro o claro, la Arquitectura en la que está basada dentro de las Arquitecturas orientadas a la interacción, con la arquitectura MVVM, que es una variante, de la arquitectura MVC, que a diferencia de del MVC, reemplaza el Controlador por un componente llamado ViewModel (VM)



___
### Tecnologías:

- [Kotlin](https://www.youtube.com/watch?v=Y0tcdQ7Nfqk "Kotlin") : Es un lenguaje de programación multiplataforma, estáticamente tipado, de alto nivel y propósito general con inferencia de tipos. 
- [SQLite](https://sqlite.org/index.html "SQLite"): SQLite is a C-language library that implements a small, fast, self-contained, high-reliability, full-featured, SQL database engine. SQLite is the most used database engine in the world. SQLite is built into all mobile phones and most computers and comes bundled inside countless other applications that people use every day.

___
### IDE:

- El proyecto se desarrolla con Android Studio.
- [Android Studio](https://developer.android.com/studio "Android Studio"): Android Studio es el entorno de desarrollo integrado oficial para la plataforma Android. Fue anunciado el 16 de mayo de 2013 en la conferencia Google I/O, y reemplazó a Eclipse como el IDE oficial para el desarrollo de aplicaciones para Android.

___
### Instalación:

#### Requisitos previos
1. Es necesario tener instalado Android Studio
2. Tener instalado GIT

#### Pasos de instalación

##### 1. Clonar el repositorio del proyecto en Laravel
Para clonar el proyecto abre una terminal o consola de comandos y escribe la siguiente nomenclatura, esto es después de la instrucción git clone agrega tu dirección:

```sh
git clone https://github.com/JheynerLobo/Actividad4_Arquitectura
```

##### 2. Descomprimir el archivo y abrirlo en Android Studio

Al descomprimir y abrir el proyecto en Android Studio, deberá dejar descargar las dependencias del proyecto.
![imagen1](https://github.com/JheynerLobo/Actividad4_Arquitectura/assets/84026784/1444c820-5302-4b20-b415-f904ad5deed9)

##### 4. Seleccionar un emulador
Para que el proyecto en Laravel corra sin problemas es necesario generar una key de seguirdad, para ello en tu terminal corre el siguiente comando:

```sh
php artisan key:generate
```
Esta key nueva se agregará a tu archivo .env

##### 5. Crear base de datos (Omitir este paso, si ya has creado la BD)
Sí tu proyecto en Laravel funciona haciendo consultas a una base de datos entonces tienes que crear una nueva base de datos, la forma más rápida para crearla es desde la terminal:
```sh
mysql -u root -p

CREATE DATABASE nombreDeTuDBAqui CHARACTER SET utf8 COLLATE utf8_spanish_ci;
```
Para salir de la consola de MySQL solo escribe ‘exit’ y tecla Enter.

##### 6. Agregar información de variables globales
En el archivo .env se guardan todas la variables globales de distintos servicios que necesita tu proyecto para funcionar sin errores. Ah! y no te olvides agregar los datos de la base de datos que creaste en el punto anterior como es el nombre y contraseña.
También si tu proyecto va a estar mandando e-mails para informar distintas acciones que suceden en el sistema, necesitas configurar el cliente de correo que usaras para esto, como en este proyecto se uso Sengrid.

##### 7. Crear vínculo simbólico
Sí tu proyecto guarda algún tipo de archivo como imágenes, pdf’s etc., necesitas desde la consola de comandos crear un vínculo o enlace simbólico de la carpeta public a la carpeta storage para que tu sistema pueda tener acceso a los archivos, desde tu terminal teclea:
```sh
php artisan storage:link
```
##### 8. Composer dump-autoload
Sí en tu proyecto creaste nuevas clases como helpers tienes que correr este comando para que se agreguen al cargador automático de clases de otra manera cuando algún método mande a llamar estás clases te arrojará un error:
```sh
composer dump-autoload
```
##### 9. Correr migraciones y seeds

###### 9.1 Sí tu proyecto no usa los seeds para sembrar datos en la base de datos solo corre el comando:
```sh
php artisan migrate
```
###### 9.2 Sí tu proyecto cuenta con seeders y factories para poblar ciertas tablas en tu base de datos como usuarios para tu sistema escribe en la terminal:
```sh
php artisan migrate --seed
```
###### 9.3 El comando migrate:fresh eliminará todas las tablas de la base de datos y luego ejecutará el comando migrate:
```sh
php artisan migrate:fresh --seed
```
##### 10. Comando para optimizar el rendimiento

```sh
php artisan optimize
```

##### 11. Comando para ver las rutas del aplicativo
El comando route:list se puede utilizar para mostrar una lista de todas las rutas registradas para la aplicación. Este comando mostrará el dominio, método, URI, nombre, acción y middleware de las rutas que incluye en la tabla generada.

```sh
php artisan route:list
```
De acuerdo a lo anterior, son los pasos generales para clonar e instalar un proyecto de Laravel, para este proyecto SAGIS es recomenble seguir los siguientes pasos: 1, 2, 3, 4, 5, 6, 7, 8, 9.3, 10 y 11.
___

### Autores:

1. Jarlin Andres Fonseca Bermón 1151758 - jarlinandresfb@ufps.edu.co
2. Junior Yoel Castilla Osorio 1151755 - osoriojunioryoelc@ufps.edu.co
3. Manuel Felipe Mora Espitia 1151863 - manuelfelipeme@ufps.edu.co

___
### Institución Académica:
Proyecto desarrollado en las materias de Análisis y Diseño de Sistemas, Ingeniería de Software y Seminario Integrador III [Programa de Ingeniería de Sistemas](https://ingsistemas.cloud.ufps.edu.co/ "Programa de Ingeniería de Sistemas") de la [Universidad Francisco de Paula Santander](https://ww2.ufps.edu.co/ "Universidad Francisco de Paula Santander")
