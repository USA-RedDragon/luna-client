FROM openjdk:8-jdk as build

RUN apt-get update && apt-get install -y --no-install-recommends xvfb openjfx && rm -rf /var/lib/apt/lists/*

WORKDIR /src

COPY . ./

RUN mkdir build
RUN javac -d build/ $(find . -name "*.java")
RUN jar cvfe client.jar com.jagex.Client -C build/ .

FROM busybox

COPY --from=build /src/client.jar /client.jar
ENTRYPOINT [ "ash", "-c", "mkdir -p out && cp /client.jar /out/" ]