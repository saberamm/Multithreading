package SharingResources;

class EvenThread extends Thread {
    private final SharedResource sharedResource;
    private final int maxNumber;

    public EvenThread(SharedResource sharedResource, int maxNumber) {
        this.sharedResource = sharedResource;
        this.maxNumber = maxNumber;
    }

    public void run() {
        for (int i = 0; i <= maxNumber; i += 2) {
            sharedResource.addNumber(i);
            synchronized (sharedResource) {
                sharedResource.notify();
                try {
                    sharedResource.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        synchronized (sharedResource) {
            sharedResource.notify();
        }
    }
}
