package c.n.d.b;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest
class ComponentAndBeanTest {

    @Resource(name = "componentAndBean")
    private ComponentAndBean component;

    @Resource(name = "component-s1")
    private Student s1;

    @Resource(name = "component-s2")
    private Student s2;

    @Test
    void component() {
        log.info("component-s1 : [{}]", s1);
        log.info("component-s2 : [{}]", s2);

        log.info("component-s1 == component-s2 ? [{}]", s1 == s2);

        Student s22 = component.s2();
        log.info("component-s22 : [{}]", s22);
        log.info("component-s2 == component-s22 ? [{}]", s2 == s22);

        Student s3 = component.s3();
        log.info("component-s3 : [{}]", s3);
        log.info("component-s1 == component-s3 ? [{}]", s1 == s3);
    }
}
