#Hotel Example project

The project is an example thatv demonstrate how to achieve server side call for JSON API.

This project developed using Java as a platform, and Spring framework, Spring MVC technologies for backend. and it uses JSP, HTML, bootstarp for Web pages.

Anyone needs to understand and review the code must have knowledge mentioned technologies, In addition to that the project is a Spring boot project, So no need to install any application server, or servlet container (ex:-Tomcat) because Tomcat wil be embeded, but Spring Boot CLI must be installed to run, or test the project.

You can download spring boot and follow the instructions for installation from <a href ="https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#getting-started-installing-the-cli">here</a>

After Installtion you will only need navigate to the project home folder (ex:-hotelExample; the folder that contaons the pom) and run the following command:
  mvnw.cmd spring-boot:run    (for windowes)
  mvnw spring-boot:run        (for *nix enviroments)
  
Also the project contains test case to run and seet the result, run the following:
   mvnw.cmd test    (for windowes)
   mvnw test        (for *nix enviroments)
