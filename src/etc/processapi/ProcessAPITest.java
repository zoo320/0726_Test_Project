package etc.processapi;

import java.util.Optional;

public class ProcessAPITest {
	public static void main(String[] args) {
		ProcessHandle currentProcess = ProcessHandle.current();
		System.out.println("Current Process Id: = " + currentProcess.pid());
		Optional<String> user = currentProcess.info().user();
		user.ifPresent(System.out::println);
	}
}