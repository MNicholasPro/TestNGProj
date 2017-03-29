import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * V1.0.0
 * Created by zhoumingkai on 2017/3/29.
 */
public class testMy2 {
    @DataProvider
    public Object[][] provideNunbers(Method method){
        Object[][] result = null;

        if (method.getName().equals("two")){
            result = new Object[][]{
                    new Object[]{
                            2
                    }
            };
        }else if (method.getName().equals("three")){
            result = new Object[][]{
                    new Object[]{
                            3
                    }
            };
        }else if (method.getName().equals("four")){
            result = new Object[][]{
                    new Object[]{
                            4
                    }
            };
        }
        return result;
    }

    @Test(dataProvider = "provideNunbers")
    public void two(int param){
        System.out.println("Two received:" + param);
    }

    @Test(dataProvider = "provideNunbers")
    public void three(int param){
        System.out.println("Three received:" + param);
    }

    @Test(dataProvider = "provideNunbers")
    public void four(int param){
        System.out.println("Four received:" + param);
    }
}


