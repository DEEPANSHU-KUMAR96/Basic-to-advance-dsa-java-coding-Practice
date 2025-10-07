package com.ExecutorCode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingleThreadService {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            PrintNumbers task = new PrintNumbers();
            service.submit(task);
        } finally {
            service.shutdown();
            try {
                if (!service.awaitTermination(5, TimeUnit.SECONDS)) {
                    service.shutdownNow();
                }
            } catch (InterruptedException e) {
                service.shutdownNow();
                Thread.currentThread().interrupt();
            }
        }
    }
}
