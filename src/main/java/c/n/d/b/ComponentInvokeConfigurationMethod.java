package c.n.d.b;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ComponentInvokeConfigurationMethod {

    @Resource
    private ConfigDefault configDefault;

    @Bean(name = "component-invoke-config-default-s1")
    public Student s1() {
        return configDefault.s1();
    }

    @Bean(name = "component-invoke-config-default-s3")
    public Student s3() {
        return configDefault.s3();
    }
}
