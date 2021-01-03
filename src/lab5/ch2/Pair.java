package lab5.ch2;

public class Pair<T extends Shoe> {
    private T first;
    private T second;

    public Pair(T firstElement,T secondElement)  {
        first = firstElement;
        second = secondElement;
        match(firstElement, secondElement);
    }

    private void match(T firstElement, T secondElement) {
        if (firstElement.getSize() != secondElement.getSize()) {
            throw new ShoesDontMatch("sizes do not match");
        }
        if (!firstElement.getColor().equals(secondElement.getColor())) {
            throw new ShoesDontMatch("colors do not match");
        }
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
