package c.n.d.b;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest
class ConfigProxyBeanMethodsFalseTest {

    @Resource(name = "configProxyBeanMethodsFalse")
    private ConfigProxyBeanMethodsFalse proxyBeanMethodFalseConfig;


    @Resource(name = "config-false-s1")
    private Student s1;

    @Resource(name = "config-false-s2")
    private Student s2;

    @Test
    void configProxyBeanMethodsFalse() {
        log.info("config-false-s1 : [{}]", s1);
        log.info("config-false-s2 : [{}]", s2);

        log.info("config-false-s1 == config-false-s2 ? [{}]", s1 == s2); // false

        Student s22 = proxyBeanMethodFalseConfig.s2();
        log.info("config-false-s22 : [{}]", s22);
        log.info("config-false-s2 == config-false-s22 ? [{}]", s2 == s22); // false

        Student s3 = proxyBeanMethodFalseConfig.s3();
        log.info("config-false-s3 : [{}]", s3);
        log.info("config-false-s1 == config-false-s3 ? [{}]", s1 == s3); // false
    }
}
