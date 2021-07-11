package c.n.d.b;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@Configuration
public class ConfigDefault {

    private AtomicInteger count = new AtomicInteger();

    @Bean(name = "config-default-s1")
    public Student s1() {
        log.info("config-default-s1 第 [{}] 被调用", count.getAndIncrement());
        return new Student();
    }

    @Bean(name = "config-default-s2")
    public Student s2() {
        return s1();
    }

    public Student s3() {
        return s1();
    }
}
