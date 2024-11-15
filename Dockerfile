FROM gradle:jdk21

COPY ./ ./

RUN gradle build

RUN mv ./build/libs/portfolio-SG-0.0.1-SNAPSHOT.jar /app.jar


EXPOSE 8080
CMD ["java", "-jar", "/app.jar"]