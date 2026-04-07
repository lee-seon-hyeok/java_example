FROM eclipse-temurin:17-jre-alpine

#RUN mkdir app

WORKDIR /app

COPY ./out/artifacts/project_jar/project.jar /app


#EXPOSE 3000

CMD ["java", "-jar", "project.jar"]



# 1단계: 빌드용 컨테이너
#FROM openjdk:17-jdk-slim as build
# 작업 디렉토리 생성
#WORKDIR /app
#소스코드 복사
#COPY ./src/ch18/DBDemo.java ./src/ch18/DBDemo.java
	# 컴파일 (miniproject.App 기준)
#RUN javac -cp /app/lib/mysql-connector-j-8.0.33.jar src/ch18/DBDemo.java -d out
# 2단계: 실행용 컨테이너
#FROM openjdk:17-jdk-slim
#WORKDIR /app
# MySQL JDBC 드라이버 복사 (lib/mysql-connector-j-8.0.33.jar)
#COPY ./lib/mysql-connector-j-8.0.33.jar ./lib/
# build 단계에서 컴파일된 클래스 복사
#COPY --from=build /app/out ./out
# 실행 명령 (패키지명 포함)
#CMD ["java", "-cp", "out:lib/mysql-connector-j-8.0.33.jar", "DBDemo.jar"]




