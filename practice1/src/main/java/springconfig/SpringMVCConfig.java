package springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "controller")
public class SpringMVCConfig {

	
	@Bean
	InternalResourceViewResolver getViewResolver()
	{
		return new 	InternalResourceViewResolver("/WEB-INF/Views/", ".jsp");
	}
}
