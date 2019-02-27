package machin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
// @EnableFeignClients
// @EnableEurekaClient
// @FeignClient("config-client")
public class ConfigClient {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient.class, args);
    }

    @Autowired
    private Environment env;
     
    @Value("${user.role}")
    private String role;
 
    @RequestMapping(
      value = "/whoami/{username}", 
      method = RequestMethod.GET, 
      produces = MediaType.TEXT_PLAIN_VALUE)
    public String whoami(@PathVariable("username") String username) {
        String val = env.getProperty("user.role");
        System.out.println("Role = " + val);        
        return String.format("Hello! You're %s and you'll become a(n) %s...\n", username, role);
    }
}
