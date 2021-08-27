import com.guillaume.grpc.User.APIResponse;
import com.guillaume.grpc.User.LoginRequest;
import com.guillaume.grpc.userGrpc;
import com.guillaume.grpc.userGrpc.userBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {

	public static void main(String[] args) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9090).usePlaintext().build();
		// stubs - generate from proto
		userBlockingStub userStub = userGrpc.newBlockingStub(channel);
		LoginRequest loginrequest = LoginRequest.newBuilder().setUsername("Test").setPassword("Error").build();
		APIResponse response = userStub.login(loginrequest);
		System.out.println(response.getResponseMessage());
	}
}
