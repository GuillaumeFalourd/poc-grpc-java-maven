package user;

import com.guillaume.grpc.User.APIResponse;
import com.guillaume.grpc.User.Empty;
import com.guillaume.grpc.User.LoginRequest;
import com.guillaume.grpc.userGrpc.userImplBase;

import io.grpc.stub.StreamObserver;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class UserService extends userImplBase{

	@Override
	public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now) + ": New request received inside Login Server");
		String username = request.getUsername();
		String password = request.getPassword();
		APIResponse.Builder response = APIResponse.newBuilder();
		if(username.equals(password)) {
			 // return success message
			response.setResponseCode(200).setResponseMessage("SUCCESS");
		}
		else {
			 // return error message
			response.setResponseCode(400).setResponseMessage("INVALID PASSWORD");
		}
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void logout(Empty request, StreamObserver<APIResponse> responseObserver) {
		APIResponse.Builder response = APIResponse.newBuilder();
		// return success message
		response.setResponseCode(200).setResponseMessage("LOGOUT SUCCESS");
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}
}
