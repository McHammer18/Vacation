package dmacc.controller;

import org.springframework.context.annotation.Bean;
import dmacc.bean.Vacation;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VacationController {
	
	
	@Bean
	public Vacation vacation()
	{
		Vacation bean = new Vacation();
		bean.setTown("Denver");
		bean.setState("Colorado");
		bean.setMiles(677);
		return bean;
	}
	
	

}
