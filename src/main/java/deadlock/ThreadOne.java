package deadlock;

public class ThreadOne extends Thread {
    final String resource1;
    final String resource2;

    public ThreadOne(String resource1, String resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    public void run() {
        synchronized (resource1) {
            System.out.println(resource1 + "--->Thread 1: locked resource 1");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            synchronized (resource2) {
                System.out.println(resource2 + "--->Thread 1: locked resource 2");
            }
        }
    }
}
