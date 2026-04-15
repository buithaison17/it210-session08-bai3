package org.example.bai3.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MultipleOfTenThousandValid implements ConstraintValidator<MultipleOfTenThousand, Double> {
    @Override
    public boolean isValid(Double value, ConstraintValidatorContext context) {
        if (value <= 0) return false;
        return value % 10000 == 0;
    }
}
