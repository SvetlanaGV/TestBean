package config;

import dao.PersonDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.PersonService;
import service.PersonServiceImpl;

@Configuration
public class ServiceConfig {

    @Bean
    public PersonService personService(PersonDao dao) {
        return new PersonServiceImpl(dao);
    }
}
