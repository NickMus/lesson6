import org.junit.Assert;
import org.junit.Test;

public class ArrTest {


    @Test
    public void Test1() {
        //int [] arr = {1, 2, 3, 6, 8, 4, 5, 6, 9, 5, 4, 1, 2, 5};

        int[] arr = {1, 2, 3, 6, 8, 4, 5, 6, 9, 5, 4, 1, 2, 5};
        int[] arr1 = {1, 2, 5};

        int[] result = Main.returnArray(arr);
        Assert.assertArrayEquals(arr1, result);
    }

    @Test
    public void Test2() {

        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9};
        int[] arr1 = {1, 2, 3, 5, 6, 7, 8, 9};

        Assert.assertFalse(false);
    }

    @Test
    public void Test3() {

        int[] arr = {};
        int[] arr1 = {1, 2, 3, 4, 5, 6};

        Assert.assertFalse(false);
    }

    @Test
    public void Test4() {
        int[] arr = {1, 1, 1, 4, 4, 1, 4, 4};
        Assert.assertTrue(Main.returnArray3(arr));
    }

    @Test
    public void Test5() {
        int[] arr = {1, 1, 1, 1, 1, 1};
        Assert.assertFalse(Main.returnArray3(arr));
    }

    @Test
    public void Test6() {
        int[] arr = {4, 4, 4, 4, 4};
        Assert.assertFalse(Main.returnArray3(arr));
    }

    @Test
    public void Test7() {
        int[] arr = {1, 4, 4, 1, 1, 4, 3};
        Assert.assertFalse(Main.returnArray3(arr));
    }
}


