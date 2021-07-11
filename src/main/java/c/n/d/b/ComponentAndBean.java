package c.n.d.b;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ComponentAndBean {

    @Bean(name = "component-s1")
    public Student s1() {
        return new Student();
    }

    @Bean(name= "component-s2")
    public Student s2() {
        return s1();
    }

    public Student s3() {
        return s1();
    }
}
