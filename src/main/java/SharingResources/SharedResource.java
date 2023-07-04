package SharingResources;

import java.util.ArrayList;
import java.util.List;

class SharedResource {
    private final List<Integer> numbers = new ArrayList<>();

    public synchronized void addNumber(int number) {
        numbers.add(number);
    }

    public synchronized List<Integer> getNumbers() {
        return numbers;
    }

    @Override
    public String toString() {
        return "SharedResource{" +
                "numbers=" + numbers +
                '}';
    }
}
