package com.example.TruongKhacDi_BookStore.validator;

import com.example.TruongKhacDi_BookStore.entity.Category;
import com.example.TruongKhacDi_BookStore.validator.annotation.ValidCategoryId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context) {
        return category != null && category.getId() != null;
    }
}
