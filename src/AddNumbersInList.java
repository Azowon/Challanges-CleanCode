import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddNumbersInList {

    /**
     * Coding Interview challenge:
     * There are 2 numbers which are presented as Lists
     * Write a method which returns the result of these 2 numbers added, also displayed as list.
     *
     * Example:
     * List.of(1,5,5,2) + List.of(2,2,3)
     * returns: List.of(1,7,7,5)
     *
     */

    public List<Integer> addNumbersInList(List<Integer> numberAsList1, List<Integer> numberAsList2) {

        int maxLength = Math.max(numberAsList1.size(), numberAsList2.size());
        List<Integer> resultList = new ArrayList<>(maxLength);
        int transfer = 0;

        for(int i = 1; i <= maxLength; i++) {

            int number1 = 0;
            int number2 = 0;

            if(numberAsList1.size()-i >= 0)
                number1 = numberAsList1.get(numberAsList1.size()-i);

            if(numberAsList2.size()-i >= 0)
                number2 = numberAsList2.get(numberAsList2.size()-i);

            int result = number1 + number2;
            resultList.add(0, (result%10) + transfer);
            transfer = result / 10;

        }
        if(transfer > 0)
            resultList.add(0, transfer);

        return resultList;
    }
}
