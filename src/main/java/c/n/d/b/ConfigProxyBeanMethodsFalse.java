package c.n.d.b;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class ConfigProxyBeanMethodsFalse {

    @Bean(name = "config-false-s1")
    public Student s1() {
        return new Student();
    }

    @Bean(name = "config-false-s2")
    public Student s2() {
        return s1();
    }

    public Student s3() {
        return s1();
    }
}
