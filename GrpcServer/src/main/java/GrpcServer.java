import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import user.UserService;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class GrpcServer {
	public static void main(String args[]) throws IOException, InterruptedException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now) + ": Starting GRPC Server");
		Server server = ServerBuilder.forPort(9090).addService(new UserService()).build();
		server.start();
		System.out.println("GRPC Server started at "+ server.getPort());
		server.awaitTermination();
	}
}
