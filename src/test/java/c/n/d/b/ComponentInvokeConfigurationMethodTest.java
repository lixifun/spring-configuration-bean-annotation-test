package c.n.d.b;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class ComponentInvokeConfigurationMethodTest {


    @Resource(name = "config-default-s1")
    private Student defaultS1;

    @Resource(name = "component-invoke-config-default-s1")
    private Student anS1;

    @Resource(name = "component-invoke-config-default-s3")
    private Student anS3;

    @Test
    void componentInvokeConfigDefault() {

        log.info("config-default-s1: [{}]", defaultS1);
        log.info("component-invoke-config-default-s1: [{}]", anS1);
        log.info("component-invoke-config-default-s3: [{}]", anS3);

        log.info("config-default-s1 == component-invoke-config-default-s1 ? [{}]", defaultS1 == anS1); // false
        log.info("config-default-s1 == component-invoke-config-default-s3 ? [{}]", defaultS1 == anS3); // true
        log.info("component-invoke-config-default-s1 == component-invoke-config-default-s3 ? [{}]", anS1 == anS3); // true;
    }


}
