import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AddNumbersInListTest {

    AddNumbersInList addNumbersInList;

    @Before
    public void setUp() {
        addNumbersInList = new AddNumbersInList();
    }

    @Test
    public void testEvenLengthNumbers() {
        List<Integer> list1 = Arrays.asList(1,5,5,2);
        List<Integer> list2 = Arrays.asList(2,2,3,4);

        List<Integer> result = addNumbersInList.addNumbersInList(list1, list2);

        Assert.assertEquals(Optional.of(result.get(0)), Optional.of(3));
        Assert.assertEquals(Optional.of(result.get(1)), Optional.of(7));
        Assert.assertEquals(Optional.of(result.get(2)), Optional.of(8));
        Assert.assertEquals(Optional.of(result.get(3)), Optional.of(6));
    }

    @Test
    public void testTransfer() {
        List<Integer> list1 = Arrays.asList(9,9,9);
        List<Integer> list2 = Arrays.asList(9,9,9);

        List<Integer> result = addNumbersInList.addNumbersInList(list1, list2);

        Assert.assertEquals(Optional.of(result.get(0)), Optional.of(1));
        Assert.assertEquals(Optional.of(result.get(1)), Optional.of(9));
        Assert.assertEquals(Optional.of(result.get(2)), Optional.of(9));
        Assert.assertEquals(Optional.of(result.get(3)), Optional.of(8));
    }

    @Test
    public void testNumber1Longer() {
        List<Integer> list1 = Arrays.asList(3,2,5,9);
        List<Integer> list2 = Arrays.asList(2,5,7);

        List<Integer> result = addNumbersInList.addNumbersInList(list1, list2);

        Assert.assertEquals(Optional.of(result.get(0)), Optional.of(3));
        Assert.assertEquals(Optional.of(result.get(1)), Optional.of(5));
        Assert.assertEquals(Optional.of(result.get(2)), Optional.of(1));
        Assert.assertEquals(Optional.of(result.get(3)), Optional.of(6));
    }

    @Test
    public void testNumber2Longer() {
        List<Integer> list1 = Arrays.asList(3,6,9);
        List<Integer> list2 = Arrays.asList(8,4,6,9);

        List<Integer> result = addNumbersInList.addNumbersInList(list1, list2);

        Assert.assertEquals(Optional.of(result.get(0)), Optional.of(8));
        Assert.assertEquals(Optional.of(result.get(1)), Optional.of(8));
        Assert.assertEquals(Optional.of(result.get(2)), Optional.of(3));
        Assert.assertEquals(Optional.of(result.get(3)), Optional.of(8));
    }

}
