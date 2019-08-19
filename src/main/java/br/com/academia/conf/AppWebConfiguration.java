package br.com.academia.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.academia.controllers.HomeController;
import br.com.academia.daos.TrainingDao;
import br.com.academia.daos.UsersDao;

	@EnableWebMvc
	@ComponentScan(basePackageClasses = {HomeController.class, UsersDao.class, TrainingDao.class})
	public class AppWebConfiguration {
		
		@Bean
		public InternalResourceViewResolver internalResourceViewResolver() {
			
			InternalResourceViewResolver resolver = new InternalResourceViewResolver();
			
			resolver.setPrefix("/WEB-INF/views/");
			resolver.setSuffix(".jsp");
		
			return resolver;
			
		}
	}
