package Task_3;

public class Main {
    public static void main(String[] args) {
        String[] strings = new String[]{"1, 2, 0", "4, 5"};
        GetDigits getDigits = new GetDigits();
        System.out.println(getDigits.getDigitsFromObtainedArray(strings));
    }
}
