FROM eclipse-temurin:11-jdk AS build
RUN mkdir -p /workspace
COPY build.gradle /workspace
COPY gradlew /workspace
COPY settings.gradle /workspace
COPY gradle /workspace/gradle
COPY src /workspace/src
WORKDIR /workspace
RUN chmod a+x gradlew
RUN ./gradlew build

FROM eclipse-temurin:11-jre
COPY --from=build /workspace/build/libs/ci-helloworld-1.0-SNAPSHOT.jar app.jar
EXPOSE 6379
ENTRYPOINT ["java", "-jar", "app.jar"]
