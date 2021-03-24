package Task_3;

import java.util.*;
import java.util.stream.Collectors;

public class GetDigits {
    public String getDigitsFromObtainedArray(String[] strings) {
        return Arrays.stream(strings)
                .flatMap(x -> Arrays.stream(x.split(", ")))
                .sorted(Comparator.comparingInt(Integer::parseInt))
                .collect(Collectors.joining(", "));
    }
}
