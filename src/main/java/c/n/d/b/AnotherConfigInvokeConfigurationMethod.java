package c.n.d.b;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class AnotherConfigInvokeConfigurationMethod {

    @Resource
    private ConfigDefault defaultConfig;

    @Resource
    private ConfigProxyBeanMethodsFalse falseConfig;

    @Bean(name = "anconfig-invoke-config-default-s1")
    public Student s1() {
        return defaultConfig.s1();
    }

    @Bean(name = "anconfig-invoke-config-default-s3")
    public Student s3() {
        return defaultConfig.s3();
    }

    // 测试 proxyBeanMethods = false 的意义不大
    @Bean(name = "anconfig-invoke-config-false-s1")
    public Student falseS1() {
        return falseConfig.s1();
    }

    @Bean(name = "anconfig-invoke-config-false-s3")
    public Student falseS3() {
        return falseConfig.s3();
    }
}
