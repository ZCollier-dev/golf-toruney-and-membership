FROM openjdk:23
WORKDIR /javaapp
COPY GolfApp.java .
RUN javac GolfApp.java
CMD ["java", "GolfApp"]