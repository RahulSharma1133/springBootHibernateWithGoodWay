package in.sp.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.sp.hibernate.entities.User;
import in.sp.hibernate.repository.DbOprations;

@SpringBootApplication
public class SpringBootHibernate02Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootHibernate02Application.class, args);
        DbOprations dbop =  context.getBean(DbOprations.class);
        User user =  dbop.getUserdetails(1L);
        if(user != null) {
        	System.out.println("ID: " + user.getId());
			System.out.println("Name: " + user.getName());
			System.out.println("Email: " + user.getEmail());
			System.out.println("Password: " + user.getPassword());
			System.out.println("Gender: " + user.getGender());
			System.out.println("City: " + user.getCity());
        }else {
        	System.out.println("User Not Found");
        }
        
        
	}

}
