package custom;

import org.apache.dubbo.common.extension.Adaptive;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

/**
 * @author shenhuaxin
 * @date 2020/12/4
 */
public class CustomTest {


    @Test()
    public void testIsAnnotationPresent() throws NoSuchMethodException {
        Class<AdaptiveClass> adaptiveClassClass = AdaptiveClass.class;
        /**
         * 测试类上是否存在Adaptive注解
         */
        boolean annotationPresent = adaptiveClassClass.isAnnotationPresent(Adaptive.class);
        System.out.println(annotationPresent);
        /**
         * 测试方法上是否存在Adaptive注解
         */
        Method adaptive = adaptiveClassClass.getMethod("adaptive");
        System.out.println(adaptive.isAnnotationPresent(Adaptive.class));
    }
}
