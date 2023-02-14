package andreasgasser.com.gitpoddemobackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.management.ManagementFactory;

@SpringBootApplication
public class GitpoddemoBackendApplication {

	static long jvmStartTime = ManagementFactory.getRuntimeMXBean().getStartTime();
	static long jvmUpTime = ManagementFactory.getRuntimeMXBean().getUptime();

	public static void main(String[] args) {
		System.out.println("Start time: " + jvmStartTime);
		System.out.println("Up time: " + jvmUpTime);
		SpringApplication.run(GitpoddemoBackendApplication.class, args);
	}

}
