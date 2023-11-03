FROM maven as builder

WORKDIR /app
COPY pom.xml .
COPY src ./src

RUN mvn package -DskipTests
FROM openjdk:21-jdk


COPY --from=builder /app/target/coursesapp*.jar /coursesapp.jar

CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/coursesapp.jar"]