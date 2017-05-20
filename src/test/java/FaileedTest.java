import org.testng.annotations.Test;

/**
 * Created by April_Chou on 2017/5/20.
 */
public class FaileedTest {

    @Test
    public void depend(){

    }

    @Test(dependsOnMethods = "depend")
    public void f (){
        throw new RuntimeException();
    }

    @Test
    public void failed(){
        throw new RuntimeException();
    }
}
