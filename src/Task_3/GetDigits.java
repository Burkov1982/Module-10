package Task_3;

import java.util.ArrayList;

public class GetDigits {
    public String getDigitsFromArray(String[] array){
        String result = "";
        ArrayList<Integer> list = new ArrayList<>();
        if (array.length > 0){
            for (String temp:array) {
                if (temp != null) {
                    char[] chars = temp.toCharArray();
                    String tempDigit = "";
                    for (char element : chars) {
                        if (Character.isDigit(element)) {
                            tempDigit += String.valueOf(element);
                        }
                    }
                    list.add(Integer.valueOf(tempDigit));
                }
            }
        }
        else {
            return "The obtained array is empty";
        }
        if (!list.isEmpty()){
            MyComparator comparator = new MyComparator();
            list.sort(comparator);
            for (Integer digit:list) {
                result += String.format("%s, ", digit);
            }
            result = result.substring(0, result.length()-2);
        }
        else {
            return "The obtained array don't have any digits";
        }

        return result;
    }
}
