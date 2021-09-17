FROM openjdk:11
ADD target/CountryApp14-0.0.1-SNAPSHOT.jar CountryApp14-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "CountryApp14-0.0.1-SNAPSHOT.jar"]
