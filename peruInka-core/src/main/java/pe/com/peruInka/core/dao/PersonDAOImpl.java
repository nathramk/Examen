package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Person;
import pe.com.peruInka.core.domain.TypeDocument;
import pe.com.peruInka.core.domain.UserSystem;

public class PersonDAOImpl extends BaseDAOHibernate implements PersonDAO {

	public List<Person> findAllPerson() {
		return find(Person.class, "from Person");
	}

	public List<UserSystem> findAllUser() {
		return find(UserSystem.class, "from UserSystem");
	}

	
	public List<TypeDocument> findTypeDocument() {
		return find(TypeDocument.class, "from TypeDocument");
	}
	
	public void savePerson(Person person){
		save(person);
	}

	public Person findPersonById(Long id){
		return findById(Person.class, id);
	}
	
	public void deletePerson(Person person){
		
		delete(person);
		
	}

	
	
	
	
	
//	public List<StatusUser> findStatusUser() {
//		return find(StatusUser.class, "from StatusUser");
//	}
//
//	public List<StatusPerson> findStatusPerson() {
//		return find(StatusPerson.class, "from StatusPerson");
//	}

	
	
	
	
	
	
	
}
