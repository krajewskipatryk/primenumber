package com.prime.number.test.application.controllers;

import com.prime.number.test.application.model.PrimeNumberInitial;
import com.prime.number.test.application.services.PrimeNumberService;
import com.sun.jdi.InvalidTypeException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.management.InvalidAttributeValueException;

@RestController
@RequiredArgsConstructor
public class PrimeNumberController {
    private final PrimeNumberService primeNumberService;

    @GetMapping("/prime")
    public boolean isPrimeNumber(@RequestBody PrimeNumberInitial initialValue) throws InvalidTypeException, InvalidAttributeValueException {

            return primeNumberService.isPrimeNumber(initialValue.getNumber());
    }
}
