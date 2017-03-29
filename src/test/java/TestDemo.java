import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/3/27.
 */
public class TestDemo {
    @Test
    public void testcase1() {
        Assert.assertTrue(true);
        System.out.println("testcase1");
    }

    @Test
    public void testcase2() {
        Assert.assertTrue(true);
        System.out.println("testcase2");
    }
}

