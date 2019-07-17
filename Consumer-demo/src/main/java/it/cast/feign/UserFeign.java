package it.cast.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/

@FeignClient(value = "Eureka-service",fallback =UserFeignFallback.class)
public interface UserFeign {

    @GetMapping("/user/{id}")
    public String queryById(@PathVariable("id") Long id);
}
