package Task_3;

public class Main {
    public static void main(String[] args) {
        String[] strings = new String[]{"1", "2\"", "3", "54\"", "6\"4"};
        GetDigits getDigits = new GetDigits();
        System.out.println(getDigits.getDigitsFromArray(strings));
    }
}
