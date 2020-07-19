package cn.wr.testSpringCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author wangrong.lucky
 * @description 收费周期
 * @email wangrong.lucky@bytedance.com
 * @date 2020/7/19$
 **/

@SpringBootApplication
@ServletComponentScan
@EnableDiscoveryClient
@RefreshScope
public class TestApplicaion {
    public static void main(String[] args) {

        SpringApplication.run(TestApplicaion.class, args);
    }


}
