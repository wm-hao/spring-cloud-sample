package zx.sc.springcloudserviceconsumerfeign;

import org.springframework.stereotype.Component;

@Component
public class HelloErrorServiceImpl implements IHelloService{
    @Override
    public String sayHiFromClientOne(String name) throws Exception {
        return "hi " + name + " error";
    }
}
