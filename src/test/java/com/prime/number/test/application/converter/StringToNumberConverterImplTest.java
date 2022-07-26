package com.prime.number.test.application.converter;

import com.prime.number.test.application.exceptions.InvalidValueTypeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToNumberConverterImplTest {

    @Test
    void IsConvertedToTypeLong() throws InvalidValueTypeException {
        StringToNumberConverterImpl stringToNumberConverter = new StringToNumberConverterImpl();

        long result = stringToNumberConverter.convertToTypeLong("10");
        assertEquals(10, result);
    }

    @Test
    void ShouldThrowExceptionIfProvidedValueContainsLetters() {
        StringToNumberConverterImpl stringToNumberConverter = new StringToNumberConverterImpl();

        assertThrows(InvalidValueTypeException.class, () -> {
            stringToNumberConverter.convertToTypeLong("one");
        });
    }
}