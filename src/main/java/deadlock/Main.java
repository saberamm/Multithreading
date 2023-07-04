package deadlock;

public class Main {

    //creating two resource and creating two thread and start them
    public static void main(String[] args) {

        final String resource1 = "hello from resource one";
        final String resource2 = "hello from resource two";

        Thread t1 = new ThreadOne(resource1, resource2);
        Thread t2 = new ThreadTwo(resource1, resource2);

        t1.start();
        t2.start();
    }
}

