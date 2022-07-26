package com.prime.number.test.application.converter;

import com.sun.jdi.InvalidTypeException;
import org.springframework.stereotype.Service;

@Service
public class StringToNumberConverterImpl implements StringToNumberConverter {
    @Override
    public long convertToTypeLong(String number) throws InvalidTypeException {
        long convertedNumber;
        try {
            convertedNumber = Long.parseLong(number);
        } catch (Exception e) {
            throw new InvalidTypeException("Provided value is not a number");
        }
        return convertedNumber;
    }
}
