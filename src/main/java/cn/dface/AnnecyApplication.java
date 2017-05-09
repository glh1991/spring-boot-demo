package cn.dface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AnnecyApplication {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Object index(String name) {
        return "hello world: " + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(AnnecyApplication.class, args);
    }
}
