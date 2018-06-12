package zx.sc.springcloudservicehi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudServiceHiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServiceHiApplication.class, args);
	}
}
