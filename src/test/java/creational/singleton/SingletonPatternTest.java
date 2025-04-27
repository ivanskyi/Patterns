package creational.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.concurrent.CountDownLatch;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingletonPatternTest {

    @Test
    @DisplayName("Should keep apiKey consistent in multithreaded access")
    void shouldKeepApiKeyConsistentInMultithreadedAccess() throws InterruptedException {
        ConfigSingleton sharedInstance = ConfigSingleton.getInstance();
        String fixedApiKey = String.valueOf(LocalDateTime.now().toLocalTime().getNano());
        sharedInstance.setApiKey(fixedApiKey);

        int numberOfThreads = 100;
        CountDownLatch latch = new CountDownLatch(numberOfThreads);

        Runnable task = () -> {
            ConfigSingleton instance = ConfigSingleton.getInstance();
            assertEquals(fixedApiKey, instance.getApiKey());
            latch.countDown();
        };

        for (int i = 0; i < numberOfThreads; i++) {
            new Thread(task).start();
        }

        latch.await();
    }
}
