import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/3/28.
 */
public class Mytest {
    private int count = 0;

    @Test
    public void test1(){
        count++;
        Assert.assertEquals(1,count);
        System.out.println("Pass1");
    }

    @Test
    public void test2(){
        count++;
        Assert.assertEquals(2,count);
        System.out.println("Pass2");
    }
}
