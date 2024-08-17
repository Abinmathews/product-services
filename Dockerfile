FROM eclipse-temurin:17-jdk-focal
LABEL maintainer = "AbinMathew abinmathewrajan@gmail.com"
COPY target/product-service-1.0.jar productservice.jar
ENTRYPOINT ["java","-jar", "/productservice.jar"]