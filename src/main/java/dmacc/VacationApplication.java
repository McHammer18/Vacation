package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.bean.Vacation;
import dmacc.controller.VacationController;
import dmacc.repository.VacationRepository;

@SpringBootApplication
public class VacationApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(VacationApplication.class, args);
	}

	@Autowired
	VacationRepository repo;
	
	@Override
	public void run(String... args) throws Exception{
		ApplicationContext appContext = new AnnotationConfigApplicationContext(VacationController.class);
		
		Vacation v = appContext.getBean("vacation", Vacation.class);
		v.setTown("Denver");
		repo.save(v);
		
		Vacation d = new Vacation("Brayton", "Missouri", 200);
		repo.save(d);
		
		List<Vacation> allMyVacations = repo.findAll();
		for (Vacation vacation: allMyVacations)
		{
			System.out.println(vacation.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}
}
