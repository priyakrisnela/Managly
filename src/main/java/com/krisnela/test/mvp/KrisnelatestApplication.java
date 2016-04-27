	package com.krisnela.test.mvp;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import com.krisnela.test.mvp.component.JwtFilter;
import com.krisnela.test.mvp.component.SimpleCORSFilter;
import com.krisnela.test.mvp.domain.GroupMessages;

@SpringBootApplication
@ComponentScan
public class KrisnelatestApplication {

	public static void main(String[] args) {
		   ApplicationContext ctx=	(ApplicationContext) SpringApplication.run(KrisnelatestApplication.class, args);
		System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ((ListableBeanFactory) ctx).getBeanDefinitionNames();
//        GroupMessages groupMessages=(GroupMessages) ctx.getBean("groupMessages");
//		System.out.println("Good Morning "+ groupMessages.getText());

        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
	}
	   @Bean
	    public FilterRegistrationBean jwtFilter() {
	        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
	        registrationBean.setFilter(new JwtFilter());
	        registrationBean.addUrlPatterns("/api/*");

	        return registrationBean;
	    }
	   
	   @Bean
	   public GroupMessages groupMessages(){
		   final GroupMessages groupMessages=new GroupMessages();
		   groupMessages.setText("Hello Himanshu");
		   return groupMessages;
		   
	   }	
}
	