package zx.sc.springcloudserviceconsumerribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String helloService(String name) {
        return restTemplate.getForObject("http://SPRING-CLOUD-SERVICE-HI/hi?name=" + name, String.class);
    }

    public String hiError(String name) throws Exception {
        return "hi " + name + "there are some errors";
    }

}

