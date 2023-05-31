package com.example.TruongKhacDi_BookStore.validator;

import com.example.TruongKhacDi_BookStore.entity.Category;
import com.example.TruongKhacDi_BookStore.entity.User;
import com.example.TruongKhacDi_BookStore.validator.annotation.ValidUserId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidUserIdValidator implements ConstraintValidator<ValidUserId, User> {
    @Override
    public boolean isValid(User user, ConstraintValidatorContext context){
        if(user == null)
            return true;
        return user.getId() != null;
    }
}
