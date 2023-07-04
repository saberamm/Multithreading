package deadlock;

public class ThreadTwo extends Thread {
    final String resource1;
    final String resource2;

    public ThreadTwo(String resource1, String resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    public void run() {
        synchronized (resource2) {
            System.out.println(resource2 + "--->Thread 2: locked resource 2");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            synchronized (resource1) {
                System.out.println(resource1 + "--->Thread 2: locked resource 1");
            }
        }
    }
}
