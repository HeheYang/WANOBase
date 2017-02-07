package tk.mybatis.springboot;

import com.dhcc.ecm.WANO.util.WANOProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@EnableTransactionManagement
@SpringBootApplication
@EnableConfigurationProperties({WANOProperties.class})
@ComponentScan(basePackages = "com.majesco.poc,tk.mybatis.springboot,com.dhcc.ecm.WANO.mybatis,com.dhcc.ecm.WANO")
public class WANOApplication extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(WANOApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                .allowedOrigins("*")
    			.allowedMethods("PUT", "DELETE","GET","POST")
                .allowedHeaders("*")
    			.exposedHeaders("access-control-allow-headers",
    					"access-control-allow-methods",
    					"access-control-allow-origin",
    					"access-control-max-age",
    					"X-Frame-Options")
    			.allowCredentials(false).maxAge(3600);
            }
        };
    }
    

}
