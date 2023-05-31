/*
package com.example.TruongKhacDi_BookStore.validator;

import com.example.TruongKhacDi_BookStore.repository.IuserRepository;
import com.example.TruongKhacDi_BookStore.validator.annotation.ValidUsername;

import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

public class ValidUsernameValidator implements ConstraintValidator<ValidUsername,String> {
    @Autowired
    private IuserRepository userRepository;
    @Override
    public boolean isValid(String username, ConstraintValidatorContext context){
        if (userRepository==null){
            return true;
        }
        return userRepository.findByUsername(username)==null;
    }
}
*/
