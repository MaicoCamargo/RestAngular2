/*classe de conf do spring */

package br.csi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class SpringBoot extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot.class, args);
    }


    @RequestMapping("/home")
    public String hello() {
        return "Hello buddy!";
    }
}