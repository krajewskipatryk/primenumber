package com.prime.number.test.application.services.utils.prime;

import org.springframework.stereotype.Service;

@Service
public class PrimeNumberUtilsImpl implements PrimeNumberUtils {
    @Override
    public boolean isPrimeNumber(long number) {
        if (number <= 0) {
            return false;
        }
        if (number == 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (int i = 2; i < number; i++)
        {
            if ((number % i) == 0)
                return false;
        }
        return true;
    }
}
