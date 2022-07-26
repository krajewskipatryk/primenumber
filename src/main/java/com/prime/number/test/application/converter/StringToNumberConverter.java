package com.prime.number.test.application.converter;

import com.prime.number.test.application.exceptions.InvalidValueTypeException;

public interface StringToNumberConverter {
    long convertToTypeLong(String number) throws NumberFormatException, InvalidValueTypeException;
}
