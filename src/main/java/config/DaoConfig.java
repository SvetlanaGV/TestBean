package config;

import dao.PersonDao;
import dao.PersonDaoSimple;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoConfig {

    @Bean
    public PersonDao personDao(){
        return new PersonDaoSimple();
    }
}
