package com.prime.number.test.application.services;

import com.sun.jdi.InvalidTypeException;

import javax.management.InvalidAttributeValueException;

public interface PrimeNumberService {
    boolean isPrimeNumber(String number) throws InvalidAttributeValueException, InvalidTypeException;
}
