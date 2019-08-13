package com.wd.backto90s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Backto90sApplication {
    private static Logger logger = LogManager.getLogger(Backto90sApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(Backto90sApplication.class, args);
        logger.info("系统启动成功");
    }

    @GetMapping("/hello")
    public String Test(){
        return "hello world!";
    }

}
