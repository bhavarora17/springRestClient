package bhavya.springframework.springrestclient.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by barora on 1/10/2018.
 */
/*@Configuration
public class RestTemplateConfig {
	
	@Bean
	public RestTemplate restTemplateConfig(RestTemplateBuilder builder){
		return builder.build();
	}

}*/
@Configuration
public class RestTemplateConfig {
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		
		return builder.build();
	}
}