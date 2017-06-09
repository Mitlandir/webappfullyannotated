
package app.dao;

import app.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {
    
    @Autowired
    SessionFactory sessionFactory;
    
    public void savePerson(Person person){
        Session ses = sessionFactory.openSession();
        Transaction tx = ses.beginTransaction();
        ses.save(person);
        tx.commit();
        ses.close();
    }
    
}
