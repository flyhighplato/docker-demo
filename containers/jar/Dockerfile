FROM lwieske/java-8:jdk-8u74

COPY scripts/run.sh /run.sh
RUN chmod +x /run.sh

COPY jars/*.jar /app.jar
RUN chmod +r /app.jar

CMD /run.sh