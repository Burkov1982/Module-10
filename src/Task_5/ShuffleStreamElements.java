package Task_5;

import java.util.Iterator;
import java.util.stream.Stream;

public class ShuffleStreamElements {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> frstIterator = first.iterator();
        Iterator<T> scndIterator = second.iterator();
        Stream<T> toReturn = Stream.ofNullable(null);
        while (frstIterator.hasNext() && scndIterator.hasNext()) {
            Stream<T> tempStream = Stream.of(frstIterator.next(), scndIterator.next());
            toReturn = Stream.concat(toReturn, tempStream);
        }
        return toReturn;
    }
}
