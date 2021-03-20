package Task_1;

public class OddElements{
    public String getOddElementsInArray(String[] names){
        String result = "";
        if (names.length > 0){
            for (int i = 0; i < names.length; i++) {
                if (i%2!=0){
                    result += String.format("%s. %s, ", i, names[i]);
                }
            }
        }
        else{
            return "The obtained array is empty";
        }
        return result.substring(0, result.length()-2);
    }
}
