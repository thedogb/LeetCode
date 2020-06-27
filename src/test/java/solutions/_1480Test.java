package solutions;

import org.apache.logging.log4j.core.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;


public class _1480Test {

    private static _1480.Solution solution;
    private static int[] nums;

    @BeforeClass
    public static void setup() {
        solution = new _1480.Solution();
    }

    @Test
    public void test() {
        nums = new int[] {1, 2, 3, 4};
        int[] result = solution.runningSum(nums);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(result, new int[]{1, 3, 6, 10});
    }

    @Test
    public void test1() {
        nums = new int[] {3, 1, 2, 10, 1};
        int[] result = solution.runningSum(nums);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(result, new int[]{3, 4, 6, 16, 17});
    }

    @Test
    public void test2() {
        nums = new int[] {1, 1, 1, 1, 1};
        int[] result = solution.runningSum(nums);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(result, new int[]{1, 2, 3, 4, 5});
    }


}
