package cn.yunlingfly.hikaricp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.yunlingfly.hikaricp.mapper")
public class HikaricpApplication {

    public static void main(String[] args) {
        SpringApplication.run(HikaricpApplication.class, args);
    }
}
