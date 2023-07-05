package starving;

public class Main {

    // creating main methode and creat 5 thread and set different priority
    // test the starvation in multi threading
    public static void main(String[] args) {

        Starvation thread0 = new Starvation();
        thread0.setPriority(10);
        Starvation thread1 = new Starvation();
        thread1.setPriority(7);
        Starvation thread2 = new Starvation();
        thread2.setPriority(5);
        Starvation thread3 = new Starvation();
        thread3.setPriority(3);
        Starvation thread4 = new Starvation();
        thread4.setPriority(1);

        thread4.start();
        thread3.start();
        thread1.start();
        thread2.start();
        thread0.start();


    }
}
