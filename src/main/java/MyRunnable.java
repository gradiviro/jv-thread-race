import org.apache.log4j.Logger;

public class MyRunnable implements Runnable {
    private static final Logger logger = Logger.getLogger(MyRunnable.class);
    private Counter counter;

    public MyRunnable(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        while (counter.getValue() < 100) {
            counter.increment();
            logger.info("Thread " + Thread.currentThread().getName()
                    + " current value " + counter.getValue());
        }
    }
}
