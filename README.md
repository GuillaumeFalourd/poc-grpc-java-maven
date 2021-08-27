# gRPC (Google Remote Procedure Call) Java with MAVEN

POC of a gRPC project in Java using Maven ☕️

## Project

This project contains 2 services, one for LOGIN and one for LOGOUT.

The Login service will return **SUCCESS** if the `username` is the same as the `password` (_responseCode 200_). Otherwise, the Login service will return **INVALID PASSWORD** (_responseCode 400_).

The Logout service will always return **LOGOUT SUCCESS** (_respondeCode200).

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

On the `GrpcServer/src/main/java` directory, run the `main` method from the `GrpcServer.java` class.

**To start the Client:**

On another terminal, run the `main` method from the `GrpcClient.java` class located in the `GrpcClient/src/main/java` directory.

Or, use a _gRPC Client Tool_ such as [BloomRPC](https://github.com/uw-labs/bloomrpc):

