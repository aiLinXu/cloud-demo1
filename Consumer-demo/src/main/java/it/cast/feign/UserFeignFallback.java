package it.cast.feign;

/**
 * @author xualin
 * @version v1.0
 * @date 2019/4/2 11:45
 * @description
 **/
public class UserFeignFallback implements UserFeign {
    public String queryById(Long id) {
        return "远程调用出现异常！";
    }
}
