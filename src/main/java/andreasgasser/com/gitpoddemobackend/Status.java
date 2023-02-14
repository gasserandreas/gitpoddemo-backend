package andreasgasser.com.gitpoddemobackend;

import java.lang.management.ManagementFactory;

public class Status {

    public long jvmStartTime = ManagementFactory.getRuntimeMXBean().getStartTime();
    public long jvmUpTime = ManagementFactory.getRuntimeMXBean().getUptime();
}
