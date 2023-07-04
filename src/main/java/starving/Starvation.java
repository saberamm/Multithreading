package starving;

class Starvation extends Thread {

    // treads with higher priority should access the run methode sooner
    public synchronized void run() {
        System.out.println(Thread.currentThread() +
                " Thread execution starts");
        System.out.println(Thread.currentThread() + "execution completes");
    }
}