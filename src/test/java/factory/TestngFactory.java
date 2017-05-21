package factory;

/**
 * Created by April_Chou on 2017/5/21.
 */

import org.testng.annotations.Factory;

/**
 *
 * <p>
 * Title: TestngFactory
 * </p>
 *
 * <p>
 * Description: 配置文件:testng-factory.xml
 *
 * TestngFactory工厂类,在带有@Factory注解的方法中调用被执行的测试类,TestNg会自动调用被执行类中带有@Test注解的方法，
 * 被执行的测试类为：TestngFactoryTest,
 * </p>
 *
 * <p>
 * Company:
 * </p>
 *
 * @author : april_chou
 *
 * @date : 2017年05月21日
 */
public class TestngFactory {
    @Factory
    public Object[] createInstances() {
        Object[] result = new Object[10];
        for (int i = 0; i < 10; i++) {
            result[i] = new TestngFactoryTest(i * 10);
        }
        return result;
    }
}