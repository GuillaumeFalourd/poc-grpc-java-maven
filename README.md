# gRPC (Google Remote Procedure Call) Java with MAVEN

POC of a gRPC project in Java using Maven ☕️

## Project

This project contains 2 services: one for `LOGIN` and one for `LOGOUT`.

- The Login service will return **SUCCESS** if the `username` is the same as the `password` (_responseCode 200_). Otherwise, the Login service will return **INVALID PASSWORD** (_responseCode 400_).

- The Logout service will always return **LOGOUT SUCCESS** (_responseCode 200_).

### Setup

On the `GrpcServer` directory, run:

```bash
mvn clean generate-sources compile install
```

On the `GrpcClient` directory, run:

```bash
mvn clean generate-sources compile install
```

### Run

**To start the Server:**

- On the `GrpcServer/src/main/java` directory, run the `main` method from the `GrpcServer.java` class.

- _Note: It will run on port `9090`._

**To use the Client:**

- On another terminal, run the `main` method from the `GrpcClient.java` class located in the `GrpcClient/src/main/java` directory.

**Using a _gRPC Client Tool_:** 

- Example: [BloomRPC](https://github.com/uw-labs/bloomrpc) (_Note: You'll need to import the [user.proto file](https://github.com/GuillaumeFalourd/poc-grpc-java-maven/blob/main/GrpcServer/src/main/resources/user.proto))._

#### Login Success

![Login Success](https://user-images.githubusercontent.com/22433243/128184423-b9916696-4476-4b00-a438-b8fc89567cf1.png)

#### Login Error

![Login Error](https://user-images.githubusercontent.com/22433243/128184445-6e7910e5-5e31-457e-98af-bf00e2519caa.png)

#### Logout Success

![Logout Success](https://user-images.githubusercontent.com/22433243/128184472-de32897e-2cb7-41cc-b91b-144832d05819.png)
```
