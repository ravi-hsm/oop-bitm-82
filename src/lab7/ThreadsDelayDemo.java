package lab7;

class DelayedTask implements Runnable {
    private String taskName;
    private long delayMs;

    DelayedTask(String taskName, long delayMs) {
        this.taskName = taskName;
        this.delayMs = delayMs;
    }

    @Override
    public void run() {
        try {
            System.out.println(taskName + " starting...");
            Thread.sleep(delayMs);
            System.out.println(taskName + " completed!");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class ThreadsDelayDemo{
    public static void main(String[] args) {
        Thread t1 = new Thread(new DelayedTask("Task 1", 3000));
        Thread t2 = new Thread(new DelayedTask("Task 2", 1000));
        t1.start();
        t2.start(); // Run concurrently
    }
}
