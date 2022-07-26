package com.prime.number.test.application.converter;

import com.prime.number.test.application.exceptions.InvalidValueTypeException;
import org.springframework.stereotype.Service;

@Service
public class StringToNumberConverterImpl implements StringToNumberConverter {
    @Override
    public long convertToTypeLong(String number) throws InvalidValueTypeException {
        long convertedNumber;
        try {
            convertedNumber = Long.parseLong(number);
        } catch (NumberFormatException exception) {
            throw new InvalidValueTypeException("Provided value is not a number", exception);
        }
        return convertedNumber;
    }
}
