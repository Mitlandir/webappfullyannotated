
package app.controller;

import app.dao.PersonDao;
import app.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class RestController {
    
    @Autowired
    PersonDao personDao;
    
    @RequestMapping(value = "/test")
    public void test(){
        personDao.savePerson(new Person("Pera Peric", 21));
    }//test comment for git
    
    
}
