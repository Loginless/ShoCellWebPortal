package ua.com.shocell.controller;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import ua.com.shocell.model.WebUsers;

@Component
public class FormValidator implements Validator {

    @Override
    public boolean supports(Class<?> type) {
        return WebUsers.class.equals(type);    }

    @Override
    public void validate(Object o, Errors errors) {
        // actually you have to check in DB that there is no such user and then permit validation
        ValidationUtils.rejectIfEmpty(errors
                // name of field must be equal to class(User) field name
                , "login"
                // this value is from properties file
                , "error.enterYourName");
        ValidationUtils.rejectIfEmpty(errors, "login", "error.enterYourLogin");
        ValidationUtils.rejectIfEmpty(errors, "password", "error.enterYourPassword");
    }
}
