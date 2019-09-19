import domain.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import service.PersonService;

@Configuration
@ComponentScan
public class TestBean {
    public static void main(String[] args){

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TestBean.class);
        PersonService service = context.getBean(PersonService.class);
        Person newPerson = service.getByName();
        System.out.println("Hello " + newPerson.getName() + " " + newPerson.getSurname());

    }

}
