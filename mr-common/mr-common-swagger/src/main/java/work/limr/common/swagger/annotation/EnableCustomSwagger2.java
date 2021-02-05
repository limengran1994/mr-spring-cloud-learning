package work.limr.common.swagger.annotation;

import org.springframework.context.annotation.Import;
import work.limr.common.swagger.config.SwaggerAutoConfiguration;

import java.lang.annotation.*;

/**
 * @author: limengran
 * @Time: 2021/2/4  22:39
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({SwaggerAutoConfiguration.class})
public @interface EnableCustomSwagger2 {

}
