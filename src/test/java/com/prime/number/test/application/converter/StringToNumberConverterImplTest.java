package com.prime.number.test.application.converter;

import com.sun.jdi.InvalidTypeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToNumberConverterImplTest {

    @Test
    void convertToTypeLong() throws InvalidTypeException {
        StringToNumberConverterImpl stringToNumberConverter = new StringToNumberConverterImpl();

        long result = stringToNumberConverter.convertToTypeLong("10");
        assertEquals(10, result);
    }
}