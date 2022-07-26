package com.prime.number.test.application.converter;

import com.sun.jdi.InvalidTypeException;

public interface StringToNumberConverter {
    long convertToTypeLong(String number) throws InvalidTypeException;
}
