# Instalación

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
	    
- Levantar la app de springboot.
