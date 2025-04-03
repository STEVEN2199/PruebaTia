# PruebaTia
# SIMULACIÓN DE MENSAJERÍA DE INTELIGENCIA MILITAR CON PYTHON, JAVA Y MYSQL

Desarrolle una solución de software que simule el procesamiento y la distribución de esta información de inteligencia. La solución debe constar de dos componentes principales: un script en Python y una aplicación Java.

## Descripción

La aplicación utiliza Spring Boot para exponer un endpoint que permite a los usuarios descargar un reporte Excel con información sobre tropas y enemigos. Los datos se obtienen de una base de datos MySQL y se procesan utilizando Apache POI para generar el archivo Excel.

## Tecnologías Utilizadas

* Spring Boot
* MySQL
* Apache POI
* Thymeleaf
* Python
* Maven

## Requisitos

* Java 17 o superior
* Maven
* Python 3.12.3

## Configuración de la Base de Datos

1.  Asegúrate de tener una instancia de MySQL en ejecución.
2.  Crea una base de datos llamada `pruebatia`.
3.  Configura las credenciales de la base de datos en el archivo `application.properties` o `application.yaml` de Spring Boot.

## Ejecución de la Aplicación

### Opción 1: Ejecución con Maven

1.  Clona el repositorio del proyecto.
2.  Navega al directorio del proyecto en tu terminal.
3.  Ejecuta el siguiente comando para construir la aplicación:

    ```bash
    mvn clean install
    ```

4.  Ejecuta la aplicación Spring Boot:

    ```bash
    mvn spring-boot:run
    ```

5.  Abre tu navegador web y ve a `http://localhost:8080/reporte`.

### Opción 2: Ejecución desde IDE Intellij IDEA

1.  Clona el repositorio del proyecto.
2.  Navega al directorio del proyecto en tu terminal.
3.  Da click derecho sobre el directorio actual y presiona abrir el IDE especificado 
4.  Da click en la barra de navegación derecha donde se encuentra la opción de Maven
5.  Luego da click sobre la barra de navegación en la opción Execute Maven Goal
6.  Escribe y ejecuta el siguiente comando para construir la aplicación:

    ```bash
    mvn clean install
    ```

7.  Luego da click en Reload All Maven Projects
8.  Ejecuta la aplicación Spring Boot desde el main en PruebaTiaApplication:

### Opción 3: Ejecución con Script Python

1.  Asegúrate de tener Python instalado.
2.  Abre una termina donde se encuentra el archivo el Script.
3.  Ejecuta el comando
   
    ```bash
    python script.py
    ```
5.  Si surge un error instala la librería request desde la terminal.
   
    ```bash
    pip isntall request
    ```
7.  Finalmente si toda esta bien se poblara la base de datos:
8.  Abre tu navegador web y ve a `http://localhost:8080/reporte`.
9.  Haz clic en el botón "Descargar Reporte Excel" para generar y descargar el reporte.

## Configuración del Backend (Spring Boot)**
Configuración de la Base de Datos
El backend usa MySQL, asegúrate de que la configuración en application.properties es correcta:

spring.application.name=PruebaTia
spring.datasource.url=jdbc:mysql://localhost:3306/pruebatia?serverTimezone=UTC
spring.datasource.username=<TU_USUSARIO>
spring.datasource.password=<TU_PASSWORD>
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.properties.hibernate.format_sql=true
spring.devtools.restart.enabled=true
spring.thymeleaf.prefix=classpath:/templates/
spring.thymeleaf.suffix=.html

## Estructura del Proyecto
PruebaTia/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/PruebaTia/
│   │   │       ├── Controller/
│   │   │       ├── Dtos/
│   │   │       ├── Model/
│   │   │       ├── Repository/
│   │   │       ├── Service/
│   │   │       └── PruebaTiaApplication.java
│   │   ├── resources/
│   │   │   ├── templates/
│   │   │   │   └── reporte.html
│   │   │   ├── application.properties
├── pom.xml
└── README.md
