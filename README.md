# Luna Client

A client for the [Luna server](https://github.com/luna-rs/luna).

## Compiling

1. `docker build -t rsclient .`
2. `docker run -v $(pwd):/out -it rsclient`
3. You should now have a client.jar file

## Running

1. Set the public key in the `rsa` directory
2. Set the server address somewhere????
3. `java -jar client.jar`
