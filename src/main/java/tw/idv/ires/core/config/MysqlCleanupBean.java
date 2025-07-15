package tw.idv.ires.core.config;

import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;

@Component
public class MysqlCleanupBean {

    @PreDestroy
    public void cleanup() {
        AbandonedConnectionCleanupThread.checkedShutdown();
        System.out.println("MySQL cleanup thread shutdown completed.");
    }
}