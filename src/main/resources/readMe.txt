spring.application.name=minkia_pitittu
spring.datasource.url=jdbc:mysql://localhost:3306/yourDB
spring.datasource.username=YourUser
spring.datasource.password=YourPass
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=firstCreate/update

spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.type=trace
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
#logging.level.org.hibernate=DEBUG
#logging.level.org.springframework=DEBUG
# JWT Configuration
jwt.secret=pGLK1ozZhZBtcfs2PpP5m8Wcc2u6uhTWUIHGoJZDFgY7VjXcrd5qeidYDdu7RDs7
jwt.expiration=3600000000000
#jwt.token.prefix=Bearer 
#jwt.header.string=Authorization
#jwt.authorities.key=roles

server.port=8080