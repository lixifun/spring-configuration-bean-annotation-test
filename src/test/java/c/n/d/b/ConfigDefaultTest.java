package c.n.d.b;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest
class ConfigDefaultTest {

    @Resource(name = "configDefault")
    private ConfigDefault configDefault;


    @Resource(name = "config-default-s1")
    private Student s1;

    @Resource(name = "config-default-s2")
    private Student s2;

    /**
     * - @Configuration 和 @Bean 的合用
     * 在此类中的另一个方法中调用被 @Bean 注解的方法，返回的是同一个实例
     */
    @Test
    void configDefault() {
        log.info("config-default-s1 : [{}]", s1);
        log.info("config-default-s2 : [{}]", s2);

        log.info("config-default-s1 == config-default-s2 ? [{}]", s1 == s2); // true

        Student s11 = configDefault.s1();
        log.info("config-default-s11 : [{}]", s11);
        log.info("config-default-s1 == config-default-s11 ? [{}]", s1 == s11); // true


        Student s22 = configDefault.s2();
        log.info("config-default-s22 : [{}]", s22);
        log.info("config-default-s2 == config-default-s22 ? [{}]", s2 == s22); // true

        Student s3 = configDefault.s3();
        log.info("config-default-s3 : [{}]", s3);
        log.info("config-default-s1 == config-default-s3 ? [{}]", s1 == s3); // true
    }

}
