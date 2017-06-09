package app.controller;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    SessionFactory sessionFactory;

    @RequestMapping(value = "/home")
    public String getHome() {
        return "homepage";
    }

}
