package in.sp.hibernate.repository;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import in.sp.hibernate.config.HibernateConfig;
import in.sp.hibernate.entities.User;

@Repository
public class DbOprationsImpl implements DbOprations {

	@Override
	public User getUserdetails(Long id) {
		
		User user = null;
	
		try(
			Session session = HibernateConfig.getSessionFactory().openSession();
				)
		{
			user  = session.get(User.class, 6L);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
	

}
