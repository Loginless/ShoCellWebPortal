package ua.com.shocell.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.com.shocell.model.WebUsers;

@Controller
public class AppController {

    @Autowired
    DAOUserImpl daoUserImpl;

@RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getIndex(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
    WebUsers webUsers = daoUserImpl.findByLogin("User1");
    modelAndView.addObject("webuser", webUsers);
    return modelAndView;
}

}
