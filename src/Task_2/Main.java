package Task_2;

import java.util.Arrays;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        String[] names = new String[]{"Ivan", "Peter", "Daniil", "Anastasia", "Alexander"};
        MyComparator comparator = new MyComparator();
        Arrays.sort(names,comparator);
        System.out.println(Arrays.toString(names));
    }
}
class MyComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}