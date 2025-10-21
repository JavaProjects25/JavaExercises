package Interfaces;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public interface IMedicalTeam {
    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    void performCPR();

    void rest();

}
