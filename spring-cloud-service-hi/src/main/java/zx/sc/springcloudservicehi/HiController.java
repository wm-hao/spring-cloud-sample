package zx.sc.springcloudservicehi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Value("${server.port}")
    private String port;

    @Value("${eureka.instance.hostname}")
    private String hostName;

    @RequestMapping("/hi")
    public String hei(@RequestParam String name) throws Exception {
        return "hi " + name + ",i 'am from " + hostName + ",port:" + port;
    }
}
