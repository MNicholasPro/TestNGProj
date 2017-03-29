import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/3/29.
 */
public class testMy {
    @Test(dataProvider = "ranger-provider")
    public void testISBetween(int n, int lower, int upper, boolean expected) {
        isBetweenq isBetweenq = new isBetweenq();
        System.out.println("Received" + n + " " + lower + "_" + upper + " expected: " + expected);
        Assert.assertEquals(expected, isBetweenq.isBetween(n, lower, upper));
    }

/*    private boolean isBetween(int n, int lower, int upper) {
        if (lower <= n && n<= upper){
            return true;
        }else {
            return false;
        }
    }*/

    @DataProvider(name = "ranger-provider")
    public Object[][] rangeData() {
        int lower = 5;
        int upper = 10;
        return new Object[][]{
                {lower - 1, lower, upper, false},
                {lower,     lower, upper, true},
                {lower + 1, lower, upper, true},
                {upper,     lower, upper, true},
                {upper + 1, lower, upper, false},
        };
    }
}