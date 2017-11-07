package ua.com.shocell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import ua.com.shocell.model.WebUsers;

import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes(types = WebUsers.class)
public class RegistrationController {

    @Autowired
    GeneralDAO generalDAO;

    @Autowired
    DAOUserImpl daoUser;

    @Autowired
    HttpSession httpSession;

    @Autowired
    FormValidator formValidator;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String getRegistrationForm(Model model) {
        WebUsers user = new WebUsers();
        model.addAttribute("registeredUser", user);
        return "registration";
    }

    @RequestMapping(value = "/userregistration", method = RequestMethod.POST)
    public ModelAndView doRegistration(
            @ModelAttribute("registeredUser")
            // to be validated by Validator
            @Validated
                    WebUsers webUsers
            // results of form validation
            , BindingResult result) {
        ModelAndView mod = new ModelAndView();
        if (result.hasErrors()) {
            mod.setViewName("registration");
        } else {
            mod.setViewName("confirmation");
        }
        return mod;
    }

    @InitBinder
    protected void initValidator(WebDataBinder binder) {
        // bind validator to controller
        binder.setValidator(this.formValidator);
    }

    @RequestMapping(value = "/confirmation", method = RequestMethod.GET)
    public String getConfirmation(SessionStatus status) {
        generalDAO.create((WebUsers) httpSession.getAttribute("registeredUser"));
        status.setComplete(); //обнуление сессии (delete and recreate new)
        // we have to clear data after registrations and provide new one to login
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLogin(SessionStatus status) {
        return "login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String getLogout(SessionStatus status) {
        status.setComplete(); //обнуление сессии (delete and recreate new)
        return "logout";
    }

}