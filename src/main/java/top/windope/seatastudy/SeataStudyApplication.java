package top.windope.seatastudy;

import io.seata.spring.boot.autoconfigure.SeataTCCFenceAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableScheduling
@EntityScan(basePackages = "top.windope.seatastudy.entity")
@EnableJpaRepositories(basePackages = "top.windope.seatastudy")
@EnableTransactionManagement(proxyTargetClass = true)
public class SeataStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataStudyApplication.class, args);
    }

}
