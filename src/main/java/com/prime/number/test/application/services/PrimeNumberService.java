package com.prime.number.test.application.services;

import com.prime.number.test.application.exceptions.InvalidValueTypeException;
import com.sun.jdi.InvalidTypeException;

import javax.management.InvalidAttributeValueException;

public interface PrimeNumberService {
    boolean isPrimeNumber(String number) throws InvalidAttributeValueException, InvalidTypeException, InvalidValueTypeException;
}
