package c.n.d.b;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest
class AnotherConfigInvokeConfigurationMethodTest {

    @Resource(name = "config-default-s1")
    private Student configDefaultS1;

    @Resource(name = "anconfig-invoke-config-default-s1")
    private Student anDefaultS1;

    @Resource(name = "anconfig-invoke-config-default-s3")
    private Student anDefaultS3;

    @Resource(name = "config-false-s1")
    private Student configFalseS1;

    @Resource(name = "anconfig-invoke-config-false-s1")
    private Student anFalseS1;

    @Resource(name = "anconfig-invoke-config-false-s3")
    private Student anFalseS3;


    @Test
    void another() {

        log.info("config-default-s1: [{}]", configDefaultS1);
        log.info("anconfig-default-s1: [{}]", anDefaultS1);
        log.info("anconfig-default-s3: [{}]", anDefaultS3);

        log.info("config-default-s1 == anconfig-default-s1 ? [{}]", configDefaultS1 == anDefaultS1); // false
        log.info("config-default-s1 == anconfig-default-s3 ? [{}]", configDefaultS1 == anDefaultS3); // true
        log.info("anconfig-default-s1 == anconfig-default-s3 ? [{}]", anDefaultS1 == anDefaultS3); // false

        // 测试 proxyBeanMethods = false 的意义不大，不被代理，意味着每次都是新的
        log.info("config-false-s1: [{}]", configFalseS1);
        log.info("anconfig-false-s1: [{}]", anFalseS1);
        log.info("anconfig-false-s3: [{}]", anFalseS3);

        log.info("config-false-s1 == anconfig-false-s1 ? [{}]", configFalseS1 == anFalseS1); // false
        log.info("config-false-s1 == anconfig-false-s3 ? [{}]", configFalseS1 == anFalseS3); // false
        log.info("anconfig-false-s1 == anconfig-false-s3 ? [{}]", anFalseS1 == anFalseS3); // false
    }


}
