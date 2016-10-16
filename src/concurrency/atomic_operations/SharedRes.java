package concurrency.atomic_operations;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedRes {
    static AtomicInteger atomicInt = new AtomicInteger(0);
}
