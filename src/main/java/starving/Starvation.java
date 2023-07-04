package starving;

class Starvation extends Thread {

    public synchronized void run() {
        System.out.println(Thread.currentThread() +
                " Thread execution starts");
        System.out.println(Thread.currentThread() + "execution completes");
    }
}