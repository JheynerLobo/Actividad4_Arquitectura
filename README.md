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
1. Es necesario tener instalado Android Studio.
2. Tener instalado GIT.
3. Contar con un computador con mínimo 8 Gb de memoria Ram.

#### Pasos de instalación

##### 1. Clonar el repositorio del proyecto en Laravel
Para clonar el proyecto abre una terminal o consola de comandos y escribe la siguiente nomenclatura, esto es después de la instrucción git clone agrega tu dirección:

```sh
git clone https://github.com/JheynerLobo/Actividad4_Arquitectura
```

##### 2. Descomprimir el archivo y abrirlo en Android Studio

Al descomprimir y abrir el proyecto en Android Studio, deberá dejar descargar las dependencias del proyecto.

##### 3. Seleccionar un emulador
seleccionará en dode se encuentra el cuadrado rojo
![imagen1](https://github.com/JheynerLobo/Actividad4_Arquitectura/assets/84026784/1444c820-5302-4b20-b415-f904ad5deed9)
Luego en Create Device.
![imagen2](https://github.com/JheynerLobo/Actividad4_Arquitectura/assets/84026784/832be94f-3a04-4878-9469-5709dce571d4)
Luego será redireccionado a la siguiente pestaña donde seleccionará cualquier tenga en cuenta que entre más arriba el dispositivo más recurso consumirá y darle click en NEXT.
![image](https://github.com/JheynerLobo/Actividad4_Arquitectura/assets/84026784/4d579321-4bed-44bb-b47a-c0a582c777d9)
Luego deberá seleccionará la imagen del sistema, debrá darle a Next y por último a Finish, en este paso tendrá que descargar la imagen, la cual en su mayoría pesa más de 1 Gb y el tiempo de descarga dependerá de la conexión a Internet.
![image](https://github.com/JheynerLobo/Actividad4_Arquitectura/assets/84026784/a343fa2a-2b73-40d3-80de-6d364840f060)

##### 6. Correr el Emulador
Después de descargar el emulador y la imagen podrá correr el emulador dando click en el cuadrado marcado en la siguiente imagen.
![imagen3](https://github.com/JheynerLobo/Actividad4_Arquitectura/assets/84026784/fe6aa2f6-45fd-4942-aa20-fb21caccd689)


### Autores:

1. Luis Fernando López Pacheco 1151519 - luisfernandolp@ufps.edu.co
2. Angely Natalia García Barrera 1151775 - angelynataliagb@ufps.edu.co
3. Jheyner Alexander Lobo Duarte 1151785 - jheyneralexanderld@ufps.edu.co
4. Leider Yesid Martínez Mandón 1151786 - leideryesidmm@ufps.edu.co
5. Matilde Alexandra Arévalo León 1151788 - matildealexandraal@ufps.edu.co

___
### Institución Académica:
Proyecto desarrollado en las materias de Análisis y Diseño de Sistemas, Ingeniería de Software y Seminario Integrador III [Programa de Ingeniería de Sistemas](https://ingsistemas.cloud.ufps.edu.co/ "Programa de Ingeniería de Sistemas") de la [Universidad Francisco de Paula Santander](https://ww2.ufps.edu.co/ "Universidad Francisco de Paula Santander")
