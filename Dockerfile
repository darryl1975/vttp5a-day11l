FROM openjdk:23-oracle

ARG APP_DIR=/APP

# directory where your source code will reside
# directory where you copy your project to (in the next step)
WORKDIR ${APP_DIR}

# copy the required files and/or directories into the image 
COPY pom.xml .
COPY mvnw .
COPY mvnw.cmd .
COPY src src
COPY .mvn .mvn

# package the application using the RUN directive
# this will download the dependencies definedin pom.xml
# compile and package to jar
# RUN chmod a+x ./mvnw
# RUN chmod a+x ./mvnw && ./mvnw clean package -Dmaven.test.skip=true
# RUN mvn package -Dmaven.test.skip=true

ENV SERVER_PORT 4000

EXPOSE ${SERVER_PORT}

# ENTRYPOINT SERVER_PORT=${SERVER_PORT} java -jar target/vttp5a-ssf-day13l-0.0.1-SNAPSHOT.jar

CMD ./mvnw spring-boot:run