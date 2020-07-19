package cn.wr.testSpringCloud.Controller;

import cn.wr.testSpringCloud.Result.RestfulResult;
import cn.wr.testSpringCloud.Result.ServiceInfo;
import cn.wr.testSpringCloud.Util.CommUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wangrong.lucky
 * @description 收费周期
 * @email wangrong.lucky@bytedance.com
 * @date 2020/7/19$
 **/
@Controller // 重要，如果用Controller会404
@RequestMapping(value = "service1")
public class ServiceTestController {
    static{
        System.out.println("wangrong Creates ServiceTestController");
    }

    @ResponseBody
    @RequestMapping(value = "helloWorld")
    public String rest(){

        return "Service1:Welcome " + " !";
    }

    @RequestMapping(value = "hello")
    public void login(HttpServletRequest request, HttpServletResponse response,
                      @RequestBody ServiceInfo serviceInfo) {

        RestfulResult restfulResult = new RestfulResult();

        try {
            restfulResult.setData("Service1:Welcome " + serviceInfo.getName() + "!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        CommUtils.printDataJason(response, restfulResult);
    }

    @RequestMapping(value = "rest")
    public String rest(@RequestBody ServiceInfo serviceInfo){

        return "Service1:Welcome " + serviceInfo.getName() + " !";
    }
}
