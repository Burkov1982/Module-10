package Task_1;

import java.util.List;
import java.util.stream.Collectors;

public class OddElements{
    public String getNamesWithOddIndex(List<String> names) {
        return names.stream()
                .map(name -> (names.indexOf(name)) + ". " + name)
                .filter(name -> Integer.parseInt(name.substring(0, 1)) % 2 == 1)
                .collect(Collectors.joining(", "));
    }
}
