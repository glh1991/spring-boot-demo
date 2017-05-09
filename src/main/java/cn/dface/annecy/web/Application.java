package cn.dface.annecy.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import cn.dface.annecy.service.UserService;

@SpringBootApplication
@RestController
@MapperScan(basePackages = "cn.dface.annecy.dal")
@ComponentScan({ "cn.dface.annecy.service.*" })
@EntityScan("cn.dface.annecy.entity")
@EnableWebMvc
public class Application {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Object index(String name) {
        return "hello world: " + name;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public Object users(String name) {
        return this.userService.findUsersByName(name);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
