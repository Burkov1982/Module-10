package Task_1;

public class Main {
    public static void main(String[] args) {
        OddElements oddElements = new OddElements();
        String[] names = new String[]{"Ivan", "Peter", "Daniil", "Anastasia", "Alexander"};
        System.out.println(oddElements.getOddElementsInArray(names));
    }
}
