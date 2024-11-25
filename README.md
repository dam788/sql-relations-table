# Ejercicio de relación de Tablas en mySQL
Éste es un ejercicio con fines didactivos para practicar relaciones de tablas:
**UNO-A-UNO**, **UNO-A-MUCHOS**, **MUCHOS-A-UNO** y **MUCHOS-A-MUCHOS**.

Para llegar a tal fin, se realizó un ejercicio de Equipo de futbol y su relación con técnico, jugadores, asociación y competencias.

![Captura de pantalla 24 11 2024 a 21 34 58 p  m](https://github.com/user-attachments/assets/74d45de1-dd0e-4f7a-a0dc-b367f73328f8)

## Instalación

 - Crear una base de datos en **MySQL** con los comandos: `CREATE TABLE nombre_db`
 - Crear el archivo **application.properties** dentro de **resources** con la siguiente configuración:
	
	    spring.application.name=fcdemo
	    server.port=8082
	    spring.datasource.url=jdbc:mysql://localhost:3306/[nombre_db]
	    spring.datasource.username=[nombre_usuario]
	    spring.datasource.password=[contraseña_usuario]
	    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
        
	    spring.jpa.hibernate.ddl-auto=create-drop
	    spring.jpa.show-sql=true
	    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
	    
- Levantar la app de springboot. Spring JPA automáticamente generará las tablas por la configuración **spring.jpa.hibernate.ddl-auto=create-drop**.
- Ya puede revisar las tablas de la base de dato y sus relaciones.
