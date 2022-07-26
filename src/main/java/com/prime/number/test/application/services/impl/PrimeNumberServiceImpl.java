package com.prime.number.test.application.services.impl;

import com.prime.number.test.application.exceptions.InvalidValueTypeException;
import com.prime.number.test.application.services.PrimeNumberService;
import com.prime.number.test.application.converter.StringToNumberConverter;
import com.prime.number.test.application.services.utils.prime.PrimeNumberUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PrimeNumberServiceImpl implements PrimeNumberService {
    private final PrimeNumberUtils primeNumberUtils;
    private final StringToNumberConverter stringToNumberConverter;
    @Override
    public boolean isPrimeNumber(String number) throws InvalidValueTypeException {
        long convertedNumber = stringToNumberConverter.convertToTypeLong(number);
        return primeNumberUtils.isPrimeNumber(convertedNumber);
    }
}
