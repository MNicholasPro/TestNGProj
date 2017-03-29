import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/3/29.
 */
public class testMy3 {
    @DataProvider
    public Object[][] randomIntegers(ITestContext context){
        String[] groups = context.getIncludedGroups();
        int size = 2;
        for (String group : groups){
            if (group.equals("functional-test")){
                size = 10;
                break;
            }
        }
        Object[][] result = new Object[size][];
        Random r = new Random();
        for (int i = 0; i < size; i++){
            result[i] = new Object[]{
                    new Integer(r.nextInt())
            };
        }
        return result;
    }

    @Test(dataProvider = "randomIntegers", groups = {"util-test","functional-test"})
    public void random(Integer n){

    }
}
