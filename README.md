# Spring-data & Hibernate

### Generate project

Use https://start.spring.io/ to generate an empty Spring project

Complete the following project metadata:

* Group: com.cegeka.academy<br />
* Artifact: spring

Add the following dependencies:
* JPA (for Hibernate and Spring data support)
* H2 (for H2 database) 
* Web (for Spring MVC and Tomcat embedded server)

Add the following property:<br />
*spring.h2.console.enabled=true*

After starting the Spring Boot application, the H2 DB will run in memory. It is accessible here:
*http://localhost:8080/h2-console/* <br />
The JDBC URL should be: *jdbc:h2:mem:testdb*<br />

