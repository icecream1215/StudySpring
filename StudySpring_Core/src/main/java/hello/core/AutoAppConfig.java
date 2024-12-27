package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core",
        excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes = Configuration.class)
        //AppConfig 예제에 있는 @Bean들 등록하지 않기 위해 선언한것임. 실무에서는 안쓰는데, 예제코드 두려고 이렇게 선언한거임
)
public class AutoAppConfig {
}
