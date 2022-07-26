package com.prime.number.test.application.services.impl;

import com.prime.number.test.application.services.utils.prime.PrimeNumberUtils;
import com.prime.number.test.application.services.utils.prime.PrimeNumberUtilsImpl;
import com.sun.jdi.InvalidTypeException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PrimeNumberServiceImplTest {
    @Test
    void testMockListIsPrimeNumber() throws InvalidTypeException {
        PrimeNumberServiceImpl primeNumberService = mock(PrimeNumberServiceImpl.class);

        primeNumberService.isPrimeNumber("1");

        verify(primeNumberService).isPrimeNumber("1");
    }
}