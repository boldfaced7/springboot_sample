# (1) base-image
FROM openjdk:11

# ⭐ 'ARG' 예약어를 통해 인자로 전달 받아야 한다.
ARG test_1
ARG test_2

# ⭐ 'ENV' 예약어를 통해 전달받은 값을 실제 값과 매칭시켜야 한다.
ENV TEST_1=${test_1} \
    TEST_2=${test_2}

# (2) COPY에서 사용될 경로 변수
ARG JAR_FILE=build/libs/*.jar

# (3) jar 빌드 파일을 도커 컨테이너로 복사
COPY ${JAR_FILE} app.jar

# (4) jar 파일 실행
ENTRYPOINT ["java","-jar","/app.jar"]