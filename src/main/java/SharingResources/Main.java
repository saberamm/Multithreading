package SharingResources;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int maxNumber = getNumber();
        SharedResource sharedResource = new SharedResource();

        EvenThread evenThread = new EvenThread(sharedResource, maxNumber);
        OddThread oddThread = new OddThread(sharedResource, maxNumber);

        evenThread.start();
        oddThread.start();

        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Integer> numbers = sharedResource.getNumbers();
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }

    //this methode will get a positive round number from client
    public static int getNumber() {
        Scanner input = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print("Enter a round number :");
            try {
                number = input.nextInt();
                input.nextLine();

                if (number < 0) {
                    System.out.println("Just enter a positive number Please.");
                    continue;
                }
                return number;
            } catch (InputMismatchException e) {
                input.nextLine();
                System.out.println("Just enter a round number Please.");
            }
        }
    }
}