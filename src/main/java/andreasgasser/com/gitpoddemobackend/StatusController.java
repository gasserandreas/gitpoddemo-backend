package andreasgasser.com.gitpoddemobackend;


import java.lang.management.ManagementFactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {
    private long jvmStartTime = ManagementFactory.getRuntimeMXBean().getStartTime();
    private long jvmUpTime = ManagementFactory.getRuntimeMXBean().getUptime();

    private Status status = new Status();

    @GetMapping("/status")
    Status getStatus() {
        return this.status;
    }
}
