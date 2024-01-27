## Hello World JSP

#### Pasos para desplegar: 
**1.** Ejecutar mvn package para crear el artefacto <br/>
**2. Comando para contenedor en docker:** <br/>
    docker run -d -v \<yourpath\>/hello-world-jsp/dist:/usr/local/tomcat/webapps -p 9999:8080 tomcat:9.0.83-jdk21-corretto-al2
