package Task_5;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> firstList = new ArrayList<>();
        firstList.add("Petro");
        firstList.add("Vasya");
        firstList.add("Daniil");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Anna");
        secondList.add("Maria");

        Stream<String> frstStream = firstList.stream();
        Stream<String> scndStream = secondList.stream();

        ShuffleStreamElements shuffleStreamElements = new ShuffleStreamElements();
        ShuffleStreamElements.zip(frstStream, scndStream).forEach(System.out::println);
    }
}
