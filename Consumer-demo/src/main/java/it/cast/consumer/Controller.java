package it.cast.consumer;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/

@RestController
public class Controller {



    @GetMapping("user/{id}")
    public String queryById(@PathVariable Long id){
        return "这是个错误的应用！";
    }
}
