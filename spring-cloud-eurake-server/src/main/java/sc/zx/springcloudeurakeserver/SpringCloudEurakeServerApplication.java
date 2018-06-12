package sc.zx.springcloudeurakeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurakeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurakeServerApplication.class, args);
	}
}
